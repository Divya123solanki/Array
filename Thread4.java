 //Performing single task from single thread
 class Thread4 extends Thread {
    public void run(){
        System.out.println("thread task");
    }
    public static void main(String args[]){
        Thread4 t=new Thread4();
        t.start();
    }
}
