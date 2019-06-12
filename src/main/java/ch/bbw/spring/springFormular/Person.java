package ch.bbw.spring.springFormular;

import java.util.Date;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

public class Person {

	@NotNull
	@Size(min=2, max=8)
	private String name;
	
	@NotNull
	@Size(min=2, max=8)
	private String firstName;
		
	@NotNull
	@Min(10)
	@Max(70)
	private int age;
	
	@DecimalMin("1.0")
	@DecimalMax("6.0")
	private double grade;
	
	@Past
	private Date date;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", grade=" + grade + "]";
	}

}
