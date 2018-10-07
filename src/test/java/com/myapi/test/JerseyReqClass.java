package com.myapi.test;

public class JerseyReqClass {
	String title;
	String body;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Track [title=" + title + ", body=" + body + "]";
	}

}
