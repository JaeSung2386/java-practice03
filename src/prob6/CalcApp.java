package prob6;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = 0, b = 0;
		
		while( true ) {
			System.out.print( ">> " );
			String expression = scanner.nextLine();
			
			if(expression.equals("quit"))
				System.exit(0);
			else {
				String[] word = expression.split(" ");
				a = Integer.parseInt(word[0]);
				b = Integer.parseInt(word[2]);
				
				switch(word[1]) {
				case "+" : 
					Add add = new Add();
					add.setValue(a, b);
					System.out.println(add.calculate());
					break;
				case "-" : 
					Sub sub = new Sub();
					sub.setValue(a, b);
					System.out.println(sub.calculate());
					break;
				case "*" : 
					Mul mul = new Mul();
					mul.setValue(a, b);
					System.out.println(mul.calculate());
					break;
				case "/" :
					Div div = new Div();
					div.setValue(a, b);
					System.out.println(div.calculate());
					break;
				default :
					System.out.println("잘못 입력하셨습니다.\n다시입력해주십시오.");
				}
			}
		}
	}
	/* 입력 및 출력 결과
	>> 1 + 1
	2
	>> 2 - 4
	-2
	>> 3 * 2
	6
	>> 4 / 2
	2
	>> 1 1 1
	잘못 입력하셨습니다.
	다시입력해주십시오.
	>> quit
	 */
}
