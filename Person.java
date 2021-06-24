package fs.apidef.identifyservice.java.BT_test_2;


public class Person {
    String name;
    String nationality;
    int age;

    public Person(String name, String nationality, int age) {
        this.name = name;
        this.nationality = nationality;
        this.age = age;
    }

    @Override
    public String toString() {
        return "- " + name  +
                "- " + nationality +
                " - " + age ;
    }
}


