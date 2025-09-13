package org.example;
import java.util.Arrays;
public class Employee {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans;

    public Employee(int id, String fullName, String email, String password, String[] healthPlans){
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthPlans;
    }
    public int getId(){
        return this.id;
    }
    public String getFullName(){
        return this.fullName;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPassword(){
        return this.password;
    }
    public String[] getHealthPlans(){
        return this.healthPlans;
    }

    public void setId(int id){
        this.id=id;
    }
    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setHealthPlans(String[] healthPlans){
        this.healthPlans = healthPlans;
    }

    public void addHealthPlan(int index, String name) {
        if (index < 0 || index >= healthPlans.length) {
            System.out.println("İlgili index yok!");
            return;
        }

        if (healthPlans[index] == null) {
            healthPlans[index] = name;
        } else {
            System.out.println("Index dolu!");
        }
    }
    @Override
    public String toString() {
        return "Employee {" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", healthplans=" + Arrays.toString(healthPlans) +
                '}';
    }
}
