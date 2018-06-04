<<<<<<< HEAD
package timeTableController;

import java.util.Collection;
import java.util.Date;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

import timeTableModel.Book;
import timeTableModel.Room;
import timeTableModel.TimeTable;
import timeTableModel.TimeTableDB;

/**
 * Cette classe est le contrôleur d'emplois du temps que vous devez implémenter.
 * Elle contient un attribut correspondant à la base de données d'emplois du
 * temps que vous allez créer. Elle contient toutes les fonctions de l'interface
 * ITimeTableController que vous devez implémenter.
 * 
 * @author Jose Mennesson (Mettre à jour)
 * @version 04/2016 (Mettre à jour)
 * 
 */

// TODO Classe à modifier

public class TimeTableController implements ITimeTableController {

	/**
	 * Contient une instance de base de données d'emplois du temps
	 * 
	 */
	TimeTableDB tTDB;

	/**
	 * Constructeur de controleur d'emplois du temps créant la base de données
	 * d'emplois du temps
	 * 
	 * @param tTfile
	 *            Fichier XML contenant la base de données d'emplois du temps
	 * 
	 */
	public TimeTableController(String tTfile) {
		TimeTableDB tTDB = new TimeTableDB(tTfile);
		this.tTDB = tTDB;
	}

	@Override
	public String getTeacherLogin(String timeTableId, int bookId) {
		// TODO Auto-generated method stub
		return this.tTDB.timeTables.get(timeTableId).books.get(String.valueOf(bookId)).getLogin();
	}

	@Override
	public String[] roomsIdToString() {
		// TODO Auto-generated method stub
		String[] roomIds = new String[100];
		Collection<Room> allRooms = this.tTDB.rooms.values();
		Iterator<Room> it = allRooms.iterator();
		int temp = 0;
		while (it.hasNext()) {
			Room tempRoom = it.next();
			roomIds[temp] = String.valueOf(tempRoom.getRoomId());
			temp++;
		}
		return roomIds;
	}

	@Override
	public String[] roomsToString() {
		// TODO Auto-generated method stub
		String[] rooms = new String[100];
		Collection<Room> allRooms = this.tTDB.rooms.values();
		Iterator<Room> it = allRooms.iterator();
		int temp = 0;
		while (it.hasNext()) {
			Room tempRoom = it.next();
			rooms[temp] = tempRoom.toString();
			temp++;
		}
		return rooms;
	}

	@Override
	public String[] timeTablesIDToString() {
		// TODO Auto-generated method stub
		String[] timeTableIDs = new String[100];
		Set<String> s = this.tTDB.timeTables.keySet();
		int temp = 0;
		for (String str : s) {
			timeTableIDs[temp] = str;
			temp++;
		}
		return timeTableIDs;
	}

	@Override
	public String[] booksIdToString(int timeTableId) {
		// TODO Auto-generated method stub
		TimeTable timeTable = this.tTDB.timeTables.get(String.valueOf(timeTableId));
		String[] booksId = new String[100];
		int temp = 0;
		Set<String> strs = timeTable.books.keySet();
		for (String str : strs) {
			booksId[temp] = str;
			temp++;
		}
		return booksId;
	}

	@Override
	public boolean addRoom(int roomId, int capacity) {
		Room r = new Room(roomId, capacity);
		this.tTDB.rooms.put(String.valueOf(roomId), r);
		return true;
	}

	@Override
	public boolean removeRoom(int roomId) {
		this.tTDB.rooms.remove(String.valueOf(roomId));
		return true;
	}

	@Override
	public int getRoom(int timeTableId, int bookId) {
		// TODO Auto-generated method stub
		return this.tTDB.timeTables.get(String.valueOf(timeTableId)).books.get(String.valueOf(bookId)).getRoomId();

	}

	@Override
	public boolean addTimeTable(int timeTableId) {
		// TODO Auto-generated method stub

		TimeTable newTable = new TimeTable();
		this.tTDB.timeTables.put(String.valueOf(timeTableId), newTable);
		return true;
	}

	@Override
	public boolean removeTimeTable(int timeTableId) {
		// TODO Auto-generated method stub;
		this.tTDB.timeTables.remove(String.valueOf(timeTableId));
		return true;
	}

