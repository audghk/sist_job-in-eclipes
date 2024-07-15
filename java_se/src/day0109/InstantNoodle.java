package day0109;

public class InstantNoodle {

	private int serving, contents;
	private String spicy;
	
	
	public void setServing(int serving) {
		if(serving != 1) {
			serving=1;
		}
		this.serving=serving;
	}
	public int getServing() {
		return serving;
	}
	
	public void setContents(int contents) {
		if(contents != 3) {
			contents=3;
		}
		this.contents=contents;
	}
	public int getContents() {
		return contents;
	}
	
	public void setSpicy(String spicy) {
		if(!("순한".equals(spicy) || "보통".equals(spicy) || "매운".equals(spicy))) {
			spicy="보통";
		}
		this.spicy=spicy;
	}
	public String getSpicy() {
		return spicy;
	}
	
	public String write(String msg) {
		return msg + spicy + "맛이다.";
	}
}
