package calculator;

public class Product {
    String name;
    double price;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

//    public void setName(String name) {
//        this.name = name;
//        this.price = 0;
//    }

//    public void setPrice(double price) {
//        this.name = null;
//        this.price = price;
//    }

        public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

