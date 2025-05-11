package za.ac.cput.domain;

import java.util.Date;
import java.util.Objects;

public class Order {
    private final int orderID;
    private final int userID;
    private final Date orderDate;
    private final String status;
    private final double totalAmount;

     private Order(OrderBuilder builder) {
        this.orderID = builder.orderID;
        this.userID = builder.userID;
        this.orderDate = new Date(builder.orderDate.getTime());
        this.status = builder.status;
        this.totalAmount = builder.totalAmount;
    }

    public int getOrderID() {
        return orderID;
    }

    public int getUserID() {
        return userID;
    }

    public Date getOrderDate() {
        return new Date(orderDate.getTime());
    }

    public String getStatus() {
        return status;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public boolean isOrderCompleted() {
        return "COMPLETED".equalsIgnoreCase(status);
    }

    // Builder Class
    public static class OrderBuilder {
        private int orderID;
        private int userID;
        private Date orderDate;
        private String status;
        private double totalAmount;

        public OrderBuilder setOrderID(int orderID) {
            this.orderID = orderID;
            return this;
        }

        public OrderBuilder setUserID(int userID) {
            this.userID = userID;
            return this;
        }

        public OrderBuilder setOrderDate(Date orderDate) {
            this.orderDate = new Date(orderDate.getTime());
            return this;
        }

        public OrderBuilder setStatus(String status) {
            this.status = status;
            return this;
        }

        public OrderBuilder setTotalAmount(double totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return orderID == order.orderID &&
                userID == order.userID &&
                Double.compare(order.totalAmount, totalAmount) == 0 &&
                Objects.equals(orderDate, order.orderDate) &&
                Objects.equals(status, order.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderID, userID, orderDate, status, totalAmount);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID=" + orderID +
                ", userID=" + userID +
                ", orderDate=" + orderDate +
                ", status='" + status + '\'' +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
