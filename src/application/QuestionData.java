package application;

import java.util.ArrayList;
import java.util.List;

public class QuestionData {

	private String question;
	private String solution;
	private List<String> answers = new ArrayList<String>();
	
	
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}	
	public String getSolution() {
		return solution;
	}
	public void setSolution(String solution) {
		this.solution = solution;
	}
	public List<String> getAnswers() {
		return answers;
	}
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	
	public void createQuestion(String str1, String str2, List<String>list) //List<String> 
	{
		question = str1;
		solution = str2;
		
	for(String s : list) {
			answers.add(s);
		}
		
	}
	
}
