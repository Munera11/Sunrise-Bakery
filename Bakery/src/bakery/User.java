
package bakery;

public class User {
private String id;
private String name;
private int age;
public static int numOfUsers;

    public User() {
        numOfUsers++;
    }

    public User(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        numOfUsers++;
    }

    

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void menu()
         {
           System.out.println("                             ~~~***~~~***~~~***~~~ SUNRISE BAKERY ~~~***~~~***~~~***~~~");
         }

    @Override
    public String toString() {
        return  "\n ID: " + id + "\n Name: " + name + "\n Age: " + age;
    }

    
}
