package com.lanwan.util.hibernate;

import java.lang.reflect.ParameterizedType;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.Transformers;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.util.Assert;

public class BaseDao<T> extends HibernateDaoSupport {

	private Class<T> entityClass;

	// Log log = LogFactory.getLog(BaseDao.class);

	@SuppressWarnings("unchecked")
	public BaseDao() {
		this.entityClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass())
				.getActualTypeArguments()[0];
	}

	/**
	 * 保存更新对象
	 * 
	 * @param obj
	 */
	public void save(Object obj) {
		this.getHibernateTemplate().save(obj);

	}

	/**
	 * 根据hql查询对象集合
	 * 
	 * @param hql
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<T> find(String hql) {
		return this.getHibernateTemplate().find(hql);

	}

	/**
	 * 根据主键和对象类型查询对象
	 * 
	 * @param id
	 * @param clazz
	 * @return
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public T getEntity(Integer id, Class clazz) {
		return (T) this.getHibernateTemplate().get(clazz, id);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public T getEntity(Long id, Class clazz) {
		return (T) this.getHibernateTemplate().get(clazz, id);
	}

	/**
	 * 根据主键和对象类型查询对象
	 * 
	 * @param id
	 * @param clazz
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public T loadEntity(Integer id, Class clazz) {
		return (T) this.getHibernateTemplate().load(clazz, id);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public T loadEntity(Long id, Class clazz) {
		return (T) this.getHibernateTemplate().load(clazz, id);
	}

	/**
	 * 根据主键和对象类型删除对象
	 * 
	 * @param id
	 * @param clazz
	 */
	@SuppressWarnings("rawtypes")
	public void delete(Integer id, Class clazz) {
		Object obj = this.loadEntity(id, clazz);
		this.getHibernateTemplate().delete(obj);

	}

	@SuppressWarnings("rawtypes")
	public void delete(Long id, Class clazz) {
		Object obj = this.loadEntity(id, clazz);
		this.getHibernateTemplate().delete(obj);

	}

	public Collection<?> findCollection(BaseCondition condition) throws Exception {
		Collection<?> result = null;
		/**
		 * 从condition中获取Query， 需要自己调用session.createQuery方法，并将占位符等条件拼装好
		 */
		Query query = condition.getQuery();
		// 设置查询结果封装bean，用于多表连查，封装各表中查出的属性
		if (condition.getBasebean() != null) {
			query.setResultTransformer(Transformers.aliasToBean(condition.getBasebean()));
		}
		if (query != null) {
			result = query.list();
		} else {
			System.out.println("query为Null值，hql拼写有误。");
		}
		return result;
	}

	/**
	 * 得到Query的通用方法
	 * 
	 * @param hql
	 * @return
	 */
	public Query createQuery(String hql) {
		Query query = this.getSession().createQuery(hql);
		return query;
	}

	/**
	 * 得到sql Query的通用方法，用于多表查询
	 * 
	 * @param sql
	 * @return
	 */
	public SQLQuery createSQLQuery(String sql) {
		SQLQuery query = this.getSession().createSQLQuery(sql);
		return query;
	}

	/**
	 * 分页查询query,conditon中的firstResult和maxResult需要赋值
	 * 
	 * @param hql
	 * @param conditon
	 * @return
	 */
	public Query createQuery(String hql, BasePageCondition conditon) {
//		Query query = this.getSession().createQuery(hql).setFirstResult(conditon.getStart())
//				.setMaxResults(conditon.getPageline());
//		return query;
		return null;
	}

	/**
	 * 根据obj的主键是否为空自动选择保存或更新
	 * 
	 * @param obj
	 */
	public void saveOrUpdate(Object obj)

	{
		this.getHibernateTemplate().saveOrUpdate(obj);
	}

	/**
	 * 根据obj的主键是否为空自动选择保存或更新
	 * 
	 * @param obj
	 */
	public void saveOrUpdateSefCommit(Object obj)

	{
		Session s = this.getSession();
		Transaction tx = s.beginTransaction();
		s.saveOrUpdate(obj);
		tx.commit();
		s.flush();
		s.clear();

	}

	public void mergerSefCommit(Object obj)

	{
		Session s = this.getSession();
		Transaction tx = s.beginTransaction();
		s.merge(obj);
		tx.commit();
		s.flush();
		s.clear();

	}

	/**
	 * 批量保存
	 * 
	 * @param objList
	 * @date Nov 26, 2013
	 */
	public void saveBatchSefCommit(List<T> objList) {
		Session s = this.getSession();
		Transaction tx = s.beginTransaction();
		for (T obj : objList) {
			s.save(obj);
		}
		tx.commit();
		s.flush();// 强制提交事物
		s.clear();// 同步缓存

	}

	/**
	 * 批量保存或修改
	 * 
	 * @param objList
	 * @date Nov 26, 2013
	 */
	public void saveUpdateBatchSefCommit(List<T> objList) {
		Session s = this.getSession();
		Transaction tx = s.beginTransaction();
		for (T obj : objList) {
			s.saveOrUpdate(obj);
		}
		tx.commit();
		s.flush();// 强制提交事物
		s.clear();// 同步缓存

	}

	/**
	 * 按HQL查询唯一对象.
	 * 
	 * @param values
	 *            数量可变的参数,按顺序绑定.
	 */
	@SuppressWarnings("unchecked")
	public T findUnique(final String hql, final Object... values) {
		return (T) createQuery(hql, values).uniqueResult();
	}

	/**
	 * 按属性查找唯一对象,匹配方式为相等.
	 */
	@SuppressWarnings("unchecked")
	public T findByUnique(final String propertyName, final Object value) {
		Assert.hasText(propertyName, "propertyName不能为空");
		Criterion criterion = Restrictions.eq(propertyName, value);
		return (T) createCriteria(criterion).uniqueResult();
	}

	/**
	 * 按HQL查询唯一对象.
	 * 
	 * @param values
	 *            命名参数,按名称绑定.
	 */
	@SuppressWarnings("unchecked")
	public T findUnique(final String hql, final Map<String, Object> values) {
		return (T) createQuery(hql, values).uniqueResult();
	}

	/**
	 * 根据查询HQL与参数列表创建Query对象.
	 * 
	 * 本类封装的find()函数全部默认返回对象类型为T,当不为T时使用本函数.
	 * 
	 * @param values
	 *            数量可变的参数,按顺序绑定.
	 */
	public Query createQuery(final String queryString, final Object... values) {
		Assert.hasText(queryString, "queryString不能为空");
		Query query = getSession().createQuery(queryString);
		if (values != null) {
			for (int i = 0; i < values.length; i++) {
				query.setParameter(i, values[i]);
			}
		}
		return query;
	}

	/**
	 * 根据查询HQL与参数列表创建Query对象.
	 * 
	 * @param values
	 *            命名参数,按名称绑定.
	 */
	public Query createQuery(final String queryString, final Map<String, Object> values) {
		Assert.hasText(queryString, "queryString不能为空");
		Query query = getSession().createQuery(queryString);
		if (values != null) {
			query.setProperties(values);
		}
		return query;
	}

	/**
	 * 根据Criterion条件创建Criteria.
	 * 
	 * 本类封装的find()函数全部默认返回对象类型为T,当不为T时使用本函数.
	 * 
	 * @param criterions
	 *            数量可变的Criterion.
	 */
	public Criteria createCriteria(final Criterion... criterions) {

		Criteria criteria = getSession().createCriteria(entityClass);
		for (Criterion c : criterions) {
			criteria.add(c);
		}
		return criteria;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<T> findByCriteria(final Criterion... criterion) {
		List<T> list = (List<T>) getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				Criteria criteria = session.createCriteria(entityClass);
				for (Criterion c : criterion) {
					criteria.add(c);
				}
				return criteria.list();
			}
		});
		return list;
	}

	@SuppressWarnings("unchecked")
	public List<T> findAll() {

		return this.createQuery("from " + entityClass.getName()).list();
	}

	public Long findByPage(String hql) {

		Query q = createQuery(hql);
		return (Long) q.uniqueResult();
	}

	public List<T> findByPage(String hql, PageBean pageBean) {

//		Query q = createQuery(hql).setFirstResult(pageBean.getBegin())
//				.setMaxResults(Integer.parseInt(pageBean.getPageline()));
//		return q.list();
		return null;
	}

	public boolean deleteEntityByIds(Integer[] ids) {
		boolean temp = true;
		if (ids == null || ids.length == 0) {
			return true;
		}
		StringBuffer sb = new StringBuffer("(");
		for (Integer id : ids) {
			sb.append(id).append(",");
		}
		if (sb.length() > 1) {
			sb.deleteCharAt(sb.length() - 1).append(")");
		}
		try {
			Session session = this.getSession();
			String hql = "delete from  " + entityClass.getName() + " o where o.id in" + sb.toString();
			// System.out.println(hql);
			session.createQuery(hql).executeUpdate();
			session.clear();
		} catch (Exception e) {
			// log.error(e.getMessage());
			temp = false;
		}
		return temp;
	}

	public boolean executeHQL(String hql) {
		boolean temp = true;

		try {
			Session session = this.getSession();
			Transaction tx = session.beginTransaction();
			session.createQuery(hql).executeUpdate();
			tx.commit();
			session.clear();
		} catch (Exception e) {
			// log.error(e.getMessage());
			temp = false;
		}
		return temp;
	}

	public boolean deleteEntityByIds(Long[] ids) {
		boolean temp = true;
		if (ids == null || ids.length == 0) {
			return true;
		}
		StringBuffer sb = new StringBuffer("(");
		for (Long id : ids) {
			sb.append(id).append(",");
		}
		if (sb.length() > 1) {
			sb.deleteCharAt(sb.length() - 1).append(")");
		}
		try {
			Session session = this.getSession();
			String hql = "delete from  " + entityClass.getName() + " o where o.id in" + sb.toString();
			// System.out.println(hql);
			session.createQuery(hql).executeUpdate();
			session.clear();
		} catch (Exception e) {
			// log.error(e.getMessage());
			temp = false;
		}
		return temp;
	}

	// 逻辑删除，更新表中的enable列为0
	public boolean logicalDeleteEntityByIds(Integer[] ids) {
		boolean temp = true;
		if (ids == null || ids.length == 0) {
			return true;
		}
		StringBuffer sb = new StringBuffer("(");
		for (Integer id : ids) {
			sb.append(id).append(",");
		}
		if (sb.length() > 1) {
			sb.deleteCharAt(sb.length() - 1).append(")");
		}
		try {
			Session session = this.getSession();
			String hql = "update  " + entityClass.getName() + " o set o.enable=0 where o.id in" + sb.toString();
			// System.out.println(hql);
			session.createQuery(hql).executeUpdate();
			session.clear();
		} catch (Exception e) {
			// log.error(e.getMessage());
			temp = false;
		}
		return temp;
	}

	// 逻辑删除，更新表中的enable列为0同时更新日期为当前时间
	public boolean logicalDeleteEntityByIdsWithUpdateTime(Integer[] ids) {
		boolean temp = true;
		if (ids == null || ids.length == 0) {
			return true;
		}
		StringBuffer sb = new StringBuffer("(");
		for (Integer id : ids) {
			sb.append(id).append(",");
		}
		if (sb.length() > 1) {
			sb.deleteCharAt(sb.length() - 1).append(")");
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		try {
			Session session = this.getSession();
			String hql = "update  " + entityClass.getName() + " o set o.enable=0,o.updateTime='"
					+ sdf.format(new Date(System.currentTimeMillis())) + "' where o.id in" + sb.toString();
			// System.out.println(hql);
			session.createQuery(hql).executeUpdate();
			session.clear();
		} catch (Exception e) {
			// log.error(e.getMessage());
			temp = false;
		}
		return temp;
	}

	public Class<T> getEntityClass() {
		return entityClass;
	}

	public void setEntityClass(Class<T> entityClass) {
		this.entityClass = entityClass;
	}

}
