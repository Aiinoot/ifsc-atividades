package projetodesistemas.marco;

public class Database {

    private static Database database;

    private Database() {
    }

    public void getConnection(){
        System.out.println("Conexão Aberta");
    }
    public static synchronized Database getInstance(){
        if (database == null){
            database = new Database();
        }
        return database;
    }

}
