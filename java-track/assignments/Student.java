import java.util.ArrayList;

public class Student  {
	
	public String first_name;
	public String last_name;
	public Integer StudentID;
	public Integer Credits;
	public double GPA;

	public Student (String first_name, String last_name, Integer StudentID) {
		this.last_name = last_name;
		this.first_name = first_name;
		this.StudentID = StudentID;
		this.Credits = 0;
		this.GPA = 0;
	}
//	public Student baby (String first_name, String last_name, Integer StudentID) {
//		this.last_name = last_name;
//		this.first_name = first_name;
//		this.StudentID = StudentID;
//		return baby;
//	}
	
	public String getName() {
		return this.first_name + " " + this.last_name;
	}
	
	public Integer getStudentID() {
		return this.StudentID;
	}
	public Integer getCredits() {
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
	
	public void submitGrade(double courseGrade, Integer courseCredits) {
///Take the number of credits for a course and multiply it by the grade for that course. 
///This is called the quality score. GPA is computed as the sum of all of the quality 
///scores for each course the student has taken, divided by the total number of credits.
///You should also round the GPA so that it only contains three digits after the decimal.
		double qualityScore = courseGrade * courseCredits;
				
		qualityScore += qualityScore;
		Credits += Credits;
		double GPA = (qualityScore / this.Credits) * 1000 / 1000;
		this.GPA = GPA;
		
	}
	
	public Integer computeTuition() {
//returns the total amount of tuition the student has paid. 
//The average cost of tuition for 1 semester in the United States is 
//roughly $20,000. Assume that there are 15 credit hours per semester, 
//and that any "leftover" credits are computed at the proportional rate.
		int tuition = (20000 * (this.Credits / 15));
		return tuition;
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

		this.first_name = student1.getName();
		this.last_name =  student2.getName();
		this.StudentID = student1.getStudentID() + student2.getStudentID();
		this.GPA = student1.getGPA() + student2.getGPA() / 2;
		this.Credits = (student1.getCredits() + student2.getCredits());
		return createLegacy(student1, student2);
	}
	
//- returns the students full name and student ID
	public String toString(){
		Student baby = new Student(this.first_name, this.last_name, this.StudentID);
///		name = this.first_name + " " + this.last_name
		String name = (baby.first_name + " " + baby.last_name + " " + baby.StudentID);
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
