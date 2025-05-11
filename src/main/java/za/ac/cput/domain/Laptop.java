package za.ac.cput.domain;

/* Laptop.java
Laptop POJO Class
Author: Nontando Zondi 221248986
Date: 11 May 2025
*/

public class Laptop {

    private int laptopID;
    private String brand;
    private String model;
    private String specifications;
    private double price;
    private String condition;


    private Laptop (Builder builder) {

        this.laptopID = builder.laptopID;
        this.brand = builder.brand;
        this.model = builder.model;
        this.specifications = builder.specifications;
        this.price = builder.price;
        this.condition = builder.condition;
    }

    public int getLaptopID() { return laptopID; }

    public String getBrand() { return brand; }

    public String getModel() { return model; }

    public String getSpecifications() { return specifications; }

    public double getPrice() { return price; }

    public String getCondition() { return condition; }


    @Override
    public String toString() {
        return "Laptop { " +
                ", laptopID'" + laptopID + '\'' +
                ", brand'" + brand + '\'' +
                ", model'" + model + '\'' +
                ", specifications'" + specifications + '\'' +
                ", price'" + price + '\'' +
                ", condition'" + condition + '\'' +
                '}';
    }

    public static class Builder {

        private int laptopID;

        private String brand;

        private String model;

        private String specifications;

        private double price;

        private String condition;


        public Builder setLaptopID(int laptopID) {
            this.laptopID = laptopID;
            return this;
        }

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setSpecifications(String specifications) {
            this.specifications = specifications;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder setCondition(String condition) {
            this.condition = condition;
            return this;
        }

        public Builder copy(Laptop laptop) {
            this.laptopID = laptop.laptopID;
            this.brand = laptop.brand;
            this.model = laptop.model;
            this.specifications = laptop.specifications;
            this.price = laptop.price;
            this.condition = laptop.condition;
            return this;
        }

        public Laptop build() {
            return new Laptop(this);
        }
    }
}

