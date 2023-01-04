package MVC;

public class MVCPattern {

	public static void main(String[] args) {
		
		Student model = retriveStudentFromDatabase();
		StudentView view = new StudentView();
		StudentController controller = new StudentController(model,view);
		controller.updateView();
		
		controller.setStudentName("RBC");
		controller.updateView();
	}

	private static Student retriveStudentFromDatabase() {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setName("WBC");
		student.setRollNo("100023");
		return student;
	}
}
