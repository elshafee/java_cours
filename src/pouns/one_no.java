package pouns;

import java.util.Scanner;

public class one_no {
    /*
     * author: Ahmad Khaled Elshafee
     *  ID: 1181318
     */


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int speed = 0;
        int value, num, fact = 0, select;
        System.out.print("please enter a value: ");
        value = input.nextInt();

        if (speed > value) {
            speed = decrement_speed(value, speed);
        } else if (speed < value) {
            speed = increment_speed(value, speed);
        } else {
            get_speed(speed);
        }
        System.out.println("the car is moving? " + is_moving(speed));

        System.out.println("please select in range [0 => 2], the car has:");
        System.out.println("0 => 1 door per each car");
        System.out.println("1 => 2 doors per each car");
        System.out.println("2 => 4 doors per each car");
        select = input.nextInt();

        if (select >= 0 && select <= 2) {
            if (select == 0) {
                fact = 1;
            } else if (select == 1) {
                fact = 2;
            } else {
                fact = 4;
            }

            System.out.print("number of cars you can see : ");
            num = input.nextInt();
            get_num_of_cars(num, fact);
        } else {
            System.out.print("Out of range please try again");

        }

    }

    public static int increment_speed(int value, int speed) {
        speed += value;
        System.out.println("speed is incremented, current speed is: " + speed);
        return speed;
    }


    public static int decrement_speed(int value, int speed) {
        speed -= value;
        System.out.println("speed is decremented, current speed is: " + speed);

        return speed;

    }

    public static void get_speed(int speed) {
        System.out.println("current speed is:  " + speed);

    }

    public static boolean is_moving(int speed) {
        boolean start;
        start = speed != 0;
        return start;
    }

    public static void get_num_of_cars(int num_of_doors, int factor) {
        int num_of_cars;
        num_of_cars = num_of_doors / factor;
        System.out.println("num of cars is" + num_of_cars);

    }

}












