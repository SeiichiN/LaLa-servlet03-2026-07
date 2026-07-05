package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ParseDateLogic {
	public LocalDate execute(String dateTxt) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate localDate = LocalDate.parse(dateTxt, formatter);
		return localDate;

	}
}
