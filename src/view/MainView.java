//view settings panels boxes added text set and added to view 

/*
 * File: MainView.java
 * Author: Móra Barna
 * Copyright: 2023 Móra Barna
 * Group: Szoft_I_1_N
 * Date: 2023.04.03
 * Github: https://github.com/MrBrown16/javafx-template
 * Licence: GNU GPL
 */


package view;

import com.github.mrbrown16.inputlib.ButtonPanel;
import com.github.mrbrown16.inputlib.InputPanel;
import com.github.mrbrown16.inputlib.TitlePanel;

import javafx.scene.layout.VBox;

public class MainView extends VBox{
    TitlePanel title;
    InputPanel inputa;
    InputPanel inputc;
    InputPanel inputm;
    ButtonPanel subButton;
    InputPanel areaP;

    public MainView() {
        this.title = new TitlePanel();
        this.inputa = new InputPanel();
        this.inputc = new InputPanel();
        this.inputm = new InputPanel();
        this.subButton = new ButtonPanel();
        this.areaP = new InputPanel();

        setMainView();
        addMainView();       
    }

    private void setMainView(){
        title.setText("Cím");
        inputa.setText("Bekérés szöveg");
        inputc.setText("Bekérés szöveg");
        inputm.setText("Bekérés szöveg");
        subButton.setText("Számít");
        areaP.setText("Mit számolt, eredmény");
    }
    private void addMainView(){
        this.getChildren().add(title);
        this.getChildren().add(inputa);
        this.getChildren().add(inputc);
        this.getChildren().add(inputm);
        this.getChildren().add(subButton);
        this.getChildren().add(areaP);
    }
    public TitlePanel getTitle() {
        return title;
    }

    public InputPanel getInputa() {
        return inputa;
    }

    public InputPanel getInputc() {
        return inputc;
    }

    public InputPanel getInputm() {
        return inputm;
    }

    public ButtonPanel getSubButton() {
        return subButton;
    }

    public InputPanel getAreaP() {
        return areaP;
    }
}
