import java.util.Scanner;

public class Tem_con {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double f;
        double c;
        int choice;

        do{
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter temperature in Fahrenheit");
                    f = sc.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + FtoC(f));
                    break;
                case 2:
                    System.out.println("Enter temperature in Celsius");
                    c = sc.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + CtoF(c));
                    break;
                case 0:
                    System.exit(0);
            }

        }while (choice != 0);


    }

    public static double CtoF(double c){
        double f = (9.0 / 5) * c + 32;
        return f;
    }

    public static double FtoC(double f){
        double c = (5.0 / 9) * (f - 32);
        return c;
    }
}
