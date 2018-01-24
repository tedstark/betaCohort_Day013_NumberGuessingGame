package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
/*  2018.01.24
    Write a guessing game program.
    Your program should generate a random integer between 1 and 10000.
    Prompt the user to enter a guess.
    For each guess, output "HIGHER" if the guess is smaller than the random integer
    or "LOWER" if the user's guess is larger than the random integer.
    Also output the new range of eligible guesses.
    When the user guesses the random integer, output a message that says so
    and displays the number guesses it took to get to the right number.
    Additionally, it should show what numbers the user guessed along the way.

 */
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Guess My Number!");
        primaryStage.setScene(new Scene(root, 350, 400));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
