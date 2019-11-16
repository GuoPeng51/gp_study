package com.gupaoedu.service;

import com.gupaoedu.entity.OrderHistory;
import com.gupaoedu.entity.UserInfo;
import com.gupaoedu.mapper.OrderHistoryMapper;
import com.gupaoedu.mapper.UserInfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Service
public class OrderHistoryService {

    @Resource
    OrderHistoryMapper orderHistoryMapper;

    public static Long userId = 1L;

    public void insert() {
        for (int i = 1; i <= 3; i++) {
            OrderHistory orderHistory = new OrderHistory();
            //orderHistory.setUserId(userId);
            orderHistory.setName("account" + i);
            orderHistory.setMoney("password" + i);
            orderHistory.setMonth("20190" + i);
            orderHistory.setOrderTime(new Date());
            orderHistoryMapper.insert(orderHistory);
        }
    }

    public OrderHistory getUserInfoByUserId(Long id){
        return orderHistoryMapper.selectByPrimaryKey(id);
    }
}
