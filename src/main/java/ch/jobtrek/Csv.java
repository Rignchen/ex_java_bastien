package ch.jobtrek;

import ch.jobtrek.sbb.Tunnel;
import ch.jobtrek.sbb.Tunnelable;

import java.io.FileNotFoundException;
import java.net.URI;
import java.util.*;
import java.io.File;

public class Csv {

	/**
	 * This method reads the CSV file, and parse each lines to create a list of objects that represent a tunnel.
	 *
	 * @param filePath The path to the CSV file
	 * @return A List of objects that implements the Tunnelable interface. You need to create this special class.
	 */
	public static List<Tunnelable> importCSVfile(URI filePath) {
		ArrayList<Tunnelable> data = new ArrayList<>();
		try {
			File myObj = new File(filePath);
			Scanner myReader = new Scanner(myObj);
            Boolean is_title = true;
			while (myReader.hasNextLine()) {
				String[] temp = myReader.nextLine().split(";");
                if (is_title) {is_title = false;}
                else {data.add(new Tunnel(temp[1], Double.parseDouble(temp[2]) / 1000, Integer.parseInt(temp[3]), temp[8]));}
			}
		}
		catch (FileNotFoundException error) {System.out.println("An error occurred.");}
		return data; // TODO in 1 line ._.
	}

	/**
	 * Sort the list of tunnels provided, and pick de 10 longest
	 *
	 * @param tunnels A List of tunnels
	 * @return A List containing only the 10 longest tunnels
	 */
	public static List<Tunnelable> tenLongestTunnels(List<Tunnelable> tunnels) {
		return List.of(); // Replace with your code here
	}

	/**
	 * @param tunnels List of tunnels
	 * @return The computed average of the length of all tunnels
	 */
	public static double computeAverageLength(List<Tunnelable> tunnels) {
		return 0; // Replace with your code here
	}

	/**
	 * @param tunnels List of tunnels
	 * @return A Map with the year as key and the number of tunnels as value
	 */
	public static Map<Integer, Long> tunnelsByYears(List<Tunnelable> tunnels) {
		return Map.of(); // Replace with your code here
	}

	/**
	 * @param tunnels List of tunnels
	 * @return The year in which the most tunnels were built
	 */
	public static int yearWithBiggestTunnelBuilds(List<Tunnelable> tunnels) {
		return 0; // Replace with your code here
	}

}