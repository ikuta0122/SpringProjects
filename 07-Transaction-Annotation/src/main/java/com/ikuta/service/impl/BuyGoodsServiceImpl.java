package com.ikuta.service.impl;

import com.ikuta.dao.GoodsDao;
import com.ikuta.dao.SaleDao;
import com.ikuta.entity.Goods;
import com.ikuta.entity.Sale;
import com.ikuta.excep.NotEnoughException;
import com.ikuta.service.BuyGoodsService;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class BuyGoodsServiceImpl implements BuyGoodsService {
    private SaleDao saleDao;
    @Transactional(propagation = Propagation.REQUIRED,
            isolation = Isolation.DEFAULT,
            readOnly = false,
            rollbackFor = {
                    NullPointerException.class,
                    NotEnoughException.class
            }
    )
    @Override
    public void buy(Integer goodsId, Integer nums) {
        // 向销售表添加销售信息
        Sale sale = new Sale();
        sale.setGid(goodsId);
        sale.setNums(nums);
        saleDao.insertSale(sale);

        // 向商品表更新库存
        Goods goods = goodsDao.selectGoods(goodsId);
        if (goods == null) {// 商品不存在
            throw new NullPointerException("编号:" + goodsId + ",商品不存在");
        } else if (goods.getAmount() < nums) {// 商品库存不足
            throw new NotEnoughException("编号:" + goodsId + ",商品库存不足");
        }
        Goods buyGoods = new Goods();
        buyGoods.setId(goodsId);
        buyGoods.setAmount(nums);
        goodsDao.updateGoods(buyGoods);
    }

    private GoodsDao goodsDao;

    public void setSaleDao(SaleDao saleDao) {
        this.saleDao = saleDao;
    }

    public void setGoodsDao(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }

}
