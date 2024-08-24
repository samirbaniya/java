package com.nist.lab.assignment;

import java.util.*;
public class Quiz {
    Scanner sc = new Scanner(System.in);
    Scanner scString = new Scanner(System.in);
    List<Question> questionList = new ArrayList<>();

    public void setQuestion() {
        Question q1 = new Question("Which area in Nepal is recognized "
        		+ "as the birthplace of Lord Buddha?", Arrays.asList("1.Patan",
        				"2.Bhaktapur", "3.Lumbini", "4.Janakpur"), 3);
        Question q2 = new Question("What is the capital city of Nepal?",
        		Arrays.asList("1. Pokhara", "2.Kathmandu", "3.Bhaktapur", "4."
        				+ "Lalitpur"), 2);
        Question q3 = new Question("Who is known as the father of "
        		+ "computer?", Arrays.asList("1.Alan Turing", "2.Bill Gates"
        				, "3.Steve Jobs", "4.Charles Babbage"), 4);
        Question q4 = new Question("Which animal is considered as the "
        		+ "national animal of Nepal?", Arrays.asList("1.Cow", "2.Tiger", 
        				"3.Elephant", "4.Lion"), 1);
        questionList.add(q1);
        questionList.add(q2);
        questionList.add(q3);
        questionList.add(q4);
        
        Collections.shuffle(questionList);

    }

    public void play() {
        questionList.clear();
        setQuestion();

        System.out.println("Enter your name:");
        String name = scString.nextLine();
        int score = 0;

        for (Question q : questionList) {
            System.out.println("====================================\n"+q.question);
            System.out.println(q.optionList);
            int userChoice = sc.nextInt();
            if (userChoice == q.correctAnswer) {
                System.out.println("Correct answer");
                score += 1;
            } else {
                System.out.println("Incorrect answer");
                System.out.println("Correct answer is: " + q.optionList.get(q.correctAnswer
                		- 1));
            }
        }

        System.out.println(name + "'s score is " + score);
    }

    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        quiz.play();
    }
}

