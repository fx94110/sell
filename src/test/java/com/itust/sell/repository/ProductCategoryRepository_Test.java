package com.itust.sell.repository;

import com.itust.sell.entity.TabProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * @program: ProductCategoryRepository_Test
 * @description: TODO
 * @author: FangXu
 * @create: 2018-11-21 20:51
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepository_Test {


    @Autowired
    private ProductCategoryRepository productCategoryDao;

    @Test
    public void testGetOne() {
        TabProductCategory productCategory = productCategoryDao.getOne(2);
        System.out.println(productCategory.getCategoryName());
//        Assert.assertNotNull(productCategory);
    }

    @Test
    public void testSaveOne() {
        TabProductCategory one = new TabProductCategory();
        Date now = new Date();


        one.setCategoryName("女生专属");
        one.setCategoryType(3);
        one.setCreateTime(now);
        one.setUpdateTime(now);

        TabProductCategory result = productCategoryDao.save(one);
        Assert.assertNotNull(result);
    }

}