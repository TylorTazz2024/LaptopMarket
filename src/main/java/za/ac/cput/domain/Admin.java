package za.ac.cput.domain;

import java.util.Objects;
/* Employee.java

     Admin POJO class

     Author: T.Malifethe (222602511)

     Date: 11 May 2025 */

public class Admin {
    private Long adminID;
    private String staffNumber;
    private String department;

    public Admin() {
    }

    public Admin(AdminBuilder builder) {
        this.adminID = builder.adminID;
        this.staffNumber = builder.staffNumber;
        this.department = builder.department;
    }

    public Long getAdminID() {
        return adminID;
    }

    public String getStaffNumber() {
        return staffNumber;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Admin)) return false;
        Admin admin = (Admin) o;
        return Objects.equals(adminID, admin.adminID) &&
                Objects.equals(staffNumber, admin.staffNumber) &&
                Objects.equals(department, admin.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adminID, staffNumber, department);
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminID=" + adminID +
                ", staffNumber='" + staffNumber + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    public static class AdminBuilder {
        private Long adminID;
        private String staffNumber;
        private String department;

        public AdminBuilder setAdminID(Long adminID) {
            this.adminID = adminID;
            return this;
        }

        public AdminBuilder setStaffNumber(String staffNumber) {
            this.staffNumber = staffNumber;
            return this;
        }

        public AdminBuilder setDepartment(String department) {
            this.department = department;
            return this;
        }

        public AdminBuilder copy(Admin admin) {
            this.adminID = admin.adminID;
            this.staffNumber = admin.staffNumber;
            this.department = admin.department;
            return this;
        }

        public Admin build() {
            return new Admin(this);
        }
    }
}
