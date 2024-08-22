import java.util.*;
class Collection11 {
    public static void main(String args[]){
        Stack s=new Stack();
        s.push("deepak");
        s.push("amit");
        s.push(200);
        s.push(100.10);
        s.push(200);
        System.out.println(s.search("amit"));
        System.out.println(s.empty());

    }
}
