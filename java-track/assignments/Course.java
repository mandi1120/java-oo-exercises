
public class Course {
	private String Name;
	private int Credits;
	private int remainingSeats;
	private Student[] Roster;

	public Course (String Name, int Credits, int remainingSeats) {
		this.Name = Name;
		this.Credits = Credits;
		this.remainingSeats = remainingSeats;
		this.Roster = new Student[remainingSeats];
	}
	public String getName(){
		return this.Name;}
	
	public int getCredits(){
		return this.Credits;}
	
	public int getRemainingSeats(){
		return this.remainingSeats;}
	
	public Student[] getRoster(){
		return this.Roster;}
	
	public boolean addStudent(Student student) {
		Roster = this.getRoster();
		remainingSeats = this.getRemainingSeats();
//		if (!Roster.isEmpty()) {
//			return false;}
		if (this.getRemainingSeats() == 0) {
			return false;}
//		else if (this.getRoster().contains() == false){		
//			this.remainingSeats = this.remainingSeats -1;
//			this.Roster[] = [student];
		else {
			for(int s = 0; s < this.Roster.length; s=s+1) {
				if (this.Roster[s]==null) {
					this.Roster[s] = (student);
					this.remainingSeats = this.remainingSeats -1;
					return true;}
				}
		return false;
		}
	}
	
		
///returns a boolean based on whether or not the student was successfully added to the course. 
///Check to make sure that the student has not already enrolled, and update the number of seats
///remaining. When checking that the student has not already enrolled, use the student's name to 
///compare an enrolled student to the student that you are trying to add.
		

	
	public void generateRoster() {
///Returns a String that represents a roster with all of the students in the course. 
///Make sure to omit "empty" seats!
//		Roster = this.getRoster();
//		if (this.Roster.contains("")) {
//			return Roster;}
//		else {
//			Roster = Roster + (this.getName());
//			return "Roster: " + Roster;}
		  for(Student student : this.Roster) {
	        	if (student == null){
	        		System.out.println("  Empty");}
	        	else{
	        		System.out.println("  " + student.getName());}
	        }
	}
	
	public double averageGPA() {
///- returns the average GPA of all students enrolled in the course. Make sure to omit "empty" seats!
		double allGPA = 0;
		for(Student student: this.Roster) {
			if (student != null) {
				allGPA = allGPA + student.getGPA();}
			else {
				allGPA = allGPA;}
		}
		double averageGPA= allGPA / (this.Roster.length - this.remainingSeats);
		return averageGPA;}
	

	public String toString() {
///should contain the course number and credits
//		Credits = this.getCredits();
//		Name = this.getName();
		return ("Credits: " + this.Credits + ", Course Number: " + this.Name);
	}


	

	
	
}
