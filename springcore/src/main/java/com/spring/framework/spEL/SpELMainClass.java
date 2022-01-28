package com.spring.framework.spEL;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class SpELMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Config-SpEL.xml");

       SpEL spEL =context.getBean("spEL",SpEL.class);
       System.out.println(spEL);
       SpelExpressionParser expressionParser = new SpelExpressionParser();
       Expression expression= expressionParser.parseExpression("3+8");
       System.out.println(expression.getValue());
	}

}
