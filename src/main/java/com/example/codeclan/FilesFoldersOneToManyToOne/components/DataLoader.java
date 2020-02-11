package com.example.codeclan.FilesFoldersOneToManyToOne.components;

import com.example.codeclan.FilesFoldersOneToManyToOne.models.File;
import com.example.codeclan.FilesFoldersOneToManyToOne.models.Folder;
import com.example.codeclan.FilesFoldersOneToManyToOne.models.User;
import com.example.codeclan.FilesFoldersOneToManyToOne.repositories.FileRepository;
import com.example.codeclan.FilesFoldersOneToManyToOne.repositories.FolderRepository;
import com.example.codeclan.FilesFoldersOneToManyToOne.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    private FileRepository fileRepository;

    @Autowired
    private FolderRepository folderRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(ApplicationArguments args) {

        User paul = new User("Paul");
        userRepository.save(paul);

        User abby = new User("Abby");
        userRepository.save(abby);

        Folder gifs = new Folder("Gifs", paul);
        folderRepository.save(gifs);

        Folder games = new Folder("Games", paul);
        folderRepository.save(games);

        Folder pictures = new Folder("Pictures", abby);
        folderRepository.save(pictures);

        Folder recipes = new Folder("Recipes", abby);
        folderRepository.save(recipes);

        File dog = new File("Dog",".gif",1024,gifs);
        fileRepository.save(dog);

        File cat = new File("Cat",".gif",1400,gifs);
        fileRepository.save(cat);

        File stoneAgeRules = new File("Stone Age Rules",".pdf",1000,games);
        fileRepository.save(stoneAgeRules);

        File pointSaladRules = new File("Point Salad Rules",".pdf",1230,games);
        fileRepository.save(pointSaladRules);

        File empireStateBuilding = new File("Empire State Building",".jpeg",2048,pictures);
        fileRepository.save(empireStateBuilding);

        File goldenGateBridge = new File("Golden Gate Bridge",".jpeg",2000,pictures);
        fileRepository.save(goldenGateBridge);

        File pizzaRecipe = new File("Pizza Recipe", ".txt",1600, recipes);
        fileRepository.save(pizzaRecipe);

        File lasagnaRecipe = new File("Lasagna Recipe", ".txt",1738, recipes);
        fileRepository.save(lasagnaRecipe);
    }
}
