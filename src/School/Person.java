package School;

public class Person {
    protected String name;
    protected int age;
    protected String dob;
    private String ssn;
    private String address;
    private String phone;

    Person(String name, int age, String dob, String address, String phone, String ssn) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.address = address;
        this.phone = phone;
        this.ssn = ssn;
    }

    Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person(){}

}
