package webbrowser;

public class bbuu {

	public static void main(String[] args) {
		String s ="212";
		String reverse = " ";
		String arr[]=s.split(reverse);
		for(int i=s.length()-1;i>=0;i--) {
			reverse = reverse+s.charAt(i);
		}
		if (s.equals(reverse)) {
			System.out.println(s+"is a palindrome number");
		}
		else {
			System.out.println(s+"given number is not a palindrome number");
		}
	}

}
