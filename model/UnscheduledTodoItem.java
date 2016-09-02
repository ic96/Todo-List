package ca.ubc.cpsc210.todo.model;

import java.util.Date;

/**
 * Created by Ian on 10/6/2015.
 */
public class UnscheduledTodoItem extends TodoItem {
    private boolean highPriority;

    public UnscheduledTodoItem(String title, String description, boolean highPriority){
        super(title, description);
        this.highPriority = highPriority;

    }

    @Override
    public boolean isHighPriority() {
        return highPriority;
    }

    public void setHighPriority(boolean highPriority){
        this.highPriority = highPriority;
    }
}
