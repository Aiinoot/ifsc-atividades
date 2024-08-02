package projetodesistemas.singleton;

public class Main {
    public static void main(String[] args) {
        Database.getInstance().getConnection();
    }
}
