import java.util.Scanner;

public class App {
    public static void main(final String[] args) throws Exception {
       Scanner input = new Scanner(System.in);
      System.out.println("Pick any number");
        int num1 = input.nextInt();
        input.nextLine();

        System.out.println("Pick a higher number");
        int num2 = input.nextInt();
        input.nextLine();

        for(int i = num1; i <= num2; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
     }
      
     

      
    }

    

      