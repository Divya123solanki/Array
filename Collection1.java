import java.util.*;
class Collection1 {
    public static void main(String args[]){
        ArrayList a=new ArrayList();
        a.add(100);
        a.add(200);
        a.add(300);
        System.out.print(a);
        ArrayList a2=new ArrayList();
        a2.add("aaa");
        a2.add("bbb");
        a2.add("ccc");
        System.out.print(a2);
        a.addAll(a2);
        System.out.print(a);
    }
}
