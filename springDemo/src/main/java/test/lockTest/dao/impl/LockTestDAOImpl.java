package test.lockTest.dao.impl;

import java.util.ArrayList;
import java.util.List;

import test.lockTest.common.JdbcBaseDao;
import test.lockTest.dao.LockTestDAO;

public class LockTestDAOImpl extends JdbcBaseDao implements LockTestDAO {

	private static final String SQL_UPDATE_PATENT = "update userInfo u set u.age=? where u.id=?";
	
	private static final String SQL_DELETE_PATENT = "delete from userInfo where id=?";

	private static final String SQL_INSERT_PATENT = "insert into userInfo (age,id) values (?,?)";

	@Override
	public void deleteAge(String id) {
		// TODO Auto-generated method stub
		super.execute(SQL_DELETE_PATENT, new Object[]{id});
	}

	@Override
	public void updateAge() {
		// TODO Auto-generated method stub
		List<Object[]> ids = new ArrayList<Object[]>();
		for(int i=0;i<10000;i++)
			ids.add(new Object[]{20,"admin"});
		super.batchUpdate(SQL_UPDATE_PATENT, ids);
	}

	@Override
	public void initDate(int age,String id) {
		// TODO Auto-generated method stub
		super.execute(SQL_INSERT_PATENT, new Object[]{age,id});
	}

}
