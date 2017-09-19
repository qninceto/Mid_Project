package user.pesonalInformation;

import java.io.File;
import java.time.*;
import java.util.*;

import locations.*;
import user.Language;
import user.User;

public class PersonalInformation {
	
	private File profilePicture;

	

	private String occupation = "";

	// Should the degree come from a data base
	// with the option to add new if its not in the list
	// searching by key Word???
	private String degree = "";

	private Country currentCountry;
	private City currentCity;
	// the city is connected to the city!!!

	private Country homeCountry;
	private City hometown;
	// the city is connected to the city!!!

	private Collection<Country> visitedCountries;
	private Collection<Country> countriesIveLivedIn;
	
	private String intersets ="";
	private String whyIAmOnCSReasons = "";
	//more stuff comes here
	//....

	
	
	//chosing a language comes from a dropDown 
	private Collection<Language> spokenLanguages;
	
	

	
	
	private Collection<User> friends;
	private Collection<Reference> myReferences;
}
