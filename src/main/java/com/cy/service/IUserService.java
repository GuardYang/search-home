package com.cy.service;

import com.cy.entity.User;
import com.cy.web.dto.UserDTO;
import org.springframework.stereotype.Service;

/**
 * @author a123
 * @title: UserService
 * @projectName search-home
 * @description: 用户服务
 * @date 2019/8/245:52 PM
 */
public interface IUserService {
    User findUserByName(String userName);

    ServiceResult<UserDTO> findById(Long userId);

    /**
     * 根据电话号码寻找用户
     * @param telephone
     * @return
     */
    User findUserByTelephone(String telephone);

    /**
     * 通过手机号注册用户
     * @param telehone
     * @return
     */
    User addUserByPhone(String telephone);

    /**
     * 修改指定属性值
     * @param profile
     * @param value
     * @return
     */
    ServiceResult modifyUserProfile(String profile, String value);

}
