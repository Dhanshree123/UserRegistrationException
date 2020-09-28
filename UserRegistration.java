package GradleUserRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	
	public boolean firstName(String fname) throws UserRegistrationException {
		String pattern_fn = "^[A-Z][a-z]{2,}";
		Pattern p1 = Pattern.compile(pattern_fn);
		Matcher m1 = p1.matcher(fname);
		if(m1.matches())
			 return true;
		
		else
			throw new UserRegistrationException("Invalid First name");
	}
	
	public boolean lastName(String lname) throws UserRegistrationException {
		String pattern_ln = "^[A-Z][a-z]{2,}";
		Pattern p2 = Pattern.compile(pattern_ln);
		Matcher m2 = p2.matcher(lname);
		if(m2.matches())
			 return true;
		
		else
			throw new UserRegistrationException("Invalid Last name");
	}
	
	public boolean email(String email) throws UserRegistrationException {
		String pattern_email = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
		Pattern p3 = Pattern.compile(pattern_email);
		Matcher m3 = p3.matcher(email);
		if(m3.matches())
			return true;
		
		else
			throw new UserRegistrationException("Invalid Email");
	}
	
	public boolean mob_num(String mob_num) throws UserRegistrationException {
		String pattern_mob_num = "[0-9]{2}\\s[1-9]{1}[0-9]{9}";
		Pattern p4 = Pattern.compile(pattern_mob_num);
		Matcher m4 = p4.matcher(mob_num);
		if(m4.matches())
			 return true;
		
		else
			throw new UserRegistrationException("Invalid Mobile Number");
	}
	
	public boolean password(String password) throws UserRegistrationException {
		String pattern_password = "^(?=.*[!@#$%^&*|'<>.-^*()%!])(?=.*[0-9])(?=.*[A-Z])[^\\s]{8,}$";
		Pattern p5 = Pattern.compile(pattern_password);
		Matcher m5 = p5.matcher(password);
		if(m5.matches())
			 return true;
		
		else
			throw new UserRegistrationException("Invalid Password");
	}
	
}