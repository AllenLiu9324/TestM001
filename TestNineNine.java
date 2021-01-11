package Homework02;
//mainVersion2
public class TestNineNine {
	
	public static void main(String[] args) {
		// 2 for loops
		for(int j = 1;j <= 9;j++) {
			for(int i = 1;i <= 9;i++) {
				System.out.print(i+"x"+j+"= "+(i*j)+"\t");
			}
			System.out.println();
		}
		
		// for loop + while loop
		for(int j = 1;j <= 9;j++) {
			int i = 1;
			while(i <= 9) {
				System.out.print(i+"x"+j+"= "+(i*j)+"\t");
				i++;
			}
			System.out.println();
		}
		
		// for loop + do-while loop
		for(int j = 1;j <= 9;j++) {
			int i = 1;
			do {
				System.out.print(i+"x"+j+"= "+(i*j)+"\t");
				i++;
			} while(i <= 9);
			System.out.println();
		}
		
		// while loop + do-while loop
		int a = 1;
		while(a <= 9) {
			int b = 1;
			do {
				System.out.print(b+"x"+a+"= "+(a*b)+"\t");
				b++;
			} while(b <= 9);
			a++;
			System.out.println();
		}
	}
}
