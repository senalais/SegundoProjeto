package main.java;

import main.java.vo.Cachorro;
import main.java.vo.Gato;

public class Main {

    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();

        System.out.println(cachorro1);
        cachorro1.atribuirIdade(2L);
        System.out.println(cachorro1);
        cachorro1.atribuirIdade(5L);
        System.out.println(cachorro1);
        cachorro1.atribuirIdade(8L);
        System.out.println(cachorro1);


        Gato gato1 = new Gato();

        System.out.println(gato1);
        gato1.atribuirIdade(2L);
        System.out.println(gato1);
        gato1.atribuirIdade(5L);
        System.out.println(gato1);
        gato1.atribuirIdade(8L);
        System.out.println(gato1);

        Cachorro cachorro2 = new Cachorro();
        System.out.println(cachorro2);
        cachorro2.atribuirRaca("chiuaua");
        System.out.println(cachorro2);
        cachorro2.atribuirRaca("cocker");
        System.out.println(cachorro2);
        cachorro2.atribuirRaca("labrador");
        System.out.println(cachorro2);
        cachorro2.atribuirRaca("Persa");
        System.out.println(cachorro2);


    }
}
