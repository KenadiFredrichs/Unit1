import java.util.Scanner;

public class App {
    public static void main(final String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        String password = "Banana Phone";
        int tries = 0;
        boolean secretMess = false;

        while (tries < 3) {
            if (secretMess == false) {
                System.out.println("Enter the password");
                String enterPass = input.nextLine();

                if (enterPass.equals(password)) {
                    System.out.println("Accepted");
                    System.out.println("Your fridge is running");
                    secretMess = true;
                }

                else {
                    System.out.println("Declined");
                    tries++;
                    System.out.println("You have " + (3 - tries) + "remaining");
                }
            }
        }

        if (tries == 3) {
            System.out.println("Recieved limited amount of tries");
        }
    }
    }

    

      