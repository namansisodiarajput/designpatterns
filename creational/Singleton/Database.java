package creational.Singleton;

public class Database {

    private String databaseName;
    private String host;
    private String port;
    private String userName;
    private String password;

    static private Database database;

    private Database() {}

    static Database getInstance() {

        if(database == null) {

            database = new Database();
            database.databaseName = "Mysql";
            database.host = "localhost";
            database.port = "8561";
            database.userName = "namaansisodia";
            database.password = "scobbyscoobydoo";
        }

        return database;
    }

    @Override
    public String toString() {
        return "Database{" +
                "databaseName='" + databaseName + '\'' +
                ", host='" + host + '\'' +
                ", port='" + port + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
