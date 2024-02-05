import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double fahr = getUserInput();
        while(fahr>-460){

            double celcTemp = conversion(fahr);
            displayOutput(celcTemp);
            fahr = getUserInput();
        }
        System.out.println("Thanks for playing");


    }
    static void displayOutput(double a){
        System.out.println(a);
    }
    static double getUserInput(){
        Scanner input= new Scanner(System.in);
        System.out.println("what the weather lookin like");
        double userInput = input.nextDouble();
        return userInput;
    }

    static double conversion(double userInput) {
        double newTemp = ((userInput - 32)*(5.0/9.0));
        return newTemp;
    }


}
