package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ParseDateLogic {
	public LocalDate execute(String day) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate localDate = LocalDate.parse(day, fmt);
		return localDate;
	}
}
