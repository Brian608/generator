package org.feather.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import org.feather.entity.Users;
import org.feather.mapper.UsersMapper;
import org.feather.service.IUsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表  服务实现类
 * </p>
 *
 * @author feather(杜雪松)
 * @since 2022-01-11
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements IUsersService {

}
