import java.util.Scanner;
public class ThursdayAssignment {
    public static void main(String[] args){
        // reversed number

        Scanner sc = new Scanner(System.in);

        int num;
        int reversedNum = 0;

        System.out.print("Enter any number: ");
        num = sc.nextInt();

        while (num > 0){
            int digit = num % 10;
            reversedNum = reversedNum*10 + digit;
            num = num /10;
        }
        System.out.printf("The reversed number is %d", reversedNum);



        sc.close();








    }
}
