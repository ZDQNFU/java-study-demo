package test;

public class Person {
    Person() {
        System.out.println("Person");
    }
}

class Student extends Person {

    private Integer age = 18;

    Student() {
        //super()会出现在构造方法的第一行代码，无论写或不写，都存在；
        //注意：若在构造方法中显示的调用父类的有参构造方法，此时super()不会默认提供
        System.out.println("Student");
    }

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.age);
    }

}
