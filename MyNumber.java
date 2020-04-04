package sample;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class MyNumber {
    private DoubleProperty number;

    public double getNumber() {
        if(number !=null)
            return number.get();
        return 0;
    }

    public void setNumber(double number) {
        this.nummberProperty().set(number);
    }

    public final DoubleProperty nummberProperty(){
        if(number == null){
            number=new SimpleDoubleProperty( 0 );
        }
        return number;
    }
}
