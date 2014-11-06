package club.cogs.busadventure;

import java.util.HashMap;

public class Node {
	
	private String name;
	private HashMap<String,Node> destinations;
	
	public Node(String name){
		this.name = name;
		this.destinations = new HashMap<String,Node>();
	}

}
