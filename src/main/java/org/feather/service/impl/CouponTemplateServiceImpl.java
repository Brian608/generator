package org.feather.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import lombok.Data;
import org.feather.entity.CouponTemplate;
import org.feather.mapper.CouponTemplateMapper;
import org.feather.service.ICouponTemplateService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 优惠券模板表 服务实现类
 * </p>
 *
 * @author feather(杜雪松)
 * @since 2022-01-11
 */
@DS("db2")
@Service
public class CouponTemplateServiceImpl extends ServiceImpl<CouponTemplateMapper, CouponTemplate> implements ICouponTemplateService{

}
