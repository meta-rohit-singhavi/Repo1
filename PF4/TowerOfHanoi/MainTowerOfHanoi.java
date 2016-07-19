import java.util.Scanner;


public class MainTowerOfHanoi {
	
	public static void main(String[] args) {
		TowerOfHanoi toh=new TowerOfHanoi();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No. of discs=");
		int discs=sc.nextInt();
		String[] result=new String[(int)(Math.pow(2, discs))-1];
		
		System.out.println(result.length);
		String arr[]=toh.solveTOH(discs, "A", "B", "C",result);
		
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		
		sc.close();
	}
}
