package string;

import java.util.Arrays;

public class Method {

	public static void main(String[] args) {
		String a = "Velocity";
		 String b = "velocity";
		 if(a.equals(b))
		 {
			 System.out.println("true");
			 
		 }
		 else {
			 System.out.println("false");
		 }
		 // .eualsIgnoreCase()
		 if(a.equalsIgnoreCase(b))
		 {
			 System.out.println("t");
			 
		 }
		 else {
			 System.out.println("f");
		 }
		 
		 //.length
		 System.out.println(a.length());
		 
		 //.toUpperCase
		 System.out.println(b.toUpperCase());
		 
		 //.toLowerCase
		 System.out.println(a.toLowerCase());
		 
		 //.indexOf
		 System.out.println(a.indexOf('c'));
		 
		 //.replace
		 System.out.println(b.replace('c', 'b'));
		 
		 //.endsWith
		 String c = "Velocity is in katraj";
		 if(c.endsWith("traj"))
		 {
			 System.out.println("true");
		 }
		 
		 //.startWith
		 if(c.startsWith("velo"))
		 {
			 System.out.println("true"); 
		 }
		 else {
			 System.out.println("False");
		 }
		 //.concat
		 System.out.println(a.concat(" is in pune"));
		 String D = " is in pune  ";
		 
		 System.out.println(D.concat(a));
		 
		 //.split
		 System.out.println(Arrays.toString(c.split(" ")));
		 
		 //.contains
		 if(c.contains(" "))
		 {
			 System.out.println("T");
			 
		 }
		 else 
		 {
			 System.out.println("F");
		 }
		//.intern
		 
		 
		 
		 String rString = "";
		 
		 String s = new String("Mumbai");
		 for(int j = (s.length()-1); j>=0; j--) {
		 rString = rString + s.charAt(j);
		 }
		 System.out.println(rString);
		 
		 
		 
		 String ss = "Mumbai";
		 String e = s.intern();
		 if(e==ss)
		 {
			 System.out.println("True");
			 
		 }
		 else {
			 System.out.println("false");

		 }
	}
		 

}
