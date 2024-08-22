import java.util.*;
class Collection13 {
    public static void main(String args[]){
      ArrayList al=new ArrayList<>();
      al.add("deepak");
      al.add("rahul");
      al.add("amit");
      HashSet hs=new HashSet();
      hs.addAll(al);
      hs.add(30);
      hs.add(10);
      hs.add(20);
      hs.add(40);
     
      System.out.println(hs);
        }
    }

