/*
 * File: MainControl.java
 * Author: Móra Barna
 * Copyright: 2023 Móra Barna
 * Group: Szoft_I_1_N
 * Date: 2023.04.03
 * Github: https://github.com/MrBrown16/javafx-template
 * Licence: GNU GPL
 */


package control;

import javafx.scene.control.Button;
import model.MainModel;
import view.MainView;

public class MainControl {
    MainView mainView;

    MainModel mainModel;

    public MainControl() {
        mainView = new MainView();
        handleEvent();
        mainModel = new MainModel();    
    }
    private void handleEvent(){
        Button calcButton = this.mainView.getSubButton().getCalcButton();
        calcButton.setOnAction(e->{
            System.out.println("BU!");
            String inputaStr = this.mainView.getInputa().getValue();
            String inputcStr = this.mainView.getInputc().getValue();
            String inputmStr = this.mainView.getInputm().getValue();
            double inputa = Double.parseDouble(inputaStr);
            double inputc = Double.parseDouble(inputcStr);
            double inputm = Double.parseDouble(inputmStr);
            Double area = mainModel.calcTrapitArea(inputa, inputc, inputm);
            this.mainView.getAreaP().setValue(area.toString());
        });
    }

    public MainView getMainView() {
        return mainView;
    }
    
}
