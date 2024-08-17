

class Faculty{
    private String name;
    private String subject;
    private int salary;
    public void setName(String name){
        this.name=name;
    }
    public void setSubject(String subject){
        this.subject=subject;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public String getName(){
       return name;
    }
    public String getSubject(){
        return subject;
    }
    public int getSalary(){
        return salary;
    }
}
 class GuestFaculty extends Faculty{
    private int pls;
    private int plt;
    public void setPls(int pls){
        this.pls=pls;
    }
    public void setPlt(int plt){
        this.plt=plt;
    }
    public int getPls(){
        return pls;
    }
    public int getPlt(){
        return plt;
    }
}
 class ContractFaculty extends Faculty{
    private int cd,cm;
    public void setCd(int cd){
       this.cd=cd;
    }
    public void setCm(int cm){
        this.cm=cm;
    }
    public int getCd(){
        return cd;
    }
    public int getCm(){
        return cm;
    }
}
public class practice_2{
   public static void main(String args[]){
    Faculty f=new Faculty();
    f.setName("Ram");
    f.setSubject("Maths");
    f.setSalary(1000);

    GuestFaculty gf=new GuestFaculty();
      gf.setName("Raj");
      gf.setSubject("Physics");
      gf.setPls(1150);
      gf.setPlt(1);

      ContractFaculty cf=new ContractFaculty();
      cf.setName("Ravan");
      cf.setSubject("Bio");
      cf.setCd(6);
      cf.setCm(1234);

      System.out.println("Faculty name="+f.getName());
      System.out.println("Subject="+f.getSubject());
      System.out.println("Salary="+f.getSalary());
      System.out.println("guestFaculty name="+gf.getName());
      System.out.println("Subject="+gf.getSubject());
      System.out.println("Salary="+gf.getSalary());
      System.out.println("Per lecture salary="+gf.getPls());
      System.out.println("Per lecture time="+gf.getPlt());
      System.out.println("ContractFaculty="+cf.getName());
      System.out.println("Subject="+cf.getSubject());
      System.out.println("Contract duration="+cf.getCd());
      System.out.println("Contract amount="+cf.getCm());
   }
}
