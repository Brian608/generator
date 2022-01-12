package org.feather.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import org.feather.entity.UserAddress;
import org.feather.mapper.UserAddressMapper;
import org.feather.service.IUserAddressService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户地址表  服务实现类
 * </p>
 *
 * @author feather(杜雪松)
 * @since 2022-01-11
 */
@Service
public class UserAddressServiceImpl extends ServiceImpl<UserAddressMapper, UserAddress> implements IUserAddressService {

}
