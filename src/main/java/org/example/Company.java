package org.example;

import java.util.Arrays;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(int id, String name, double giro, String[] developerNames){
        if(giro >= 0){
            this.giro = giro;
        }
        this.id = id;
        this.name = name;
        this.developerNames = developerNames;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public double getGiro(){
        return this.giro;
    }
    public String[] getDeveloperNames(){
        return this.developerNames;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setGiro(double giro){
        if(giro >=0){
            this.giro = giro;
        }
    }
    public void setDeveloperNames(String[] developerNames){
        this.developerNames = developerNames;
    }
    public void addEmployee(int index, String name){
        if (index < 0 || index >= developerNames.length) {
            System.out.println("İlgili index yok!");
            return;
        }

        if (developerNames[index] == null) {
            developerNames[index] = name;
        } else {
            System.out.println("Index dolu!");
        }
    }

    @Override
    public String toString() {
        return "Company {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giro='" + giro + '\''  +
                ", developerNames=" + Arrays.toString(developerNames) +
                '}';
    }
}
