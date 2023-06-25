package Encapsulations;

import org.checkerframework.checker.units.qual.A;

public class AccountTest {
    public static void main(String[] args) {
        Account ac = new Account();
        ac.setAccNo(123456);
        ac.setName("Test");
        ac.setEmail("Test@gmail.com");
        ac.setAmount(12000);
        System.out.println("AccNo:"+ac.getAccNo()+", Name:"+ac.getName()+", Email:"+ac.getEmail()+", Amount:"+ac.getAmount());
    }
}
