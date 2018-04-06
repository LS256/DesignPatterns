package pl.codemakesfun.MVC;

public class StudentController {

    private Student model;
    private StudentView studentView;

    public StudentController(Student model, StudentView studentView) {
        this.model = model;
        this.studentView = studentView;
    }

    public String getStudentName() {
        return model.getName();
    }

    public void setStudentName(String name) {
        model.setName(name);
    }

    public String getStudentSureName(){
        return model.getSureName();
    }

    public void setStudentSureName(String sureName) {
        model.setSureName(sureName);
    }

    public int getStudentRolNo() {
        return model.getRollNo();
    }

    public void setStudentRollNo(int rollNo) {
        model.setRollNo(rollNo);
    }

    public void updateView(){
        studentView.printStudentDetails(model.getName(), model.getSureName(), model.getRollNo());
    }


}
