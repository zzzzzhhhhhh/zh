package com.heima.trade.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.heima.trade.IOrderDetailService;
import com.heima.trade.dataobject.OrderDetail;
import com.heima.trade.mapper.OrderDetailMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单详情表 服务实现类
 * </p>
 *
 * @author 虎哥
 * @since 2023-05-05
 */
@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements IOrderDetailService {

}
