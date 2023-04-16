package com.bridgelabz;

public class MoodAnalyser {
	private String message;

	public MoodAnalyser() {
		message = "";
	}

	public MoodAnalyser(String message) {
		this.message = message; // Set the message field with the passed parameter
	}

	public String analysisMood() {
		if (message.contains("Sad")) {
			return "SAD";
		} else {
			return "HAPPY";
		}
	}
}
