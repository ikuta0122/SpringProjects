package com.ikuta.dao;

import com.ikuta.entity.Sale;

public interface SaleDao {
    /**
     * 增加销售记录
     */
    int insertSale(Sale sale);
}
