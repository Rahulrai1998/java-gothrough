package com.javalearning.test;

public class Test {
    public static void main(String[] args) {
//        Student student = new Student();
//        student.name = "Ramesh";
////        student.age = 56;
//        student.rollNumber = 2;
//        student.setAge(20);
//        System.out.println(student.name);
//        System.out.println(student.getAge());
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber(365987452);
        bankAccount.deposit(200);
        bankAccount.withdraw(10);
        System.out.println(bankAccount.getAccountNumber() + " " + bankAccount.getBalance());
    }
}
