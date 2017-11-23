/*
 * Welcome to use the TableGo Tools.
 * 
 * http://vipbooks.iteye.com
 * http://blog.csdn.net/vipbooks
 * http://www.cnblogs.com/vipbooks
 * 
 * Author:bianj
 * Email:edinsker@163.com
 * Version:4.1.2
 */

package com.teamway.cms.dbentity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 传感器设备信心表(CMS_RES_SENSOR_INFO)
 * 
 * @author bianj
 * @version 1.0.0 2017-04-24
 */
public class Cms_res_sensor_infoEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 4137467280065073133L;
    
    /**  */
    private Long id;
    
    /**  */
    private Integer type_id;
    
    /**  */
    private Long region_id;
    
    /**  */
    private Integer channel;
    
    /**  */
    private Integer server_id;
    
    /**  */
    private String name;
    
    /**  */
    private BigDecimal maxRange;
    
    /**  */
    private BigDecimal minRange;
    
    /**  */
    private BigDecimal limit_4;
    
    /**  */
    private BigDecimal limit_3;
    
    /**  */
    private BigDecimal limit_2;
    
    /**  */
    private BigDecimal limit_1;
    
    /**  */
    private Integer limit_type;
    
    /**  */
    private String code;
    
    /**  */
    private Date gmt_create;
    
    /**  */
    private Date gmt_motified;
    
    /**  */
    private String remark;
    
    /**
     * 获取
     * 
     * @return 
     */
    public Long getId() {
        return this.id;
    }
     
    /**
     * 设置
     * 
     * @param id
     *          
     */
    public void setId(Long id) {
        this.id = id;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public Integer getType_id() {
        return this.type_id;
    }
     
    /**
     * 设置
     * 
     * @param type_id
     *          
     */
    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public Long getRegion_id() {
        return this.region_id;
    }
     
    /**
     * 设置
     * 
     * @param region_id
     *          
     */
    public void setRegion_id(Long region_id) {
        this.region_id = region_id;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public Integer getChannel() {
        return this.channel;
    }
     
    /**
     * 设置
     * 
     * @param channel
     *          
     */
    public void setChannel(Integer channel) {
        this.channel = channel;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public Integer getServer_id() {
        return this.server_id;
    }
     
    /**
     * 设置
     * 
     * @param server_id
     *          
     */
    public void setServer_id(Integer server_id) {
        this.server_id = server_id;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getName() {
        return this.name;
    }
     
    /**
     * 设置
     * 
     * @param name
     *          
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public BigDecimal getMaxRange() {
        return this.maxRange;
    }
     
    /**
     * 设置
     * 
     * @param maxRange
     *          
     */
    public void setMaxRange(BigDecimal maxRange) {
        this.maxRange = maxRange;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public BigDecimal getMinRange() {
        return this.minRange;
    }
     
    /**
     * 设置
     * 
     * @param minRange
     *          
     */
    public void setMinRange(BigDecimal minRange) {
        this.minRange = minRange;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public BigDecimal getLimit_4() {
        return this.limit_4;
    }
     
    /**
     * 设置
     * 
     * @param limit_4
     *          
     */
    public void setLimit_4(BigDecimal limit_4) {
        this.limit_4 = limit_4;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public BigDecimal getLimit_3() {
        return this.limit_3;
    }
     
    /**
     * 设置
     * 
     * @param limit_3
     *          
     */
    public void setLimit_3(BigDecimal limit_3) {
        this.limit_3 = limit_3;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public BigDecimal getLimit_2() {
        return this.limit_2;
    }
     
    /**
     * 设置
     * 
     * @param limit_2
     *          
     */
    public void setLimit_2(BigDecimal limit_2) {
        this.limit_2 = limit_2;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public BigDecimal getLimit_1() {
        return this.limit_1;
    }
     
    /**
     * 设置
     * 
     * @param limit_1
     *          
     */
    public void setLimit_1(BigDecimal limit_1) {
        this.limit_1 = limit_1;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public Integer getLimit_type() {
        return this.limit_type;
    }
     
    /**
     * 设置
     * 
     * @param limit_type
     *          
     */
    public void setLimit_type(Integer limit_type) {
        this.limit_type = limit_type;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getCode() {
        return this.code;
    }
     
    /**
     * 设置
     * 
     * @param code
     *          
     */
    public void setCode(String code) {
        this.code = code;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public Date getGmt_create() {
        return this.gmt_create;
    }
     
    /**
     * 设置
     * 
     * @param gmt_create
     *          
     */
    public void setGmt_create(Date gmt_create) {
        this.gmt_create = gmt_create;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public Date getGmt_motified() {
        return this.gmt_motified;
    }
     
    /**
     * 设置
     * 
     * @param gmt_motified
     *          
     */
    public void setGmt_motified(Date gmt_motified) {
        this.gmt_motified = gmt_motified;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getRemark() {
        return this.remark;
    }
     
    /**
     * 设置
     * 
     * @param remark
     *          
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}