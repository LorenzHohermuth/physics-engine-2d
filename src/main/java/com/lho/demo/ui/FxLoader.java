package com.lho.demo.ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FxLoader extends Application {

    private static FXMLLoader currentLoader;

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(FxLoader.class.getResource("Enviroment.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

        currentLoader = fxmlLoader;
        FxLoader.scene = scene;
    }

    public static void launchFx()  {
        launch();
    }

    public static Controller getController() {
        return (Controller) currentLoader.getController();
    }

    public static Scene getScene() {
        return scene;
    }
}