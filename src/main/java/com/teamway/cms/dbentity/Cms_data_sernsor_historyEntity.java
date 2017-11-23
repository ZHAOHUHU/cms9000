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
 * 传感器历史数据表(CMS_DATA_SERNSOR_HISTORY)
 * 
 * @author bianj
 * @version 1.0.0 2017-04-24
 */
public class Cms_data_sernsor_historyEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -7605966134049978765L;
    
    /**  */
    private Long id;
    
    /**  */
    private Long sensor_id;
    
    /**  */
    private BigDecimal value;
    
    /**  */
    private Date gmt_create;
    
    /**  */
    private Date gmt_modified;
    
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
    public Long getSensor_id() {
        return this.sensor_id;
    }
     
    /**
     * 设置
     * 
     * @param sensor_id
     *          
     */
    public void setSensor_id(Long sensor_id) {
        this.sensor_id = sensor_id;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public BigDecimal getValue() {
        return this.value;
    }
     
    /**
     * 设置
     * 
     * @param value
     *          
     */
    public void setValue(BigDecimal value) {
        this.value = value;
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
    public Date getGmt_modified() {
        return this.gmt_modified;
    }
     
    /**
     * 设置
     * 
     * @param gmt_modified
     *          
     */
    public void setGmt_modified(Date gmt_modified) {
        this.gmt_modified = gmt_modified;
    }
}