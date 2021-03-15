package org.zhangqinghua.tutorial.production.feign;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderFeignImpl {

    @RequestMapping("/find_order")
    public String findOrder(@RequestParam Long orderId) {
        return "orderId: " + orderId;
    }
}
