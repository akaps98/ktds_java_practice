package com.ktdsuniversity.edu.fileioasm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.fileioasm.exceptions.ContactNotFoundException;


public class ContactApp implements ContactAppInterface {

	private List<Contact> contacts;

	public ContactApp(String fileDirectoryPath, String filename) {
		this.contacts = new ArrayList<>();
		this.loadData(fileDirectoryPath, filename);
	}

	@Override
	public void loadData(String fileDirectoryPath, String filename) {
		// 파일을 읽어서 this.contacts 에 연락처 목록을 할당한다.
		File file = new File(fileDirectoryPath, filename);
		
		if(!file.exists()) {
			System.out.println("Cannot load the data."); // file is not exist
			return;
		}
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line;
			
			while((line = br.readLine()) != null) {
				String[] eachContact = line.split(",");
				
				contacts.add(new Contact(Integer.parseInt(eachContact[0]), eachContact[1], eachContact[2], eachContact[3]));
			}
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void writeData(String fileDirectoryPath, String filename) {
		// this.contact에 있는 연락처 정보를 파일에 쓴다.
		File file = new File(fileDirectoryPath, filename);
		
	   if(!file.getParentFile().exists()) {
		   file.getParentFile().mkdir();
	   }
	   
	   int nameIdx = 2;
	   
	   while(file.exists() ) {
		   String newFileName = filename.substring(0, filename.lastIndexOf("."));
		   
		   newFileName += " (" + (nameIdx++) + ").";
		   
		   newFileName += filename.substring(filename.lastIndexOf(".") + 1);
		   
		   file = new File(fileDirectoryPath, newFileName);
	   }
	   
       List<String> data = new ArrayList<>();
       for (Contact contact : contacts) {
           data.add(contact.getNumber() + "," +
                    contact.getName() + "," +
                    contact.getPhoneNumber() + "," +
                    contact.getProfile());
       }
	   
	   try {
		   Files.write(file.toPath(), data);
		   System.out.println(file.getAbsolutePath());
	   } catch(IOException e) {
		   e.printStackTrace();
	   }
	}
	
	@Override
	public void clean() {
		this.contacts.clear();
	}

	@Override
	public void addNewContact(Contact newContact) {
		this.contacts.add(newContact);
	}

	@Override
	public void remove(int contactIndex) {
		if (contactIndex >= 0 && contactIndex < this.contacts.size()) {
			this.contacts.remove(contactIndex);
		}
	}

	@Override
	public Contact getContactAt(int contactIndex) {
		if (contactIndex < this.contacts.size() && contactIndex >= this.contacts.size()) {
			throw new ContactNotFoundException(contactIndex + " 연락처가 아직 채워지지 않은 인덱스입니다.");
		}
		return this.contacts.get(contactIndex);
	}
	
	@Override
	public void sort() {
		// Selection Sort
		int minIdx = 0;
		for (int i = 0; i < this.contacts.size(); i++) {
			minIdx = i;
			for (int j = i + 1; j < this.contacts.size(); j++) {
				if (this.contacts.get(minIdx) != null && this.contacts.get(j) != null) {
					if ( this.contacts.get(minIdx).getNumber() > this.contacts.get(j).getNumber() ) {
						minIdx = j;
					}
				}
			}
			
			if (minIdx != i) {
				Contact temp = this.contacts.get(minIdx);
				if (temp != null && this.contacts.get(i) != null) {
					this.contacts.set(minIdx, this.contacts.get(i));
					this.contacts.set(i, temp);
				}
			}
		}
	}


}
