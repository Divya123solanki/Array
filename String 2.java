//Write repeating element in string
class String2 {
    public static void main(String args[]){
        String s1[]={"i","am","divya","divya","is","very ","honest","she","is","very","beautiful"};
         int n=s1.length;
         for (int i=0;i<n;i++){
            for(int j=i+1;j<n-1;j++){
                if(s1[i]==s1[j]){
                System.out.println(s1[i]);
                break;
                }
            }
        }
    }
}
