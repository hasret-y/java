package odev2;

public class CourseManager {
	
	//Metot
	public void addCourse(Course course) {
		System.out.println("Kurs eklendi: " + course.courseName);
	}
	
	//Metot
	public void deleteCourse(Course course) {
		System.out.println("Kurs silindi: " + course.courseName);
	}
	
	//Metot
	public void contentDelete(Course course) {
		System.out.println("Kurs i�eri�i silindi: " + course.courseDetail);
	}
	

}
