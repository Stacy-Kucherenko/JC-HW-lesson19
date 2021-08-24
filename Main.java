import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Main {

	
	public static void main(String[] args) throws Exception {
		File employeeFile = new File ("Employee.txt"); 
		Employee employee = new Employee (21, "Anastasiia", 10000);
		System.out.println("Good worker");
		System.out.println(employee);
		
		
		System.out.println("After serialization/deserealization");
		Methods.serialize(employee, employeeFile );
		System.out.println(Methods.deserealize(employeeFile));
		
		System.out.println();
		
		File fileEmployeeList = new File ("EmployeeList.txt"); 
		List <Employee> employeeList = new ArrayList <Employee>(); 
		employeeList.add(new Employee (24, "Julia", 15000));
		employeeList.add(new Employee (21, "Maks", 17000));
		employeeList.add(new Employee (24, "Vlad", 0));
		employeeList.add(new Employee (21, "Valeria", 25000));
		employeeList.add(new Employee (24, "Volodya", 13000));
		
		System.out.println("List of our employees:");
		for (Employee employee2 : employeeList) {
			System.out.println(employee2);
			
			
		}
		System.out.println();
		
		System.out.println("The List of our employees after serialization/deserialization");
		Methods.serialize((Serializable) employeeList, fileEmployeeList);
		
		List <Employee> employeeListDeserialized = new ArrayList <Employee>(); 
		employeeListDeserialized = (List <Employee>) Methods.deserealize(fileEmployeeList);
		for (Employee employee2 : employeeListDeserialized) {
		System.out.println(employee2);
		}
		
		
		
	}
}
