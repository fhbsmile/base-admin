package cn.huanzi.qch.baseadmin.sys.sysuserauthority.vo;

import cn.huanzi.qch.baseadmin.common.pojo.PageCondition;
import cn.huanzi.qch.baseadmin.sys.sysauthority.vo.SysAuthorityVo;
import cn.huanzi.qch.baseadmin.sys.sysuser.vo.SysUserVo;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

//@Data
public class SysUserAuthorityVo extends PageCondition implements Serializable {
    private String userAuthorityId;//用户权限表id

    private String userId;//用户id

    private String authorityId;//权限id

    private SysUserVo sysUser;//用户

    private SysAuthorityVo sysAuthority;//权限

    private Date createTime;//创建时间

    private Date updateTime;//修改时间

    private String authorityIdList;//新增、修改用户权限时权限id集合

	public String getUserAuthorityId() {
		return userAuthorityId;
	}

	public void setUserAuthorityId(String userAuthorityId) {
		this.userAuthorityId = userAuthorityId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAuthorityId() {
		return authorityId;
	}

	public void setAuthorityId(String authorityId) {
		this.authorityId = authorityId;
	}

	public SysUserVo getSysUser() {
		return sysUser;
	}

	public void setSysUser(SysUserVo sysUser) {
		this.sysUser = sysUser;
	}

	public SysAuthorityVo getSysAuthority() {
		return sysAuthority;
	}

	public void setSysAuthority(SysAuthorityVo sysAuthority) {
		this.sysAuthority = sysAuthority;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getAuthorityIdList() {
		return authorityIdList;
	}

	public void setAuthorityIdList(String authorityIdList) {
		this.authorityIdList = authorityIdList;
	}
    
    
}
