package study.pattern.strategy.schoolwork;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;

public class MessageStrategy {
    private static List<Handler> handlerList = new ArrayList<Handler>();
    private static final BussinessService bussinessService = new BussinessService();
    private static final MessageStrategy messageStrategy = new MessageStrategy();

    private MessageStrategy(){
        Class<?> bussinessServiceClass = BussinessService.class;
        Class<?> superclass = bussinessServiceClass.getSuperclass();
        Method[] methods = bussinessServiceClass.getMethods();
        Method[] superMethods = superclass.getMethods();
        a:for (int i = 0; i < methods.length; i++) {
            Method method = methods[i];
            String methodName = method.getName();
            b:for (int j = 0; j < superMethods.length; j++) {
                Method supermethod = superMethods[j];
                String supermethodName = supermethod.getName();
                if (methodName.equals(supermethodName)){
                    continue a;
                }
            }
            handlerList.add(new Handler().setService(bussinessService).setScene(String.valueOf(i)).setMethod(method));
        }
    }

    public static void handlerMessage(String scene,String messageType) throws Exception{
        Handler target = null;
        for (Handler handler:handlerList) {
            if (handler.getScene().equals(scene)){
                target = handler;
            }
        }
        target.getMethod().invoke(target.getService(),new Object());
    }

    public static void main(String[] args) throws Exception{
        MessageStrategy instance = getInstance();
        System.out.println(handlerList);
        handlerMessage("2","04");
    }

    public static MessageStrategy getInstance(){
        return  messageStrategy;
    }
    class Handler{
        private Object service;
        private Method method;
        private String scene;
        private String messageType;

        public Object getService() {
            return service;
        }

        public Handler setService(Object service) {
            this.service = service;
            return this;
        }

        public Method getMethod() {
            return method;
        }

        public Handler setMethod(Method method) {
            this.method = method;
            return this;
        }

        public String getScene() {
            return scene;
        }

        public Handler setScene(String scene) {
            this.scene = scene;
            return this;
        }

        public String getMessageType() {
            return messageType;
        }

        public Handler setMessageType(String messageType) {
            this.messageType = messageType;
            return this;
        }

        @Override
        public String toString() {
            return new ToStringBuilder(this)
                    .append("service", service)
                    .append("method", method)
                    .append("scene", scene)
                    .append("messageType", messageType)
                    .toString();
        }
    }
}
