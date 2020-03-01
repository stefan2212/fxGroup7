package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import sample.entity.Database;
import sample.entity.User;

import java.util.List;

public class Controller {

    @FXML
    private TextField username;
    @FXML
    private PasswordField password;

    public void loginButtonIsClicked() {
        User user = new User(username.getText(), password.getText());
        Database database = new Database();
        List<User> userList = database.getUsers();
        if(userExists(userList, user)){
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setContentText("You have logged in succesfully");
            alert.show();
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("You have failed!!!!");
            alert.show();
        }
    }

    public void buttonIsClicked() {
        System.out.println("Button is pressed");
    }

    private boolean userExists(List<User> users, User user) {
       for(User each:users) {
           if(each.equals(user)) {
               return true;
           }
       }
       return false;
    }

}
