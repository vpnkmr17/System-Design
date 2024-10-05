public class Client {
    
    public static void main(String[] args) {
        // DataAccessLayer dalObj = new DataAccessLayer(new PostgresDatabase());
        // Migrate to MySQL database
        DataAccessLayer dalObj = new DataAccessLayer(new MySQLDatabase());
        dalObj.saveData();

        

    }
}
