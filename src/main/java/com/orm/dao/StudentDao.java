package com.orm.dao;

import com.orm.entity.Student;
import javax.transaction.Transactional;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class StudentDao {

    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Transactional
    public Long saveStudent(Student student){
        Long output = (Long) this.hibernateTemplate.save(student);
        return output;
    }
}
