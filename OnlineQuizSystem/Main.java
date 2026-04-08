import java.util.ArrayList;
import java.util.Scanner;
//this is the starting point of the program
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===============================");
        System.out.println("     WELCOME TO QUIZ SYSTEM    ");
        System.out.println("===============================");
        //the admin adds questions
        System.out.println("Admin - Please add questions first");
        Admin admin = new Admin();
        ArrayList<Question> questions = admin.getQuestions();
        //start quiz for user
        System.out.println("\nQuestions added successfully!");
        System.out.println("Starting quiz...\n");
        Quiz quiz = new Quiz();
        quiz.startQuiz(questions);
    }
}