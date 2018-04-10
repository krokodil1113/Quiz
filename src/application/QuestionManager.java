package application;

import java.util.List;
import java.util.ArrayList;

public class QuestionManager {

	// QuestionData qData = new QuestionData();

	private List<QuestionData> qd = new ArrayList<QuestionData>();

	private int currentQuestion;
	public int points;
	private boolean theEnd;

	public int getCurrentQuestion() {
		return currentQuestion;
	}

	public QuestionManager() {
		this.currentQuestion = 0;
		this.points = 0;
		this.theEnd = false;

		addQuestionsToList();
	}
	
	

	public boolean isTheEnd() {
		return theEnd;
	}

	public void addQuestionsToList() {
		QuestionData prvoPtinje = question1();
		qd.add(prvoPtinje);
		QuestionData drugoPtinje = question2();
		qd.add(drugoPtinje);
		QuestionData trecePtinje = question3();
		qd.add(trecePtinje);
		QuestionData cetvrtoPtinje = question4();
		qd.add(cetvrtoPtinje);
		QuestionData petoPtinje = question5();
		qd.add(petoPtinje);
		QuestionData sestoPtinje = question6();
		qd.add(sestoPtinje);

	}

	public void isCorrect(String userAnsw) {

		// System.out.println(currentQuestion);
		String rightSolution = getQd().get(currentQuestion).getSolution();
		if (userAnsw.equals(rightSolution)) {
			points++;
			System.out.println("Tacno");
		} else {
			System.out.println("nije tacno");
		}
	}

	public void setNextQuestion() {
		if (currentQuestion == qd.size()-1) {
			System.out.println("TODO: KRAJ KVIZA");
			theEnd = true;
			return;
		}
		currentQuestion++;
	}

	public List<QuestionData> getQd() {
		return qd;

	}
	
	public String getTextLabel1() {
		return this.getQd().get(currentQuestion).getQuestion();
	}

	public String getTextButton1() {
		return this.getQd().get(currentQuestion).getAnswers().get(0);
	}

	public String getTextButton2() {
		return this.getQd().get(currentQuestion).getAnswers().get(1);
	}

	public String getTextButton3() {
		return this.getQd().get(currentQuestion).getAnswers().get(2);
	}

	public String getTextButton4() {
		return this.getQd().get(currentQuestion).getAnswers().get(3);
	}

	public QuestionData question1() {
		QuestionData qData = new QuestionData();

		String p1 = "Ko sam ja?";
		String s1 = "Ivan";
		List<String> answ1 = new ArrayList();
		answ1.add("Ivan");
		answ1.add("Milan");
		answ1.add("Dejan");
		answ1.add("Slavko");

		qData.createQuestion(p1, s1, answ1);

		return qData;
	}

	public QuestionData question2() {
		QuestionData qData = new QuestionData();

		String p1 = "Koji filozof se smatra osnivacem logike?";
		String s1 = "Aristotel";
		List<String> answ1 = new ArrayList();
		answ1.add("Aristotel");
		answ1.add("Platon");
		answ1.add("Kant");
		answ1.add("Toma Akvinski");

		qData.createQuestion(p1, s1, answ1);
		return qData;

	}

	public QuestionData question3() {
		QuestionData qData = new QuestionData();

		String p1 = "Koja zemlja od punudjenih ima navise stanovnika?";
		String s1 = "Brazil";
		List<String> answ1 = new ArrayList();
		answ1.add("Francuska");
		answ1.add("Kanada");
		answ1.add("Brazil");
		answ1.add("Rusija");

		qData.createQuestion(p1, s1, answ1);
		return qData;

	}

	public QuestionData question4() {
		QuestionData qData = new QuestionData();

		String p1 = "Prvi balkanski rat je poceo...";
		String s1 = "1912";
		List<String> answ1 = new ArrayList();
		answ1.add("1921");
		answ1.add("1912");
		answ1.add("1903");
		answ1.add("1913");

		qData.createQuestion(p1, s1, answ1);
		return qData;

	}

	public QuestionData question5() {
		QuestionData qData = new QuestionData();

		String p1 = "Ko je rezirao film Bure Baruta";
		String s1 = "Goran Paskaljevic";
		List<String> answ1 = new ArrayList();
		answ1.add("Zdravko Sotra");
		answ1.add("Srdan Golubovic");
		answ1.add("Goran Markovic");
		answ1.add("Goran Paskaljevic");

		qData.createQuestion(p1, s1, answ1);
		return qData;

	}

	public QuestionData question6() {
		QuestionData qData = new QuestionData();

		String p1 = "Drugi svetski rat je poceo...";
		String s1 = "1939";
		List<String> answ1 = new ArrayList();
		answ1.add("1914");
		answ1.add("1941");
		answ1.add("1939");
		answ1.add("1940");

		qData.createQuestion(p1, s1, answ1);
		return qData;

	}

	

}
