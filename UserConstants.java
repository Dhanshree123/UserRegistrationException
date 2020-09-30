package GradleUserRegistration;

public class UserConstants {
	public static final String PATTERN_FIRST_NAME = "^[A-Z][a-z]{2,}";
	public static final String PATTERN_LAST_NAME = "^[A-Z][a-z]{2,}";
	public static final String PATTERN_EMAIL = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";;
	public static final String PATTERN_MOB_NUM = "[0-9]{2}\\s[1-9]{1}[0-9]{9}";
	public static final String PATTERN_PASSWORD = "^(?=.*[!@#$%^&*|'<>.-^*()%!])(?=.*[0-9])(?=.*[A-Z])[^\\s]{8,}$";

}
