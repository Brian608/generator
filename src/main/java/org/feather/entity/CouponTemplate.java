package org.feather.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 优惠券模板表
 * </p>
 *
 * @author feather(杜雪松)
 * @since 2022-01-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class CouponTemplate extends Model<CouponTemplate> {

    private static final long serialVersionUID=1L;

    /**
     * 自增主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 是否是可用状态; true: 可用, false: 不可用
     */
    private Boolean available;

    /**
     * 是否过期; true: 是, false: 否
     */
    private Boolean expired;

    /**
     * 优惠券名称
     */
    private String name;

    /**
     * 优惠券 logo
     */
    private String logo;

    /**
     * 优惠券描述
     */
    private String intro;

    /**
     * 优惠券分类
     */
    private String category;

    /**
     * 产品线
     */
    private Integer productLine;

    /**
     * 总数
     */
    private Integer couponCount;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建用户
     */
    private Long userId;

    /**
     * 优惠券模板的编码
     */
    private String templateKey;

    /**
     * 目标用户
     */
    private Integer target;

    /**
     * 优惠券规则: TemplateRule 的 json 表示
     */
    private String rule;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
