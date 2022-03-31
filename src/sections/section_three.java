package sections;

public class section_three {

    public static void main(String[] args) {
        int v = 10;
        int s = 0;
        for (int i = 0; v > i; i++) {
            for (int e = 0; v - i > e; e++) {
                System.out.print(" ");
            }
            for (int j = 0; i > j; j++) {
                System.out.print("**");
            }

            System.out.println();
        }
        for (int i = 0; v > i; i++) {
            for (int e = 0; v - i > e; e++) {
                System.out.print(" ");
            }
            for (int j = 0; i > j; j++) {
                System.out.print("**");
            }

            System.out.println();
        }

    }
}
