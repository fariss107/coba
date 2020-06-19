/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregasi;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Annisa Olga Z
 */
public class Aggregation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	Student s1 = new Student("Mia", 1, "CSE"); 
	Student s2 = new Student("Priya", 2, "CSE"); 
	Student s3 = new Student("John", 1, "EE"); 
	Student s4 = new Student("Rahul", 2, "EE"); 

	// making a List of 
	// CSE Students. 
	List <Student> cse_students = new ArrayList<Student>(); 
	cse_students.add(s1); 
	cse_students.add(s2); 
		
	// making a List of 
	// EE Students 
	List <Student> ee_students = new ArrayList<Student>(); 
	ee_students.add(s3); 
	ee_students.add(s4); 
		
	Departement CSE = new Departement("CSE", cse_students); 
	Departement EE = new Departement("EE", ee_students); 
                
	List <Departement> departements = new ArrayList<Departement>(); 
	departements.add(CSE); 
	departements.add(EE); 
		
	// creating an instance of Institute. 
	Institute institute = new Institute("BITS", departements); 
	System.out.print("Total students in institute: "); 
	System.out.print(institute.getTotalStudentsInInstitute()); 
	} 
}
    


