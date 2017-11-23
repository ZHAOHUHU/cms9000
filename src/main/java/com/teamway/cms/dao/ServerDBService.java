package com.teamway.cms.dao;

import java.util.List;
import java.util.Map;

import org.fastquery.core.Id;
import org.fastquery.core.Modifying;
import org.fastquery.core.Param;
import org.fastquery.core.Primarykey;
import org.fastquery.core.Query;
import org.fastquery.core.QueryByNamed;
import org.fastquery.core.QueryRepository;
import org.fastquery.filter.After;
import org.fastquery.filter.Before;

import org.fastquery.filter.SkipFilter;
import org.fastquery.page.Page;
import org.fastquery.page.Pageable;
import org.fastquery.where.Condition;

import com.alibaba.fastjson.JSONArray;
import com.teamway.cms.dbentity.Cms_config_userEntity;
import com.teamway.cms.dbentity.Cms_res_server_infoEntity;



public interface ServerDBService extends QueryRepository {

    @Query("select * from `cms_res_server_info` #{#where}")
    @Condition("type_id = ?1")    
    Page<Cms_res_server_infoEntity> findByType(Integer type_id,Pageable pageable);

    
    @Query("select * from `cms_res_server_info` #{#where}")
    @Condition("type_id = ?1")    
    List<Cms_res_server_infoEntity> findByType(Integer type_id);

    @Query("select * from cms_res_server_info s where s.ip=?1 and s.port = ?2 limit 1")
    Cms_res_server_infoEntity findOneByIpAndPort(String ip,Integer port);
    
	@Query("insert into cms_res_server_info (id,type_id,name ,username, password, ip, port, remark,gmt_create,gmt_modified,stream_id) values (NULL,?1, ?2,?3, ?4,?5,?6,?7,now(),now(),?8)")
	@Modifying(table="cms_res_server_info",id="id")
	Cms_res_server_infoEntity newServer(int type_id,String name ,String username,String password,String ip,int port, String remark,int stream_id);

	
	@Query("update cms_res_server_info  set type_id=?2,name=?3 ,username=?4, password=?5, ip=?6, port=?7, remark=?8,gmt_modified=now(),stream_id=?9 where id= ?1")
	@Modifying(table="cms_res_server_info",id="id")
	int editServer(@Id int id,int type_id,String name ,String username,String password,String ip,int port, String remark,int stream_id);
	
	
	
    @Query("select * from cms_res_server_info where id= ?1")
    Cms_res_server_infoEntity getServerById(Integer id);
	
	@Query("delete from cms_res_server_info where id in (?1)")
	@Modifying(table="cms_res_server_info",id="id")
	int delServerByIds(List<String> ids);
    
    
	
	
}

