package Many_to_Many;

public class Students {
	private String studentId;
	private String studentName;
	private String studentAdd;
	private Courses[] course;
	
	public Students(String studentId, String studentName, String studentAdd, Courses[] course) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAdd = studentAdd;
		this.course = course;
	}

	public void getStudentsDetails() {
		System.out.println("Student Id is : "+ studentId);
		System.out.println("Student Name is : "+ studentName);
		System.out.println("Student Course is : "+ studentAdd);
		System.out.println("Student's Coourse details are" );
		System.out.println("--------------------------------");
		for(Courses c:course) {
			System.out.println("Course ID : "+c.courseId);
			System.out.println("Course Name is : "+ c.courseName);
			System.out.println("Couse cost is : "+ c.courseCost);
			System.out.println("________________________");
			System.out.println();
		}
		
	}

}
