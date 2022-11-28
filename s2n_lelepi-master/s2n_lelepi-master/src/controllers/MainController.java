package controllers;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import views.MainWindow;

public class MainController {
    MainWindow mainWindow;

    public MainController() {
        this.mainWindow = new MainWindow();
        this.handleEvents();
    }

    public void handleEvents() {
        JButton calcButton = this.mainWindow.buttonsPanel.calcButton;
        JButton aboutButton = this.mainWindow.buttonsPanel.aboutButton;
        calcButton.addActionListener(e -> onClickCalcButton());
        aboutButton.addActionListener(e -> onClickAboutButton());
    }

    public void onClickCalcButton() {
        String aedgeStr = this.mainWindow.aedgePanel.getValue();
        String bedgeStr = this.mainWindow.bedgePanel.getValue();
        String cedgeStr = this.mainWindow.cedgePanel.getValue();
        double aedge = Double.parseDouble(aedgeStr);
        double bedge = Double.parseDouble(bedgeStr);
        double cedge = Double.parseDouble(cedgeStr);
        Double volume = aedge * bedge * cedge;

        this.mainWindow.volumePanel.setValue(volume.toString());

    }

    public void onClickAboutButton() {
        String aboutString = "Niki prototípus";
        JOptionPane.showMessageDialog(mainWindow, aboutString);

    }
}
