package Day17.FileHandling;

import java.io.*;
import java.util.Scanner;

public class Files {
    public static void main(String[] args) throws IOException {

        //Creating a file//
        System.out.println("Starting My File");
        String path="C:\\Users\\Heenakousar\\IdeaProjects\\JAVA TRAINING\\src\\Day17\\FileHandling\\test.txt";
        File f=new File(path);
//        FileWriter fw=new FileWriter(f);
//        BufferedWriter bw=new BufferedWriter(fw);
//      fw.write("Hello World");
//        bw.write("Heena ");
//        bw.close();
//        fw.close();

        //Adding data into existing file//


//        FileWriter fw=new FileWriter(f,true);
//        BufferedWriter bw=new BufferedWriter(fw);
//      // fw.write("Hello World");
//        bw.write("Heena");
//        bw.close();
//        fw.close();



        // Taking Input from Console and Storing in File
       /* Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        bw.write(str);
        bw.newLine();
        bw.close();*/

        //How to Read a File and Print in Console?
       FileReader fr=new FileReader(f);
        BufferedReader br=new BufferedReader(fr);
        int ch;
       int c=0;
       while((ch=br.read())!=-1){
            System.out.print((char)ch);
            c++;
        }
       System.out.println(c);
    }
}