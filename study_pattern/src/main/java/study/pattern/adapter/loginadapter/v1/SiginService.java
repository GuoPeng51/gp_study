package study.pattern.adapter.loginadapter.v1;

import study.pattern.adapter.loginadapter.ResultMsg;
import study.pattern.adapter.loginadapter.User;

public class SiginService {
    /**
     * 注册方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg regist(String username, String password){
        return new ResultMsg(200,"注册成功",new User());
    }
    /**
     * 登录的方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg login(String username,String password){
        return new ResultMsg(200,"登陆成功",null);
    }

}
