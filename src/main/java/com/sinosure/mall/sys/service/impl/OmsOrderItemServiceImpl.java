package com.sinosure.mall.sys.service.impl;

import com.sinosure.mall.sys.model.OmsOrderItem;
import com.sinosure.mall.sys.mapper.OmsOrderItemMapper;
import com.sinosure.mall.sys.service.IOmsOrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单中所包含的商品 服务实现类
 * </p>
 *
 * @author 小康
 * @since 2020-11-12
 */
@Service
public class OmsOrderItemServiceImpl extends ServiceImpl<OmsOrderItemMapper, OmsOrderItem> implements IOmsOrderItemService {

}
