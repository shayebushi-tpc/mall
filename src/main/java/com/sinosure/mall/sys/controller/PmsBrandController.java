package com.sinosure.mall.sys.controller;


import com.sinosure.mall.sys.service.IPmsBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 品牌表 前端控制器
 * </p>
 *
 * @author 小康
 * @since 2020-11-12
 */
@RestController
@RequestMapping("/sys/pms-brand")
public class PmsBrandController {

    @Autowired
    IPmsBrandService pmsBrandService;
    @GetMapping("/findall")
    @ResponseBody
    public String findAllBrands(){
        return this.pmsBrandService.list().stream().toString();
    }

}

