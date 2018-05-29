package timeTableModel;
/**
 * 
 * Cette classe gére la base de données d'emplois du temps. Elle doit permettre de sauvegarder et charger les emplois du temps ainsi que les salles à partir d'un fichier XML. 
 * La structure du fichier XML devra être la même que celle du fichier TimeTableDB.xml.
 * @see <a href="../../TimeTableDB.xml">TimeTableDB.xml</a> 
 * 
 * @author Jose Mennesson (Mettre à jour)
 * @version 04/2016 (Mettre à jour)
 * 
 */

import java.io.IOException;

//TODO Classe à modifier

import java.util.*; 
import org.jdom2.*;
import org.jdom2.input.SAXBuilder;

public class TimeTableDB {
	/**
	 * 
	 * Le fichier contenant la base de données.
	 * 
	 */
	private String file;
	/**
	 * 
	 * Constructeur de TimeTableDB. 
	 * 
	 * @param file
	 * 		Le nom du fichier qui contient la base de données.

	 */
	public TimeTableDB(String file) {
		//TODO	À modifier
		super();
	
		
		
		this.setFile(file);
	}
	
	
	public void loadDB() throws JDOMException, IOException {
	SAXBuilder DB=new SAXBuilder();  
		
		Document doc = DB.build(file);
	}
	/**
	 * Getter de file
	 * 
	 * @return 
	 * 		Le nom du fichier qui contient la base de données.
	 */
	public String getFile() {
		return file;
	}
	/**
	 * Setter de file
	 * 
	 * @param file
	 * 		Le nom du fichier qui contient la base de données.
	 */
	public void setFile(String file) {
		this.file = file;
	}
}
