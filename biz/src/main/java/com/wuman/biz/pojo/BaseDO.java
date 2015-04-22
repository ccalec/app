package com.wuman.biz.pojo;

public class BaseDO {
	/**
	 * 递增ID
	 */
	protected Integer cid;
	/**
	 * 关联ID
	 */
	protected Integer nodeId;
	/**
	 * 创建时间
	 */
	protected Long addTime;
	/**
	 * 视图别名
	 */
	protected String alias;

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public Integer getNodeId() {
		return nodeId;
	}

	public void setNodeId(Integer nodeId) {
		this.nodeId = nodeId;
	}

	public Long getAddTime() {
		return addTime;
	}

	public void setAddTime(Long addTime) {
		this.addTime = addTime;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

}
