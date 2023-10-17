import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Serie de Fibonacci");
        System.out.println("Ingresa el número de términos que desea calcular: ");
        int n = scanner.nextInt();

        System.out.println("Los primeros " + n + " términos de la serie de Fibonacci son: ");
        for (int i = 0; i < n; i++){
            System.out.println(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n){
        if (n <= 1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}