package com.wanshi.t19.cadre_remove_manage.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wanshi.t19.cadre_remove_manage.model.CadreRemove;
import com.wanshi.t19.sys_dict_key.model.SysDictKey;
import com.wanshi.t19.sys_dict_val.model.SysDictVal;
import com.wanshi.t19.utils.PageBean;

public interface CadRmvMapper {
	//查询所有+模糊查询
	public List<CadreRemove> queryCadreRem(@Param("searchBean")CadreRemove searchBean,@Param("pageBean")PageBean pageBean);
	public Integer queryCount(@Param("searchBean")CadreRemove searchBean,@Param("pageBean")PageBean pageBean);
	
	//批量删除   集合
	public void batchDel(String[] id);
	
	//根据id查询单条数据
	public CadreRemove queryOne(Integer id);
	
	//修改信息
	public int updateCadreRem(CadreRemove cadreRemove);
	
	//修改信息 字典查询
	public List<SysDictVal> selectfind(SysDictKey sysDictKey);
	
	//增加信息
	public int addCadreRem(CadreRemove cadreRemove);
}
