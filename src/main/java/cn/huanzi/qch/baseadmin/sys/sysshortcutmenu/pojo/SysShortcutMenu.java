package cn.huanzi.qch.baseadmin.sys.sysshortcutmenu.pojo;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "sys_shortcut_menu")
public class SysShortcutMenu implements Serializable {
    @Id
    private String shortcutMenuId;//用户快捷菜单id

    private String shortcutMenuName;//用户快捷菜单名称

    private String shortcutMenuPath;//用户快捷菜单路径

    private String userId;//用户id

    private String shortcutMenuParentId;//上级id

    private Date createTime;//创建时间

    private Date updateTime;//修改时间

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

}
