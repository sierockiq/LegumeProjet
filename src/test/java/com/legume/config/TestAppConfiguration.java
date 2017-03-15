package com.legume.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestAppConfiguration {
		public static void main(String[] args) {
			AnnotationConfigApplicationContext context = null;
			try {
				context = new AnnotationConfigApplicationContext(AppConfiguration.class);
				MyApplication application = context.getBean(MyApplication.class);

				application.addLegume();
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				context.close();
			}	    
		}
	}
