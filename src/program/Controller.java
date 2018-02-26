package program;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class Controller {
    @FXML
    public Button tambah;
    @FXML
    public Button kurang;
    @FXML
    public Button kali;
    @FXML
    public Button bagi;
    @FXML
    public Button clearBtn;
    @FXML
    public TextField number1;
    @FXML
    public TextField number2;
    @FXML
    public TextField resultArea;



    public void operasiTambah(javafx.event.ActionEvent actionEvent) {
        String numb1 = number1.getText().trim();
        String numb2 = number2.getText().trim();
        if (numb1.matches("[0-9]+") && numb2.matches("[0-9]+")) {
            Integer num1 = Integer.valueOf(numb1);
            Integer num2 = Integer.valueOf(numb2);
            Integer results = num1 + num2;
            resultArea.setAlignment(Pos.TOP_RIGHT);
            resultArea.setText(String.valueOf(results));
        }
        else if (number1.getText().isEmpty() || number2.getText().isEmpty()){
            new Alert(Alert.AlertType.ERROR, "Please input your numbers").showAndWait();
        }
        else {
            new Alert(Alert.AlertType.ERROR, "Please input numbers only").showAndWait();
        }

    }

    public void operasiKurang(javafx.event.ActionEvent actionEvent) {
        String numb1 = number1.getText().trim();
        String numb2 = number2.getText().trim();
        if (numb1.matches("[0-9]+") && numb2.matches("[0-9]+")) {
            Integer num1 = Integer.valueOf(numb1);
            Integer num2 = Integer.valueOf(numb2);
            Integer results = num1 - num2;
            resultArea.setAlignment(Pos.TOP_RIGHT);
            resultArea.setText(String.valueOf(results));
        }
        else if (number1.getText().isEmpty() || number2.getText().isEmpty()){
            new Alert(Alert.AlertType.ERROR, "Please input your numbers").showAndWait();
        }
        else {
            new Alert(Alert.AlertType.ERROR, "Please input numbers only").showAndWait();
        }

    }

    public void operasiBagi(javafx.event.ActionEvent actionEvent) {
        String numb1 = number1.getText().trim();
        String numb2 = number2.getText().trim();
        if (numb1.matches("[0-9]+") && numb2.matches("[0-9]+")) {
            Float num1 = Float.valueOf(numb1);
            Float num2 = Float.valueOf(numb2);
            if (num1 % num2 == 0){
                Integer int1 = Integer.valueOf(numb1);
                Integer int2 = Integer.valueOf(numb2);
                Integer results = int1 / int2;
                resultArea.setAlignment(Pos.TOP_RIGHT);
                resultArea.setText(String.valueOf(results));
            }
            else {
                Float results = num1 / num2;
                resultArea.setAlignment(Pos.TOP_RIGHT);
                resultArea.setText(String.valueOf(results));
            }

        }
        else if (number1.getText().isEmpty() || number2.getText().isEmpty()){
            new Alert(Alert.AlertType.ERROR, "Please input your numbers").showAndWait();
        }
        else {
            new Alert(Alert.AlertType.ERROR, "Please input numbers only").showAndWait();
        }

    }

    public void operasiKali(javafx.event.ActionEvent actionEvent) {
        String numb1 = number1.getText().trim();
        String numb2 = number2.getText().trim();
        if (numb1.matches("[0-9]+") && numb2.matches("[0-9]+")) {
            Integer num1 = Integer.valueOf(numb1);
            Integer num2 = Integer.valueOf(numb2);
            Integer results = num1 * num2;
            resultArea.setAlignment(Pos.TOP_RIGHT);
            resultArea.setText(String.valueOf(results));
        }
        else if (number1.getText().isEmpty() || number2.getText().isEmpty()){
            new Alert(Alert.AlertType.ERROR, "Please input your numbers").showAndWait();
        }
        else {
            new Alert(Alert.AlertType.ERROR, "Please input numbers only").showAndWait();
        }

    }

    public void clear(javafx.event.ActionEvent actionEvent) {
        number1.setText(null);
        number2.setText(null);
        resultArea.setText(null);
    }
}
