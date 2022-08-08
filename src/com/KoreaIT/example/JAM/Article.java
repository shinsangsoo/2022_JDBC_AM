package com.KoreaIT.example.JAM;

public class Article extends Object{

	public int id;
	public String title;
	public String body;

	public Article(int id, String title, String body) {
		this.id = id;
		this.title = title;
		this.body = body;
	}

	@Override
	public String toString() {
		return "게시물을 작성하였습니다 [번호 = " + id + ", 제목 = " + title + ", 내용 = " + body + "]";
	}

}
