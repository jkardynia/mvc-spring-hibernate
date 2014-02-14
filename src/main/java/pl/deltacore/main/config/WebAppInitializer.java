package pl.deltacore.main.config;

import javax.servlet.Filter;

import org.springframework.core.annotation.Order;
import org.springframework.orm.hibernate4.support.OpenSessionInViewFilter;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

@Order(2)
public class WebAppInitializer extends
		AbstractAnnotationConfigDispatcherServletInitializer {

  //{!begin addToRootContext}
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] { CoreConfig.class, HibernateConfig.class };
	}
  //{!end addToRootContext}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { WebConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/*" };
	}
	
	@Override
	protected Filter[] getServletFilters() {
		
		CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
		characterEncodingFilter.setEncoding("UTF-8");
		
		return new Filter[] {characterEncodingFilter};
	}

}
