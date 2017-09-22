package features;

import java.io.File;
import java.time.LocalDateTime;
import java.util.Collection;

import locations.City;
import user.User;

public class Event {
private Collection<User> participants;
private int maxNumberParticipants;
private String name;
private User organizer ;
private String description;

//take from a map???????
private String address;
private City location;

private LocalDateTime timeOTheEvent;

private Collection<Post> comments;

private File pictureOfTheEvent;
}
