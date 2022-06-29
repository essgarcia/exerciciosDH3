package Exercicio03;

public class Perishable extends Product {
    private int daysToExpire;

    public Perishable(String name, double price, int daysToExpire) {
        super(name, price);
        this.daysToExpire = daysToExpire;
    }

    public Perishable() {

    }

    public double calculate(int productsQuantity){

        if (daysToExpire == 1){
            return (getprice() / 4) * productsQuantity;
        }
        if (daysToExpire == 2){
            return (getprice() / 3) * productsQuantity;
        }
        if (daysToExpire == 3){
            return (getprice() / 2) * productsQuantity;
        }

        return getprice() * productsQuantity;
    }

    public int getDaysToExpire() {
        return daysToExpire;
    }

    public void setDaysToExpire(int daysToExpire) {
        this.daysToExpire = daysToExpire;
    }

    @Override
    public String toString() {
        return "Perishable{" +
                "daysToExpire=" + daysToExpire +
                '}';
    }
}

