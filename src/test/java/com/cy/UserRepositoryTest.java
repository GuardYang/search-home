package com.cy;

import com.cy.entity.User;
import com.cy.repository.UserRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author a123
 * @title: UserRepositoryTest
 * @projectName search-home
 * @description: TODO
 * @date 2019/8/244:10 PM
 */

public class UserRepositoryTest extends SearchHomeApplicationTests{

    @Autowired
    private UserRepository userRepository;
    @Test
    public void testFindOne(){
        User user = userRepository.findOne(1L);
        System.out.println(user);
    }
}
