package za.ac.cput.domain;

public class Customer {
    private String shippingAddress;


    public Customer() {
    }


    private Customer(Builder builder) {
        this.shippingAddress = builder.shippingAddress;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "shippingAddress='" + shippingAddress + '\'' +
                '}';
    }


    public static class Builder {
        private String shippingAddress;

        public Builder setShippingAddress(String shippingAddress) {
            this.shippingAddress = shippingAddress;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }
    }
}




