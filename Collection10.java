import java.util.*;
class Collection10 {
    public static void main(String args[]){
        Vector v=new Vector<>();
        v.add("deepak");
        v.add(1,"rahul");
        v.addElement("ravi");
        v.add(100);
        v.add(10.24);
        v.add('g');
        v.add(null);
        v.add(null);
        v.removeElementAt(2);
        v.setElementAt("aaa", 2);
        System.out.println(v);
        
    }
}
