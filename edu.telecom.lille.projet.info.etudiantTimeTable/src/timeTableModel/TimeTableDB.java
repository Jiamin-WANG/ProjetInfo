/*******************************************************************************
 * 2018, All rights reserved.
 *******************************************************************************/
package timeTableModel;
import java.util.*;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of TimeTableDB.
 * 
 * @author Jiamin WANG
 */
public class TimeTableDB {
	/**
	 * Description of the property timeTables.
	 */
	public Hashtable<String,TimeTable> timeTables ;

	/**
	 * Description of the property file.
	 */
	private Object file = null;

	/**
	 * Description of the property rooms.
	 */
	public Hashtable<String,Room> rooms ;

	// Start of user code (user defined attributes for TimeTableDB)

	// End of user code

	/**
	 * The constructor.
	 */
	public TimeTableDB(String _file) {
		// Start of user code constructor for TimeTableDB)
		super();
		rooms = new Hashtable<String,Room>();
		timeTables = new Hashtable<String,TimeTable>();
		file = _file;
		// End of user code
	}

	/**
	 * Description of the method saveDB.
	 */
	public void saveDB() {
		// Start of user code for method saveDB
		// End of user code
	}

	/**
	 * Description of the method loadDB.
	 */
	public void loadDB() {
		// Start of user code for method loadDB
		// End of user code
	}

	// Start of user code (user defined methods for TimeTableDB)

	// End of user code
	/**
	 * Returns timeTables.
	 * @return timeTables 
	 */
	public Hashtable<String,TimeTable> getTimeTables() {
		return this.timeTables;
	}

	/**
	 * Returns file.
	 * @return file 
	 */
	public Object getFile() {
		return this.file;
	}

	/**
	 * Sets a value to attribute file. 
	 * @param newFile 
	 */
	public void setFile(Object newFile) {
		this.file = newFile;
	}

	/**
	 * Returns rooms.
	 * @return rooms 
	 */
	public Hashtable<String,Room> getRooms() {
		return this.rooms;
	}

}
