package Consructor;

public class Student {
    String name = "Emily";
    int age =20;
    Student(String name, int age){
        this.name = name;
        this.age = 22;
    }

    public static void main(String[] args) {
        Student st = new Student("Mali",21);
        System.out.print(st.name);//mali
        System.out.print(", "+st.age);//22
    }
}
