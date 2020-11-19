package com.okra.seckill.db.mybatis;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * this method is not used by industrial
 * use "mvn mybatis-generator:generate" instead
 * add the following to pom.xml
 * 			<plugin>
 * 				<groupId>org.mybatis.generator</groupId>
 * 				<artifactId>mybatis-generator-maven-plugin</artifactId>
 * 				<version>1.4.0</version>
 *
 * 				<dependencies>
 * 					<dependency>
 * 						<groupId>mysql</groupId>
 * 						<artifactId>mysql-connector-java</artifactId>
 * 						<version>8.0.22</version>
 * 					</dependency>
 * 				</dependencies>
 * 			</plugin>
 */
public class GeneratorSqlmap {
    public void generator() throws Exception {
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        //指定逆向工程配置文件
        String realpath = System.getProperty("user.dir");
        String path = GeneratorSqlmap.class.getClassLoader().getResource("generatorConfig.xml").getPath();
        File configFile = new File("/Users/qingzi/Desktop/SeckillSystem/src/main/resources/generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }

    public static void main(String[] args) throws Exception {
        try {
            GeneratorSqlmap generatorSqlmap = new GeneratorSqlmap();
            generatorSqlmap.generator();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
