package Consructor;

public class St2 {
    String name;
    int age;
    String phone;

    St2(){}
    St2(String name, int age, String phone){
        this.name = name;
        this.phone = phone;
        this.age = age;
    }

    public static void main(String[] args) {
       St2 s = new St2();
       St2 s2 = new St2("Ali",23,"1234567");
        System.out.println(s2.name+", "+s2.age+", "+s2.phone); //Ali, 0, 1234567
    }
}
