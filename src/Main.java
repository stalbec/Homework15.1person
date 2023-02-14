import person.Builder;
import person.Driver;
import person.Person;
import person.Programmer;

public class Main {
    private static String getName;

    public static void main(String[] args) {
        Person driver = new Driver();
        Driver.setAge(35);
        System.out.println("Driver's name is:  " + driver.getName()+ Driver.getAge() + "years old");
        
        Person programmer = new Programmer();
        Programmer.setAge(27);
        System.out.println("Programmer's name is:  " + programmer.getName()+ Programmer.getAge()+ "years old");
        
        Person builder = new Builder();
        Builder.setAge(35);
        System.out.println("Builder's name is:  " + builder.getName()+ Builder.getAge()+ "years old");

    }
}