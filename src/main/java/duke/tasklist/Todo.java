package duke.tasklist;

/**
 * Class to represent todo tasks.
 * */
public class Todo extends Task {

    /**
     * Constructs a new Todo object
     *
     */
    public Todo(String description) {
        super(description);
    }

    /**
     * Return string representation of todo object prefixed with [T].
     */
    @Override
    public String toString() {
        return "[T]" + super.toString();
    }

    /**
     * Return string representation of todo object for saving to file.
     */
    @Override
    public String savedFileFormat() {
        return "T | " + (this.isDone ? 1 : 0) + " | " + this.description;
    }
}
