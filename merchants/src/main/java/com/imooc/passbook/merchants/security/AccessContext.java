package com.imooc.passbook.merchants.security;

/**
 * 用 ThreadLocal 去单独存储每一个线程携带的 Token 信息
 *
 * @author Yin
 * @date 2021/3/22 0:46
 */
public class AccessContext {
    public static final ThreadLocal<String> token = new ThreadLocal<String>();
    
    public static String getToken() {
        return token.get();
    }
    
    public static void setToken(String tokenStr){
        token.set(tokenStr);
    }
    
    public static void clearAccessKey(){
        token.remove();
    }
}
