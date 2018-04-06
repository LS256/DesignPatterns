package pl.codemakesfun.MVC;

public class StudentView {

    public void printStudentDetails(String studentName, String studentSureName, int rollNo){
        System.out.println("Student rollNo: " + rollNo);
        System.out.println("Name: " + studentName);
        System.out.println("Surname: " + studentSureName);
        System.out.println();
    }
}
