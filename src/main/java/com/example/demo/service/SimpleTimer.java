package com.example.demo.service;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SimpleTimer {

	@Value("${config.camle.timer.counter}")
	private Integer timerCounter;

	public void printTime() {
		DateTimeFormatter dtf = DateTimeFormatter.ISO_ZONED_DATE_TIME;

		while (timerCounter > 0) {
			ZonedDateTime now = ZonedDateTime.now();
			System.out.println("Current Time: " + dtf.format(now));
			timerCounter--;
		}
	}
}
