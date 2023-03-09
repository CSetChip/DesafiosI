package sequenciaFibo.servers;

import java.util.Scanner;

public class Gerenciador {

    private static Scanner scanner;
    private static int var;
    private static boolean pertenceSequencia = false;

    public static void leitorDeVariavel(){
        scanner = new Scanner(System.in);
        var = scanner.nextInt();
    }

    public  static  void calcularFibo(){
        Fibonacci fibonacci = new Fibonacci();

        for (int i = 0; i < var; i++) {
            int valorFibo = fibonacci.fibo(i);
            if (valorFibo == var) pertenceSequencia = true;
            System.out.print("(" + i + "):" + valorFibo + "\t");
        }
    }

    public static boolean verificarSePertence(){
        return pertenceSequencia;
    }
}
