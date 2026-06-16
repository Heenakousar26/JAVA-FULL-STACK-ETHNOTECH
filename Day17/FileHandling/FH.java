package Day17.FileHandling;

import java.io.*;

public class FH {
    public static void main(String[] args)throws IOException {
        System.out.println("Starting my file");
        String path="C:\\Users\\Heenakousar\\IdeaProjects\\JAVA TRAINING\\src\\Day17\\FileHandling\\test.txt";
        File f1=new File(path);
        File f2=new File("C:\\Users\\Heenakousar\\IdeaProjects\\JAVA TRAINING\\src\\Day17\\FileHandling\\test2.txt");

        FileInputStream fis1=new FileInputStream(f1);
        FileOutputStream fos2=new FileOutputStream(f2);

        int ch;
        while((ch=fis1.read())!=-1){
            System.out.print ((char)ch);
            fos2.write(ch);
        }
        fis1.close();
        fos2.close();
    }
}
