package com.ooqiu.gaming.server.api.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 文章数据传输对象
 * <p>Title: ArticleDTO</p>
 * <p>Description: </p>
 *
 * @author Lusifer
 * @version 1.0.0
 * @date 2018/3/10 15:32
 */
@Data
public class ArticleDTO implements Serializable {
	/**
	* @Fields serialVersionUID : (用一句话描述这个变量表示什么)
	*/
	private static final long serialVersionUID = -39482916213122167L;
	private long id;
	private String type;
	private String source;
	private String title;
	private String url;
	private String introduction;
	private List<String> cover;
}
