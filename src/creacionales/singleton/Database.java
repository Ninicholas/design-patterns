package creacionales.singleton;

public class Database {
    private static Database instance;

    public Database() {
        System.out.println("Creando instancia de la base de datos");
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public void query(String sql) {
        System.out.println("Ejecutando la consulta: " + sql);
    }
}
