package Day18.Serialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args)throws IOException{
        SER s=new SER(1,"Heena");
        s.display();
        String path="C:\\Users\\Heenakousar\\IdeaProjects\\JAVA TRAINING\\src\\Day18\\Serialize\\sample.txt";
        FileOutputStream fos=new FileOutputStream(path);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(s);

    }
}
