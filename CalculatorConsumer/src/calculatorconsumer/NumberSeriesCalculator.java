package calculatorconsumer;

import javax.swing.JOptionPane;

import com.sliit.sa.interfaces.NumberSeriesInterfaces;

public class NumberSeriesCalculator {

	int  type=1;
	String  input,number,number1;
	
	public void NumberSeriesCalculatorOperations(NumberSeriesInterfaces service_series) {
		while (type!=0) {
			input = JOptionPane.showInputDialog(null, ""
					+ "Press 1 - fibonacci number \n "
					+ "Press 2 - Square number \n "
					+ "Press 3 - Factorial number \n "
					+ "Press 4 - Check Prime number  \n"
					+ "Press 5 - Find Maximum Number \n"
					+ "Press 6 - Find Minimum Number \n"
					+ "Press 7 - Check Odd Number \n"
					+ "Press 8 - Check Even Number \n"
					+ "Press 9 - Check Perfect Number \n "
					+ "Press 10 - Check Armstrong Number \n"
					+ "\n Press 0 - Back", "Operations", JOptionPane.INFORMATION_MESSAGE);
			if(Validate.validateNumber(input)) {
				type=Integer.parseInt(input);
				if(type==1) {
					number = JOptionPane.showInputDialog("Enter the position of fibinocci number needed : ");
					if(Validate.validateNumber(number)) {
						JOptionPane.showMessageDialog(null, "The Answer is : " + service_series.fibonacci(Integer.parseInt(number)), "Answer", JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						JOptionPane.showMessageDialog(null, "Please enter only numbers", "Input Error", JOptionPane.ERROR_MESSAGE);
						continue;
					}
					
				}
				if(type==2) {
					number = JOptionPane.showInputDialog("Enter the position of square number needed : ");
					if(Validate.validateNumber(number)) {
						JOptionPane.showMessageDialog(null, "The Answer is : " + service_series.findSquareNumber(Integer.parseInt(number)), "Answer", JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						JOptionPane.showMessageDialog(null, "Please enter only numbers", "Input Error", JOptionPane.ERROR_MESSAGE);
						continue;
					}
				}
				if(type==3) {
					number = JOptionPane.showInputDialog("Enter factorial  number needed : ");
					if(Validate.validateNumber(number)) {
						JOptionPane.showMessageDialog(null, "The Answer is : " + service_series.findFactorial(Integer.parseInt(number)), "Answer", JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						JOptionPane.showMessageDialog(null, "Please enter only numbers", "Input Error", JOptionPane.ERROR_MESSAGE);
						continue;
					}
				}
				if(type==4) {
					number = JOptionPane.showInputDialog("Enter the number to checked whether the number is prime or not ");
					if(Validate.validateNumber(number)) {
						String answer;
						if(service_series.checkPrime(Integer.parseInt(number))) {
							answer = number + " is prime "; 
						}
						else {
							answer = number + " is not prime";
						}
						JOptionPane.showMessageDialog(null, answer, "Answer", JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						JOptionPane.showMessageDialog(null, "Please enter only numbers", "Input Error", JOptionPane.ERROR_MESSAGE);
						continue;
					}
				}
				if(type==5) {
					number = JOptionPane.showInputDialog("Enter the First Number ");
					if(Validate.validateNumber(number)) {
						number1 = JOptionPane.showInputDialog("Enter the Second Number ");
						if(Validate.validateNumber(number1)) {
							JOptionPane.showMessageDialog(null, "The Maximum number is : "+ service_series.findMax(Integer.parseInt(number), Integer.parseInt(number1)), "Answer", JOptionPane.INFORMATION_MESSAGE);
						}
						else {
							JOptionPane.showMessageDialog(null, "Please enter only numbers", "Incorrect Input", JOptionPane.ERROR_MESSAGE);
							continue;
						}
					}
					else {
						JOptionPane.showMessageDialog(null, "Please enter only numbers", "Incorrect Input", JOptionPane.ERROR_MESSAGE);
						continue;
					}
				}
				if(type==6) {
					number = JOptionPane.showInputDialog("Enter the First Number ");
					if(Validate.validateNumber(number)) {
						number1 = JOptionPane.showInputDialog("Enter the Second Number ");
						if(Validate.validateNumber(number1)) {
							JOptionPane.showMessageDialog(null, "The Minimum number is : "+ service_series.findMin(Integer.parseInt(number), Integer.parseInt(number1)), "Answer", JOptionPane.INFORMATION_MESSAGE);
						}
						else {
							JOptionPane.showMessageDialog(null, "Please enter only numbers", "Incorrect Input", JOptionPane.ERROR_MESSAGE);
							continue;
						}
					}
					else {
						JOptionPane.showMessageDialog(null, "Please enter only numbers", "Incorrect Input", JOptionPane.ERROR_MESSAGE);
						continue;
					}
					
				}
				if(type==7) {
					number = JOptionPane.showInputDialog("Enter the number to checked whether the number is Odd or not ");
					if(Validate.validateNumber(number)) {
						String answer;
						if(service_series.checkOdd(Integer.parseInt(number))) {
							answer = number + " is Odd "; 
						}
						else {
							answer = number + " is not Odd";
						}
						JOptionPane.showMessageDialog(null, answer, "Answer", JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						JOptionPane.showMessageDialog(null, "Please enter only numbers", "Input Error", JOptionPane.ERROR_MESSAGE);
						continue;
					}
				}
				if(type==8) {
					number = JOptionPane.showInputDialog("Enter the number to checked whether the number is Even or not ");
				if(Validate.validateNumber(number)) {
					String answer;
					if(service_series.checkEven(Integer.parseInt(number))) {
						answer = number + " is Even "; 
					}
					else {
						answer = number + " is not Even";
					}
					JOptionPane.showMessageDialog(null, answer, "Answer", JOptionPane.INFORMATION_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(null, "Please enter only numbers", "Input Error", JOptionPane.ERROR_MESSAGE);
					continue;
				}
					
				}
				if(type==9) {
					number = JOptionPane.showInputDialog("Enter the number to checked whether the number is Perfect number or not ");
					if(Validate.validateNumber(number)) {
						String answer;
						if(service_series.checkPerfectNumber(Integer.parseInt(number))) {
							answer = number + " is Perfect "; 
						}
						else {
							answer = number + " is not Perfect";
						}
						JOptionPane.showMessageDialog(null, answer, "Answer", JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						JOptionPane.showMessageDialog(null, "Please enter only numbers", "Input Error", JOptionPane.ERROR_MESSAGE);
						continue;
					}
				}
				if(type==10) {
					number = JOptionPane.showInputDialog("Enter the number to checked whether the number is Armstrong number or not ");
					if(Validate.validateNumber(number)) {
						String answer;
						if(service_series.checkArmStrongNumber(Integer.parseInt(number))) {
							answer = number + " is Armstrong Number "; 
						}
						else {
							answer = number + " is not Armstrong Number";
						}
						JOptionPane.showMessageDialog(null, answer, "Answer", JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						JOptionPane.showMessageDialog(null, "Please enter only numbers", "Input Error", JOptionPane.ERROR_MESSAGE);
						continue;
					}
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "Please enter the correct operations", "Incorrect Input", JOptionPane.ERROR_MESSAGE);
				continue;
			}
		}
	}
}
