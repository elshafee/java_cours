package quiz;

import java.util.Scanner;

public class quiz_one {

    public static void main(String[] args) {
        int num_one, num_two, num_three, sum, select = 0;
        double avarage = 0.0;
        System.out.println("Hello, I'm your mathematical Assistant");
        System.out.println("I can help you to calculate the average and sum of any three number let's Start,");

        System.out.print("please type your first number:");
        Scanner in_one = new Scanner(System.in);
        num_one = in_one.nextInt();

        System.out.print("please type your Second number:");
        Scanner in_two = new Scanner(System.in);
        num_two = in_two.nextInt();

        System.out.print("please type your third number:");
        Scanner in_three = new Scanner(System.in);
        num_three = in_three.nextInt();


        System.out.println("Please Select the process you need to do:");
        System.out.println(" 0 => sum");
        System.out.println(" 1 => average");
        Scanner sel = new Scanner(System.in);
        select = sel.nextInt();

        switch (select) {
            case 0:
                sum = sum(num_one, num_two, num_three);
                System.out.println("the sum of your three numbers is: " + sum);

            case 1:
                avarage = ava(num_one, num_two, num_three);
                System.out.println("the average of your three numbers is: " + avarage);


            default:
                System.out.println("Error, out of range");
                sum = sum(num_one, num_two, num_three);
                avarage = ava(num_one, num_two, num_three);
                System.out.println("the sum of your three numbers is: " + sum);
                System.out.println("the average of your three numbers is: " + avarage);


        }

        System.out.println("thanks for using me if you need any mathematical help I'm here");


    }

    private static int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    private static double ava(int num1, int num2, int num3) {
        double avar = num1 + num2 + num3;
        avar = avar / 3;
        return avar;
    }
}
