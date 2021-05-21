package odev2;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1, " JAVA" , " Yaz�l�m geli�tirici yeti�tirme kamp� ");
		Course course2 = new Course(2 , " C# , ANGUR " , "Yaz�l�m geli�tirici yeti�tirme kamp�");
		Course course3 = new Course(3, "Python" , " Yaz�l�m geli�tirici yeti�tirme kamp� " );
		
		Course[] course = {course1 , course2 , course3 };
		
		for(Course kurs: course) {
			System.out.println(kurs.courseName+" "+ kurs.courseDetail+ " "+ kurs.courseInstructor);
			
			System.out.println("********************");
			
			System.out.println(course.length);
			
			System.out.println("********************");
			
			CourseManager courseManager = new CourseManager();
			
			courseManager.addCourse(course1); 
			
			courseManager.deleteCourse(course2);
			
			courseManager.addCourse(course3);
		}

	}

}
