package bookExercises;

import javax.swing.JOptionPane;

public class Ex89 {

	public static void main(String[] args) {

		String userAnswer;

		int userInput;

		Double n1, n2, n3, finalResult;

		Ex89methods ex = new Ex89methods();

		do {

			userInput = Integer.parseInt(JOptionPane.showInputDialog(null,
					"What would you like to calculate? \n1 - Arithmetic Mean \n2 - Weighted Average"));

			n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the first grade"));

			n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the second grade"));

			n3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the third grade"));

			finalResult = ex.arithmeticCalculations(n1, n2, n3, userInput);

			JOptionPane.showMessageDialog(null, "Selected option: " + userInput + "\nFinal Result: " + finalResult);

			userAnswer = JOptionPane.showInputDialog(null, "Do You Want To Continue? (yes/no)");

			userAnswer = userAnswer.trim();

		} while (userAnswer.equalsIgnoreCase("yes"));

		JOptionPane.showMessageDialog(null, "END OF APPLICATION!");

	}

}
