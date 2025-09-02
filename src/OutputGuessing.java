import java.io.*;

public class OutputGuessing {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("output.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject("Hello");
        oos.writeObject("World");
        oos.close();

        FileInputStream fis = new FileInputStream("output.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        System.out.println(ois.readObject());
        System.out.println(ois.readObject());
        ois.close();
    }
}