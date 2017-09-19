package user.pesonalInformation;

import java.time.LocalDate;
import java.time.Month;

public class AccountInformation {
	private String userName = "";
	private String firstName ="";
	private String lastName ="";
	
	
	private int age;
	
	//initialize in the constructor
	//izbira se ot dropDowns
	//create functions!!!
	//taka li da q syhranqvam ili razbita?
	//tova dali go nqma gotovo v nqkoq biblioteka???
	private LocalDate dateOfBirth;
	public void changeMonthOfBirth(Month monthOfBirth) {
		
	}
	//samo for the year and the day
	
	private enum Gender {
		FEMALE, MALE
	}	

	private String password;
	private String email;

}
