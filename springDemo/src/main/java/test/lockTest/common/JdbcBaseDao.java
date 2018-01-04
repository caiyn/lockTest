package test.lockTest.common;

import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;


public class JdbcBaseDao extends JdbcDaoSupport {
	
	protected int execute(String sql, Object[] params){
		return this.getJdbcTemplate().update(sql, params);
	}
	protected int[] batchUpdate(String sql,List<Object[]> batchArgs){
		return this.getJdbcTemplate().batchUpdate(sql, batchArgs);
	}
}
