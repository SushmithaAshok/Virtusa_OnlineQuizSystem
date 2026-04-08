import java.util.ArrayList;
import java.util.Scanner;
//this is the class which is used by the admin to add the questions
public class Admin {
    //the below list is used to store all the questions
    ArrayList<Question> QB = new ArrayList<>();
    //this method is used to get questions from the admin and store them
    public ArrayList<Question> getQuestions() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of questions:");
        int n = sc.nextInt();
        sc.nextLine();//this clears the buffer
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter the question:");
            String q = sc.nextLine();
            System.out.println("Enter option A:");
            String a = sc.nextLine();
            System.out.println("Enter option B:");
            String b = sc.nextLine();
            System.out.println("Enter option C:");
            String c = sc.nextLine();
            System.out.println("Enter option D:");
            String d = sc.nextLine();
            System.out.println("Enter the correct option (A/B/C/D):");
            char ans = sc.next().charAt(0);
            sc.nextLine();
            //create object of Question class
            Question obj = new Question(q, a, b, c, d, ans);
            QB.add(obj);
        }
        return QB;
    }
}