package com.ktdsuniversity.edu.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.file.data.Product;

public class FileReadExam {
	public static void loadProducts() {
	   File targetFile = new File("/Users/tony/Desktop/fileexam/fileioexam", "products.txt");
	   
	   List<Product> productList = new ArrayList<>();
	   
	   try {
		   List<String> filesLine = Files.readAllLines(targetFile.toPath()); // pipe가 자동으로 닫힘
		   
		   for(String line : filesLine) {
			   System.out.println(line);
			   
			   productList.add(new Product(line.split(",")));
		   }
	   } catch (IOException e) {
    	  System.out.println("The error is occured while it's reading file.");
    	  System.out.println(e.getMessage());
	   }
	   
	   for(Product eachProduct : productList) {
		   System.out.println(eachProduct);
	   }
	}
	
   public static void fileReadUseNewIO(String directoryPath, String filename) throws IOException {
	   File targetFile = new File(directoryPath, filename);
	   try {
		   List<String> filesLine = Files.readAllLines(targetFile.toPath()); // pipe가 자동으로 닫힘
		   
		   for(String line : filesLine) {
			   System.out.println(line);
		   }
	   } catch (IOException e) {
    	  System.out.println("The error is occured while it's reading file.");
    	  System.out.println(e.getMessage());
	   }
   	}
   
   	public static void fileReadUseOldIO(String directoryPath, String filename) {
	   File targetFile = new File(directoryPath, filename);
	      
	      if(!targetFile.exists() || !targetFile.isFile()) {
	    	  return;
	      }
	      
	      FileReader fr = null;
	      BufferedReader br = null;
	      
	      try {
	    	  fr = new FileReader(targetFile);
	    	  
	    	  br = new BufferedReader(fr);
	    	  
	    	  String line = null;
	    	  
	    	  while((line = br.readLine()) != null) {
	    		  System.out.println(line);
	    	  }
	      } catch (FileNotFoundException e) {
	    	  System.out.println(targetFile.getName() + " is not exist.");
//	    	  return;
	      } catch (IOException e) {
	    	  System.out.println("The error is occured while it's reading file.");
	    	  System.out.println(e.getMessage());
//	    	  return;
	      } finally {
	    	  if(br != null) {
		    	  try {
		    		  br.close();
		    	  } catch (IOException e) {
		    		  
		    	  }
	    	  }

	    	  if(fr != null) {
		    	  try {
		    		  fr.close();
		    	  } catch (IOException e) {
		    		  
		    	  }
	    	  }
	      }
   	}

   	public static void main(String[] args) throws IOException {
//	   fileReadUseOldIO("asdfsadfasf", "fsdafsd"); 
//	   fileReadUseOldIO("/Users/tony/Desktop/fileexam/fileioexam", "readSample.txt"); // customize
//	   fileReadUseNewIO("/Users/tony/Desktop/fileexam/fileioexam", "readSample.txt"); // customize
   		loadProducts();
   	}
}