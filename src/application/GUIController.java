package application;

import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class GUIController {

	QuestionData qData = new QuestionData();

	QuestionManager qManager = new QuestionManager();

	// int questionNum = 0;

	@FXML
	private Label l1;
    @FXML
	private Label l2;
    @FXML
	private Label l3;
	@FXML
	private Button btn1;
	@FXML
	private Button btn2;
    @FXML
	private Button btn3;
	@FXML
	private Button btn4;

	
	public void initialize() {

		l1.setText(qManager.getQd().get(0).getQuestion());
		btn1.setText(qManager.getQd().get(0).getAnswers().get(0));
		btn2.setText(qManager.getQd().get(0).getAnswers().get(1));
		btn3.setText(qManager.getQd().get(0).getAnswers().get(2));
		btn4.setText(qManager.getQd().get(0).getAnswers().get(3));

	}

	public void buttonClick(ActionEvent event) {

		
		if (!qManager.isTheEnd()) {
			Button anyButton = (Button) event.getSource();
			String userAnsw = anyButton.getText();

			qManager.isCorrect(userAnsw);
			qManager.setNextQuestion();
			DisplayQuestion();
		}
		
	}

	
	private void DisplayQuestion() {
			
		if (!qManager.isTheEnd()) {
			l3.setText(String.valueOf(qManager.points));
			l1.setText(qManager.getTextLabel1());
			btn1.setText(qManager.getTextButton1());
			btn2.setText(qManager.getTextButton2());
			btn3.setText(qManager.getTextButton3());
			btn4.setText(qManager.getTextButton4());
		}
		else {
			l3.setText("KRAJ! Broj poena: " + qManager.points );
		}
		
	}
		// System.out.println(qManager.points);
}


