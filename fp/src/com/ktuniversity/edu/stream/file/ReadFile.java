package com.ktuniversity.edu.stream.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

public class ReadFile {
	private final String FILE_PATH = "/Users/tony/Desktop/streamexam";
	private final String FILE_NAME = "text.txt";
	
	public static void main(String[] args) {
		ReadFile rf = new ReadFile();
		rf.printFileDescription();
	}
	
	public void printFileDescription() {
		Stream<String> fileStream = null;
		
		try {
			fileStream = Files.lines(new File(this.FILE_PATH, this.FILE_NAME).toPath());
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		if(fileStream != null) {
			fileStream.filter(line -> line.length() > 0) // 줄바꿈 제거
					  .map(line -> line.replace("\t", " "))
					  .map(line -> line.replaceAll("(KBS|KBS2|SBS|MBC|tvN)", ""))
					  .map(line -> line.trim())
					  .filter(line -> line.contains(" MC"))
					  .filter(line -> line.length() < 50)
					  .forEach(System.out::println);
		}
	}
}
