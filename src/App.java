import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        double K, F, Re, Ra;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Me passe uma temperatura em Celsius para ser convertida: ");
        int cels = scanner.nextInt();

        K = cels + 273.15;
        F = cels * 1.8 + 32;
        Re = cels * 0.8;
        Ra = cels * 1.8 + 32 + 459.67;

        System.out.println("A temperatura " + cels + " celsius convertida em Kelvin ficará: " + K);
        System.out.println("A temperatura " + cels + " celsius convertida em Fahrenheit ficará: " + F);
        System.out.println("A temperatura " + cels + " celsius convertida em Réaumur ficará: " + Re);
        System.out.println("A temperatura " + cels + " celsius convertida em Rankine ficará: " + Ra);

        scanner.close();

    }
}
