package com.imooc.passbook.merchants.service;

import com.alibaba.fastjson.JSON;
import com.imooc.passbook.merchants.vo.CreateMerchantsRequest;
import com.imooc.passbook.merchants.vo.PassTemplate;
import org.apache.commons.lang.time.DateUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * 商户用户服务测试
 *
 * @author Yin
 * @date 2021/4/4 16:11
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class MerchantsServTest {
    
    @Autowired
    private IMerchantsServ merchantsServ;
    
    @Test
    @Transactional
    public void testCreateMerchantsServ() {
        CreateMerchantsRequest request = new CreateMerchantsRequest();
        request.setName("mooc");
        request.setLogoUrl("www.imooc.com");
        request.setBusinessLicenseUrl("www.imooc.com");
        request.setPhone("1234567890");
        request.setAddress("武汉市");
        
        System.out.println(JSON.toJSONString(merchantsServ.createMerchants(request)));
    }
    
    /**
     * {"data":{"address":"武汉市",
     * "audit":false,"businessLicenseUrl":"www.imooc.com",
     * "id":1,"logoUrl":"www.imooc.com","name":"mooc","phone":"1234567890"}}
     */
    @Test
    public void testBuildMerchantsInfoById() {
        
        System.out.println(JSON.toJSONString(merchantsServ.buildMerchantsInfoById(1)));
    }
    
    /**
     * DropPassTemplate:{"background":2,"end":1622738157935,"hastoken":false,"id":1,
     * "limit":1000,"start":1621874157935,"summary":"简介:慕课","title":"title:慕课"}
     */
    @Test
    public void testDropPassTemplate() {
        PassTemplate passTemplate = new PassTemplate();
        passTemplate.setId(1);
        passTemplate.setTitle("title:慕课");
        passTemplate.setSummary("简介:慕课");
        passTemplate.setLimit(1000L);
        passTemplate.setHastoken(false);
        passTemplate.setBackground(2);
        passTemplate.setStart(new Date());
        passTemplate.setEnd(DateUtils.addDays(new Date(), 10));
        System.out.println(JSON.toJSONString(merchantsServ.dropPassTemplate(passTemplate)));
    }
    
}
