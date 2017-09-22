package locations;

import java.io.File;
import java.util.*;

import features.Event;
import user.User;

public class City {
	private String name;
	private String description;
	private Collection<User> localHosts;
	private Collection<User> upcomingTravellers;
	private Collection<Event> events;
	private File picture;
//	private Country country???? composition//only one country//set once in the constructor
}
