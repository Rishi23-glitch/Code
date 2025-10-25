package jk;
import java.util.*;

public class sumofdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;

        while (num > 0) {
            int res = num % 10;
            System.out.println("Digit = " + res);
            sum = sum + res;
            num = num / 10;
        }

        System.out.println("Sum of digits = " + sum);

	}

}
