
public class Grades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int grade = 81;
	        String message = checkGrade(grade);
	        System.out.println(message);
	    }

	    public static String checkGrade(int grade) {
	        if (grade > 80) {
	            return "Congratulations on getting grade A+";
	        } else {
	            return "You need to work hard";
	        
	        }
	  }

}
