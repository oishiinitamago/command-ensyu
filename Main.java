import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner stdIn = new Scanner(System.in);

                System.out.print("g’·(m)‚ğ‹³‚¦‚Ä‚­‚¾‚³‚¢:");
                double height = stdIn.nextDouble();
                System.out.print("‘Ìd(kg)‚ğ‹³‚¦‚Ä‚­‚¾‚³‚¢:");
                double weight = stdIn.nextDouble();

                double bmi = weight / (Math.pow(height, 2) * 100) * 100;

                System.out.println("BMI’l‚Í"+ (Math.floor(bmi * 100)) / 100);
        }
}

