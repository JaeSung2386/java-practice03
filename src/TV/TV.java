package TV;

public class TV {
	private boolean power;	//파워가 true이면 channel, volume 변경
	private int channel;	//0~50
	private int volume;		//0~50
	
	public TV(int channel, int volume, boolean power) {
		this.power = power;
		this.channel = channel;
		this.volume = volume;
	}
	
	public void power(boolean on) {
		this.power = on;
	}
	
	public void channel(int channel) {
		if(power) {
			this.channel = channel;
			if(this.channel > 50)
				this.channel = 0;
			else if(this.channel < 0)
				this.channel = 50;	
		}
	}
	
	public void channel(boolean up) {
		if(power) {
			if(up) {
				this.channel++;
				if(this.channel > 50)
					this.channel = 0;
				} else {
					this.channel--;
					if(this.channel < 0)
						this.channel = 50;
			}
		}
	}
	
	public void volume(int volume) {
		if(power) {
			this.volume = volume;	
			if(this.volume > 50)
				this.volume = 0;
			else if(this.volume < 0)
				this.volume = 50;	
		}	
	}
	
	public void volume(boolean volume) {
		if(power) {
			if(volume) {
				this.volume++;
				if(this.volume > 50)
					this.volume = 0;
				} else {
					this.volume--;
					if(this.volume < 0)
						this.volume = 50;
			}
		}
	}
	
	public void status() {
		System.out.println("TV[power=" + power + 
				", channel=" + channel + 
				", volume=" + volume+"]");
	}
}
