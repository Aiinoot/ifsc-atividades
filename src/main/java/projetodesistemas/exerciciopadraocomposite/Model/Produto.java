package projetodesistemas.exerciciopadraocomposite.Model;

import projetodesistemas.exerciciopadraocomposite.Interfaces.Component;

public class Produto implements Component {
    public String nome;
    public Double valor;
    @Override
    public Double somaValores() {
        return valor;
    }

    @Override
    public String toString() {
        return "Produto{" + "nome='" + nome + '\'' + ", valor=" + valor + '}';
    }
    public Produto(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
    }
    public Produto() {
    }


}
