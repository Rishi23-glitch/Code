import java.util.*;
public class prime {
    public static void main(String[] args) {
        System.out.println("Enter no. to check:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        boolean isprime=true;
        if(a<=1){
            isprime=false;
        }
        else{
            for(int i=2;i<a;i++)
            {
            if(a%i==0){
            isprime=false;   
            }
        break;
        }
        }
        if(isprime){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not");
        }
        
        
    }
    
}
