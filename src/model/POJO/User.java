package model.POJO;

import java.time.LocalDateTime;
import java.util.*;

import features.*;
import user.pesonalInformation.ProfileInformation;

public class User {
	private ProfileInformation myInformatin;
	private LocalDateTime lastBeingOnline;
	private enum UserStatus{
		ACCEPTING_GUESTS,NON_ACCEPTING_GUESTS,MAYBE,WANTS_TO_HANG_OUT
	}
	private UserStatus currentStatus;
	
	
//	collections:
	Collection<Event> attendingEvents;
	Collection<Event> hostingEvents;
	Collection<MessageBox> inbox;
	Collection<Request> currentHostsRequests;
	Collection<Request> currentSurfersRequests;
	Collection<Reference> myReferences;
	
	
}
