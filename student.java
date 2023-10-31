
    class student{
        int roll_no;
        String name;
        public static void main(String[] args){
            student stud_1 = new student();
            student stud_2 = new student();

            stud_1.name = "Ayushi";
            stud_1.roll_no = 22;

            stud_2.name = "xyz";
            stud_2.roll_no = 10;


            System.out.println("The name of the student is:" + " " + stud_1.name);
            System.out.println("The roll no. of the student is:" + " " + stud_1.roll_no);
            System.out.println("  ");
            System.out.println("The name of the student is:" + " " + stud_2.name);
            System.out.println("The roll no. of the student is:" + " " + stud_2.roll_no);
        }
    } 
   