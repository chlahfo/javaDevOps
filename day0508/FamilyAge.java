import java.util.Scanner;

public class FamilyAge{
	public static void main(String []args){
		int father, mother, son, average;
		Scanner sc = new Scanner(System.in);
		System.out.print("Father Age? => ");
		father = sc.nextInt();
		System.out.print("Mother Age? => ");
		mother = sc.nextInt();
		System.out.print("Son Age? => ");
		son =  sc.nextInt();
		average = (father + mother + son) / 3;
		System.out.print("average Age : "+ average);

	}
}