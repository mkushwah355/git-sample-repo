package DemoProject.DemoProject;

public class ReverseString {

	public static void main(String[] args) {
		
		
		String s1= "Mayank";
		String s2= "";
		char[] s3= s1.toCharArray();
		System.out.println("Length of name is : " +s3.length);
		 for (int i = s3.length-1;i>=0; i--) {
			 s2=s2+s3[i];
			 		
		}
		 System.out.println(s2);
		

	}

}
