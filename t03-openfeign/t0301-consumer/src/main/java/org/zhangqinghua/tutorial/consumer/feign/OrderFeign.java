package org.zhangqinghua.tutorial.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("production")
public interface OrderFeign {

    @RequestMapping("/order/find_order")
    String findOrder(@RequestParam("orderId") Long orderId);
}
