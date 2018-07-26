package com.ooqiu.gaming.server.web.admin.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 前端树控件
 * <p>Title: TreeView</p>
 * <p>Description: </p>
 *
 * @author Lusifer
 * @version 1.0.0
 * @date 2018/3/2 9:19
 */
@Data
public class TreeView implements Serializable {
	/**
	* @Fields serialVersionUID : (用一句话描述这个变量表示什么)
	*/
	private static final long serialVersionUID = 844380268391149550L;
	private String id;
	private String icon;
	private String text;
	private boolean children;
}
