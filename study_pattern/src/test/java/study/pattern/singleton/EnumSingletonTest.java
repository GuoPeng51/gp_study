package study.pattern.singleton;

import study.pattern.singleton.register.EnumSingleton;
import study.pattern.singleton.seriable.SeriableSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EnumSingletonTest {
    public static void main(String[] args) {
        EnumSingleton s1 = null;
        EnumSingleton s2 = EnumSingleton.getInstance();

        try {
            FileOutputStream outputStream = new FileOutputStream("D://EnumSingleton.obj");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(s2);
            objectOutputStream.flush();
            objectOutputStream.close();

            FileInputStream fileInputStream = new FileInputStream("D://EnumSingleton.obj");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            s1 = (EnumSingleton)objectInputStream.readObject();
            System.out.println(s1 == s2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
