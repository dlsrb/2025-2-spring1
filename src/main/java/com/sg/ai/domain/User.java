package com.sg.ai.domain;

public class User {
	private int id;
	private String username;
	private String password;
	private String email;

	void changeid() {
		id = id + 1;
	}

}

// 자바의 접근 제어자
// public < protected < default < private

