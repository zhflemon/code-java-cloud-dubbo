package com.ooqiu.gaming.server.web.admin.dto;

import java.io.Serializable;
import java.util.List;

import com.github.pagehelper.PageInfo;

import lombok.Data;

/**
 * 前端数据表格
 * <p>Title: DataTable</p>
 * <p>Description: </p>
 *
 * @author Lusifer
 * @version 1.0.0
 * @date 2018/3/2 14:26
 */
@Data
public class DataTable<T> implements Serializable {
	/**
	* @Fields serialVersionUID : (用一句话描述这个变量表示什么)
	*/
	private static final long serialVersionUID = 6321314052604337773L;
	private Meta meta;
	private List<T> data;

	public DataTable(PageInfo<T> pageInfo) {
		data = pageInfo.getList();

		meta = new Meta();
		meta.setPage(pageInfo.getPageNum());
		meta.setPerpage(pageInfo.getPageSize());
		meta.setPages(pageInfo.getPages());
		meta.setTotal(pageInfo.getTotal());
	}

	@Data
	class Meta {
		/**
		 * 页码
		 */
		private int page;

		/**
		 * 总页数
		 */
		private int pages;

		/**
		 * 笔数
		 */
		private int perpage;

		/**
		 * 总笔数
		 */
		private long total;
		private String sort;
		private String field;
	}
}
