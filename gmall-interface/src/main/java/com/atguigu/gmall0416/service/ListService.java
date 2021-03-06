package com.atguigu.gmall0416.service;

import com.atguigu.gmall0416.bean.SkuLsInfo;
import com.atguigu.gmall0416.bean.SkuLsParams;
import com.atguigu.gmall0416.bean.SkuLsResult;

public interface ListService {

    // SkuLsInfo -- 对es 数据进行封装的对象
    void saveSkuInfo(SkuLsInfo skuLsInfo);
    // 根据用户输入的参数，返回封装好的结果集
    SkuLsResult search(SkuLsParams skuLsParams);
    // 为当前的商品增加热度
    void incrHotScore(String skuId);
}
