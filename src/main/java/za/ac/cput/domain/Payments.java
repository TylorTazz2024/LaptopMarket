package za.ac.cput.domain;

public class Payments {
    // N.Mathonsi (230999948)
    public static class Payment {
        private final int paymentID;
        private final double amount;
        private final String method;
        private String status;

        private Payment(Builder builder) {
            this.paymentID = builder.paymentID;
            this.amount = builder.amount;
            this.method = builder.method;
            this.status = builder.status;
        }

        public void processPayment() {
            this.status = "COMPLETED";
        }

        public static Builder builder() {
            return new Builder();
        }

        public int getPaymentID() { return paymentID; }
        public double getAmount() { return amount; }
        public String getMethod() { return method; }
        public String getStatus() { return status; }

        public static final class Builder {
            private int paymentID;
            private double amount;
            private String method;
            private String status = "PENDING";

            public Builder paymentID(int paymentID) {
                this.paymentID = paymentID;
                return this;
            }

            public Builder amount(double amount) {
                this.amount = amount;
                return this;
            }

            public Builder method(String method) {
                this.method = method;
                return this;
            }

            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Payment build() {
                validate();
                return new Payment(this);
            }

            private void validate() {
                if (paymentID <= 0) throw new IllegalArgumentException("Invalid payment ID");
                if (amount <= 0) throw new IllegalArgumentException("Amount must be positive");
                if (method == null || method.isBlank()) throw new IllegalArgumentException("Method is required");
                if (!status.equals("PENDING") && !status.equals("COMPLETED"))
                    throw new IllegalArgumentException("Invalid status");
            }
        }
    }
}