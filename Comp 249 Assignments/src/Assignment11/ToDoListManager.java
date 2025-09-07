package Assignment11;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ToDoListManager extends Application {
    //------------------------------------------------------------------------------------------------------------------
// Assignment 2
// Written by: Mayar Rekmani 40309949, Krish Patel 40311230
// For COMP 249 Summer 2025
//------------------------------------------------------------------------------------------------------------------


//override start
    @Override
    public void start(Stage stage) {
        //create a list of strings that will present the tasks
        ListView<String> taskListView = new ListView<>();
        //create a place to put in the input
        TextField input = new TextField();
        input.setPromptText("Enter the next task");
        input.setStyle("-fx-prompt-text-fill: black;");
        //create the variables for Hbox to present the user, as well create variables for the user to click on buttons
        Label taskLabel = new Label("Task: [ ");
        Label parenthesis = new Label("] ");
        Button addTask = new Button("[Add Task]");
        Button removeTask = new Button("[Remove Selected]");
        HBox inputRow = new HBox(taskLabel, input,parenthesis,addTask);
        VBox root = new VBox(10,inputRow,taskListView,removeTask);
//create a statement that allows the user to click on the taskview and create an x on top as well be able to remove the task using the remove task button
        taskListView.setOnMouseClicked(e -> {
            int index = taskListView.getSelectionModel().getSelectedIndex();
            if (index >= 0) {
                //we will create an if statement that will allow us to put in the x on the braces
                String item = taskListView.getItems().get(index);
                if (item.startsWith("[ ] ")) {
                    taskListView.getItems().set(index, "[X] " + item.substring(4));
                } else if (item.startsWith("[X] ")) {
                    taskListView.getItems().set(index, "[ ] " + item.substring(4));
                }
                taskListView.getSelectionModel().clearSelection();
                }
            //we will remove all items that have the x
            removeTask.setOnAction(ev-> {
                    taskListView.getItems().removeIf(item -> item.startsWith("[X] "));
            });
        });
//create the add task button which allows you to add the task with the braces
        addTask.setOnAction(e ->{
            String taskInput = "[ ] "+input.getText().trim();
            if (!taskInput.substring(4).isEmpty()){
                taskListView.getItems().add(taskInput);
                input.clear();
            }
        });
//put it all into a scene
        Scene scene = new Scene(root, 400, 200);
//present the scene
        stage.setScene(scene);
        stage.setTitle("Simple JavaFX To-Do List Manager");
        stage.show();
    }
    public static void main(String[] args) {
        //launch it
        launch(args);
    }
}
