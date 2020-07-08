package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)->{ String word =""; for(int i = 0; i < s.length(); i++) {
			word += s.charAt(s.length()-1-i);
		} System.out.println(word);
	}, "repeat");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{ String word =""; for(int i = 0; i < s.length(); i++) {
			if(i%2==0) {
				word += s.substring(i, i+1).toLowerCase();
			} else {
				word += s.substring(i,i+1).toUpperCase();
			}
		} System.out.println(word);
	}, "randomthing");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s)->{ String word =""; for(int i = 0; i < s.length(); i++) {
			if(i<s.length()-1) {
			word += s.charAt(i) + ".";
			} else {
				word += s.charAt(i);
			}
		} System.out.println(word);
	}, "addingaperiodbetweeneach character");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s)->{ String word =""; 
		word = s.replaceAll("[AEIOUaeiou]", "");
		 System.out.println(word);
	}, "removing all the vowels from this line");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
