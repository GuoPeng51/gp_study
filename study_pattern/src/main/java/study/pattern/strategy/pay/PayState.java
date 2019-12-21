package study.pattern.strategy.pay;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class PayState {
    private int code;
    private Object data;
    private String msg;

    public PayState(int code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("code", code)
                .append("data", data)
                .append("msg", msg)
                .toString();
    }
}
