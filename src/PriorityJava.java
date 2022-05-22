public class PriorityJava implements Runnable {
    int count; Thread thread; static boolean stop = false; static int currentName;

    void Priority(String name){
        Runnable target;
        thread = new Thread(target; this, name);
        count= 0;
        currentName=  0;
    }
    public void run(){
        System.out.println(thread.GetName()+ "starts to operate");
        do{
            count++;
            if (currentName.compareTo(thread.GetName()) !=0){
                currentName =thread.GetName();
                System.out.println(currentName + "is executed");
            }
        }while (stop == false && count < 10_000_000);
        stop = true;
        System.out.println("\n" + thread.GetName()+  "finishes running");
    }
}

class PriorityDemo{
    public static <Priority> void main(String[]args){
        Priority mt1 = new Priority("High priority thread");
        Priority mt2 = new Priority("High priority thread");
        Priority mt3 = new Priority("High priority thread");
        Priority mt4 = new Priority("High priority thread");
        Priority mt5 = new Priority("High priority thread");

        mt1.thread.setPriority(Thread.MAX_PRIORITY);
        mt2.thread.setPriority(Thread.MAX_PRIORITY);

        mt1.thread.start();mt2.thread.start();mt3.thread.start();mt4.thread.start();mt5.thread.start();
        try{
            mt1.thread.join();mt2.thread.join();mt3.thread.join();mt4.thread.join();mt5.thread.join();
        }catch (InterruptedException e){System.out.println("The main thread starts running");}
        System.out.println("\n HIgh priority thread counted to"+ mt1.count);
        System.out.println("\n The low priority thread counted to"+ mt2.count);
        System.out.println("\n Normal priority thread counted to"+ mt3.count);
        System.out.println("\n Normal priority thread counted to"+ mt4.count);
        System.out.println("\n Normal priority thread counted to"+ mt5.count);
    }
}
