package com.baeldung.java8.comparator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Employee implements Comparable<Employee>{
    String name;
    int age;
    double salary;
    long mobile;
    
    
    protected Employee(String name, int age, double salary, long mobile) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.mobile = mobile;
	}

	@Override
    public int compareTo(Employee argEmployee) {
        return name.compareTo(argEmployee.getName());
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
    
    
}
