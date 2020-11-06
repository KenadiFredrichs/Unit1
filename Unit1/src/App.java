import java.util.Scanner;

public class App {
    public static void main(final String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        int num = 34;
        boolean finish = false;

        while (finish == false) {
            System.out.println("Pick a number between 0 and 100");
            int guess = input.nextInt();
            input.nextLine();

            if (guess == num) {
                System.out.println("Correct");
                finish = true;
            }

            else if (guess < num) {
                System.out.println("Too low");
            }

            else {
                System.out.println("Too high");
            }
        }

    }
    }

    

      