/**
 * <pre>项目名称:easyui_dome
 * 文件名称:SendPage.java
 * 包名:com.jk.pojo
 * 创建日期:2018-11-29下午1:34:17
 * Copyright (c) 2018, All Rights Reserved.</pre>
 */
package com.jk.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * <pre>项目名称：easyui_dome
 * 类名称：SendPage
 * 类描述：
 * 创建人：薛正航
 * 创建时间：2018-11-29 下午1:34:17
 * 修改人：薛正航
 * 修改时间：2018-11-29 下午1:34:17
 * 修改备注：
 * @version </pre>
 */
@Data
@AllArgsConstructor//全部参数的构造方法
@NoArgsConstructor//一定要写无参的构造方法
public class SendPage {

    private Integer total;

    private List rows;

}