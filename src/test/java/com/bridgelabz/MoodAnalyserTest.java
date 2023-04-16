package com.bridgelabz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
	@Test
	public void testAnalysisMoodSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
		String mood = moodAnalyser.analysisMood();
		assertEquals("SAD", mood);
	}

	@Test
	public void testAnalysisMoodHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
		String mood = moodAnalyser.analysisMood();
		assertEquals("HAPPY", mood);
	}

}
