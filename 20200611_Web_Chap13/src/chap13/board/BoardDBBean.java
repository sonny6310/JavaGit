package chap13.board;

public class BoardDBBean {
	private static BoardDBBean instance = new BoardDBBean();

	// .jsp 페이지에서 DB 연동빈인 BoardDBBean 클래스의 메소드에 접근시 필요
	public static BoardDBBean getInstance() {
		return instance;
	}

	public BoardDBBean() {
	}
	
	// 게시판 정보 DB등록
	public void insertArticle(BoardDataBean dataBean) {
		
	}
}
