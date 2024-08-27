//Q=18)Write a program to demonstrate the finally block
class Code1 {
    public static void main(String args[]){
        String s = null;
        try {
            System.out.println(s.length());
        }
         catch (NullPointerException e)
         {
            System.out.println(e);
        }
    

        finally{
            System.out.println("in finally block");
        }
    }
}
        

