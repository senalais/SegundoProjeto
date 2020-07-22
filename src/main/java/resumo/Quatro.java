package main.java.resumo;

public class Quatro {
    public static void main(String args[]) {

        Integer novaVariavel = 0;
/*
novavariavel = 0
minhavariavel = 0
novaVariavel = novaVariavel + minhaVariavel;
0 = 0 + 0 =0

novavariavel = 0
minhavariavel = 1
novaVariavel = novaVariavel + minhaVariavel;
0 = 0 + 1 = 1


novavariavel = 1
minhavariavel = 2
novaVariavel = novaVariavel + minhaVariavel;
1 = 1 + 2 = 3

novavariavel = 3
minhavariavel = 3
novaVariavel = novaVariavel + minhaVariavel;
3 = 3 + 3 = 6

novavariavel =  6
minhavariavel = 4
novaVariavel = novaVariavel + minhaVariavel;
6 = 6 + 4 = 10

novavariavel = 10
minhavariavel = 5
novaVariavel = novaVariavel + minhaVariavel;
10 = 10 + 5 = 15

novavariavel = 15
minhavariavel = 6
novaVariavel = novaVariavel + minhaVariavel;
15 = 15 + 6 = 21
 */
        for (Integer minhaVariavel = 0; minhaVariavel < 10; minhaVariavel = minhaVariavel + 1) {
            novaVariavel = novaVariavel + minhaVariavel;
            System.out.println("valor atual da minha variavel " + novaVariavel);

        }

    }
}
