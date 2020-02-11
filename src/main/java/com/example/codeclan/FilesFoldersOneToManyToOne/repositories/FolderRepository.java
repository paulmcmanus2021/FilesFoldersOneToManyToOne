package com.example.codeclan.FilesFoldersOneToManyToOne.repositories;

import com.example.codeclan.FilesFoldersOneToManyToOne.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
