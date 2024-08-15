package com.example.application.Repository;

import com.example.application.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = "SELECT * FROM users WHERE username = :username AND password = :password", nativeQuery = true)
    User findAccount(@Param("username") String username, @Param("password") String password);
}
