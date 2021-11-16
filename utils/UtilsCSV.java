package utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.opencsv.CSVWriter;


public class UtilsCSV {
    public static void WriteCSVFile(String filePath, HashMap<String, Integer> map, String columna)
    {
	// first create file object for file placed at location
	// specified by filepath
	File file = new File(filePath);
	try {
		// create FileWriter object with file as parameter
		FileWriter outputfile = new FileWriter(file);

		// create CSVWriter object filewriter object as parameter
		CSVWriter writer = new CSVWriter(outputfile);

		// adding header to csv
		String[] header = {columna, "cantidad"};
		writer.writeNext(header);

		Iterator it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry)it.next();

			String[] data = { String.format("%s", pair.getKey()), String.format("%d", pair.getValue())};
			writer.writeNext(data);

			it.remove(); // avoids a ConcurrentModificationException
		}
		// closing writer connection
		writer.close();
	}
	catch (IOException e) {
		e.printStackTrace();
	}
}

}
