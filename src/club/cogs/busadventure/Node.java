package club.cogs.busadventure;

import java.util.ArrayList;
import java.util.HashMap;

public class Node {
	
	private String name;
	private String message;
	private HashMap<String,Node> destinations;
	private ArrayList<Integer> requiredEvents;
	
	public Node(String name, String message){
		this.name = name;
		this.message = message;
		this.destinations = new HashMap<String,Node>();
		this.requiredEvents = new ArrayList<Integer>();
	}
	
	public void addDestination(String commandString, Node n){
		this.destinations.put(commandString, n);
	}
	
	public void requireEventID(int eventID){
		this.requiredEvents.add(eventID);
	}
	
	public Node getNode(String commandString){
		return this.destinations.get(commandString);
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getMessage(){
		return this.message;
	}
	
	public ArrayList<Integer> getRequiredEvents(){
		return this.requiredEvents;
	}

}
