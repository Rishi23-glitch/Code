import java.util.*;
public class leap {
    public static void main(String[] args) {
        System.out.println("Enter year to check:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%4==0){

            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}
