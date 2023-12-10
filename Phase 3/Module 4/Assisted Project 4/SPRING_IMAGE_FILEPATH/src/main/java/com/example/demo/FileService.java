package com.example.demo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Optional;
import java.util.zip.DataFormatException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileService {

	@Autowired
	FileRepo repo;
	private final String FOLDER_PATH="C:\\Users\\Naresh\\Downloads\\PNG\\";
	
	public String uploadImage(MultipartFile file) throws IOException {
			FileData data=new FileData();
			data.setName(file.getOriginalFilename());
			data.setType(file.getContentType());
                               //G:/image/abc.png			
			data.setFilePath(FOLDER_PATH+file.getOriginalFilename());
			FileData res=repo.save(data);
			if(res!=null) {
				return "file is uploaded via path into the dB sucessfully....."+file.getOriginalFilename();
			}
			return null;
	}
	
	public byte[] downloadImage(String filename) throws DataFormatException, IOException {
		
		Optional<FileData> fileimg=repo.findByName(filename);
		String filePath=fileimg.get().getFilePath();
		byte[] images=Files.readAllBytes(new File(filePath).toPath());
		return images;
		
	}
	
	
}
