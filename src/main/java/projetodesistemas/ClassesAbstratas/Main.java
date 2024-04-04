package projetodesistemas.ClassesAbstratas;

public class Main {
    public static void main(String[] args) {
        Pessoa professor = new Trabalhador("João", "M", 1);
        Trabalhador funcionario = new Trabalhador("Maria", "F", 0);

        System.out.println(professor.toString());
        professor.alteraNome("Marcos");
        professor.trabalha();

        System.out.println(funcionario.toString());
        funcionario.trabalha();
    }
}
