package application;

import java.util.List;
import java.util.ArrayList;

public class QuestionManager {

	QuestionData qData = new QuestionData();

	private List<QuestionData> qd = new ArrayList<QuestionData>();

	private int currentQuestion = 0;
	
	public int points = 0;

	public QuestionManager() {

		addToList();
	}

	public void addToList() {
		QuestionData prvoPtinje = question1();
		qd.add(prvoPtinje);
		QuestionData drugoPtinje = question2();
		qd.add(drugoPtinje);
		QuestionData trecePtinje = question3();
		qd.add(trecePtinje);
		QuestionData cetvrtoPtinje = question4();
		qd.add(cetvrtoPtinje);
	}
	
	// TODO: fix counter 
	public void isCorrect(String userAnsw) {
		System.out.println(currentQuestion);
		if (userAnsw.equals(getQd().get(currentQuestion).getSolution())) {
			points++;
			System.out.println("Radi");
		}else {
			System.out.println("ne radi");
		}
		System.out.println(currentQuestion);

	}

	/*public void setNextQuestion() {
		++currentQuestion;
		System.out.println(currentQuestion);

	}*/

	public int setNextQuestion2() {
		
		if(currentQuestion < qd.size()-1) {
			currentQuestion++;
			
		}

		return currentQuestion;
	}

	

	public List<QuestionData> getQd() {
		return qd;
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

		String p1 = "Ja nisam?";
		String s1 = "Stevan";
		List<String> answ1 = new ArrayList();
		answ1.add("Ian");
		answ1.add("Milan");
		answ1.add("Dejan");
		answ1.add("Stevan");

		qData.createQuestion(p1, s1, answ1);
		return qData;

	}

	public QuestionData question3() {
		QuestionData qData = new QuestionData();

		String p1 = "De sam ja?";
		String s1 = "Potktovlje";
		List<String> answ1 = new ArrayList();
		answ1.add("Brazil");
		answ1.add("Rim");
		answ1.add("Potktovlje");
		answ1.add("Kina");
		
		qData.createQuestion(p1, s1, answ1);
		return qData;

	}
	
	public QuestionData question4() {
		QuestionData qData = new QuestionData();

		String p1 = "OD kad sam ja?";
		String s1 = "1984";
		List<String> answ1 = new ArrayList();
		answ1.add("2956");
		answ1.add("1984");
		answ1.add("0054");
		answ1.add("1111");
		
		qData.createQuestion(p1, s1, answ1);
		return qData;

	}
	
	

}
