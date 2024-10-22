package net.haebup.dto.qna;

public class QnaDTO {
	private int qnaIdx;				// QnA 아이디
	private String qnaTitle;		// QnA 제목
	private String qnaContent;		// QnA 내용
	private String qnaRegdate;		// QnA 등록일
	private String qnaWiter;		// QnA 작성자 아이디
	private char qnaType;			// QnA 유형 G : 일반 QnA, T : 선생님 QnA
	private String qnaCategory;		// QnA 카테고리 일반 QnA 유형 코드, 강의 코드
	
	
	public int getQnaIdx() {
		return qnaIdx;
	}
	public void setQnaIdx(int qnaIdx) {
		this.qnaIdx = qnaIdx;
	}
	public String getQnaTitle() {
		return qnaTitle;
	}
	public void setQnaTitle(String qnaTitle) {
		this.qnaTitle = qnaTitle;
	}
	public String getQnaContent() {
		return qnaContent;
	}
	public void setQnaContent(String qnaContent) {
		this.qnaContent = qnaContent;
	}
	public String getQnaRegdate() {
		return qnaRegdate;
	}
	public void setQnaRegdate(String qnaRegdate) {
		this.qnaRegdate = qnaRegdate;
	}
	public String getQnaWiter() {
		return qnaWiter;
	}
	public void setQnaWiter(String qnaWiter) {
		this.qnaWiter = qnaWiter;
	}
	public char getQnaType() {
		return qnaType;
	}
	public void setQnaType(char qnaType) {
		this.qnaType = qnaType;
	}
	public String getQnaCategory() {
		return qnaCategory;
	}
	public void setQnaCategory(String qnaCategory) {
		this.qnaCategory = qnaCategory;
	}
	
	

}
