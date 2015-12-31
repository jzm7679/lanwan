package com.lanwan.util.hibernate;

import org.hibernate.Query;

public class BaseCondition {
	/**
	 * Hibernate query
	 */
	private Query query;

	/**
	 * 查询结果封装bean
	 */
	private Class<? extends BaseBean> basebean;

	public Query getQuery() {
		return query;
	}

	public void setQuery(Query query) {
		this.query = query;
	}

	public Class<? extends BaseBean> getBasebean() {
		return basebean;
	}

	public void setBasebean(Class<? extends BaseBean> basebean) {
		this.basebean = basebean;
	}
}
