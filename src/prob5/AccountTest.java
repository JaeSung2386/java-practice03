package prob5;

public class AccountTest {

	public static void main(String[] args) {
		
		Account account = new Account( "078-3762-293" );
		System.out.println( account.getAccountNo() + "계좌의 잔고는 " + account.getBalance() + "만원입니다." );
		
		account.save( 100 );
		System.out.println( account.getAccountNo() + "계좌의 잔고는 " + account.getBalance() + "만원입니다." );

		account.deposit( 30 );
		System.out.println( account.getAccountNo() + "계좌의 잔고는 " + account.getBalance() + "만원입니다." );
		/* 출력 결과
		078-3762-293 계좌가 개설되었습니다.
		078-3762-293계좌의 잔고는 0만원입니다.
		078-3762-293 계좌에 100만원이 입금되었습니다.
		078-3762-293계좌의 잔고는 100만원입니다.
		078-3762-293 계좌에 30만원이 출금되었습니다.
		078-3762-293계좌의 잔고는 70만원입니다.
		 */
	}

}
