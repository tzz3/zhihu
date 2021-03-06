package com.zhihu.dao.impl;

import com.zhihu.dao.QuestionDao;
import com.zhihu.pojo.Question;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author tzz
 * @Package com.zhihu.dao.impl
 * @Name QuestionDaoImpl
 */
@Repository
public class QuestionDaoImpl implements QuestionDao {
    @Resource
    private SessionFactory sessionFactory;


    @Override
    public List<Question> findAll() {
        String hql = "from Question q order by q.id";
        return sessionFactory.getCurrentSession().createQuery(hql, Question.class).getResultList();
    }

    @Override
    public void addQuestion(Question question) {
        sessionFactory.getCurrentSession().persist(question);
    }

    @Override
    public List<Question> findByLike(String qTitle) {
        String hql = "from Question q where q.qTitle like :qTitle";
        return sessionFactory.getCurrentSession().createQuery(hql, Question.class).setParameter("qTitle", "%" + qTitle + "%").getResultList();
    }

    @Override
    public List<Question> findByLike2(String qName) {
        String hql = "from Question q where q.qTitle like :qName";

        return sessionFactory.getCurrentSession().createQuery(hql,Question.class).setParameter("qName","%"+qName+"%").getResultList();
    }

    @Override
    public Question findQuestion(String id) {
        String hql = "from Question q where q.id=:id";
        return sessionFactory.getCurrentSession().createQuery(hql,Question.class).setParameter("id",id).uniqueResult();
    }
}
