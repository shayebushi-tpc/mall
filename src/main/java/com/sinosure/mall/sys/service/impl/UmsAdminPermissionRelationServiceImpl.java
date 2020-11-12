package com.sinosure.mall.sys.service.impl;

import com.sinosure.mall.sys.model.UmsAdminPermissionRelation;
import com.sinosure.mall.sys.mapper.UmsAdminPermissionRelationMapper;
import com.sinosure.mall.sys.service.IUmsAdminPermissionRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户和权限关系表(除角色中定义的权限以外的加减权限) 服务实现类
 * </p>
 *
 * @author 小康
 * @since 2020-11-12
 */
@Service
public class UmsAdminPermissionRelationServiceImpl extends ServiceImpl<UmsAdminPermissionRelationMapper, UmsAdminPermissionRelation> implements IUmsAdminPermissionRelationService {

}
