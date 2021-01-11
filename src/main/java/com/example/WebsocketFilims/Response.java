package com.example.WebsocketFilims;

import java.util.Map;


import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Response<T> {
	private String statusCode = "10000";
	private boolean status = false;
	private String msg = "FAILURE";
	private int httpCode = 404;

	private T data = null;

	public Response(Map<String, ?> codes, int httpCode, T data) {
		this.statusCode = codes.get(200) != null ? codes.get(200).toString() : statusCode;
		this.status = codes.get(200) != null ? Boolean.parseBoolean(codes.get(200).toString()) : Boolean.FALSE;
		this.msg = codes.get("msg") != null ? codes.get("msg").toString() : msg;
		this.httpCode = httpCode >= 200 ? httpCode : 404;
		this.data = data;
	}

	public Response(Map<String, ?> codes, int httpCode) {
		this.statusCode = codes.get(200) != null ? codes.get(200).toString() : statusCode;
		this.status = codes.get(200) != null ? Boolean.parseBoolean(codes.get(200).toString()) : Boolean.FALSE;
		this.msg = codes.get("msg") != null ? codes.get("msg").toString() : msg;
		this.httpCode = httpCode >= 200 ? httpCode : 404;
		this.data = null;
	}
	
	public Response(int httpCode, T data) {
		this.status=true;
		this.msg="SUCCESS";
		this.httpCode = httpCode >= 200 ? httpCode : 404;
		this.data = data;
	}

	public Response() {
	}

}
