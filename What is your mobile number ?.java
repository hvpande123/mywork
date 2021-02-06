// Java program to check if given mobile number 
// is valid. 
import java.util.regex.*; 
import java.util.*; 
import java.lang.*;
import java.io.*;

class codechef{ 
	
public static boolean isValid(String s) 
{ 
	
	// The given argument to compile() method 
	// is regular expression. With the help of 
	// regular expression we can validate mobile 
	// number. 
	// 1) Begins with 0 or 91 
	// 2) Then contains 7 or 8 or 9. 
	// 3) Then contains 9 digits 
	Pattern p = Pattern.compile("(1)?{9}"); 

	// Pattern class contains matcher() method 
	// to find matching between given number 
	// and regular expression 
	Matcher m = p.matcher(s); 
	return (m.find() && m.group().equals(s)); 
} 

// Driver code 
public static void main(String[] args) 
{   
    Scanner obj=new Scanner(System.in);
    int T =obj.nextInt();
	
	for(int i=1;i<=T;i++){
	String s = obj.nextLine();    
	if (isValid(s)) 
		System.out.println("YES");	 
	else
		System.out.println("NO");	 
} }
} 
