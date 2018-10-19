import java.util.Scanner;
public class Project17 {
	public static void main(String args[]) {
		
		// I define a int, to close the loop I'm going to create.
		int loopnum = 0;
		
		// Scanner to ask numbers in this program.
		Scanner sc = new Scanner(System.in);
		
		// I'm going to use while, to create a loop to use more than one option when we use the program.
		while (loopnum != 1) {
			System.out.println("Choose an option:");
			System.out.println("1.- Enter a positive number and count its even numbers");
			System.out.println("2.- Enter a positive number and count how many times appears another number");
			System.out.println("3.- Enter a positive number to return inverted");
			System.out.println("4.- Enter a binary number and become decimal");
			System.out.println("5.- Enter a sentence and count how many times appear one digit as first letter of a word");
			System.out.println("6.- Enter a sentence and count how many times appear one digit as last letter of a word");
			System.out.println("7.- Enter a word to know its palindrome or not");
			// Here I use Scanner to use one number between 1 & 7.
			int enternum = sc.nextInt();
			
			// With Switch, I can ask for any option between 1 & 7.
			switch (enternum) {
            	case 1:
            		// First define some variables, and create a rule to return an error
            		// if we put a negative number.
            		System.out.print("Enter a positive number:");
            		int num1, res1, even1 = 0;
            		num1 = Integer.parseInt(sc.next());
        			if (num1 < 0) {
        				System.out.println("Wrong.");
        				break;
        			}
            		while (num1 != 0) {
            			res1 = num1 % 10;
            			num1 = num1 / 10;
            			if(res1 % 2 == 0) {
            				even1++;
            			}
            		}
            		System.out.print("This number has " + even1 + " even number(s)");
            		System.out.println(" ");
            		System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue:");
            		int continue1 = sc.nextInt();
            		if (continue1 < 1) {
            			loopnum = 1;
            		}
            		break;
            	case 2:
            		// First define some variables, and create a rule to return an error
            		// if we put a negative number.
            		System.out.println("Enter a positive number");
        			int num2 = sc.nextInt();
        			if (num2 < 0) {
        				System.out.println("Wrong.");
        				break;
        			}
        			System.out.println("Enter a digit:");		
        			String d2 = sc.next(); 			
        			String num20 = Integer.toString(num2);					
        			char num21[] = num20.toCharArray();	
        			int cont2 = 0;	
        			for(int x2 = 0; num20.length() > x2; x2++ ) {
        				if (num21[x2]== d2.charAt(0)){			
        					cont2++;
        				}		
        			}
        			if (cont2 <= 0) {		
        					System.out.println("No results");        					
        				}       				
        				else {
        					System.out.println("The digit appear " + cont2 + " time(s)");
        				}
            		System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue:");
            		int continue2 = sc.nextInt();
            		if (continue2 < 1) {
            			loopnum = 1;
            		}
            		break;
            	case 3:
            		// First define some variables, and create a rule to return an error
            		// if we put a negative number.
            		System.out.println("Enter a positive number:");
            		int num3, inverted = 0, res3;
            		num3 = sc.nextInt();
        			if (num3 < 0) {
        				System.out.println("Wrong.");
        				break;
        			}
            		while (num3 > 0) {
            			res3 = num3 % 10;
            			inverted = inverted * 10 + res3;
            			num3 /= 10;
            		}
            		System.out.println("Inverted number: " + inverted);
            		System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue:");
            		int continue3 = sc.nextInt();
            		if (continue3 < 1) {
            			loopnum = 1;
            		}
            		break;
            	case 4:
            		// First define some variables, and create a rule to return an error
            		// if we put a non binary number.
            		System.out.println("Enter a binary number:");
            		int n4 = sc.nextInt();
            		String n40 = Integer.toString(n4);
            		n40 = n40.trim();
            		for (int x4 = n40.length()-1; x4 >= 0;) {
            			if (n40.charAt(x4) != '0' && n40.charAt(x4) != '1') {
            				System.out.println("Try Again.");
            			}
        				break;
            		}
            		String numeroBinario = sc.next();
            		int num = Integer.parseInt(numeroBinario,2);
            		System.out.println("Binario = " + numeroBinario + " Decimal = " + num);
            		System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue:");
            		int continue4 = sc.nextInt();
            		if (continue4 < 1) {
            			loopnum = 1;
            		}
            		break;
            	case 5:
            		// First we define variables for letter and sentence
            		System.out.println("Enter a letter:");
        			String ch5 = sc.next();
        			ch5 = ch5.trim();
        			sc.nextLine();
        			System.out.println("Enter a sentence:");
        			String st5 = sc.nextLine();
        			String st50[] = st5.split(" ");
        			int cont5 = 0;
        			for (int x5 = 0; st50.length > x5; x5++ ) {
        				System.out.println(st50[x5]);
        				if (st50[x5].indexOf(ch5) == 0 ) {
        					cont5++;
        				}
        			}
        			System.out.println("There are " + cont5 + " words with " + ch5 + " letter");
            		System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue:");
            		int continue5 = sc.nextInt();
            		if (continue5 < 1) {
            			loopnum = 1;
            		}
            		break;
            	case 6:
            		// First we define variables for letter and sentence
            		System.out.println("Enter a letter:");
        			String ch6 = sc.next();
        			ch6 = ch6.trim();
        			sc.nextLine();
        			System.out.println("Enter a sentence:");
        			String st6 = sc.nextLine();
        			String st60[] = st6.split(" ");
        			int cont6 = 0;
        			for (int x6 = 0; st60.length > x6; x6++ ) {
        				System.out.println(st60[x6]);
        				if (st60[x6].lastIndexOf(ch6) == (st60[x6].length()-1) ) {
        					cont6++;
        				}
        			}
        			System.out.println("There are " + cont6 + " words with " + ch6 + " letter");
            		System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue:");
            		int continue6 = sc.nextInt();
            		if (continue6 < 1) {
            			loopnum = 1;
            		}
            		break;
            	case 7:
            		// First we define a variable to enter the word
            		System.out.println("Enter a word:");
            		String st7 = sc.next();
            		int inc = 0;
            		int des = st7.length()-1;
            		boolean bool7 = false;
            		while ((inc < des) && (!bool7)){
            			if (st7.charAt(inc) == st7.charAt(des)){				
            				inc++;
            				des--;
            			} else {
            				bool7 = true;
            			}
            		}
            		if (!bool7)
            			System.out.println(st7 + " is a palindrome");
            		else
            			System.out.println(st7 + " is not a palindrome");
            		System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue:");
            		int continue7 = sc.nextInt();
            		if (continue7 < 1) {
            			loopnum = 1;
            		}
            		break;
            	// If we put an option that it's not a number between 1 & 7,
            	// the program return this sentence	
            	default:
            		System.out.println("Incorrect option, try again.");
            		break;
			}		
        }
    }
}