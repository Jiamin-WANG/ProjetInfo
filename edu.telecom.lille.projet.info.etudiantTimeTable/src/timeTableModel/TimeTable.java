/*******************************************************************************
 * 2018, All rights reserved.
 *******************************************************************************/
package timeTableModel;
import java.util.*;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of TimeTable.
 * 
 * @author Jiamin WANG
 */
public class TimeTable {
	/**
	 * Description of the property GroupId.
	 */
	private int GroupId = 0;

	/**
	 * Description of the property books.
	 */
	public Hashtable<String,Book> books = new Hashtable<String,Book>();

	// Start of user code (user defined attributes for TimeTable)

	// End of user code

	/**
	 * The constructor.
	 */
	public TimeTable() {
		
	}
	
	public TimeTable(int _groupId) {
		// Start of user code constructor for TimeTable)
		super();
		this.GroupId = _groupId;
	// End of user code
	}

	// Start of user code (user defined methods for TimeTable)

	// End of user code
	/**
	 * Returns GroupId.
	 * @return GroupId 
	 */
	public int getGroupId() {
		return this.GroupId;
	}

	/**
	 * Sets a value to attribute GroupId. 
	 * @param newGroupId 
	 */
	public void setGroupId(int newGroupId) {
		this.GroupId = newGroupId;
	}

	/**
	 * Returns books.
	 * @return books 
	 */
	public Hashtable<String,Book> getBooks() {
		return this.books;
	}

}
