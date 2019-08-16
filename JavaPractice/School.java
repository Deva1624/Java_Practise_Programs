class School { 
    // This is the inner class named Student
    class Student { 
		// This is a method in inner class Student
        public void print() { 
			System.out.println("Hi! I am inner class STUDENT of outer class SCHOOL."); 
        }
    }
}
public class Question211{ 
    public static void main(String[] args) {
        School sc = new Student();
        sc.print();
    }
}
