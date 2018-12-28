package TV;

public class WatchTV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TV tv = new TV( 7, 20, false);  	
        
        tv.status();	
        
        tv.power( true );
        tv.volume( 120 );
        tv.status();		          
        
        tv.volume( false );
        tv.status();
        
        tv.channel( 0 );
        tv.status();		          
        
        tv.channel( true );
        tv.channel( true );
        tv.channel( true );
        tv.status();

        tv.power( false );
        tv.status();
        /* 출력 결과
        TV[power=false, channel=7, volume=20]
		TV[power=true, channel=7, volume=0]
		TV[power=true, channel=7, volume=50]
		TV[power=true, channel=0, volume=50]
		TV[power=true, channel=3, volume=50]
		TV[power=false, channel=3, volume=50]
         */
	}

}
