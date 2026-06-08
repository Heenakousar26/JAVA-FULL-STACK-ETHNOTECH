package Day11.LearningThreads.MyThreads.Threads.Basics;

import Day11.LearningThreads.MyThreads.Threads.Basics.MyThreads;
public class Main {
    public static void main(String args[]) throws InterruptedException{
        System.out.println("The creation of thread");
        MyThreads t = new MyThreads();
        t.start();
        for (int i = 1; i <= 3; i++) {
            t.join();
            System.out.println(i);
        }
    }
}