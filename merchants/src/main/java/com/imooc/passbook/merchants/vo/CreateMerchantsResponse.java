package com.imooc.passbook.merchants.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 创建商户响应对象
 * @author Yin
 * @date 2021/4/4 15:43
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateMerchantsResponse {
    /**商户 id:创建失败则为 -1*/
    private Integer id;
    
    
}
