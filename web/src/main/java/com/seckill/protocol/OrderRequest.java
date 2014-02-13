package com.seckill.protocol;

import java.util.Map;

/**
 * User: 黄锴
 * Date: 13-11-17
 * Time: 下午2:26
 */
public class OrderRequest {
    private String ip;
    private String userId; //百度账号passport_id
    private String vcode;//验证码
    private String vcodeToken;//验证码在后端的唯一标识

    private Map<Long, Integer> productMap;

    private String province;
    private String city;
    private String region;
    private String area;




    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getVcode() {
        return vcode;
    }

    public void setVcode(String vcode) {
        this.vcode = vcode;
    }

    public String getVcodeToken() {
        return vcodeToken;
    }

    public void setVcodeToken(String vcodeToken) {
        this.vcodeToken = vcodeToken;
    }

    public Map<Long, Integer> getProductMap() {
        return productMap;
    }

    public void setProductMap(Map<Long, Integer> productMap) {
        this.productMap = productMap;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
