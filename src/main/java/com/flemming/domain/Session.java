package com.flemming.domain;

import java.util.UUID;

public class Session {
	private String sessionId;

	public Session() {
		this.sessionId = UUID.randomUUID().toString();
	}

	public String getSessionId() {
		return sessionId;
	}

	@Override
	public String toString() {
		return "Session [sessionId=" + sessionId + "]";
	}

}
