package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;


public class Controller implements Initializable {
    MyNumber myNumber=new MyNumber();

    @FXML
    private Label l1;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        myNumber.setNumber( 0 );
        myNumber.nummberProperty().addListener( new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                l1.setText( Double.toString( myNumber.getNumber() ) );

            }
        } );

    }
    public void CounterUp(ActionEvent event){
        myNumber.setNumber( myNumber.getNumber()+1);
    }
    public void countDown(ActionEvent event) {
        myNumber.setNumber( myNumber.getNumber() - 1 );
    }
}
