package projetodesistemas.ClassesAbstratas;

public abstract class Pessoa {
    private String nome;
    private String sexo;

    public Pessoa(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public void alteraNome(String novoNome){
        this.nome = novoNome;
    }

    public abstract void trabalha();

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}




