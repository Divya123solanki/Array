 class Thread15 extends Thread {
    public void run(){
        for(int i=1;i<=5;i++){
            try {
                Thread.sleep(1000);
                System.out.println(i);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
    public static void main(String args[]){
        Thread15 t=new Thread15();
        t.start();
    }
}
