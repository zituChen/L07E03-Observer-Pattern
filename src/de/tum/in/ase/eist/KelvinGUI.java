package de.tum.in.ase.eist;

import java.awt.*;

public class KelvinGUI extends TemperatureGUI {

    public KelvinGUI(TemperatureModel model, Point location) {
        super("Celsius Temperature", model, location);
        addRaiseTempListener(() -> getModel().increaseC(1.0));
        addLowerTempListener(() -> getModel().increaseC(-1.0));
        addDisplayListener(() -> {
            double value = getDisplay();
            getModel().setC(value);
        });
        this.getModel().addObserver(this);
    }

    @Override
    public void onUpdate(Double newState) {
        double value = TemperatureConverter.convertCelsiusToKelvin(newState);
        setDisplay(Double.toString(value));
    }

}
