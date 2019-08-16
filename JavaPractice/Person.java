public class Person {

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

class Student extends Person {
    private int stuid = 0;
    private String dept = "";
    private int sem = 0;

    public void setStudId(int stuid) {
        this.stuid = stuid;
    }

    public int getStudId() {
        return this.stuid;
    }

    public void setDept(String Department) {
        this.dept = Department;
    }

    public String getDept() {
        return this.dept;
    }

    public void setSem(int sem) {
        this.sem = sem;
    }

    public int getSem() {
        if (this.sem > 8) {
            System.out.println("Invalid Semester");
            return 0;
        }
        return this.sem;
    }

    public void Student(String name, int age, String address, int studid, String dep, int sem) {
        super.setName(name);
        super.setAge(age);
        super.setAddress(address);
        this.setSem(sem);
        this.setDept(dep);
        this.setStudId(studid);
        name = super.getName();
        age = super.getAge();
        address = super.getAddress();

        sem = this.getSem();
        dep = this.getDept();
        studid = this.getStudId();

        System.out.println("Student Id: " + studid);
        System.out.println("Student Name: " + name);
        System.out.println("Age " + age);
        System.out.println("Department: " + dep);
        System.out.println("Semester: " + sem);
        System.out.println("Address " + address);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.Student("Deva", 20, "Salem", 23456, "MCA", 10);
    }
}