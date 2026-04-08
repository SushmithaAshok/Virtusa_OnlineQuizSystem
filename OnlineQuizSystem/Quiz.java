import java.util.ArrayList;
import java.util.Scanner;
//this is the class which is used to conduct the quiz
public class Quiz {
    //this method is used to start the quiz
    public void startQuiz(ArrayList<Question> questions) {
        Scanner sc = new Scanner(System.in);
        int marks = 0;
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);
            System.out.println("\nQuestion:" + q.getQuest());
            System.out.println("A:" + q.getA());
            System.out.println("B:" + q.getB());
            System.out.println("C:" + q.getC());
            System.out.println("D:" + q.getD());
            System.out.println("You have 15 seconds!");
            //store start time
            long start = System.currentTimeMillis();
            System.out.println("Enter the correct option(A/B/C/D):");
            char ans = sc.next().charAt(0);
            //store end time
            long end = System.currentTimeMillis();
            //calculate time taken
            long tt = end - start;
            if (tt > 15000) {
                System.out.println("Time up!");
            } 
            else if (ans == q.getans()) {
                System.out.println("Correct");
                marks++;
            } 
            else {
                System.out.println("Wrong");
                System.out.println("The correct answer is: " + q.getans());
            }
        }

        showResult(name, questions.size(), marks);
    }
    //this method is used to display the final result
    public void showResult(String name, int total, int marks) {
        System.out.println("\nResult");
        System.out.println("Name: " + name);
        System.out.println("Total Questions: " + total);
        System.out.println("Score: " + marks);
        int p = (marks * 100) / total;
        System.out.println("Percentage: " + p + "%");
        if(p >= 80) {
            System.out.println("Excellent");
        } else if(p >= 60) {
            System.out.println("Good");
        } else if(p >= 40) {
            System.out.println("Average");
        } else {
            System.out.println("Poor");
        }
    }
}