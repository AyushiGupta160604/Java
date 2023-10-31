// relationship between parent and child class is also called "is a relationship"
// private members of the class can't get inherited and  constructor also doesn't get inherited
class human{ // super class/ base class/ parent class
    //private String name = "Ayushi";
    int age;
    human(){
        System.out.println("constructor of human class");
    }
    void sleep(){
        age = 18;
        System.out.println("Human needs good sleep");
        System.out.println(age);
    }
}

class student extends human{ // child class/ sub class/ derived class

}

class inheritance1{
    public static void main(String[] args) {
        student s1 = new student();
        s1.sleep();
       // s1.name(); this gives error because of private data access
    }
}