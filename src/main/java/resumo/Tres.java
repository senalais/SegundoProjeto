package main.java.resumo;

public class Tres {
    public static void main(String args[]) {
        Integer vida = 100;
        final Integer SEM_VIDA = 0;
        final String GOLPE_NA_PERNA = "Golpe na perna";
        final String GOLPE_NO_BRACO = "Golpe no braço";
        final String GOLPE_NA_BARRIGA = "Golpe na barriga";
        String meuGolpe = "Golpe na perna";

        while (vida > SEM_VIDA) {
            System.out.println("Vida atual " + vida);

            if (meuGolpe == GOLPE_NA_PERNA) {
                System.out.println("Personagem recebeu um golpe na perna");
                vida = vida - 25;
                meuGolpe = GOLPE_NA_BARRIGA;
            } else if (meuGolpe == GOLPE_NA_BARRIGA) {
                System.out.println("Personagem recebeu um golpe na barriga");
                vida = vida - 10;
                meuGolpe = GOLPE_NO_BRACO;
            } else if (meuGolpe == GOLPE_NO_BRACO) {
                System.out.println("Personagem recebeu um golpe nno braço");
                vida = vida - 05;
                meuGolpe = GOLPE_NA_PERNA;
            }
            System.out.println("Vida apos golpe " + vida);

        }
        System.out.println("Personagem morreu.");
    }
}

