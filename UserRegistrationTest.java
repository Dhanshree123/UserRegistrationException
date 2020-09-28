package GradleUserRegistration;

import org.junit.Test;
import static org.junit.Assert.*;


public class UserRegistrationTest {
	
//Happy test case
	@Test
	public void testFirstName_HappyCase(){
		UserRegistration user_obj = new UserRegistration();
		try {
			assertTrue(user_obj.firstName("Hiiiii"));
			System.out.println("Valid First Name");
		} catch (UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
//Sad test case
		@Test
		public void testFirstName_SadCase(){
			UserRegistration user_obj = new UserRegistration();
			try {
				assertTrue(user_obj.firstName("dhanshree"));
				System.out.println("Valid First Name");
			} catch (UserRegistrationException e) {
				System.out.println(e.getMessage());
			}
			
		}
	
//Happy test case
    @Test 
    public void testLastName_HappyCase(){
    	UserRegistration user_obj = new UserRegistration();
    	try {
			assertTrue(user_obj.lastName("Morgan"));
			System.out.println("Valid Last Name");
		} catch (UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}

//Sad test case    
    @Test 
    public void testLastName_SadCase(){
    	UserRegistration user_obj = new UserRegistration();
    	try {
			assertTrue(user_obj.lastName("patil"));
			System.out.println("Valid Last Name");
		} catch (UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}
    
 //Happy test case
     @Test 
     public void testEmail_HappyCase(){
    	 UserRegistration user_obj = new UserRegistration();
    	 try {
			assertTrue(user_obj.email("abc@gmail.com"));
			System.out.println("Valid Email");
		} catch (UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
    }
     
//Sad test case    
     @Test 
     public void testEmail_SadCase(){
    	 UserRegistration user_obj = new UserRegistration();
    	 try {
			assertTrue(user_obj.email(".abc@gmail.com"));
			System.out.println("Valid Email");
		} catch (UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
    }
     
//Happy test case     
     @Test 
     public void testMob_num_HappyCase(){
    	 UserRegistration user_obj = new UserRegistration();
    	 try {
			assertTrue(user_obj.mob_num("91 9876543210"));
			System.out.println("Valid Mobile Number");
		} catch (UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
     }
     
//Sad test case
     @Test 
     public void testMob_num_SadCase(){
    	 UserRegistration user_obj = new UserRegistration();
    	 try {
			assertTrue(user_obj.mob_num("91 0876543210"));
			System.out.println("Valid Mobile Number");
		} catch (UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
     }
     
//Happy test case     
     @Test 
     public void testPassword_HappyCase(){
    	 UserRegistration user_obj = new UserRegistration();
    	
			try {
				assertTrue(user_obj.password("Abcd@1234"));
				System.out.println("Valid Password");
			} catch (UserRegistrationException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		
     }
     
     
//Sad test case
     @Test 
     public void testPassword_SadCase(){
    	 UserRegistration user_obj = new UserRegistration();
    	
			try {
				assertTrue(user_obj.password("bbb"));
				System.out.println("Valid Password");
			} catch (UserRegistrationException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		
     }
	
}
