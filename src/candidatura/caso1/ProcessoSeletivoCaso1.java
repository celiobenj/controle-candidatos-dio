package candidatura.caso1;

import java.util.Scanner;

public class ProcessoSeletivoCaso1 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        analisarCandidato(scanner.nextDouble());

    }

    static void analisarCandidato(double salárioPretendido) {

        final double salárioBase = 2000.0;

        if (salárioBase > salárioPretendido) System.out.println("LIGAR PARA O CANDIDATO");
        else if (salárioBase == salárioPretendido) System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA");
        else System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");

    }
}