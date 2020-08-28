package cn.huanzi.qch.baseadmin.sys.sysshortcutmenu.vo;

import cn.huanzi.qch.baseadmin.common.pojo.PageCondition;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//@Data
public class SysShortcutMenuVo extends PageCondition implements Serializable {
    private String shortcutMenuId;//用户快捷菜单id

    private String shortcutMenuName;//用户快捷菜单名称

    private String shortcutMenuPath;//用户快捷菜单路径

    private String userId;//用户id

    private String shortcutMenuParentId;//上级id

    private Date createTime;//创建时间

    private Date updateTime;//修改时间

    private List<SysShortcutMenuVo> children = new ArrayList<>();//如果是父类，这里存孩子节点

	public String getShortcutMenuId() {
		return shortcutMenuId;
	}

	public void setShortcutMenuId(String shortcutMenuId) {
		this.shortcutMenuId = shortcutMenuId;
	}

	public String getShortcutMenuName() {
		return shortcutMenuName;
	}

	public void setShortcutMenuName(String shortcutMenuName) {
		this.shortcutMenuName = shortcutMenuName;
	}

	public String getShortcutMenuPath() {
		return shortcutMenuPath;
	}

	public void setShortcutMenuPath(String shortcutMenuPath) {
		this.shortcutMenuPath = shortcutMenuPath;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getShortcutMenuParentId() {
		return shortcutMenuParentId;
	}

	public void setShortcutMenuParentId(String shortcutMenuParentId) {
		this.shortcutMenuParentId = shortcutMenuParentId;
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

	public List<SysShortcutMenuVo> getChildren() {
		return children;
	}

	public void setChildren(List<SysShortcutMenuVo> children) {
		this.children = children;
	}
    
    
}
