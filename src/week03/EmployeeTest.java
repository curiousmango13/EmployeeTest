package week03;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * @author Julia Smith
 *
 */
public class EmployeeTest
{
	private String first;
	private String last;
	private double salary;

	@Test
	public void testGetFirstName()
	{
		Employee test = new Employee();
		String testName = test.getFirstName();
		Assert.assertEquals("New First", testName);

	}

	@Test
	public void testGetLastName()
	{
		Employee test = new Employee();
		String testLastName = test.getLastName();
		assertEquals("New Last", testLastName);

	}

	@Test
	public void setLastName()
	{
		Employee test = new Employee();
		String expectedLastName = "New Last";
		String testSetLastName = test.getLastName();
		assertEquals(expectedLastName, testSetLastName);

	}

	@Test
	public void setFirstName()
	{
		Employee test = new Employee();
		String expectedFirstName = "New First";
		String testSetFirstName = test.getFirstName();
		assertEquals(expectedFirstName, testSetFirstName);

	}

	/** Getter for salary */
	public void testGetSalary()
	{
		// return m_salary;

		Employee test = new Employee();
		double testGetSalary = test.getSalary();
		assertEquals(1000.00, testGetSalary);

	}

	/**
	 * Default constructor
	 */

	@Test
	public void testGetFormattedSalary()

	{
		String MONEY_PATTERN = "###,##0.00";
		DecimalFormat m_decimalFormatter;
		m_decimalFormatter = new DecimalFormat(MONEY_PATTERN);
		Employee test = new Employee();
		assertEquals(m_decimalFormatter.format(0.00),
				test.getFormattedSalary());
	}

	@Test
	public void testEmployee()
	{

		Employee test = new Employee("Julia", "Smith");
		assertEquals("Julia", test.getFirstName());
		assertEquals("Smith", test.getLastName());
	}

	@Test
	public void testEmployeeParam()
	{
		Employee test = new Employee();

		String expectedFirstName = "New First";
		String testFirstName = test.getFirstName();
		assertEquals(expectedFirstName, testFirstName);

		String expectedLastName = "New Last";
		String testLastName = test.getFirstName();
		assertEquals(expectedFirstName, testLastName);

		double expectedSalary = 0.0;
		double testSalary = test.getSalary();
		double delta = 0;
		assertEquals(expectedSalary,  testSalary, delta); // 0.00001
		
		

	}

	@Test
	public void testEmployeeTwo()
	{

		Employee test = new Employee();

		String expectedFirstName = "New First";
		String testSetFirstName = test.getFirstName();
		assertEquals(expectedFirstName, testSetFirstName);

		String expectedLastName = "New Last";
		String testSetLastName = test.getLastName();
		assertEquals(expectedLastName, testSetLastName);

	}

	@Test
	public void getDisplayName()
	{
		Employee test = new Employee();

		String expectedDisplayName = "New Last" + "," + " New First";
		String testDisplayName = test.getDisplayName();
		assertEquals(expectedDisplayName, testDisplayName);

	}

	@Test
	public void testToString()
	{
		Employee employee = new Employee();
		String stringTest = employee.toString();
		assertEquals("New Last, New First Salary: $0.00", stringTest);
	
		//String twoParameterConstructorRegEx = ".*Employee\\(\".*\", \".*\"\\).*";
	  
	}
	
	
//	@Test
//	public void EmployeeTestThree ()
//	{
//		String MONEY_PATTERN = "###,##0.00";
//
//		m_first = first;
//		m_last = last;
//		m_salary = salary;
//		m_decimalFormatter = new DecimalFormat(MONEY_PATTERN);

		
		@Test
	    public void testEmployeeStringString() {
	        // note: this(first, last, 0.0);
	        Employee employee = new Employee("first", "last");
	        String actualFirst = employee.getFirstName();
	        String actualLast = employee.getLastName();
	        double actualSalary = employee.getSalary();
	        
	        assertEquals("first", actualFirst);
	        assertEquals("last", actualLast);
	        assertEquals(0.0, actualSalary, 0.00001);
	    }
		
		
	    @Test
	    public void testEmployeeStringStringWithDBL() {
	        Employee employee = new Employee("first", "last", 0.0);
	        String actualFirst = employee.getFirstName();
	        String actualLast = employee.getLastName();
	        double actualSalary = employee.getSalary();
	        
	        assertEquals("first", actualFirst);
	        assertEquals("last", actualLast);

	        assertEquals(0.0, actualSalary, 0.00001);
	    }
	}
    
   // String twoParameterConstructorRegEx = ".*Employee\\(\".*\", \".*\"\\).*";
// String threeParameterConstructorRegEx =  ".*Employee\\(\".*\", \".*\", .*\\).*" ;
	
	
//	@Test
//    public void testEmployeeStringString() {
//        // note: this(first, last, 0.0);
//        Employee employee = new Employee("first", "last");
//        String actualFirst = employee.getFirstName();
//        String actualLast = employee.getLastName();
//        double actualSalary = employee.getSalary();
//        
//        assertEquals("first", actualFirst);
//        assertEquals("last", actualLast);
//        assertEquals(0.0, "'%s'"+ actualSalary);
//    }
        
//	@RunWith (Parameterized.class)
//	public class test {
//		String first;
//	    String last; 
//	    double salary;
//	    String expected;
//	    
//	    
//	    public test (String first, String last, double salary,String expected)
//	    {
//	    	super();
//	    	this.first = first;
//	    	this.last = last;
//	    	this.salary = salary;
//	    	this.expected = expected;
//	    }
//	    
//	    
//	    @Test
//	    public void testTest() {
//	    	assertEquals(expected,first, last, salary);
//	    }
//	    
//	    @RunWithParameters
//	    public void assertEquals(String expected, String first, String last,
//				double salary)
//		{
//			
//			
//		}
//	}

	
	


