package cn.huanzi.qch.baseadmin.sys.syssetting.pojo;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "sys_setting")

public class SysSetting implements Serializable {
    @Id
    private String id;//表id

    private String sysName;//系统名称

    private String sysLogo;//系统logo图标

    private String sysBottomText;//系统底部信息

    private String sysColor;//系统颜色

    private String sysNoticeText;//系统公告

    private String sysApiEncrypt;//API加密 Y/N

    private Date createTime;//创建时间

    private Date updateTime;//修改时间

    private String userInitPassword;//用户管理：初始、重置密码

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSysName() {
		return sysName;
	}

	public void setSysName(String sysName) {
		this.sysName = sysName;
	}

	public String getSysLogo() {
		return sysLogo;
	}

	public void setSysLogo(String sysLogo) {
		this.sysLogo = sysLogo;
	}

	public String getSysBottomText() {
		return sysBottomText;
	}

	public void setSysBottomText(String sysBottomText) {
		this.sysBottomText = sysBottomText;
	}

	public String getSysColor() {
		return sysColor;
	}

	public void setSysColor(String sysColor) {
		this.sysColor = sysColor;
	}

	public String getSysNoticeText() {
		return sysNoticeText;
	}

	public void setSysNoticeText(String sysNoticeText) {
		this.sysNoticeText = sysNoticeText;
	}

	public String getSysApiEncrypt() {
		return sysApiEncrypt;
	}

	public void setSysApiEncrypt(String sysApiEncrypt) {
		this.sysApiEncrypt = sysApiEncrypt;
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

	public String getUserInitPassword() {
		return userInitPassword;
	}

	public void setUserInitPassword(String userInitPassword) {
		this.userInitPassword = userInitPassword;
	}

}
