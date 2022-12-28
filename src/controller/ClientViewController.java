package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class ClientViewController implements Initializable {


    /**
     * Event that takes user to Add New Client page on click
     * @param actionEvent Add New Client button click
     * @throws Exception
     */
    public void onAddNewClient(ActionEvent actionEvent)  throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/view/ClientForm.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setTitle("Add New Client");
        Scene scene = new Scene(root, 1000, 600);
        stage.setScene(scene);
        stage.show();
    }


    public void onModClient(ActionEvent actionEvent) {
    }
    /**
     * Event handler for returning user back to home page
     * @param actionEvent on click
     * @throws Exception
     */
    public void onBack(ActionEvent actionEvent) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("/view/HomepageWindow.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setTitle("Scheduler Homepage");
        Scene scene = new Scene(root, 1000, 600);
        stage.setScene(scene);
        stage.show();
    }

    public void onDelete(ActionEvent actionEvent) {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
