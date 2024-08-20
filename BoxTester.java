class Box{
   private int l,b,h;
   public Box(){
    l=10;
    b=2;
    h=3;
   }
   public Box(int x,int y,int z){
    l=x;
    b=y;
    h=z;
   }
   public Box(Box x){
    l=x.l;
    b=x.b;
    h=x.h;
   }
   public Box(int x,int y){
    l=x;
    b=y;
    h=10;
   }
   public Box(int x){
    l=x;
    b=x;
    h=x;
   }
   public String toString(){
    return " "+l+","+b+","+h;
   }
   public int volume(){
    return (l*b*h);
   }
}
public class BoxTester{
    public static void main(String args[]){
        Box b1=new Box();
        Box b2=new Box(2,4,8);
        Box b3=new Box(b1);
        Box b4=new Box(2,7);
        Box b5=new Box(9);
        System.out.println("Dimension of Box 1="+b1);
        System.out.println("Dimension of Box 2"+b2);
        System.out.println("Dimension of Box 3="+b3);
        System.out.println("Dimension of box 4="+b4);
        System.out.println("Dimenion of Box 5="+b5);
        System.out.println("Volume="+b1.volume());
        System.out.println("Volume of cube="+b5.volume());
    }
}