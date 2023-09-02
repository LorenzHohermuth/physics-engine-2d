package com.lho.demo.ui;

import com.lho.demo.App;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private Pane canvas;

    public Pane getCanvas() {
        return canvas;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        App.start();
    }
}