package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setMaximized(true);
			primaryStage.setTitle("Workflow Manager v1.0");
			
			
			VBox topContainer = new VBox();  //Creates a container to hold all Menu Objects.
			MenuBar mainMenu = new MenuBar();  //Creates our main menu to hold our Sub-Menus.
			ToolBar toolBar = new ToolBar();	//Creates our tool-bar to hold the buttons.
			
			topContainer.getChildren().add(mainMenu);
			topContainer.getChildren().add(toolBar);
			 
			root.setTop(topContainer);
			
			
			//Add Kanban all work
			Menu add = new Menu("Add Kanban(s)");
			MenuItem createKanban = new MenuItem("Create Kanban");
			add.getItems().addAll(createKanban);
			
			
			createKanban.setOnAction(new EventHandler<ActionEvent>() {
			    public void handle(ActionEvent t) {
			        Stage stage = new Stage();
			        GridPane gridpane = new GridPane();
			        Scene scene1 = new Scene(gridpane, 600,600);
			        stage.setTitle("Create a Kanban");
			        stage.setScene(scene1);
			        stage.setMaximized(true);
			        stage.show();
			       
			        
			        gridpane.setPadding(new Insets(5));
			        gridpane.setHgap(5);
			        gridpane.setVgap(5);
			        ColumnConstraints column1 = new ColumnConstraints(100);
			        ColumnConstraints column2 = new ColumnConstraints(50, 150, 300);
			        column2.setHgrow(Priority.ALWAYS);
			        gridpane.getColumnConstraints().addAll(column1, column2);

			        Label fNameLbl = new Label("First Name");
			        TextField fNameFld = new TextField();
			        Label lNameLbl = new Label("Last Name");
			        TextField lNameFld = new TextField();

			        Button saveButt = new Button("Save");

			        // First name label
			        GridPane.setHalignment(fNameLbl, HPos.RIGHT);
			        gridpane.add(fNameLbl, 0, 0);

			        // Last name label
			        GridPane.setHalignment(lNameLbl, HPos.RIGHT);
			        gridpane.add(lNameLbl, 0, 1);

			        // First name field
			        GridPane.setHalignment(fNameFld, HPos.LEFT);
			        gridpane.add(fNameFld, 1, 0);

			        // Last name field
			        GridPane.setHalignment(lNameFld, HPos.LEFT);
			        gridpane.add(lNameFld, 1, 1);

			        // Save button
			        GridPane.setHalignment(saveButt, HPos.RIGHT);
			        gridpane.add(saveButt, 1, 2);

			       
			        stage.setScene(scene1);
			        stage.show();
			      }
			        
			        
			        
			        
			        
			    }
			);
			
			Menu edit = new Menu("Edit Kanban(s)");
			MenuItem editKanban = new MenuItem("Edit Kanban(s)");
			MenuItem deleteKanban = new MenuItem("Delete Kanban(s)");
			edit.getItems().addAll(editKanban, deleteKanban);
			
			Menu editLane = new Menu("Edit Lane(s)");
			Menu switchKanban = new Menu("Switch Project"); 
			mainMenu.getMenus().addAll(add, edit, editLane, switchKanban);
			
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
