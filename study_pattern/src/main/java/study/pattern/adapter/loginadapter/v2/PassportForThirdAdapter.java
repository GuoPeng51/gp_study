package study.pattern.adapter.loginadapter.v2;

import study.pattern.adapter.loginadapter.ResultMsg;
import study.pattern.adapter.loginadapter.v1.SiginService;

public class PassportForThirdAdapter extends SiginService implements IPassportForThird {
    @Override
    public ResultMsg loginForQQ(String id) {
        return null;
    }

    @Override
    public ResultMsg loginForWechat(String id) {
        return null;
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return null;
    }

    @Override
    public ResultMsg loginForTelphone(String telphone, String code) {
        return null;
    }

    @Override
    public ResultMsg loginForRegist(String username, String passport) {
        super.regist(username,null);
        return super.login(username,null);
    }

    private ResultMsg processLogin(String key,Class<? extends LoginAdapter> clazz)throws Exception{
        LoginAdapter loginAdapter = clazz.newInstance();
        if (loginAdapter.support(loginAdapter)){
            return loginAdapter.login(key,loginAdapter);
        }else {
            return null;
        }
    }
}
