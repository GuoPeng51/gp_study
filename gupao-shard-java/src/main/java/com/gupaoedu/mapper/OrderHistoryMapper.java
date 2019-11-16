package com.gupaoedu.mapper;

import com.gupaoedu.entity.OrderHistory;
import com.gupaoedu.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrderHistoryMapper {
    int insert(OrderHistory orderHistory);

    OrderHistory selectByPrimaryKey(Long id);
}
