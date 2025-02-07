package com.whoiszxl.feign;

import com.whoiszxl.bean.ResponseResult;
import com.whoiszxl.config.OAuth2FeignConfig;
import com.whoiszxl.dto.ActivityDTO;
import com.whoiszxl.dto.MemberCouponDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * 促销feign接口
 *
 * @author whoiszxl
 * @date 2021/7/21
 */
@FeignClient(name = "zz-promotion-web", contextId = "promotionFeign", configuration = OAuth2FeignConfig.class)
public interface PromotionFeignClient {

    /**
     * 获取当前用户未使用的优惠券
     * @return 优惠券
     */
    @GetMapping("/getMyCoupon")
    List<MemberCouponDTO> getMyCoupon();

    /**
     * 获取当前有效的活动
     * @return 当前有效的活动列表
     */
    @GetMapping("/listCurrentActivity")
    List<ActivityDTO> listCurrentActivity();

    /**
     * 使用优惠券
     * @param couponId 优惠券ID
     * @return
     */
    @PostMapping("/useCoupon/{couponId}")
    ResponseResult<Boolean> useCoupon(@PathVariable("couponId") String couponId);
}
