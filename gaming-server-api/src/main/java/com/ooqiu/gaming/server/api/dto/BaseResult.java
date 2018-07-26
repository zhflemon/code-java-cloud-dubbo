package com.ooqiu.gaming.server.api.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 自定义数据返回结构体
 * <p>Title: BaseResult</p>
 * <p>Description: </p>
 *
 * @author Lusifer
 * @version 1.0.0
 * @date 2018/3/8 14:33
 */
@Data
public class BaseResult implements Serializable {
	/**
	* @Fields serialVersionUID : (用一句话描述这个变量表示什么)
	*/
	private static final long serialVersionUID = -8920234379372536985L;

	// 状态码
	private int status;

	// 自定义消息
	private String msg;

	// 请求的数据
	private Object data;

	/**
	 * 成功的请求
	 *
	 * @param data
	 * @return
	 */
	public static BaseResult success(Object data) {
		BaseResult baseResult = new BaseResult();
		baseResult.setStatus(200);
		baseResult.setMsg("请求成功");
		baseResult.setData(data);
		return baseResult;
	}

	/**
	 * 失败的请求
	 * @param status 状态码
	 * @param msg 消息
	 * @return
	 */
	public static BaseResult fail(int status, String msg) {
		BaseResult baseResult = new BaseResult();
		baseResult.setStatus(status);
		baseResult.setMsg(msg);
		return baseResult;
	}
}
