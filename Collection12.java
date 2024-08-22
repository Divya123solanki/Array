import java.util.*;
class Collection12 {
    public static void main(String args[]){
        HashSet hs=new HashSet<>();
        hs.add(10);
        hs.add(hs.add("deepak"));
        hs.add(100.55);
        hs.add(null);
        hs.add(null);
        System.out.println(hs);
    }
}
