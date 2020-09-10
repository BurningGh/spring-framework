package org.springframework.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;
import org.springframework.stereotype.Component;

import java.beans.PropertyDescriptor;

/**
 * @author dengwj3
 * @email wenjian.deng@midea.com
 * @date 2020/7/13
 */
@Component
public class TestBeanFactoryPostProcessor implements InstantiationAwareBeanPostProcessor {
	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		if("ADO".equals(beanName)){
			System.out.println("ADO postProcessBeforeInstantiation");
		}
		return null;
	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		if("ADO".equals(beanName)){
			System.out.println("ADO postProcessAfterInstantiation");
		}
		return false;
	}

	@Override
	public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
		if("ADO".equals(beanName)){
			System.out.println("ADO postProcessAfterInstantiation");
		}
		return null;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if("ADO".equals(beanName)){
			System.out.println("ADO postProcessBeforeInitialization");
		}
		return null;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if("ADO".equals(beanName)){
			System.out.println("ADO postProcessAfterInitialization");
		}
		return null;
	}
}
