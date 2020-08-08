package dreamersnet.net.RunTogetherStringProblem;

import java.util.Scanner;

public class ReadUserInput {
	private Scanner myReader = new Scanner(System.in);
	
	public String prompt(String promptStr) {
		System.out.print(promptStr);
		String result = myReader.nextLine();
		return result;
	}
	
	public Double promptDouble(String promptStr) {
		System.out.print(promptStr);
		Double result = 0.00;
		if (myReader.hasNextDouble()) {
			result = myReader.nextDouble();
		}
		return result;
	}
	
	public int promptInteger(String promptStr) {
		System.out.print(promptStr);
		int result = 0;
		if (myReader.hasNextInt()) {
			result = myReader.nextInt();
		}
		return result;
	}
}
