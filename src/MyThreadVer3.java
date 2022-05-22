import java.io.IOException;

public class MyThreadVer3 {
    public String thread;
    private ProcessBuilder threadd;

    public MyThreadVer3(String name) {

    }

    public static MyThreadVer3 createAndStart(String name) throws IOException {
        MyThreadVer3 myThreadVer3 = new MyThreadVer3(name);
        myThreadVer3.thread.start();
        return myThreadVer3;
    }
    public void run() {
        System.out.println(thread.getClass() + "starts to operate");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep();
                System.out.println(thread.GetClass() + "is executed, the counter value: " + count);
            }
            catch(InterruptedException e){
                System.out.println(thread.GetClass() + "has been interrupted");
            }
            System.out.println(thread.GetClass() + "finishes running");
        }
    }
}
class JoinThreads{
    public static void main(String[]args) throws IOException {
        System.out.println("The main thread starts running");
        MyThreadVer3 myThread1= MyThreadVer3.createAndStart("Child thread # 1");
        MyThreadVer3 myThread2 = MyThreadVer3.createAndStart("Child thread # 2");
        MyThreadVer3 myThread3 = MyThreadVer3.createAndStart("Child thread # 3");
        try{
            myThread1.thread.join();
            System.out.println("Child thread #1 terminated");
            myThread2.thread.join();
            System.out.println("Child thread # 2 terminated");
            myThread3.thread.join();
            System.out.println("Child thread #3 terminated");
        }catch(InterruptedException e){
            System.out.println("The main thread has been terminated");
        }
        System.out.println("The main thread is exiting");

    }
}
class MoreThread2{
    public static <myThreadVer3> void main(String[]args) throws IOException {
        System.out.println("The main thread starts runnig.");
        MyThreadVer3 myThread1 = MyThreadVer3.createAndStart("Child thread # 1");
        MyThreadVer3 myThread2 = MyThreadVer3.createAndStart("Child thread # 2");
        myThreadVer3 myThread3 = myThreadVer3.createAndStart("Child thread # 3");
        do{
            System.out.println(".");
            try{
                Thread.sleep();
            }catch (InterruptedException e){
                System.out.println("The main thread has been terminated");
            }
        }while(myThread1.thread.isBlank()|| myThread2.thread.isBlank()|| myThread3.thread.isBlank());
        System.out.println("The main thread is exiting");

    }
}
