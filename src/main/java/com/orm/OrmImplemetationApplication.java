package com.orm;

import com.orm.dao.StudentDao;
import com.orm.entity.Student;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@EntityScan(basePackages = {"com.orm.entity"})
public class OrmImplemetationApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("configuration.xml");
		StudentDao studentDao = (StudentDao) applicationContext.getBean("studentDao");
		Student student = new Student(1L, "Suvankar", "Virar");
		Long output = studentDao.saveStudent(student);
		System.out.println(output);
	}

}
