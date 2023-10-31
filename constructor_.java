class student{
    private String name;
    private int age;

    student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}


public class constructor_ {
    public static void main(String[] args){
        student s1 = new student("Ayushi", 19);
        student s2 = new student("Aryan", 16);

        System.out.println("s1: " + s1.getName() + " " + s1.getAge());
        System.out.println("s2: " + s2.getName() + " " + s2.getAge());
    }
}
