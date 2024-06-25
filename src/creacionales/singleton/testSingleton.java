package creacionales.singleton;

public class testSingleton {
    public static void main(String[] args) {
        Database db1 = Database.getInstance();
        db1.query("SELECT * FROM users");

        Database db2 = Database.getInstance();
        db2.query("SELECT * FROM products");
    }
}
