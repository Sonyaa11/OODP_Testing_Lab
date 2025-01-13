package Workshop7;

/**
     *This class hold the information of student
    */
public class Student extends Person {
    public int studentNumber;
    public int average;
    
    /**
     *This method checks if student is eligible to enroll or not.
     * @param name it takes a string parameter
     * @return True or False
    */
    public boolean isEligibleToEnroll(String name){
        
        return true;
    }
    
    /**
     *This method checks if information is true or not.
     * It does not take any parameter.
     * @return number of seminar taken
    */
    public int getSeminarsTaken(){
        return 0;
    }
}
