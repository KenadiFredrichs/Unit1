package app;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println(input);

        System.out.println("Write a verb.");
        String verb = input.nextLine();
        System.out.println("Write a place.");
        String place = input.nextLine();
        System.out.println("Write a verb.");
        String verb2 = input.nextLine();
        System.out.println("Write a name.");
        String name = input.nextLine();
        System.out.println("Write a food.");
        String food = input.nextLine();

        System.out.println("It started off at the " + place + ". As always you went with " + name + ", who is a very good friend of yours. You " + verb + " all over the place. You asked " + name + " if they wanted to get food. They said yes and then you both " + verb2 + " to your favorite food truck that had " + food);
    }
}