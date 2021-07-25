package com.imooc.passbook.merchants.vo;

import com.imooc.passbook.merchants.constants.ErrorCode;
import com.imooc.passbook.merchants.dao.MerchantsDao;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Yin
 * @date 2021/3/28 15:44
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PassTemplate {
    
    /**
     * 所属商户 id
     */
    private Integer id;
    
    /**
     * 优惠券标题
     */
    private String title;
    
    
    private String summary;
    
    /**
     * 优惠券的详细信息
     */
    private String desc;
    
    /**
     * 最大个数限制
     */
    private Long limit;
    
    /**
     * 优惠券是否有 Token,用于商户核销
     */
    private Boolean hastoken;// token存储于Redis Set中，每次领取从Redis中获取
    
    /**
     * 优惠券背景颜色
     */
    private Integer background;
    
    /**
     * 优惠券开始时间
     */
    private Date start;
    
    /**
     * 优惠券结束时间
     */
    private Date end;
    
    /**
     * 校验优惠券对象的有效性
     * @param merchantsDao
     * @return
     */
    public ErrorCode validate(MerchantsDao merchantsDao) {
        
        if (null == merchantsDao.findById(id)) {
            return ErrorCode.MERCHANTS_NOT_EXIST;
        }
        return ErrorCode.SUCCESS;
    }
}
