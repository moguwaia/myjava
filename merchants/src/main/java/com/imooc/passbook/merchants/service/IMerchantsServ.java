package com.imooc.passbook.merchants.service;

import com.imooc.passbook.merchants.vo.CreateMerchantsRequest;
import com.imooc.passbook.merchants.vo.PassTemplate;
import com.imooc.passbook.merchants.vo.Response;

/**
 * 对商户服务接口定义
 * @author Yin
 * @date 2021/4/4 15:49
 */
public interface IMerchantsServ {
    
    /**
     * 创建商户服务
     * @param request
     * @return
     */
    Response createMerchants(CreateMerchantsRequest request);
    
    /**
     * 根据id构造商户信息
     * @param id
     * @return
     */
    Response buildMerchantsInfoById(Integer id);
    
    /**
     * 投放优惠券
     * @param template
     * @return
     */
    Response dropPassTemplate(PassTemplate template);
    
    
    
}
