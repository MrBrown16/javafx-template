// behind the scenes calculations database handling....

/*
 * File: MainModel.java
 * Author: Móra Barna
 * Copyright: 2023 Móra Barna
 * Group: Szoft_I_1_N
 * Date: 2023.04.03
 * Github: https://github.com/MrBrown16/javafx-template
 * Licence: GNU GPL
 */

package model;

public class MainModel {

    public MainModel() {
    }
    public Double calcTrapitArea(double inputa, double inputc, double inputm){
        Double area = ((1. * inputa + inputc)/2) *inputm;
        return area;
    }
    //calculations database handling....
}
