package com.itust.sell.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @program: TabProductCategory
 * @description: 商品类目表
 * @author: FangXu
 * @create: 2018-11-21 20:40
 */
@Entity
@Table(name = "product_category")
@Data
public class TabProductCategory implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 3894836875178047413L;

    /** 主键id **/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId;
    /** 类目名字 **/
    private String categoryName;
    private Integer categoryType;
    private Date createTime;
    private Date updateTime;

}
