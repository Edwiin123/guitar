package Entity;

public class Book {
	private String bId;
	private String iSBN;
	private String title;
	private Member loanTo;
	public String getbId() {
		return bId;
	}
	public void setbId(String bId) {
		this.bId = bId;
	}
	public String getiSBN() {
		return iSBN;
	}
	public void setiSBN(String iSBN) {
		this.iSBN = iSBN;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Member getLoanTo() {
		return loanTo;
	}
	public void setLoanTo(Member loanTo) {
		this.loanTo = loanTo;
	}
	
}
