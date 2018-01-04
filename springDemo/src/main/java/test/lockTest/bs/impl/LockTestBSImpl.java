package test.lockTest.bs.impl;

import test.lockTest.bs.LockTestBS;
import test.lockTest.dao.LockTestDAO;

public class LockTestBSImpl implements LockTestBS {

	private LockTestDAO lockTestDAO = null;
	
	@Override
	public void updateAge() {
		// TODO Auto-generated method stub
		System.out.println("更新准备..................");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("更新开始..................");
		lockTestDAO.updateAge();
	}
	
	@Override
	public void initDate() {
		// TODO Auto-generated method stub
		lockTestDAO.initDate(10, "caiyn");
	}
	
	@Override
	public void deleteAge(){
		System.out.println("删除准备..................");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("删除开始..................");
		lockTestDAO.deleteAge("caiyn");
	}
	public LockTestDAO getLockTestDAO() {
		return lockTestDAO;
	}
	public void setLockTestDAO(LockTestDAO lockTestDAO) {
		this.lockTestDAO = lockTestDAO;
	}

}
