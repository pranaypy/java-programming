class MyThreadsExample extends Thread{
    public void run(){
        String str = "Thread Started Running...";
        System.out.println(str);
    }
}

public class Threads{
    public static void main(String[] args){
        MyThreadsExample t1 = new MyThreadsExample();
        t1.start();
    }
}
