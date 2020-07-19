package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.Conference;

public class ConferenceTest {

	@Test
	public void setMeetedTest() {
		Conference testconference = new Conference();
		testconference.setMeeted(false);
		assertEquals(false, testconference.getMeeted());
		
	}
}


