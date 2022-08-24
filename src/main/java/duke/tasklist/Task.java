package duke.tasklist;

public class Task {
    protected String description;
    protected boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public void markAsDone() {
        if (this.isDone) {
            System.out.println("Task already marked as done\n" + this);
        } else {
            this.isDone = true;
            System.out.println("Nice! I've marked this task as done\n" +
                    this);
        }
    }

    public void markSavedTaskAsDone() {
        if (!this.isDone) {
            this.isDone = true;
        }
    }

    public void markAsNotDone() {
        if (!this.isDone) {
            System.out.println("Task already marked as not done\n" + this);
        } else {
            this.isDone = false;
            System.out.println("Ok! I've unmarked this task\n" + this);
        }
    }

    public String getStatusIcon() {
        return (isDone ? "X" : " ");
    }

    public String getSavedFileFormat() {
        return (this.isDone ? 1 : 0) + "|" + this.description;
    }

    @Override
    public String toString() {
        return "[" + getStatusIcon() + "] " + this.description;
    }
}