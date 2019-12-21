package study.pattern.delegate.mvc;

import study.pattern.proxy.dbroute.Order;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class DispatcherServlet extends HttpServlet {
    private List<Handler> handlerMapping = new ArrayList<Handler>();

    @Override
    public void init() throws ServletException {
        Class<?> memberControllerClass = MemberController.class;
        Class<?> OrderControllerClass = OrderController.class;
        Class<?> SystemControllerClass = SystemController.class;

        try {
            handlerMapping.add(new Handler().setController(memberControllerClass.newInstance()).setMethod(memberControllerClass.getMethod("getMemberById",String.class)).setUrl("/web/getMemberById"));
            handlerMapping.add(new Handler().setController(OrderControllerClass.newInstance()).setMethod(memberControllerClass.getMethod("getOrderById",String.class)).setUrl("/web/getOrderById"));
            handlerMapping.add(new Handler().setController(SystemControllerClass.newInstance()).setMethod(memberControllerClass.getMethod("logout",String.class)).setUrl("/web/logout"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void doDispatch(HttpServletRequest request, HttpServletResponse response){
        String uri = request.getRequestURI();
        Handler target = null;
        for (Handler handler:handlerMapping) {
            if (handler.getUrl().equals(uri)){
                target = handler;
                break;
            }
        }

        Object object = null;
        try {
            object = target.getMethod().invoke(target.getController(),request.getParameter("id"));
        //5、获取到Method 执行的结果，通过Response 返回出去
         response.getWriter().write((String)object);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    class Handler{
        private Object controller;
        private Method method;
        private String url;

        public Object getController() {
            return controller;
        }

        public Handler setController(Object controller) {
            this.controller = controller;
            return this;
        }

        public Method getMethod() {
            return method;
        }

        public Handler setMethod(Method method) {
            this.method = method;
            return this;
        }

        public String getUrl() {
            return url;
        }

        public Handler setUrl(String url) {
            this.url = url;
            return this;
        }
    }
}
