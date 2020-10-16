package Oct15;

public class Employee {
	
	Integer id;
	String firstName;
	String lastName;
	String emailId;
	Integer age;
	
	public Employee(Integer id,String firstName,String lastName,String emailId,Integer age)
	{
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.emailId=emailId;
		this.age=age;
	}
	
	Integer getId()
	{
		return this.id;
	}

}
