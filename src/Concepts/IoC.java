package Concepts;

public class IoC {
    public static void main(String[] args) {
        IoC container = new IoC();
        User user = container.new User();
        /*User user = container.new User(container.new MySQLDatabase());*/
        user.add("Some data");
    }

    public class User{
        MySQLDatabase database;

        public User(){
            database = new MySQLDatabase();
        }
        /*public User(MySQLDatabase database){
            this.database = database;
        }*/

        public void add(String data){
            database.persist(data);
        }
    }

    public class MySQLDatabase{
        public void persist(String data){
            System.out.println("MySQL has persisted: "+data);
        }
    }

}
