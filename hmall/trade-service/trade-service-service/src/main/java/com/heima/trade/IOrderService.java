package com.heima.trade;

import com.baomidou.mybatisplus.extension.service.IService;
import com.heima.trade.dataobject.Order;
import com.heima.trade.request.OrderFormQO;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 虎哥
 * @since 2023-05-05
 */
public interface IOrderService extends IService<Order> {

    Long createOrder(OrderFormQO orderFormDTO);

    void markOrderPaySuccess(Long orderId);
}
