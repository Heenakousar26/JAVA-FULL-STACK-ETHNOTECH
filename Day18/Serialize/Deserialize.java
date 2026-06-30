package Day18.Serialize;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialize {
    public static void  main(String[] args)throws IOException,ClassNotFoundException{
        String path="C:\\Users\\Heenakousar\\IdeaProjects\\JAVA TRAINING\\src\\Day18\\Serialize\\sample.txt";
        FileInputStream fis=new FileInputStream(path);
        ObjectInputStream ois=new ObjectInputStream(fis);
        SER s=(SER)ois.readObject();
        s.display();
        ois.close();
        fis.close();
    }
}
