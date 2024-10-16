import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner ch = new Scanner(System.in);
		int j=ch.nextInt();
		int l=ch.nextInt();
		int bal=j-(l*10);
		int tot=bal/20;
		System.out.println(tot);
	}
}
