package com.nist.lab.assignment;

import java.util.*;

public class Question {
	String question;
	List<String> optionList;
	int correctAnswer;
	
	public Question(String question,List<String> optionList, int correctAnswer) {
		this.question=question;
		this.optionList=optionList;
		this.correctAnswer=correctAnswer;
	}
}
