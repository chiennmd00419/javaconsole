/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer;

/**
 *
 * @author chien
 */
public class Customer {

    private int id;
    private String name;
    private String emaill;
    private String birthday;
    private int balance;
    private String avatar;
    private int status;

    public Customer() {
    }

    public Customer(int id, String name, String emaill, String birthday, int balance, String avatar, int status) {
        this.id = id;
        this.name = name;
        this.emaill = emaill;
        this.birthday = birthday;
        this.balance = balance;
        this.avatar = avatar;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmaill() {
        return emaill;
    }

    public void setEmaill(String emaill) {
        this.emaill = emaill;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void selectProduct(String ProductName) {
        System.out.println("Khách hàng đã chọn sản phẩm" + ProductName + ".");
    }

    public void checkOut() {
        System.out.println("Khách hàng đã thực hiện thanh toán hóa đơn.");
    }

    @Override
    public String toString() {
        return "Khách Hàng\n"
                + " số thứ : " + id + "\n"
                + " tên là: " + name + "\n"
                + " có email là :" + emaill + "\n"
                + " ngày sinh :" + birthday + "\n"
                + " có số tiền trong tài khoản là: " + balance + "\n"
                + " ảnh đại diện: " + avatar + "\n"
                + " status= :" + status;
    }

}
