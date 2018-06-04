/*******************************************************************************
 * 2018, All rights reserved.
 *******************************************************************************/
package timeTableModel;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Room.
 * 
 * @author Jiamin WANG
 */
public class Room {
	/**
	 * Description of the property RoomId.
	 */
	private int RoomId = 0;

	/**
	 * Description of the property Capacity.
	 */
	private int Capacity = 0;

	// Start of user code (user defined attributes for Room)

	// End of user code

	/**
	 * The constructor.
	 */
	public Room() {
		// Start of user code constructor for Room)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Room)

	// End of user code
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
	 * Returns Capacity.
	 * @return Capacity 
	 */
	public int getCapacity() {
		return this.Capacity;
	}

	/**
	 * Sets a value to attribute Capacity. 
	 * @param newCapacity 
	 */
	public void setCapacity(int newCapacity) {
		this.Capacity = newCapacity;
	}

}
