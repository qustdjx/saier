package com.hhit.system.service;

import com.hhit.common.domain.Tree;
import com.hhit.system.domain.DeptDO;

import java.util.List;
import java.util.Map;

/**
 * 部门管理

 */
public interface DeptService {
	
	DeptDO get(Long deptId);
	
	List<DeptDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(DeptDO sysDept);
	
	int update(DeptDO sysDept);
	
	int remove(Long deptId);
	
	int batchRemove(Long[] deptIds);

	Tree<DeptDO> getTree();
	
	boolean checkDeptHasUser(Long deptId);
}
