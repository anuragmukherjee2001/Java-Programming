package strings;

public class ReverseWords {

	public static void main(String[] args) {
		
//wrong output
		
		String s = "the sky is blue";
		
		String ans ="";
		int i = s.length()-1;
		
		while(i >= 0) {
			while(i >= 0 && s.charAt(i) == ' ') i--;
			
			int j = i;
			
			if(i < 0) break;
			
			while(i >= 0 && s.charAt(i) != ' ') i--;
			
			if(ans.isEmpty()) {
				ans = ans.concat(s).substring(i+1, j+1);
			}else {
			ans.concat(" "+s.substring(i+1, j+1));
			}
			System.out.print(ans);
		}
	
	}

}
