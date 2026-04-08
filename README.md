# Virtusa_OnlineQuizSystem
This is a console-based Online Quiz System built using Core Java.  
In this project, an admin can add quiz questions and a user can take the quiz with a time limit and get the score at the end.
## Project Structure
- Question.java  
  This class is used to store the question, options and correct answer.
- Admin.java  
  This class allows the admin to enter questions and store them.
- Quiz.java  
  This class handles the quiz process, shows questions, checks answers and calculates score.
- Main.java  
  This is the starting point of the program where everything is connected.
## Features
- Admin can add multiple questions  
- Multiple choice questions (A/B/C/D)  
- Each question has a time limit (15 seconds)  
- Answers are checked automatically  
- Final score and percentage is displayed  
- Performance is shown (Excellent, Good, Average, Poor)
## Concepts Used
- Object Oriented Programming concepts like classes and objects  
- Encapsulation for data hiding  
- ArrayList to store questions  
- Scanner for user input  
- System.currentTimeMillis() for timer logic  
## How It Works
1. Admin enters the questions and answers  
2. All questions are stored in an ArrayList  
3. User starts the quiz  
4. Questions are shown one by one  
5. User answers within the time limit  
6. Program checks the answer and updates score  
7. Final result with percentage is displayed  
