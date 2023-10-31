    public class cars{
        String modelName;
        int price;
        void setBudget(int price){
            System.out.println("Can i get this car for " + price + "?");
        }
        void setBudget(double price){
            System.out.println("Can i get this car for " + price + "?");
        }
    

    public static void main(String[] args) {
        cars car1 = new cars();
        cars car2 = new cars();
        car1.setBudget(1000000);
        car2.setBudget(1000000.500);

    }
  }

