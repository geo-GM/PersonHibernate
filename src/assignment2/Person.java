package assignment2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class Person {

    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private int age;
    @Column(name = "address")
    private String address;
    @Column(name = "salary")
    private double salary;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "person_id")
    private int id;

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString(){
    return "Id: " + id + "; Name: "+ name + "; Age: " + age + "; Address: " + address + "; Salary: " + salary + "\n" ;
    }
}
