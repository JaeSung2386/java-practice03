package prob2;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods[] goods = new Goods[COUNT_GOODS];
		Scanner scanner = new Scanner(System.in);
		for(int n = 0; n < COUNT_GOODS; n++) {
			String str = scanner.nextLine();
			String[] word = str.split(" ");
			goods[n] = new Goods();
			goods[n].setName(word[0]);
			goods[n].setPrice(Integer.parseInt(word[1]));
			goods[n].setCountStock(Integer.parseInt(word[2]));
		}
		
		for(int m = 0; m < COUNT_GOODS; m++) {
			System.out.println(goods[m].getName()+"(가격:"+goods[m].getPrice()+"원)이 "
					+ goods[m].getCountStock()+"개 입고 되었습니다.");
		}
		/* 입력 및 출력 결과
		콜라 1000 10
		사이다 900 40
		맥주 2000 100
		콜라(가격:1000원)이 10개 입고 되었습니다.
		사이다(가격:900원)이 40개 입고 되었습니다.
		맥주(가격:2000원)이 100개 입고 되었습니다.
		 */
	}
}
