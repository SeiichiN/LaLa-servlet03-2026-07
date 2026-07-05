package test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateSample {

	public static void main(String[] args) {
		String inputDate = "2022/12/31";
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate localDate = LocalDate.parse(inputDate, fmt);
		System.out.println(localDate);	

	}

}
