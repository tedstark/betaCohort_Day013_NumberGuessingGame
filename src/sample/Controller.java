package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import java.util.Random;

public class Controller {

    @FXML
    private TextField guessField;
    @FXML
    private Button submitButton;
    @FXML
    private Text highlow;
    @FXML
    private Text range;
    @FXML
    private Button newGame;
    @FXML
    private Button endGame;
    @FXML
    private Text showSecret;

    Random random = new Random();

    int gameLow = 0;
    int gameHigh = 10000;
    int low=gameLow;
    int high=gameHigh;
    int secretNumberI = random.nextInt(high);
    String secretNumberS = Integer.toString(secretNumberI);
    int guessCount = 0;


    public void clickSubmit(ActionEvent actionEvent) {
        String guessFieldS = guessField.getText();
        int guessFieldI = Integer.parseInt(guessFieldS);
        if (guessFieldI > secretNumberI) {
            guessCount++;
            highlow.setText("Your guess was too high!");
            high=guessFieldI;
            range.setText("Guess between: " + low + " - " + high);
            guessField.setText("");
            showSecret.setText(secretNumberS);
        }
        if (guessFieldI < secretNumberI) {
            guessCount++;
            highlow.setText("Your guess was too low!");
            low=guessFieldI;
            range.setText("Guess between: " + low + " - " + high);
            guessField.setText("");
            showSecret.setText(secretNumberS);
        }
        if (guessFieldI == secretNumberI) {
            guessCount++;
            highlow.setText("That's right!! You win!");
            range.setText("Click below to restart or end.");
            showSecret.setText("You took " + guessCount + " guesses to guess my number.");
        }
    }
    public void clickNew(ActionEvent actionEvent) {
        guessField.setText("");
        gameLow = 0;
        gameHigh = 10000;
        low=gameLow;
        high=gameHigh;
        guessCount=0;
        highlow.setText("Type your guess above...");
        range.setText("");
        showSecret.setText("");
        secretNumberI = random.nextInt(high);
        secretNumberS = Integer.toString(secretNumberI);
    }

    public void clickEnd(ActionEvent actionEvent) {
        System.exit(0);
    }
}
