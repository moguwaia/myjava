package com.imooc.passbook.merchants.dao;

import com.imooc.passbook.merchants.entity.Merchants;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Merchans Dao
 * @author Yin
 * @date 2021/3/28 15:35
 */
public interface MerchantsDao extends JpaRepository<Merchants,Integer> {
    
    
    /**
     * 根据id获取商户对象
     * @param id
     * @return
     */
    Merchants findById(Integer id);
    
    /**
     * 根据商户名称获取商户对象
     * @param name
     * @return
     */
    Merchants findByName(String name);
    
}
