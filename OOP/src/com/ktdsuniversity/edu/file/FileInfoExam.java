package com.ktdsuniversity.edu.file;

import java.io.File;
import java.util.Arrays;
import java.util.Date;

public class FileInfoExam {
	public static void main(String[] args) {
		printFileInto("/Users/tony/Desktop/fileexam", "company.txt");
		printFileInto("/Users/tony/Desktop/fileexam", "example.txt");
		printFileInto("/Users/tony/Desktop/fileexam", "sample.txt");
		printFileInto("/Users/tony/Desktop/fileexam/subfolder1", "sub_company.txt");
		printFileInto("/Users/tony/Desktop/fileexam/subfolder1", "sub_example.txt");
		printFileInto("/Users/tony/Desktop/fileexam/subfolder1", "sub_sample.txt");
		printFileInto("/Users/tony/Desktop/fileexam/subfolder1/subfolder1-1", "sub1-1_sample.txt");
		printFileInto("/Users/tony/Desktop/fileexam/subfolder1/subfolder1-1", "sub1-1_example.txt"); // invalid
		printFileInto("/Users/tony/Desktop/fileexam/subfolder2", "sub_example.txt"); // invalid
		
		printFileInto("/Users/tony/Desktop/fileexam", null);
		
		traversingAndPrintFileInfo("/Users/tony/Desktop/fileexam");
	}
	
	/**
	 * 탐색하고 싶은 폴더를 주면 
	 * 하위에 존재하는 모든 폴더와 파일들의 목록을 출력함
	 */
	public static void traversingAndPrintFileInfo(String startDirectoryPath) {
		// startDirectoryPath 경로의 File 인스턴스(File)를 생성
		File file = new File(startDirectoryPath);
		
		// file이 존재한다면
		if(file.exists()) {
			System.out.println(file.getAbsolutePath() + "(" + file.length() + ")");
			if(file.isDirectory()) {
			// file의 자식 요소(폴더 + 파일)들을 얻어옴
				File[] listFiles = file.listFiles();
				
				// file의 자식 요소(폴더 + 파일)를 반복
				for(File child : listFiles) {
					// traversingAndPrintFileInfo(자식요소의 전체 경로)
					traversingAndPrintFileInfo(child.getAbsolutePath());
				}	
			}
		}
	}
	
	public static void printFileInto(String directoryPath, String filename) {
		File file = null;
		
		if(filename == null) {
			file = new File(directoryPath);
		} else {
			file = new File(directoryPath, filename);
		}
//		File file = new File(directoryPath, filename);
		
		// 파일이 존재하는가
		boolean isExist = file.exists();
		System.out.println(filename + " isExist: " + isExist);
		
		// 파일인가
		boolean isFile = file.isFile();
		System.out.println(filename + " isFile: " + isExist);
		
		// 폴더인가
		boolean isDirectory = file.isDirectory();
		System.out.println(filename + " isDirectory: " + isDirectory);
		
		// 전체 경로는 무엇인가
		String absolutePath = file.getAbsolutePath();
		System.out.println(filename + " absolute path: " + absolutePath);
		
		// 파일의 이름은 무엇인가
		String name = file.getName();
		System.out.println(filename + " name: " + name);
		
		// 파일의 크기는 얼마인가
		long length = file.length();
		System.out.println(filename + " length: "  + length);
		
		// 파일이 언제 마지막으로 수정되었는가
		long lastModified = file.lastModified();
//		System.out.println(filename + " last modified: "  + lastModified);
		
		Date lastModifiedDate = new Date(lastModified);
		System.out.println(filename + " last modified: "  + lastModifiedDate);
		
		// 이 파일의 부모 폴더는 무엇인가
		// 이 파일이 어디에 있냐
		String getParent = file.getParent();
		System.out.println(filename + " get parent: "  + getParent);
		
		// file 객체가 폴더였을 때, 폴더 내부에 있는 항목은 무엇인가
		File[] listFiles = file.listFiles();
		System.out.println(filename + " list files: "  + Arrays.toString(listFiles));

		System.out.println("-".repeat(40));
	}
}
