/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
package CIE;
import java.util.*;

public class Internals {
	public int cieMarks[] = new int[5];
	public Internals()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the marks of 5 CIEs");
		for(int i = 0; i<5;i++)
			cieMarks[i] = sc.nextInt();
	}
}