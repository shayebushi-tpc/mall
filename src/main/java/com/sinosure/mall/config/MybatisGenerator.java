package com.sinosure.mall.config;

import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.TemplateConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.Scanner;

/**
 * 用于生成 model 及mapper配置文件
 */

public class MybatisGenerator {

    /**
     * <p>
     * 读取控制台内容
     * </p>
     */
    public static String scanner(String tip) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder help = new StringBuilder();
        help.append("请输入" + tip + "：");
        System.out.println(help.toString());
        if (scanner.hasNext()) {
            String ipt = scanner.next();
            if (StringUtils.isNotEmpty(ipt)) {
                return ipt;
            }
        }
        throw new MybatisPlusException("请输入正确的" + tip + "！");
    }

    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        gc.setOutputDir(projectPath + "/src/main/java");
//        gc.setOutputDir("D:\\workspace-sts\\0520adv\\02_mp_springboot/src/main/java");
        gc.setAuthor("小康");
        gc.setOpen(false);//当代码生成完成之后是否打开代码所在的文件夹
        // gc.setSwagger2(true); 实体属性 Swagger2 注解
//        gc.setServiceName("%sService");
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://49.233.10.97:3306/mall?useUnicode=true&characterEncoding=utf-8&serverTimezone=Asia/Shanghai");
        // dsc.setSchemaName("public");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("123456");
        mpg.setDataSource(dsc);

        // 包配置
        PackageConfig pc = new PackageConfig();
//        pc.setModuleName(scanner("模块名"));
        pc.setModuleName("sys");
        pc.setParent("com.sinosure.mall");//controller entity  service  service.impl
        pc.setController("controller");
        pc.setEntity("model");
        pc.setMapper("mapper");
        pc.setService("service");
        pc.setServiceImpl("service.impl");
        pc.setXml("mapper.xml");
        mpg.setPackageInfo(pc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        //设置字段和表名的是否把下划线完成驼峰命名规则
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        //设置生成的实体类继承的父类
//        strategy.setSuperEntityClass("com.sxt.BaseEntity");
        strategy.setEntityLombokModel(true);//是否启动lombok
        strategy.setRestControllerStyle(true);//是否生成resetController
        // 公共父类
//        strategy.setSuperControllerClass("com.sxt.BaseController");
        // 写于父类中的公共字段
//        strategy.setSuperEntityColumns("person_id","person_name");
        //要设置生成哪些表 如果不设置就是生成所有的表
//        strategy.setInclude(scanner("表名，多个英文逗号分割").split(","));
        strategy.setControllerMappingHyphenStyle(true);
//        strategy.setTablePrefix(pc.getModuleName() + "_");
        strategy.setTablePrefix("sys_");
        mpg.setStrategy(strategy);
        mpg.execute();
    }

}
