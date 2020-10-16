package Oct15;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.io.*;
import java.util.function.Function;
import java.util.function.Predicate;


public class EmployeeData {
	
	
	public static void main(String[] args)throws IOException
	{
		Map<Integer,Emp> employeesList=new TreeMap<>();
		List<Employee> duplicateRecords =new ArrayList();
		
		String readLine="";
		
		try
		{
			BufferedReader buffer=new BufferedReader(new FileReader("C:\\Users\\nsaini\\Downloads\\Records.csv"));
			readLine=buffer.readLine();
			
			while((readLine=buffer.readLine())!=null)
			{
				String[] emp = readLine.split(",");
				
				if(employeesList.containsKey(Integer.parseInt(emp[0])))
				{
					Emp e=employeesList.get(Integer.parseInt(emp[0]));
					duplicateRecords.add(new Employee(Integer.parseInt(emp[0]),e.firstName,e.lastName,e.emailId,e.age));
				}
					
				else
				   employeesList.put(Integer.parseInt(emp[0]),new Emp(emp[2],emp[4],emp[6],Integer.parseInt(emp[13])));
			}	
			
			System.out.println("Records Over Written :");
			System.out.println();
			System.out.println("EmployeeId,FirstName,LastName,Age,EmailId");
			
			for(Employee emp:duplicateRecords)
			{
				System.out.println(emp.id+","+emp.firstName+","+emp.lastName+","+emp.age+","+emp.emailId);
			}

			FileWriter fWriter=new FileWriter("C:\\Users\\nsaini\\eclipse-workspace\\SecondProject\\NewRecord.csv");
			BufferedWriter writer = new BufferedWriter(fWriter);
			
			writer.write("EmployeeId,FirstName,LastName,Age,EmailId");
			writer.newLine();
			
			
			for(Map.Entry<Integer,Emp> entry : result.entrySet())
			{
				writer.write(entry.getKey()+","+entry.getValue().firstName+","+entry.getValue().lastName+","+entry.getValue().age+","+entry.getValue().emailId);
				writer.newLine();
			}
			
			writer.close();
			
	}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
   }
	
	
}




