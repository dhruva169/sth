package com.macd.sth.models;

public class user_login_details {
    private int empID;
    private String password, confirmPassword, designation;
    private boolean isEnabled;

    public user_login_details(int empID, String password, String confirmPassword, String designation, boolean isEnabled) {
        this.empID = empID;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.designation = designation;
        this.isEnabled = isEnabled;
    }

    public user_login_details(){

    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }
}
