package user;

import java.util.*;

import locations.ILocation;

public interface ISearch {
	List<IHost> searchHost(ILocation location);
	
}
