import Department.Department;
public class College {
    public static void main(String[] args){
    Department Educ = new Department();
    Department IT = new Department();
    Department BSA = new Department();

    Educ.prof = "John";
    Educ.dean = "Hannah";
    Educ.studentsNumber = 110;
    IT.prof = "Paulo";
    IT.dean = "Mary";
    IT.studentsNumber = 80;
    BSA.prof = "Pablo";
    BSA.dean = "Joy";
    BSA.studentsNumber = 130;

    System.out.println("Educ prof is: " +Educ.getprof());
    System.out.println("Educ dean is: " +Educ.getdean());
    System.out.println("Educ number of students are: " + Educ.numStudents() + "\n");
    
    System.out.println("IT prof is: " +IT.getprof()); 
    System.out.println("IT dean is: " +IT.getdean());
    System.out.println("IT number of students are: " + IT.numStudents() + "\n");
    
    System.out.println("BSA prof is: " + BSA.getprof());
    System.out.println("BSA dean is: " + BSA.getdean());
    System.out.println("BSA number of students are: " + BSA.numStudents() + "\n");
    
    System.out.println("\n");
    Educ.speak();
    IT.speak();
    BSA.speak();
    
    System.out.println("\n");
    Educ.speak(Educ.prof);
    IT.speak(IT.prof);
    BSA.speak(BSA.prof);


}

}

