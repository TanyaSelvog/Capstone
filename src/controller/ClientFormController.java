package controller;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;
//Everything from 12.25 work
public class ClientFormController implements Initializable {
    /**
     * Button for returning to Homepage
     */
    @FXML
    public Button homeBtn;

    /**
     * Cancel button
     */
    @FXML
    public Button cancelBtn;

    /**
     * Save button for saving customer data
     */
    @FXML
    public Button saveBtn;

    /**
     * Textfield for customer name
     */
    @FXML
    public TextField customerName;

    /**
     * Textfield for customer phone number
     */
    @FXML
    public TextField customerPhone;

    /**
     * Textfield for customer postal code
     */
    @FXML
    public TextField customerPostalCode;

    /**
     * Textfield for customer address
     */
    @FXML
    public TextField clientAddress;

    /**
     * Textfield for client ID
     */
    @FXML
    public TextField clientID;



    /**
     * This method initializes the Customer form controller.
     *
     * @param url            Used to resolve relative paths for the root object, or null if the location is not known.
     * @param resourceBundle Used to localize the root object, or null if the root object was not localized.
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    /**
     * Event handler for Home button that directs user back to Home page
     * @param actionEvent Home button click
     * @throws Exception
     */
    public void onHome(ActionEvent actionEvent) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/view/HomepageWindow.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setTitle("Modify Current Client");
        Scene scene = new Scene(root, 1000, 600);
        stage.setScene(scene);
        stage.show();

    }

    /**
     * Validates and saves customer information and returns user back to Customer View page
     * @param actionEvent on Save clicked
     * @throws Exception
     */

    public void onSaveBtn(ActionEvent actionEvent) throws Exception {
     /**   String custName = customerName.getText();
        String custAddress = customerAddress.getText();

        String customerPostal =customerPostalCode.getText();
        String custPhone = customerPhone.getText();
        Country countryName = (Country) countryComboBox.getValue();
        Division division = (Division)divisionComboBox.getSelectionModel().getSelectedItem();

        if (custName.isEmpty() || custAddress.isEmpty() || custPhone.isEmpty() || countryName == null  || divisionComboBox == null ||
                customerPostal.isEmpty()){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("Missing input.");
            alert.setContentText("Data is missing in one or more fields.");
            alert.showAndWait();

        }else{
            int divisionID = division.getDivisionID();
            CustDB.createCustomer(custName, custAddress, customerPostal, custPhone, divisionID);
            Parent root = FXMLLoader.load(getClass().getResource("/view/CustomersView.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setTitle("All Customers");
            Scene scene = new Scene(root, 1000, 600);
            stage.setScene(scene);
        }

*/

    }

    /**
     * Event handler for Cancel button that directs user back to Customers View page
     * @param actionEvent Cancel button click
     * @throws Exception
     */
    public void onCancelBtn(ActionEvent actionEvent) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/view/CustomersView.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setTitle("All Customers");
        Scene scene = new Scene(root, 1000, 600);
        stage.setScene(scene);
        stage.show();
    }



}






