package org.feather.service.impl;

import org.feather.entity.UserAddress;
import org.feather.mapper.UserAddressMapper;
import org.feather.service.IUserAddressService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 用户地址表  服务实现类
 * </p>
 *
 * @author feather(杜雪松)
 * @since 2022-01-10
 */
@Service
public class UserAddressServiceImpl extends ServiceImpl<UserAddressMapper, UserAddress> implements IUserAddressService {
    @Autowired
    private UserAddressMapper userAddressMapper;

    @Override
    public List<UserAddress> findAll() {
        return userAddressMapper.selectList(null);
    }
}
