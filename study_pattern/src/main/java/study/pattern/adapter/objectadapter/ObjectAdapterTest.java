package study.pattern.adapter.objectadapter;

public class ObjectAdapterTest {
    public static void main(String[] args) {
        AC220 ac220 = new AC220();
        PowerAdapter powerAdapter = new PowerAdapter(ac220);
        powerAdapter.outputDC5V();
    }
}
