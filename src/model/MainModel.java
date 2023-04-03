// behind the scenes calculations database handling....


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
