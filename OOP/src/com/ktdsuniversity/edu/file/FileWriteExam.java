package com.ktdsuniversity.edu.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.file.data.Product;

public class FileWriteExam {
   public static void fileWriteUseNewIO(String directoryPath, String filename, List<String> data) {
	   File writeFile = new File(directoryPath, filename);
	   
	   if(!writeFile.getParentFile().exists()) {
		   writeFile.getParentFile().mkdir();
	   }
	   
	   int idx = 2;
	   
	   while(writeFile.exists()) {
		   String newFileName = filename.substring(0, filename.lastIndexOf("."));
		   
		   newFileName += " (" + (idx++) + ").";
		   
		   newFileName += filename.substring(filename.lastIndexOf(".") + 1);
		   
		   writeFile = new File(directoryPath, newFileName);
	   }
	   
	   try {
		   Files.write(writeFile.toPath(), data);
		   System.out.println(writeFile.getAbsolutePath());
	   } catch(IOException e) {
		   e.printStackTrace();
	   }
   }
   
   public static void main(String[] args) {
	   List<String> data1 = new ArrayList<>();
	   data1.add(new Product("smartphone1", 200000, 100).toFileFormat());
	   data1.add(new Product("smartphone2", 200001, 90).toFileFormat());
	   data1.add(new Product("smartphone3", 200002, 80).toFileFormat());
	   data1.add(new Product("smartphone4", 200003, 70).toFileFormat());
	   data1.add(new Product("smartphone5", 200004, 60).toFileFormat());
      
	   fileWriteUseNewIO("/Users/tony/Desktop/fileexam/fileioexam/store", "storeProduct.txt", data1);
   }
}
