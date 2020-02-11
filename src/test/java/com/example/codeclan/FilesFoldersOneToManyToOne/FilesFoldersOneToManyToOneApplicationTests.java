package com.example.codeclan.FilesFoldersOneToManyToOne;

import com.example.codeclan.FilesFoldersOneToManyToOne.models.File;
import com.example.codeclan.FilesFoldersOneToManyToOne.models.Folder;
import com.example.codeclan.FilesFoldersOneToManyToOne.models.User;
import com.example.codeclan.FilesFoldersOneToManyToOne.repositories.FileRepository;
import com.example.codeclan.FilesFoldersOneToManyToOne.repositories.FolderRepository;
import com.example.codeclan.FilesFoldersOneToManyToOne.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FilesFoldersOneToManyToOneApplicationTests {

	@Autowired
	private FileRepository fileRepository;

	@Autowired
	private FolderRepository folderRepository;

	@Autowired
	private UserRepository userRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateAndSaveFileObjects(){

		User user = new User("Paul");
		userRepository.save(user);

		Folder folder = new Folder("Gifs", user);
		folderRepository.save(folder);

		File file = new File("Dog",".gif",1024,folder);
		fileRepository.save(file);


	}

}
