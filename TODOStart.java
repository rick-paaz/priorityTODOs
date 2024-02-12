// The user interface for our Priority TODOs application of your own design.

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * This program maintains a TODO list that can be saved to disk for persistence
 * 
 * @author Rick Mercer
 */
public class TODOStart extends Application {

  public static void main(String[] args) {
    launch();
  }

  BorderPane pane = new BorderPane();

  @Override
  public void start(Stage stage) {
    getSavedToDosOrNot();
    layoutGUI();
    registerListeners(stage);
    var scene = new Scene(pane, 600, 390);
    stage.setScene(scene);
    stage.show();
  }
  
  private void registerListeners(Stage stage) {
    // TODO Auto-generated method stub  
  }

  private void getSavedToDosOrNot() {
    // TODO Auto-generated method stub    
  }

  private void layoutGUI() {
    // TODO Auto-generated method stub    
  }
  
}