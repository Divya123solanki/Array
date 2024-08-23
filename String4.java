// How many s in String
class String4 {
    public static void main(String args[]){
        String s1="divyasolanki";
        int count=0;
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if(ch=='s')
            count++;

            
        }
        System.out.println(count);
    }
}
