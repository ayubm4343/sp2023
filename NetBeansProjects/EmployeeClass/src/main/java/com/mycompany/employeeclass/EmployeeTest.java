/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeclass;

/**
 *
 * @author ayub
 */
public class EmployeeTest {
    public static void main(String[] args) {
        
        EmployeeClass emp1 = new EmployeeClass();
        EmployeeClass emp2 = new EmployeeClass("James", "Kent", 64000);

        System.out.println("hello");
        System.out.println(emp2.getSalary());
    }
}
      