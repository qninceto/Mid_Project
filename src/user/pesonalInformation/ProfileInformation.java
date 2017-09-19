package user.pesonalInformation;

import java.io.File;
import java.time.*;
import java.util.*;

import user.User;

public class ProfileInformation {
	
	//intialize in the constructor:
	private PersonalInformation myPersonalInformation;
	private HomeInformation myHomeInformation;
	
	private Collection<File> myPhotoes;
	private Collection<User> friends;
	private Collection<Reference> myReferences;
	
	final LocalDateTime dateAndTimeOfRegistration;
	// should be initialized in the costructor at the moment a new User object is
	// instatntiated
	// when a user is submitting the registration form
	
	
}
