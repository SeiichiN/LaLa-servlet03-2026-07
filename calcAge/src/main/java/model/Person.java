package model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;

public class Person implements Serializable {
	private String name;
	private LocalDate birthDate;
	
	public Person() {}
	public Person(String name, LocalDate birthDate) {
		this.name = name;
		this.birthDate = birthDate;
	}
	public Person(String name) {
		this(name, null);
	}
	public String getName() { return name; }
	public LocalDate getBirthDate() { return birthDate; }
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	public int getAge() {
		// year = 現在 - 誕生日　を　年数
		Period period = Period.between(birthDate, LocalDate.now());
		return period.getYears();
	}
}
