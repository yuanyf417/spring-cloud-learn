package com.yyf.learnseataorder.service;

import com.yyf.learnseataorder.dto.Order;

/**
 * description
 *
 * @author YYF 2024/10/16 2024/10/16.
 */
public interface OrderService {
    /**
     * 创建订单
     */
    Order create(String userId, String commodityCode, int orderCount);
}
