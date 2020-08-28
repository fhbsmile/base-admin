package cn.huanzi.qch.baseadmin.sys.sysusermenu.vo;

import cn.huanzi.qch.baseadmin.common.pojo.PageCondition;
import cn.huanzi.qch.baseadmin.sys.sysmenu.vo.SysMenuVo;
import cn.huanzi.qch.baseadmin.sys.sysuser.vo.SysUserVo;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

//@Data
public class SysUserMenuVo extends PageCondition implements Serializable {
    private String userMenuId;//用户菜单表id

    private String userId;//用户id

    private String menuId;//菜单id

    private SysUserVo sysUser;//用户

    private SysMenuVo sysMenu;//菜单

    private Date createTime;//创建时间

    private Date updateTime;//修改时间

    private String menuIdList;////新增、修改用户菜单时菜单id集合

	public String getUserMenuId() {
		return userMenuId;
	}

	public void setUserMenuId(String userMenuId) {
		this.userMenuId = userMenuId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getMenuId() {
		return menuId;
	}

	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}

	public SysUserVo getSysUser() {
		return sysUser;
	}

	public void setSysUser(SysUserVo sysUser) {
		this.sysUser = sysUser;
	}

	public SysMenuVo getSysMenu() {
		return sysMenu;
	}

	public void setSysMenu(SysMenuVo sysMenu) {
		this.sysMenu = sysMenu;
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

	public String getMenuIdList() {
		return menuIdList;
	}

	public void setMenuIdList(String menuIdList) {
		this.menuIdList = menuIdList;
	}
    
    
}
