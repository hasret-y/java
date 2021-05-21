package odev2;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1, " JAVA" , " Yazılım geliştirici yetiştirme kampı ");
		Course course2 = new Course(2 , " C# , ANGUR " , "Yazılım geliştirici yetiştirme kampı");
		Course course3 = new Course(3, "Python" , " Yazılım geliştirici yetiştirme kampı " );
		
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
