package main.java.vo;

public class Gato extends Animal {

    public void atribuirIdade(Long idade) {
        this.idade = idade;

        if (this.idade < 2) {
            this.tipo = "infantil";
        } else if (this.idade >= 2 && this.idade < 5) {
            this.tipo = "jovem";

        } else if (this.idade >= 5) {
            this.tipo = "senior";
        }
    }

    public void atribuirRaca (String raca) {

        this.raca = raca;
        if (this.raca == "Singapur") {
            this.porte = "pequeno";
        } else if (this.raca == "Siamês") {
            this.porte = "medio";
        } else if (this.raca == "Persa") {
            this.porte = "grande";
        } else {
            this.porte = "desconhecido";
        }
    }
    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", porte='" + porte + '\'' +
                ", raca='" + raca + '\'' +
                ", tipo='" + tipo + '\'' +
                ", idade=" + idade +
                '}';
    }
}

