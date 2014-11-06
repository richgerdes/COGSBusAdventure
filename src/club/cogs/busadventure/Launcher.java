package club.cogs.busadventure;

import java.io.IOException;

public class Launcher {
	
	public static void main(String[] args){
		try {
			Node startNode = Loader.loadMap("./main.map");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
