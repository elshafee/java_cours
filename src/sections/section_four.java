package sections;

public class section_four {


    public static void main(String[] args) {
        char[] myList = {'H', 'O', 'R', 'U', 'S'};
        char[] list_two = {'H', 'O', 'R', 'S', 'E'};

        char[] list_three = new char[myList.length];
        list_three[0] = 'd';
        int i = 0;
        for (char c : myList) {
            for (char m : list_two) {
                if (c == m) {
                    list_three[i] = c;
                    i++;

                }
            }


        }
        for (char n : list_three) {
            if (n != '\0') {
                System.out.print(n);

            }
        }


    }
}
