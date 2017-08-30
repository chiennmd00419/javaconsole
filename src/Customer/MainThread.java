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
public class MainThread extends Customer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Customer cus = new Customer(111, "chien", "chiennguyenminh@gamil.com", "16/04/1998", 111, "chưa đặt", 1);
       cus.selectProduct("tên lửa");
        cus.checkOut();
        
        System.out.println(cus.toString());
       
    }
    
}
