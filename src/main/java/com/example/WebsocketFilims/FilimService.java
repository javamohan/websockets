package com.example.WebsocketFilims;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public interface FilimService {

	public String addPhoto(String title, MultipartFile file) throws IOException;

	public FilimModal getPhoto(String id);

}
