package sit707_week2;

import java.io.IOException;


/**
 * Hello world!
 * @author Ahsan Habib
 */
public class Main 
{
    public static void main( String[] args ) throws IOException
    {
    	int choice = 2	;

		switch (choice) {
		case 1:
	        SeleniumOperations.officeworks_registration_page("https://www.officeworks.com.au/app/identity/create-account");
			break;
		case 2:
	        SeleniumOperations.officeworks_registration_page("https://www.signupgenius.com/index.cfm?go=w.Welcome&prior=w.createSignUp&formName=registerForm");
	        break;
		default:
			System.out.println("Invalid choice.");
			break;
		}
    }
    
}
