package org.example;
import java.sql.SQLException;
public class ToDoApp
{
    public static void main(String[] args) {
        try {
            DBConnection db = DBConnection.getInstance();
            // Insert
            Task t = new Task("Abdulhadi Alshehri", false);
            t.insertTask();
            // Retrieve all tasks
            t.retrieveTasks();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}