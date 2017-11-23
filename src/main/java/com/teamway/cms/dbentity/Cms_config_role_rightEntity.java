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

import java.util.Date;

/**
 * 角色-权限关联表(CMS_CONFIG_ROLE_RIGHT)
 * 
 * @author bianj
 * @version 1.0.0 2017-04-24
 */
public class Cms_config_role_rightEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 4253581851412321309L;
    
    /**  */
    private Long id;
    
    /**  */
    private Long role_id;
    
    /**  */
    private Long right_id;
    
    /**  */
    private Date gmt_create;
    
    /**  */
    private Date gmt_modified;
    
    /**  */
    private String remark;
    
    /** 权限类型 0: 可访问 1:可授权 */
    private String right_type;
    
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
    public Long getRole_id() {
        return this.role_id;
    }
     
    /**
     * 设置
     * 
     * @param role_id
     *          
     */
    public void setRole_id(Long role_id) {
        this.role_id = role_id;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public Long getRight_id() {
        return this.right_id;
    }
     
    /**
     * 设置
     * 
     * @param right_id
     *          
     */
    public void setRight_id(Long right_id) {
        this.right_id = right_id;
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
    
    /**
     * 获取权限类型 0: 可访问 1:可授权
     * 
     * @return 权限类型 0
     */
    public String getRight_type() {
        return this.right_type;
    }
     
    /**
     * 设置权限类型 0: 可访问 1:可授权
     * 
     * @param right_type
     *          权限类型 0: 可访问 1:可授权
     */
    public void setRight_type(String right_type) {
        this.right_type = right_type;
    }
}