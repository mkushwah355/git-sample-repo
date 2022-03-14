package DemoProject.DemoProject;

public class sdsds {

	public static void main(String[] args) {

 String s1 = "mayank";
 String s2 = " ";
 char [] s3 = s1.toCharArray();
 
 System.out.println("lenght of names= " +s3.length);
 
 
 for (int i = s3.length-1; i>=0; i--) {
	s2=s2+s3[i];
}
System.out.println(s2);
	}

}
