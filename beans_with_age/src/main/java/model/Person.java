package model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;

public class Person implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private LocalDate birthDate;
	
	public Person() {}
	public Person(String name, LocalDate birthDate) {
		this.name = name;
		this.birthDate = birthDate;
	}
	public String getName() {
		return name;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	public int getAge() {
		Period period = Period.between(birthDate, LocalDate.now());
		return period.getYears();
	}
}
