package paractice_Java;

public class DuplicateCharacters {

	public static void main(String[] args) {
		int count=0;
		int count2=0;
		String str = "My characters";
		int  len = str.length();
		
		for (int i=0;i<=len-1;i++) {
			for (int j = i+1;j<=len-1;j++) {
				if (str.charAt(i)== str.charAt(j)) {
					count=count+i;
					System.out.println("Duplicate found is :> "+str.charAt(j));
					count2= count2+1;
				}
				
			}
			
		}
		System.out.print("Total characters "+count+" and Total Duplicates "+count2);
	}

}
