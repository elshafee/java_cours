package sections;

public class section_five {

    public static void main(String[] args) {
        int[][] myArray = {{10, 5}, {20, 40}, {60, 70}, {100, 1000}};


//        int row = myArray.length;
        int column = myArray[0].length;
        for (int[] ints : myArray) {
            for (int y = 0; y < column; y++) {
                System.out.print(ints[y]);
                System.out.print(" ");

            }
            System.out.println(" ");

        }
    }
}
