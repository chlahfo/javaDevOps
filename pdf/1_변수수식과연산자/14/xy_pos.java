import java.util.Scanner;

public class xy_pos{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int pos, x, y;

		pos = 1;
		
		System.out.print("x좌표: ");
		x = sc.nextInt();
		System.out.print("y좌표: ");
		y = sc.nextInt();
		
		if(x*y < 0){
			pos++;
			
		}
		if(y < 0){
			pos += 2;
		}
		System.out.println("좌표는 "+pos+"사분면에 위치함");
	}
}