package testNG;
import org.testng.annotations.Test;

public class TestNgPriorityDemo {
	
	@Test(priority=1)
	public void priorityone() {
		System.out.println("I am inside priorityone");
	}
	
	
	@Test(priority=2)
	public void prioritytwo() {
		System.out.println("I am inside prioritytwo");
	}
	
	
	@Test
	public void one() {
		System.out.println("I am inside test1");
	}
	
	@Test
	public void two() {
		System.out.println("I am inside test2");
	}
	
	@Test
	public void three() {
		System.out.println("I am inside test3");
	}

}

//Priority Parameter

//@Test(priority=1)

//What if two test methods have same priority
//- Will run as per alphabetical order
//- If No priority then alphabetical order

//What if a class has both prioritised and non-prioritised methods
//- First non-prioritised methods will be executed in alphabetical order
