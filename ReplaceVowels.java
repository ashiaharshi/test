package Practice1;

import java.util.Scanner;

public class ReplaceVowels {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the String: ");
			String str = sc.nextLine();
			String res = "";
			System.out.println(str.charAt(0) == 'A');
			for (int i = 0; i < str.length(); i++) {
				if (!(str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U' || str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'))
					res = res + str.charAt(i);
//				else if (str.charAt(i) == ' ')
//						res = res + str.charAt(i);
					else
						res = res + (char)(str.charAt(i)+1);
				
			}
			System.out.println(res);
			sc.close();
		}

}
