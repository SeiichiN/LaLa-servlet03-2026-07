package test;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateSample {

	public static void main(String[] args) {
		// 文字列から日付を作成
		String inputDate = "2022/12/31";
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate localDate = LocalDate.parse(inputDate, fmt);
		System.out.println(localDate);    // 2022-12-31	
		
		// 年齢計算’
		Period period = Period.between(localDate, LocalDate.now());
		System.out.println(period.getYears() + "歳");    // 3歳
	}

}
