package sequenciaFibo;

import static sequenciaFibo.servers.Gerenciador.*;

public class MainFibo {
    public static void main(String[] args) {
        System.out.println("Informe um número:");
        leitorDeVariavel();

        calcularFibo();

        System.out.print("\nNúmero pertence a sequência? " + verificarSePertence());
    }

}