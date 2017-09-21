package user.pesonalInformation;

import java.io.File;
import java.time.*;
import java.util.*;

import events.Reference;
import user.User;

public class ProfileInformation {
	
	//intialize in the constructor:
	private PersonalInformation myPersonalInformation;
	private HomeInformation myHomeInformation;
	private AccountDetails myAccountDetails;
	
	private enum HostingAvailability{
		MEET_UP,ACCEPTING,NOT_ACCEPTING,MAYBE_ACCEPTING
	}
	private HostingAvailability currentAvailability;
	
	private Collection<File> myPhotoes;
	private File profilePicture;
	
	private Collection<User> friends;
	private Collection<Reference> myReferences;
	
	final LocalDateTime dateAndTimeOfRegistration;
	 /*should be initialized in the costructor at the moment a new User object is
	 instatntiated
	 when a user is submitting the registration form
	*/
	
}
