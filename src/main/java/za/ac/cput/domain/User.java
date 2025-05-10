package za.ac.cput.domain;

public class User {
    private int userID;
    private String firstname;
    private String email;
    private String phone;
    private String role;


    private User(Builder builder) {
        this.userID = builder.userID;
        this.firstname = builder.firstname;
        this.email = builder.email;
        this.phone = builder.phone;
        this.role = builder.role;
    }


    public int getUserID() {
        return userID;
    }

    public String getfirstname() {
        return firstname;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getRole() {
        return role;
    }


    public static class Builder {
        public String firstname;
        private int userID;
        private String email;
        private String phone;
        private String role;

        public Builder setUserID(int userID) {
            this.userID = userID;
            return this;
        }

        public Builder setfirstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setRole(String role) {
            this.role = role;
            return this;
        }


        public Builder copy(User user) {
            this.userID = user.getUserID();
            this.firstname = user.getfirstname();
            this.email = user.getEmail();
            this.phone = user.getPhone();
            this.role = user.getRole();
            return this;
        }

        public User build() {
            return new User(this);
        }

        @Override
        public String toString() {
            return "User.Builder{" +
                    "userID=" + userID +
                    ", firstname='" + firstname+ '\'' +
                    ", email='" + email + '\'' +
                    ", phone='" + phone + '\'' +
                    ", role='" + role + '\'' +
                    '}';
        }
    }
}
