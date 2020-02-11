package com.example.codeclan.FilesFoldersOneToManyToOne.repositories;

import com.example.codeclan.FilesFoldersOneToManyToOne.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
