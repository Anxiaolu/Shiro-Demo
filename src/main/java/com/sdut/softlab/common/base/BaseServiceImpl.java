/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdut.softlab.common.base;

import com.github.pagehelper.PageHelper;
import com.sdut.softlab.common.util.SpringContextUtil;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 通过反射的方式实现简单的service实现
 * @author huanlu
 */
public abstract class BaseServiceImpl<Mapper, Record, Example> implements BaseService<Record, Example>{
   
    public Mapper mapper;
    
    /**
     * 根据条件查询记录数量
     *
     * @param example
     * @return
     */
    @Override
    public int countByExample(Example example){
        try {
			Method countByExample = mapper.getClass().getDeclaredMethod("countByExample", example.getClass());
			Object result = countByExample.invoke(mapper, example);
			return Integer.parseInt(String.valueOf(result));
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return 0;
    }

    /**
     * 根据条件删除记录
     *
     * @param example
     * @return
     */
    @Override
    public int deleteByExample(Example example){
        try {
			Method deleteByExample = mapper.getClass().getDeclaredMethod("deleteByExample", example.getClass());
			Object result = deleteByExample.invoke(mapper, example);
			return Integer.parseInt(String.valueOf(result));
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return 0;
    }

    /**
     * 根据主键删除记录
     *
     * @param id
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Integer id){
        try {
			Method deleteByPrimaryKey = mapper.getClass().getDeclaredMethod("deleteByPrimaryKey", id.getClass());
			Object result = deleteByPrimaryKey.invoke(mapper, id);
			return Integer.parseInt(String.valueOf(result));
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return 0;
    }

    /**
     * 插入记录
     *
     * @param record
     * @return
     */
    @Override
    public int insert(Record record){
        try {
			Method insert = mapper.getClass().getDeclaredMethod("insert", record.getClass());
			Object result = insert.invoke(mapper, record);
			return Integer.parseInt(String.valueOf(result));
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return 0;
    
    }

    /**
     * 插入记录有效字段
     *
     * @param record
     * @return
     */
    @Override
    public int insertSelective(Record record){
        try {
			Method insertSelective = mapper.getClass().getDeclaredMethod("insertSelective", record.getClass());
			Object result = insertSelective.invoke(mapper, record);
			return Integer.parseInt(String.valueOf(result));
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return 0;
    }

    /**
     * 根据条件查询记录，附带BLOB字段
     *
     * @param example
     * @return
     */
    @Override
    public List<Record> selectByExampleWithBLOBs(Example example){
       try {
			Method selectByExampleWithBLOBs = mapper.getClass().getDeclaredMethod("selectByExampleWithBLOBs", example.getClass());
			Object result = selectByExampleWithBLOBs.invoke(mapper, example);
			return (List<Record>) result;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return null;
    }

    /**
     * 根据条件查询记录
     *
     * @param example
     * @return
     */
    @Override
    public List<Record> selectByExample(Example example){
       try {
			Method selectByExample = mapper.getClass().getDeclaredMethod("selectByExample", example.getClass());
			Object result = selectByExample.invoke(mapper, example);
			return (List<Record>) result;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return null;
    }

    /**
     * 根据条件查询记录并按页码分页，附带BLOB字段
     *
     * @param example 条件
     * @param pageNum 页数
     * @param pageSize 每页记录数
     * @return
     */
    @Override
    public List<Record> selectByExampleWithBLOBsForStartPage(Example example, Integer pageNum, Integer pageSize){
        try {
			Method selectByExampleWithBLOBs = mapper.getClass().getDeclaredMethod("selectByExampleWithBLOBs", example.getClass());
			PageHelper.startPage(pageNum, pageSize, false);
			Object result = selectByExampleWithBLOBs.invoke(mapper, example);
			return (List<Record>) result;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return null;
    }

    /**
     * 根据条件查询记录并按页码分页
     *
     * @param example 条件
     * @param pageNum 页数
     * @param pageSize 每页记录数
     * @return
     */
    @Override
    public List<Record> selectByExampleForStartPage(Example example, Integer pageNum, Integer pageSize){
        try {
			Method selectByExample = mapper.getClass().getDeclaredMethod("selectByExample", example.getClass());
			PageHelper.startPage(pageNum, pageSize, false);
			Object result = selectByExample.invoke(mapper, example);
			return (List<Record>) result;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return null;
    }

    /**
     * 根据条件查询记录并按最后记录数分页，附带BLOB字段
     *
     * @param example 条件
     * @param offset 跳过数量
     * @param limit 查询数量
     * @return
     */
    @Override
    public List<Record> selectByExampleWithBLOBsForOffsetPage(Example example, Integer offset, Integer limit){
        try {
			Method selectByExampleWithBLOBs = mapper.getClass().getDeclaredMethod("selectByExampleWithBLOBs", example.getClass());
			PageHelper.offsetPage(offset, limit, false);
			Object result = selectByExampleWithBLOBs.invoke(mapper, example);
			return (List<Record>) result;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return null;
    }

    /**
     * 根据条件查询记录并按最后记录数分页
     *
     * @param example 条件
     * @param offset 跳过数量
     * @param limit 查询数量
     * @return
     */
    @Override
    public List<Record> selectByExampleForOffsetPage(Example example, Integer offset, Integer limit){
        try {
			Method selectByExample = mapper.getClass().getDeclaredMethod("selectByExample", example.getClass());
			PageHelper.offsetPage(offset, limit, false);
			Object result = selectByExample.invoke(mapper, example);
			return (List<Record>) result;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return null;
    }

    /**
     * 根据条件查询第一条记录
     *
     * @param example
     * @return
     */
    @Override
    public Record selectFirstByExample(Example example){
       try {
			Method selectByExample = mapper.getClass().getDeclaredMethod("selectByExample", example.getClass());
			List<Record> result = (List<Record>) selectByExample.invoke(mapper, example);
			if (null != result && result.size() > 0) {
				return result.get(0);
			}
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return null;
    }

    /**
     * 根据条件查询第一条记录，附带BLOB字段
     *
     * @param example
     * @return
     */
    @Override
    public Record selectFirstByExampleWithBLOBs(Example example){
       try {
			Method selectByExampleWithBLOBs = mapper.getClass().getDeclaredMethod("selectByExampleWithBLOBs", example.getClass());
			List<Record> result = (List<Record>) selectByExampleWithBLOBs.invoke(mapper, example);
			if (null != result && result.size() > 0) {
				return result.get(0);
			}
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return null;
    }

    /**
     * 根据主键查询记录
     *
     * @param id
     * @return
     */
    @Override
    public Record selectByPrimaryKey(Integer id){
        try {
			Method selectByPrimaryKey = mapper.getClass().getDeclaredMethod("selectByPrimaryKey", id.getClass());
			Object result = selectByPrimaryKey.invoke(mapper, id);
			return (Record) result;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return null;
    }

    /**
     * 根据条件更新有效字段
     *
     * @param record
     * @param example
     * @return
     */
    @Override
    public int updateByExampleSelective(@Param("record") Record record, @Param("example") Example example){
        try {
			Method updateByExampleSelective = mapper.getClass().getDeclaredMethod("updateByExampleSelective", record.getClass(), example.getClass());
			Object result = updateByExampleSelective.invoke(mapper, record, example);
			return Integer.parseInt(String.valueOf(result));
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return 0;
    }

    /**
     * 根据条件更新记录有效字段，附带BLOB字段
     *
     * @param record
     * @param example
     * @return
     */
    @Override
    public int updateByExampleWithBLOBs(@Param("record") Record record, @Param("example") Example example){
        try {
			Method updateByExampleWithBLOBs = mapper.getClass().getDeclaredMethod("updateByExampleWithBLOBs", record.getClass(), example.getClass());
			Object result = updateByExampleWithBLOBs.invoke(mapper, record, example);
			return Integer.parseInt(String.valueOf(result));
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return 0;
    }

    /**
     * 根据条件更新记录
     *
     * @param record
     * @param example
     * @return
     */
    @Override
    public int updateByExample(@Param("record") Record record, @Param("example") Example example){
        try {
			Method updateByExample = mapper.getClass().getDeclaredMethod("updateByExample", record.getClass(), example.getClass());
			Object result = updateByExample.invoke(mapper, record, example);
			return Integer.parseInt(String.valueOf(result));
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return 0;
    }

    /**
     * 根据主键更新记录有效字段
     *
     * @param record
     * @return
     */
    @Override
    public int updateByPrimaryKeySelective(Record record){
       try {
			Method updateByPrimaryKeySelective = mapper.getClass().getDeclaredMethod("updateByPrimaryKeySelective", record.getClass());
			Object result = updateByPrimaryKeySelective.invoke(mapper, record);
			return Integer.parseInt(String.valueOf(result));
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return 0;
    }

    /**
     * 根据主键更新记录，附带BLOB字段
     *
     * @param record
     * @return
     */
    @Override
    public int updateByPrimaryKeyWithBLOBs(Record record){
        try {
			Method updateByPrimaryKeyWithBLOBs = mapper.getClass().getDeclaredMethod("updateByPrimaryKeyWithBLOBs", record.getClass());
			Object result = updateByPrimaryKeyWithBLOBs.invoke(mapper, record);
			return Integer.parseInt(String.valueOf(result));
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return 0;
    }

    /**
     * 根据主键更新记录
     *
     * @param record
     * @return
     */
    @Override
    public int updateByPrimaryKey(Record record){
        try {
			Method updateByPrimaryKey = mapper.getClass().getDeclaredMethod("updateByPrimaryKey", record.getClass());
			Object result = updateByPrimaryKey.invoke(mapper, record);
			return Integer.parseInt(String.valueOf(result));
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return 0;
    }

    /**
     * 根据主键批量删除记录
     *
     * @param ids
     * @return
     */
    @Override
    public int deleteByPrimaryKeys(String ids){
        try {
			if (StringUtils.isBlank(ids)) {
				return 0;
			}
			String[] idArray = ids.split("-");
			int count = 0;
			for (String idStr : idArray) {
				if (StringUtils.isBlank(idStr)) {
					continue;
				}
				Integer id = Integer.parseInt(idStr);
				Method deleteByPrimaryKey = mapper.getClass().getDeclaredMethod("deleteByPrimaryKey", id.getClass());
				Object result = deleteByPrimaryKey.invoke(mapper, id);
				count += Integer.parseInt(String.valueOf(result));
			}
			return count;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return 0;
    
    }

    /**
     * 初始化mapper
     */
    @Override
    public void initMapper(){
        this.mapper = SpringContextUtil.getBean(getMapperClass());
    }
    
    /**
	 * 获取类泛型class
	 * @return
	 */
	public Class<Mapper> getMapperClass() {
		return (Class<Mapper>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
}
