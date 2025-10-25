import java.util.*;
public class Percentage{
    public static void main(String[] args){
        System.out.println("Enter marks of first subject:");
        Scanner sc=new Scanner(System.in);
        int m1=sc.nextInt();
        System.out.println("Enter marks of second subject:");
        int m2=sc.nextInt();
        System.out.println("Enter marks of third subject:");
        int m3=sc.nextInt();
        double per=(m1+m2+m3)/3.0;
        System.out.println("The percentage is:"+per);


    }
}