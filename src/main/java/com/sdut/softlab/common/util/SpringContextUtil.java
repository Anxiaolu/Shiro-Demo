/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdut.softlab.common.util;

import java.util.Map;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 * @author huanlu
 */
@ComponentScan
public class SpringContextUtil implements ApplicationContextAware{

    private static ApplicationContext context;
    
    @Override
    public void setApplicationContext(ApplicationContext ac) throws BeansException {
        this.context = ac;
    }

    /**
	 * 根据名称获取bean
	 * @param beanName
	 * @return
	 */
	public static Object getBean(String beanName) {
		return context.getBean(beanName);
	}

	/**
	 * 根据bean名称获取指定类型bean
	 * @param beanName bean名称
	 * @param clazz 返回的bean类型,若类型不匹配,将抛出异常
	 */
	public static <T> T getBean(String beanName, Class<T> clazz) {
		return context.getBean(beanName, clazz);
	}
	/**
	 * 根据类型获取bean
	 * @param clazz
	 * @return
	 */
	public static <T> T getBean(Class<T> clazz) {
		T t = null;
		Map<String, T> map = context.getBeansOfType(clazz);
		for (Map.Entry<String, T> entry : map.entrySet()) {
			t = entry.getValue();
		}
		return t;
	}
    
    public static boolean containsBean(String Beans){
        return context.containsBean(Beans);
    }
    
    public static ApplicationContext getApplicationContext(){
        return SpringContextUtil.context;
    }
    
}
