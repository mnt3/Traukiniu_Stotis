package com.traukinio.stotis.security;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * Created by JP17-2 on 2018.03.27.
 */
public interface UserRepository extends JpaRepository<User,Long>{

    @Query("Select b from Naudotojas b where b.email = ?1")
    User findUserByEmail(String username);

}
