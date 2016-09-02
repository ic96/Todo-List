package ca.ubc.cpsc210.todo.model;

import java.util.Date;

/**
 * Created by Ian on 10/6/2015.
 */
public class ScheduledTodoItem extends TodoItem {
    private Date dueDate;
    private boolean highPriority;

    public ScheduledTodoItem(String title, String description, Date dueDate) {
        super(title, description);
        this.dueDate = dueDate;

    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isCompleted() {
        return super.isCompleted();
    }
    @Override
    public boolean isHighPriority() {
        Date currentDate = new Date();
        return (this.dueDate.getYear() == currentDate.getYear()
                &&  this.dueDate.getMonth() == currentDate.getMonth() &&
                this.dueDate.getDay() == currentDate.getDay());

    }
}


