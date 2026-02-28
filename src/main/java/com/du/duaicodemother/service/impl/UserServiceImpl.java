package com.du.duaicodemother.service.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import com.du.duaicodemother.model.entity.User;
import com.du.duaicodemother.mapper.UserMapper;
import com.du.duaicodemother.service.UserService;
import org.springframework.stereotype.Service;

/**
 * 用户 服务层实现。
 *
 * @author <a href="https://github.com/Riaduhb">riaduhb</a>
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>  implements UserService{

}
