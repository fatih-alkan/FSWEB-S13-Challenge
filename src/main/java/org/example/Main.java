package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        String names[] = {"ahmet", "mehmet", "can"};
        Company company = new Company(1, "fatih", 250.4, names);
        System.out.println(company.toString());
        Healthplan healthplan = new Healthplan(2, "fatih", Plan.BASIC);
        System.out.println(healthplan.toString());
        Employee employee = new Employee(4, "fatih alkan", "test@test","sifre.04",names);
        System.out.println(employee.toString());
    }
}