package projetodesistemas.classesabstratas;

public class Trabalhador extends Pessoa{
    private int empresaId;

    public Trabalhador(String nome, String sexo, int empresaId) {
        super(nome, sexo);
        this.empresaId = empresaId;
    }

    @Override
    public void trabalha() {
        if (empresaId == 0){
            System.out.println("Não está trabalhando");
        } else {
            System.out.println("Está trabalhando");
        }

    }
}
