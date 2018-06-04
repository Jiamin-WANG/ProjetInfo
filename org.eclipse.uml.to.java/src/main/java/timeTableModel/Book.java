/*******************************************************************************
 * 2018, All rights reserved.
 *******************************************************************************/
package timeTableModel;

import java.util.Date;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Book.
 * 
 * @author Jiamin WANG
 */
private class Book {
	/**
	 * Description of the property BookingId.
	 */
	private int BookingId = 0;

	/**
	 * Description of the property RoomId.
	 */
	private int RoomId = 0;

	/**
	 * Description of the property DateBegin.
	 */
	private Date DateBegin = new Date();

	/**
	 * Description of the property rooms.
	 */
	public Room rooms = null;

	/**
	 * Description of the property DateEnd.
	 */
	private Date DateEnd = new Date();

	/**
	 * Description of the property Login.
	 */
	private String Login = "";

	// Start of user code (user defined attributes for Book)

	// End of user code

	/**
	 * The constructor.
	 */
	public Book() {
		// Start of user code constructor for Book)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Book)

	// End of user code
	/**
	 * Returns BookingId.
	 * @return BookingId 
	 */
	public int getBookingId() {
		return this.BookingId;
	}

	/**
	 * Sets a value to attribute BookingId. 
	 * @param newBookingId 
	 */
	public void setBookingId(int newBookingId) {
		this.BookingId = newBookingId;
	}

	/**
	 * Returns RoomId.
	 * @return RoomId 
	 */
	public int getRoomId() {
		return this.RoomId;
	}

	/**
	 * Sets a value to attribute RoomId. 
	 * @param newRoomId 
	 */
	public void setRoomId(int newRoomId) {
		this.RoomId = newRoomId;
	}

	/**
	 * Returns DateBegin.
	 * @return DateBegin 
	 */
	public Date getDateBegin() {
		return this.DateBegin;
	}

	/**
	 * Sets a value to attribute DateBegin. 
	 * @param newDateBegin 
	 */
	public void setDateBegin(Date newDateBegin) {
		this.DateBegin = newDateBegin;
	}

	/**
	 * Returns rooms.
	 * @return rooms 
	 */
	public Room getRooms() {
		return this.rooms;
	}

	/**
	 * Sets a value to attribute rooms. 
	 * @param newRooms 
	 */
	public void setRooms(Room newRooms) {
		this.rooms = newRooms;
	}

	/**
	 * Returns DateEnd.
	 * @return DateEnd 
	 */
	public Date getDateEnd() {
		return this.DateEnd;
	}

	/**
	 * Sets a value to attribute DateEnd. 
	 * @param newDateEnd 
	 */
	public void setDateEnd(Date newDateEnd) {
		this.DateEnd = newDateEnd;
	}

	/**
	 * Returns Login.
	 * @return Login 
	 */
	public String getLogin() {
		return this.Login;
	}

	/**
	 * Sets a value to attribute Login. 
	 * @param newLogin 
	 */
	public void setLogin(String newLogin) {
		this.Login = newLogin;
	}

}
