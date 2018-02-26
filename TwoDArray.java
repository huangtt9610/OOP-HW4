import java.util.*;
/**
 * 
 * @author huangtt
 *
 */
public class TwoDArray {
	public static void printCombination(char[][] c, double numOfCombination) {
		int size=c.length;
		
		int[] a=new int[size];
		for(int p=0; p<size; p++) 
			a[p]=0;
		
		int i=0; 
		int n;
		numOfCombination*=c.length;
		
		while(numOfCombination-->0) {
			System.out.print(c[i][a[i]]);
			i++;			

			if(i>=size) {
				System.out.println();
				for(n=i-1; n>=0; n--) {
					a[n]+=1;
					if(a[n]>=c[n].length) {
						a[n]=0;
					}
					else 
						break;
				}
				i=0;			
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int rows;
		int length;
		int j;
		System.out.println("Please enter the number of rows in you array");
		while(s.hasNextInt()) {
			rows=s.nextInt();
			char[][]c=new char[rows][];
			double numOfCombination=1;
			
			for(int i=0; i<rows; i++) {
				System.out.println("Please enter the length of row "+ (i+1));
				
				length=s.nextInt();
				c[i]=new char[length];
				
				numOfCombination*=length;
				
				j=0;			
				while(j<length) {
					System.out.println("Please enter the value");
					c[i][j++]=s.next().charAt(0);// got information from https://www.geeksforgeeks.org/gfact-51-java-scanner-nextchar/
				}
			}
			printCombination(c,numOfCombination);
			System.out.println("Please enter the number of rows in you array");
			
		}
		s.close();
		
	}
}
