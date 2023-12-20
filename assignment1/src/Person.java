/* TASK 1
 public class Person {
    String name;
    int age;

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Bakhytzhan";
        person.age = 17;

        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
    }
} */

/* TASK 2
public class Person {
    String name;
    int age;

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Bakhytzhan";
        person.age = 17;

        person.printDetails();
    }
} */

/* TASK 3
public class Person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Bakhytzhan");
        person.setAge(17);

        person.printDetails();
    }
} */

//TASK 4
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Person person = new Person("Bakhytzhan", 17);
        person.printDetails();
    }
}


