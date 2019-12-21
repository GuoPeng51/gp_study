package study.pattern.delegate.simple;

import java.util.HashMap;
import java.util.Map;

public class Leader implements IEmployee {
    private Map<String,IEmployee> targets = new HashMap<String,IEmployee>();
    {
        targets.put("前端",new EmployeeA());
        targets.put("后端",new EmployeeB());
    }

    @Override
    public void doing(String command) {
        System.out.println("我是leader，我现在开始工作");
        targets.get(command).doing(command);
    }
}
