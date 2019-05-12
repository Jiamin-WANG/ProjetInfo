import java.util.*;

public class Task {
	protected static int idCounter = 0;
	protected int id;
	protected String label;
	protected Calendar dueDate;
	protected int estimatedTime;
	protected boolean done;

	public Task(String label, Calendar dueDate, int estimatedTime) {
		this.id = idCounter++;
		this.label = label;
		this.dueDate = dueDate;
		this.estimatedTime = estimatedTime;
		this.done = false;
	}

	public int getId() {
		return id;
	}

	public String getLabel() {
		return label;
	}

	public Calendar getDueDate() {
		return dueDate;
	}

	public int getEstimatedTime() {
		return estimatedTime;
	}

	public boolean isDone() {
		return done;
	}

	public void done() {
		done = true;
	}

	@Override
	public String toString() {
		return id + " " + label + " : " + dueDate.get(Calendar.DAY_OF_MONTH) + "/" + dueDate.get(Calendar.MONTH) + "/"
				+ dueDate.get(Calendar.YEAR);
	}
}