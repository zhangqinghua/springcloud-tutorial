package org.zhangqinghua.tutorial.consumer.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zhangqinghua.tutorial.consumer.feign.OrderFeign;

@RestController
@RequestMapping("/admin/user")
public class AdminUserController {

    @Autowired
    private OrderFeign orderFeign;

    @GetMapping("/find_user_order")
    public String findUserOrder() {
        return orderFeign.findOrder(123L);
    }
}
