class Person {

    private String name = "";
    private String lname = "";
    private int age = 0;
    private String address = "";

    // public void Person(int age,String name,String address){

    // }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setLname(String name) {
        this.lname = name;
    }

    public String getLname() {
        return this.lname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }
}

public class Student extends Person {
    private int stuid = 0;
    private String dept = "";
    private int sem = 0;

    public void Student(String name, int age, String address) {
        super.setName(name);
        super.setAge(age);
        super.setAddress(address);
        System.out.println("Student Name: " + super.getName());
        System.out.println("Age " + super.getAge());
        System.out.println("Address " + super.getAddress());
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.Student("Deva", 20, "Salem");
    }
}