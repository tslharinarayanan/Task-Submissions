package day1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class AgeCalculator  {
	public static void main(String[] args) throws Exception{

		String date = args[0];		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate localDate = LocalDate.parse(date,formatter);
		LocalDate now=LocalDate.now();		
		Period p=Period.between(localDate, now);
		System.out.println("Age of the given DOB is: "+p.getYears());
	}
}
