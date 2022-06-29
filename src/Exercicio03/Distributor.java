package Exercicio03;

import java.util.ArrayList;
import java.util.List;

public class Distributor {
    public static void main(String[] args) {

        Product product = new Product();
        Perishable perishable = new Perishable();
        NonPerishable nonPerishable = new NonPerishable();
       // Scanner scan = new Scanner(System.in);
        int productQuantity;
        double total = 0.0;
        double totalNP = 0.0;

        List<Perishable> productsListP = new ArrayList<>();
        List<NonPerishable> productsListNP = new ArrayList<>();

        productsListP.add(new Perishable("Milk", 5, 3));
        productsListP.add(new Perishable("Meat", 20, 2));
        productsListP.add(new Perishable("Apple", 3, 1));
        productsListP.add(new Perishable("Grapes", 3, 1));
        productsListP.add(new Perishable("Banana", 3, 1));

        productsListNP.add(new NonPerishable("Pasta", 30, "Food"));
        productsListNP.add(new NonPerishable("Rice", 18, "Food"));
        productsListNP.add(new NonPerishable("Bread", 10, "Food"));
        productsListNP.add(new NonPerishable("Coffee", 7, "Food"));
        productsListNP.add(new NonPerishable("Sugar", 5, "Food"));

        for(int i = 0; i<productsListP.size() ; i++){
            total += productsListP.get(i).calculate(1);
        }
        System.out.println("Perishable prods: " + total);

        for (int i = 0; i < productsListNP.size(); i++) {
            totalNP += productsListNP.get(i).calculate(1);
        }
        System.out.println("NonPerishable prods: " + totalNP);
    }
}
