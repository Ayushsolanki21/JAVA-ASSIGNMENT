//3rd
import java.util.*;
import java.lang.*;
class c {

    public static void main(String[] args) {
        
         Scanner sc= new Scanner(System.in);
        
            System.out.println("enter two value a,b");
            long a=sc.nextLong();
            long b=sc.nextLong();
             System.out.println("gcd of two number recursive : "+ gcd(a,b));
             System.out.println("gcd of two number non recursive : "+ gcd2(a,b));
    }
    public static long gcd(long n1, long n2)
    {
        if (n2 != 0)
            return gcd(n2, n1 % n2);
        else
            return n1;
    }
    public static long gcd2(long n1,long n2){

     while(n1!=n2)   
    {  
       if(n1>n2)  
      n1=n1-n2;  
    else  
      n2=n2-n1;  
     }  
    return n2; 
    }
}