	@Override
	public boolean addBooking(int timeTableId, int bookingId, String login, Date dateBegin, Date dateEnd, int roomId) {
		// TODO Auto-generated method stub
		Book newBook = new Book(bookingId, login, dateBegin, dateEnd, roomId);
		this.tTDB.timeTables.get(String.valueOf(timeTableId)).books.put(String.valueOf(bookingId), newBook);
		return true;
	}

	@Override
	public void getBookingsDate(int timeTableId, Hashtable<Integer, Date> dateBegin, Hashtable<Integer, Date> dateEnd) {
		// TODO Auto-generated method stub
		TimeTable newTT = this.tTDB.timeTables.get(String.valueOf(timeTableId));
		Collection<Book> books = newTT.books.values();
		Iterator<Book> it = books.iterator();
		while (it.hasNext()) {
			Book book = it.next();
			dateBegin.put(book.getBookingId(), book.getDateBegin());
			dateEnd.put(book.getBookingId(), book.getDateEnd());
		}

	}

	@Override
	public boolean removeBook(int timeTableId, int bookId) {
		// TODO Auto-generated method stub
		this.tTDB.timeTables.get(String.valueOf(timeTableId)).books.remove(String.valueOf(bookId));
		return true;
	}

	@Override
	public int getBookingsMaxId(int timeTableId) {
		// TODO Auto-generated method stub
		TimeTable newTT = this.tTDB.timeTables.get(String.valueOf(timeTableId));
		Collection<Book> books = newTT.books.values();
		Iterator<Book> it = books.iterator();
		int max = 0;
		while (it.hasNext()) {
			Book book = it.next();
			max=max>book.getBookingId()?max:book.getBookingId();
		}
		return max;
	}

	@Override
	public boolean saveDB() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean loadDB() {
		// TODO Auto-generated method stub
		return true;
	}

}
=======
package timeTableController;

import java.io.IOException;
import java.util.Date;
import java.util.Hashtable;
import java.util.Table;
import org.jdom2.JDOMException;

import timeTableModel.TimeTableDB;
/**
 * Cette classe est le contrôleur d'emplois du temps que vous devez implémenter. 
 * Elle contient un attribut correspondant à la base de données d'emplois du temps que vous allez créer.
 * Elle contient toutes les fonctions de l'interface ITimeTableController que vous devez implémenter.
 * 
 * @author Jose Mennesson (Mettre à jour)
 * @version 04/2016 (Mettre à jour)
 * 
 */

//TODO Classe à modifier

public class TimeTableController implements ITimeTableController{

	/**
	 * Contient une instance de base de données d'emplois du temps
	 * 
	 */
	TimeTableDB tTDB;
    private HashTable<Integer,Book> books;
    private HashTable<Integer,TimeTable> timeTables;
	/**
	 * Constructeur de controleur d'emplois du temps créant la base de données d'emplois du temps
	 * 
	 * @param tTfile
	 * 		Fichier XML contenant la base de données d'emplois du temps

	 */
	public TimeTableController(String tTfile) {
        books = new Hashtable<Book>();
        timeTables = new HashTable<TimeTable>();
		TimeTableDB tTDB=new TimeTableDB(tTfile);
		this.tTDB=tTDB;
	}

	@Override
	public String getTeacherLogin(int timeTableId, int bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] roomsIdToString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] roomsToString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] timeTablesIDToString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] booksIdToString(int timeTableId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addRoom(int roomId, int capacity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeRoom(int roomId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getRoom(int timeTableId, int bookId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean addTimeTable(int timeTableId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeTimeTable(int timeTableId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addBooking(int timeTableId, int bookingId, String login, Date dateBegin, Date dateEnd, int roomId) {
		// TODO Auto-generated method stub
        Book newBook = new Book(roomId,bookingId,login,dateBegin,dateEnd);
        books.put(bookingId,newBook);
		return false;
	}

	@Override
	public void getBookingsDate(int timeTableId, Hashtable<Integer, Date> dateBegin, Hashtable<Integer, Date> dateEnd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean removeBook(int timeTableId, int bookId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getBookingsMaxId(int timeTableId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean saveDB() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean loadDB() {
		// TODO Auto-generated method stub
		return tTDB.loadDB();
	}
	
	

}
>>>>>>> branch 'master' of git@github.com:Jiamin-WANG/ProjetInfo.git
