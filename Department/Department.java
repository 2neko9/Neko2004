package Department;

public class Department {
    public String prof, dean;
    public int studentsNumber;

    public void speak(String Prof){
        System.out.println("Unit of Department classs - speak() Method");
        System.out.println("Teacher: " + prof);
    }

    public void speak(){
        System.out.println("Unit of Department class - speak() Method");
    }
    
    public int numStudents(){
        return studentsNumber;
    }
    public String getprof(){
        return prof;
    }
    public String getdean(){
        return dean;
    }
}
