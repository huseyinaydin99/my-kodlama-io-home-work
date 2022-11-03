package com.huseyinaydin.onetomany.util;

import java.util.Date;

import org.modelmapper.ModelMapper;

import com.huseyinaydin.onetomany.business.dtos.ProgrammingLanguageDto;
import com.huseyinaydin.onetomany.entities.concretes.ProgrammingLanguage;

import lombok.RequiredArgsConstructor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class DateTimeUtil {
	
	public static String convertDateToString(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(date);
	}

	public static Date convertStringToDate(String dateString) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		java.util.Date utilDate = sdf.parse(dateString);
		return new Date(utilDate.getTime());
	}

	public static String getCurrentMonthStartDate() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate today = LocalDate.now();
		return today.withDayOfMonth(1).format(formatter);
	}

	public static String getCurrentMonthDate() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate today = LocalDate.now();
		return today.format(formatter);
	}
	
	

}
