/* 33333
 32223
 32123
 32223
 33333*/
 
 class Array51 {
    public static void main(String args[]){
      int i=1;
      int j=1;
      int k=1;
      for(i=1;i<6;i++){
        for(j=1;j<6;j++){
            if(i==1||i==5||j==1||j==5){
                System.out.print("3");
            }
            if(i==2&&(j>=2&&j<5)||i==4&&(j>=2&&j<5)){
                System.out.print("2");
            }
            if(i==3&&j<2){
                for(k=1;k<=3;k++){
                    if(k%2==0){
                        System.out.print("1");
                    }
                    else{
                        System.out.print("2");
                    }
                }
            }
        }
        System.out.println();
      }
    }
}
