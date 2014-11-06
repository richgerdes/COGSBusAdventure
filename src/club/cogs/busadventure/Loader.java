package club.cogs.busadventure;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loader {
	
	
	public static Node loadMap(String mapFile) throws IOException{
		File f = new File(mapFile);
		if (f.exists()) {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
			String line;
			while((line = br.readLine()) != null){
				String[] parts = line.split("/^([^\"]|\"[^\"]*\")*?(,)/");
				for(String s : parts){
					System.out.println(s);
				}
			}
			
		}
		return null;
	}

}