package GradleUserRegistration;

import java.util.regex.Matcher;

import java.util.regex.Pattern;


@FunctionalInterface

interface validateUserInputs{
	boolean validate(String inp);
}

public class UserRegistration {

	
	public boolean firstName(String fname) throws UserRegistrationException {
		validateUserInputs first_name_validate = (fn) -> (Pattern.compile(UserConstants.PATTERN_FIRST_NAME).matcher(fn).matches());
		if(first_name_validate.validate(fname))
			 return true;
		
		else
			throw new UserRegistrationException("Invalid First name");
	}
	
	public boolean lastName(String lname) throws UserRegistrationException {
		validateUserInputs last_name_validate = (ln) -> (Pattern.compile(UserConstants.PATTERN_LAST_NAME).matcher(ln).matches());
		if(last_name_validate.validate(lname))
			 return true;
		
		else
			throw new UserRegistrationException("Invalid Last name");
	}
	
	public boolean email(String email) throws UserRegistrationException {
		validateUserInputs email_validate = (e) -> (Pattern.compile(UserConstants.PATTERN_EMAIL).matcher(e).matches());
		if(email_validate.validate(email))
			return true;
		
		else
			throw new UserRegistrationException("Invalid Email");
	}
	
	public boolean mob_num(String mob_num) throws UserRegistrationException {
		validateUserInputs mob_num_validate = (mn) -> (Pattern.compile(UserConstants.PATTERN_MOB_NUM).matcher(mn).matches());
		if(mob_num_validate.validate(mob_num))
			 return true;
		
		else
			throw new UserRegistrationException("Invalid Mobile Number");
	}
	
	public boolean password(String password) throws UserRegistrationException {
		validateUserInputs password_validate = (pass) -> (Pattern.compile(UserConstants.PATTERN_PASSWORD).matcher(pass).matches());
		if(password_validate.validate(password))
			 return true;
		
		else
			throw new UserRegistrationException("Invalid Password");
	}
	
}