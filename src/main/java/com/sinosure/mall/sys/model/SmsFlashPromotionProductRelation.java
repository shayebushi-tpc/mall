package com.sinosure.mall.sys.model;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 商品限时购与商品关系表
 * </p>
 *
 * @author 小康
 * @since 2020-11-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SmsFlashPromotionProductRelation implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long flashPromotionId;

    /**
     * 编号
     */
    private Long flashPromotionSessionId;

    private Long productId;

    /**
     * 限时购价格
     */
    private BigDecimal flashPromotionPrice;

    /**
     * 限时购数量
     */
    private Integer flashPromotionCount;

    /**
     * 每人限购数量
     */
    private Integer flashPromotionLimit;

    /**
     * 排序
     */
    private Integer sort;


}
