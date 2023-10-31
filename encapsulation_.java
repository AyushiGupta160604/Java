class student{
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }
}




public class encapsulation_{
    public static void main(String[] args){
        student s1 = new student();
        s1.setName("Ayushi Gupta");
        s1.setAge(19);
        student s2 = new student();
        s2.setName("Aryan Gupta");
        s2.setAge(16);
        System.out.println("s1: " + s1.getName()+ " " + s1.getAge());
        System.out.println("s2: " + s2.getName()+ " " + s2.getAge());
    }
}