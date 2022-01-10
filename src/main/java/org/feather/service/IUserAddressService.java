package org.feather.service;

import org.feather.entity.UserAddress;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 用户地址表  服务类
 * </p>
 *
 * @author feather(杜雪松)
 * @since 2022-01-10
 */
public interface IUserAddressService extends IService<UserAddress> {

    List<UserAddress> findAll();

}
