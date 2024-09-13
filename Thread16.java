public class Thread16 extends Thread {
    public void run(){
        try {
            for(int i=1;i<=5;i++){
                System.out.print(i+":"+Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        } 
        catch(InterruptedException e) {
                System.out.println(e);
        }
    }
    public static void main(String args[]){
        Thread16 t=new Thread16();
        t.start();

        Thread16 t1=new Thread16();
        t1.start();
    }
}
