class Bank{
 
 void getRateInterest(int p,int r,int t){
  int si=p*r*t/100;
System.out.println(si);}
}
class SBI extends Bank{
 void getRateInterest(int p,int r,int t ){System.out.println("rate of interest for sbi:"+si);} 
  }
class ICICI extends Bank{
 void getRateInterest(int p,int r,int t){System.out.println("rate of interest for  icici:"+si);}  
}
class Axis extends Bank{
 void getRateInterest(int p,int r,int t){System.out.println("rate of interest for   axis:"+si);} 
  }
class main
{
 public static void main(String[] args)
 {
  SBI s=new SBI();
  ICICI i=new ICICI();
  Axis a=new Axis();
  s.getRateInterest(10,12,2);
  i.getRateInterest(100,2,1);
  a.getRateInterest(123,15,2);
 }
}