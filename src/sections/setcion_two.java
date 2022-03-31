package sections;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class setcion_two extends JFrame {

    public setcion_two() {
        setSize(1024, 720);
        setVisible(true);
        setTitle("Elshafee Apps");
        Dimension dis = Toolkit.getDefaultToolkit().getScreenSize();

        int w = getSize().width;
        int h = getSize().height;
        int x = (dis.width - w) / 2;
        int y = (dis.height - h) / 2;
        setLocation(x, y);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        float a, b;
        char c;
        setcion_two frameclass = new setcion_two();
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the first number:  ");
        a = sc.nextFloat();
        System.out.print("Please enter the second number:  ");
        b = sc.nextFloat();
        System.out.print("Please enter the operation:  ");
        c = sc.next().charAt(0);
        float ou = operator(a, b, c);

        System.out.println("the resualt is:  " + ou);
        Window.getWindows();
    }

    private static float operator(float a, float b, char opera) {
        float sum = 0;
        System.out.println("Flutter is the future");
        if (opera == '+') {
            sum = a + b;
        } else if (opera == '-') {
            sum = Math.abs(a - b);
        } else if (opera == '*') {
            sum = a * b;

        } else if (opera == '/') {
            sum = a / b;
        } else {
            System.out.println("Error ecured please enter valid operation");
        }
        return sum;

    }


}
