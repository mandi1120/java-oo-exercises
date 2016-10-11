
public class Course {
	public String Name;
	public Integer Credits;
	public Integer RemainingSeats;
	public Integer Roster;

	public Course (String Name, Integer Credits, Integer RemainingSeats, Integer Roster) {
		this.Name = Name;
		this.Credits = Credits;
		this.RemainingSeats = RemainingSeats;
		this.Roster = Roster;
	}

	public String addStudent() {
	
///returns a boolean based on whether or not the student was successfully added to the course. 
///Check to make sure that the student has not already enrolled, and update the number of seats
///remaining. When checking that the student has not already enrolled, use the student's name to 
///compare an enrolled student to the student that you are trying to add.
		
	
	}
	
	public String generateRoster() {
///Returns a String that represents a roster with all of the students in the course. 
///Make sure to omit "empty" seats!
		
	
	}

	public Integer averageGPA() {
///- returns the average GPA of all students enrolled in the course. Make sure to omit "empty" seats!
		for (course:courses) {
		
		}
	}

	public String toString() {
///should contain the course number and credits
	
	}


	

	
	
}
