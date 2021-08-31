package homework;

class Q_3 {
	int channel;
	String color;
	int sound;

	public Q_3() {
		channel = 5;
		color = "black";
		sound = 10;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSound() {
		return sound;
	}

	public void setSound(int sound) {
		this.sound = sound;
	}

	public void disp() {
		System.out.println("채널 : " + channel + " 번\n색상 : " + color + "\n소리 크기 : " + sound);
	}

	public static void main(String[] args) {
		Q_3 re = new Q_3();
		re.disp();
	}
}
