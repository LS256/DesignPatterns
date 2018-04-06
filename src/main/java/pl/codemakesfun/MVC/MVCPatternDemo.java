package pl.codemakesfun.MVC;

public class MVCPatternDemo {

    public static void main(String[] args){
        //  fetch student record based on his ro no from the database
        Student student = retrieveStudentFromDB();

        //  Create a view to write student details on console
        StudentView view = new StudentView();

        StudentController studentController = new StudentController(student, view);

        studentController.updateView();



        studentController.setStudentName("John");
        studentController.updateView();
    }

    public static Student retrieveStudentFromDB(){
        Student student = new Student();
        student.setRollNo(10);
        student.setName("Lukasz");
        student.setSureName("Staszewski");
        return student;
    }

}
