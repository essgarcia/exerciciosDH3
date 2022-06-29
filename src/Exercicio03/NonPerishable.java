package Exercicio03;

public class NonPerishable extends Product{
    private String productType;

    public double calculate(int productsQuantity){
        return getprice() * productsQuantity;
    }

    public NonPerishable(String name, double price, String productType) {
        super(name, price);
        this.productType = productType;
    }

    public NonPerishable() {

    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    @Override
    public String toString() {
        return "NonPerishable{" +
                "productType='" + productType + '\'' +
                '}';
    }
}
