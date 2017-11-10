package com.wjl.common.pojo;

import java.util.List;
/**
 * 这是查询tb_item的结果
 * @author wujiale
 * 2017-10-15 下午10:28:03
 */
public class ListResult {
	private Long total;
	private List<?> rows;

	public ListResult() {
	}

	public ListResult(Long total, List<?> rows) {
		super();
		this.total = total;
		this.rows = rows;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List<?> getRows() {
		return rows;
	}

	public void setRows(List<?> rows) {
		this.rows = rows;
	}

}
