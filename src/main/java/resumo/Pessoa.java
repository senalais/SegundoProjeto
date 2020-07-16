package main.java.resumo;

public abstract class Pessoa {

    public String nome;
    public String sobrenome;
    public Integer idade;
    public Integer anoNascimento;
    public Double altura;
    public Double peso;

    public abstract void idade(Long idade);

}
