package study.pattern.singleton;

import study.pattern.singleton.seriable.SeriableSingleton;

import java.io.*;

public class SeriableSingletonTest {
    public static void main(String[] args) {
        SeriableSingleton s1 = null;
        SeriableSingleton s2 = SeriableSingleton.getInstance();

        try {
            FileOutputStream outputStream = new FileOutputStream("D://SeriableSingleton.obj");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(s2);
            objectOutputStream.flush();
            objectOutputStream.close();

            FileInputStream fileInputStream = new FileInputStream("D://SeriableSingleton.obj");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            s1 = (SeriableSingleton)objectInputStream.readObject();
            System.out.println(s1 == s2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
