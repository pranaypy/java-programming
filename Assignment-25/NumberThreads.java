class NumThreads extends Thread{
    String threadName;
    
    NumThreads(String name){
        threadName = name;
    }

    public void run(){
        System.out.println(threadName + " is running.");

        for(int i=1; i<=5; i++){
            System.out.println(threadName + " prints " + i);

            try{
                Thread.sleep(500);
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}


public class NumberThreads {
    public static void main(String[] args) {
        NumThreads thread1 = new NumThreads("Thread-1");
        NumThreads thread2 = new NumThreads("Thread-2");
        NumThreads thread3 = new NumThreads("Thread-3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
    
}
