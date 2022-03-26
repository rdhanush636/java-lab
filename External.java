/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
package SEE;
import java.util.*;
import CIE.Student;

public class External extends Student{
	public int seeMarks[] = new int[5];
	public External()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name, usn, sem of STudent");
		name = sc.next();
		usn = sc.next();
		sem = sc.nextInt();
		System.out.println("Enter marks of 5 subjects in SEE");
		for(int i = 0;i<5;i++)
			seeMarks[i] = sc.nextInt();
		
	}
	
}