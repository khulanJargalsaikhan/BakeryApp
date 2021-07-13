import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class BakeryApp {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in); // create scanner
        String response;

        BakedGood bakedGood1 = new BakedGood("banana bread", 5.95, "8/3/2021", "gluten-free", 10 );
        BakedGood bakedGood2 = new BakedGood("muffins", 17.50, "8/6/2021", "gluten-free", 6 );
        BakedGood bakedGood3 = new BakedGood("cinnamon swirl bread", 11.95, "8/1/2021", "gluten-free", "soy-free", 5 );
        BakedGood bakedGood4 = new BakedGood("cinnamon bread", 11.95, "7/21/2021", "diary-free", 15 );
        BakedGood bakedGood5 = new BakedGood("Multi-grain white bread", 11.95, "8/9/2021", "diary-free", 2 );
        BakedGood bakedGood6 = new BakedGood("Cinnamon Raisin Bread", 11.95, "8/3/2021", "diary-free", "soy-free", 6 );
        BakedGood bakedGood7 = new BakedGood("Lemon Blueberry Bread", 11.95, "8/3/2021", "diary-free", "nut-free", 16 );
        BakedGood bakedGood8 = new BakedGood("soft pizza crust", 7.95, "7/18/2021", "nut-free", 12 );
        BakedGood bakedGood9 = new BakedGood("Savory Rolls", 3.00, "8/3/2021", "nut-free", 17 );
        BakedGood bakedGood10 = new BakedGood("dinner rolls", 3.00, "8/10/2021", "gluten-free", "diary-free", 20 );
        BakedGood bakedGood11 = new BakedGood("Large Hamburger Buns", 5.00, "8/3/2021", "nut-free", "soy-free", 12 );
        BakedGood bakedGood12 = new BakedGood("Savory Empanadas", 42.00, "8/3/2021", "nut-free", "soy-free", 24 );
        BakedGood bakedGood13 = new BakedGood("Mint and Chocolate Sandwich Cookies", 19.95, "8/3/2021", "soy-free", 13 );
        BakedGood bakedGood14 = new BakedGood("Remedy Cookie Brownie Bar", 4.95, "8/3/2021", "soy-free", 4);
        BakedGood bakedGood15 = new BakedGood("Spring Cupcake Cups", 28.95, "8/3/2021", "soy-free", 12 );

        ArrayList<BakedGood> bakery = new ArrayList<>();
        bakery.add(bakedGood1);
        bakery.add(bakedGood2);
        bakery.add(bakedGood3);
        bakery.add(bakedGood4);
        bakery.add(bakedGood5);
        bakery.add(bakedGood6);
        bakery.add(bakedGood7);
        bakery.add(bakedGood8);
        bakery.add(bakedGood9);
        bakery.add(bakedGood10);
        bakery.add(bakedGood11);
        bakery.add(bakedGood12);
        bakery.add(bakedGood13);
        bakery.add(bakedGood14);
        bakery.add(bakedGood15);



            System.out.println("Welcome to our bakery!");  // Welcome Message

        do{
            System.out.println("Select a dietary restriction to show products:"+
                    "\n1: Gluten Free, 2: Dairy Free, 3: Nut Free, 4: Soy Free, 5: Show All");

            int answer = keyboard.nextInt();
            if (answer == 1){
                //show the goods that BakedGood.getDietaryRestriction == gluten
                for (int i=0; i<bakery.size(); i++){
                    if (bakery.get(i).getRestriction() == "gluten-free" || bakery.get(i).getRestriction2() == "gluten-free" ) {
                        bakery.get(i).displayBakedGood();
                    }
                }
            }
            else if (answer == 2){
                //show BakedGood.get
                for (int i=0; i<bakery.size(); i++){
                    if (bakery.get(i).getRestriction() == "diary-free" || bakery.get(i).getRestriction2() == "diary-free") {
                        bakery.get(i).displayBakedGood();
                    }
                }
            }
            else if (answer == 3){
                for (int i=0; i<bakery.size(); i++){
                    if (bakery.get(i).getRestriction() == "nut-free" || bakery.get(i).getRestriction2() == "nut-free") {
                        bakery.get(i).displayBakedGood();
                    }
                }
            }
            else if (answer == 4){
                for (int i=0; i<bakery.size(); i++){
                    if (bakery.get(i).getRestriction() == "soy-free" || bakery.get(i).getRestriction2() == "soy-free") {
                        bakery.get(i).displayBakedGood();
                    }
                }
            }
            else if (answer == 5){
                for (int i=0; i<bakery.size(); i++) {
                    bakery.get(i).displayBakedGood();
                }
            }
            else {
                System.out.println("Please enter a number between 1 - 5");
            }

            System.out.println("Would you like to try again? y/n");
            keyboard.nextLine();
            response = keyboard.nextLine().toLowerCase(Locale.ROOT);

        }while(response.charAt(0) == 'y');

        System.out.println("Thank you!");

    }
}
