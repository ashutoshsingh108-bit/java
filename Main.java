import java.util.ArrayList;
import java.util.Collections;
class Student implements Comparable<Student> {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student s) {

    
        return s.age - this.age;
    }

    @Override
    public String toString() {
        return name + " - " + age;
    }
}

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("Rahul", 22));
        list.add(new Student("Aman", 19));
        list.add(new Student("Riya", 25));
        list.add(new Student("Karan", 20));

        System.out.println("Before sorting:");
        System.out.println(list);

        Collections.sort(list);

        System.out.println("After sorting by age:");
        System.out.println(list);
    }
}
