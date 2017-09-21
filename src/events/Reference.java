package events;

import java.time.LocalDateTime;

public class Reference {
private enum TypeRef{
	HOST,SURFER,PERSONAL
}
private LocalDateTime timeOfTheReference;
private boolean wouldStayAgain; 
private User sender;
private User receiver;
private String content;
}
