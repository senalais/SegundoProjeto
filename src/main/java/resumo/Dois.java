package main.java.resumo;


public class Dois {
    public static void main(String args[]) {
        Double nota = 6.5;
        final Double APROVADO = 6.0;
        final Double RECUPERACAO = 2.0;

        if (nota < RECUPERACAO) {
            System.out.println("REPROVADO, SEM RECUPERACAO");
        } else if ((nota >= RECUPERACAO) && (nota <= APROVADO)) {
            System.out.println("REPROVADO, COM RECUPERACAO");
        } else {
            System.out.println("APROVADO");
        }

    }
}



