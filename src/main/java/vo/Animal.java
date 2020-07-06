package main.java.vo;

public abstract class Animal {

    public String nome;
    public String porte;
    public String raca;
    public String tipo;
    public Long idade;


    public abstract void atribuirIdade(Long idade);
    public abstract void atribuirRaca (String raca);


}
