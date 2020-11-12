package com.sinosure.mall.sys.service.impl;

import com.sinosure.mall.sys.model.PmsProductCategoryAttributeRelation;
import com.sinosure.mall.sys.mapper.PmsProductCategoryAttributeRelationMapper;
import com.sinosure.mall.sys.service.IPmsProductCategoryAttributeRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品的分类和属性的关系表，用于设置分类筛选条件（只支持一级分类） 服务实现类
 * </p>
 *
 * @author 小康
 * @since 2020-11-12
 */
@Service
public class PmsProductCategoryAttributeRelationServiceImpl extends ServiceImpl<PmsProductCategoryAttributeRelationMapper, PmsProductCategoryAttributeRelation> implements IPmsProductCategoryAttributeRelationService {

}
