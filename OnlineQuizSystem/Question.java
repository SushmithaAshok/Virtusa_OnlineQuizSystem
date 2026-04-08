//this is the class which shows the blueprint for the quiz Q/A
public class Question {             
    //the bellow written are the private variables to store the Q/A and options
    private String quest;      
    private String A;          
    private String B;        
    private String C;          
    private String D;          
    private char ans;         
    //the constructor fill all the variables when the question is created
    public Question(String q, String a, String b, String c, String d, char ans) {
        this.quest = q;    
        this.A = a;    
        this.B = b;       
        this.C = c;      
        this.D = d;      
        this.ans = ans;   
    }
    //Get method which is used to read private variables 
    public String getQuest() { 
        return quest;   
    }
    public String getA() { 
        return A;       
    }
    public String getB() { 
        return B;      
    }
    public String getC() { 
        return C;      
    }
    public String getD() { 
        return D;       
    }
    public char getans() { 
        return ans;    
    }
}