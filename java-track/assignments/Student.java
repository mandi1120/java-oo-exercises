import java.util.ArrayList;

public class Student  {
	
	public String first_name;
	public String last_name;
	public int StudentID;
	public int Credits;
	public double GPA;

	public Student (String first_name, String last_name, Integer StudentID) {
		this.last_name = last_name;
		this.first_name = first_name;
		this.StudentID = StudentID;
		this.Credits = 0;
		this.GPA = 0;
	}
	public Student (Student student1, Student student2) {
		this.first_name = student1.getName();
		this.last_name = student2.getName();
		this.StudentID = student1.getStudentID() + student2.getStudentID();
		this.GPA = (student1.getGPA() + student2.getGPA()) / 2;
		this.Credits = Math.max(student1.getCredits(), student2.getCredits());
		return ;
	}
	
	public String getName() {
		return this.first_name + " " + this.last_name;
	}
	
	public int getStudentID() {
		return this.StudentID;
	}
	public int getCredits() {
		return this.Credits;
	}
	public double getGPA(){
		return this.GPA;
	}
	
	public String getClassStanding() {
		if (this.Credits < 30) {
			return "Freshman";
		} else if (this.Credits >= 30 && this.Credits < 60) {
			return "Sophomore";
		} else if (this.Credits >= 60 && this.Credits < 90) {
			return "Junior";
		} else if (this.Credits >= 90) {
			return "Senior";
		}
		return "no class standing";
	}
	
	public void submitGrade(double courseGrade, int courseCredits) {
///Take the number of credits for a course and multiply it by the grade for that course. 
///This is called the quality score. GPA is computed as the sum of all of the quality 
///scores for each course the student has taken, divided by the total number of credits.
///You should also round the GPA so that it only contains three digits after the decimal.
		double qualityScore = courseGrade * courseCredits;
		double oldqualityScore = this.GPA * this.Credits;
		this.Credits = this.Credits + courseCredits;
		this.GPA = (qualityScore + oldqualityScore) / this.Credits;
		this.GPA = (double) (Math.round(this.GPA * 1000)) / 1000;
		
	
	}
	
	public double computeTuition() {
//returns the total amount of tuition the student has paid. 
//The average cost of tuition for 1 semester in the United States is 
//roughly $20,000. Assume that there are 15 credit hours per semester, 
//and that any "leftover" credits are computed at the proportional rate.
        double tuition = 0;
        if (this.Credits ==15){
        	tuition = 20000;}
        else if (this.Credits > 15){
        	tuition = 20000 + (1333.33 * (this.Credits -15));}
        else {
        	tuition = this.Credits * 1333.33;}

//        else if (this.Credits % 15 == 0) {
//        	tuition = 20000 * (this.Credits /15);}
//        else if (this.Credits % 15 > 0) {			
//        	tuition = (1333.33 * this.Credits);}
		return (tuition);
	}
	
	public Student createLegacy(Student student1, Student student2) {
//it is not unusual for two students to meet at college, get married, start a family, 
//and send their children to the same school. This method should take a Student object 
//as a parameter then create a new Student object based on the following criteria:
//Use one parent's full name as the baby's first name, the other parent's full name as the baby's last name
//Assign the baby a student ID that is the sum of its parents IDs.
//The legacy's estimated GPA will be the average of its parents GPA.
//The legacy's estimated number of credits will be the maximum of its parents credits
//Hint: it may be useful to create an additional constructor!
		Student legacy = new Student(student1, student2);
		return legacy;
	}
	
//- returns the students full name and student ID
	public String toString(){
		String name = (first_name + " " + last_name + " " + StudentID);
		return name;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student new_student = new Student ("mandi", "hanway", 1);
		System.out.println(new_student.getName());
		System.out.println(new_student.getStudentID());
		System.out.println(new_student.getCredits());
		System.out.println(new_student.getGPA());


	}

}
