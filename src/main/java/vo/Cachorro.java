package main.java.vo;

public class Cachorro extends Animal {

    public void atribuirIdade(Long idade) {
        this.idade = idade;

        if (this.idade < 4) {
            this.tipo = "infantil";
        } else if (this.idade > 4 && this.idade < 7) {
            this.tipo = "jovem";

        } else if (this.idade > 7) {
            this.tipo = "senior";
        }
    }


    public void atribuirRaca(String raca) {
        this.raca = raca;
        if (this.raca == "chiuaua") {
            this.porte = "pequeno";
        } else if (this.raca == "cocker") {
            this.porte = "medio";
        } else if (this.raca == "labrador") {
            this.porte = "grande";
        } else {
            this.porte = "desconhecido";
        }


    }


    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                ", porte='" + porte + '\'' +
                ", raca='" + raca + '\'' +
                ", tipo='" + tipo + '\'' +
                ", idade=" + idade +
                '}';
    }
}

