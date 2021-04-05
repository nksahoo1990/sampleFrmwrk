package qaEndToEndDummyFramework;

import org.testng.annotations.Test;

public class APITesting {
	
	@Test
	public void postAPI() {
		
		System.out.println("This is POST method request");
	}
	
	@Test
   public void getAPI() {
		
		System.out.println("This is GET method request");
	}
   
	@Test
   public void deleteAPI() {
		
		System.out.println("This is DELETE method request");
	}
	
	@Test
	   public void deleteAPI2() {
			
			System.out.println("This is DELETE method 2 request");
		}

}
