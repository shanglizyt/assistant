<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<!-- 标题列表 -->
		<s:iterator value="pageBean_changshiList">
			<tr>
				<td colspan="4"><s:property value="title" /></td>
			</tr>
		</s:iterator>
		<tr>
			<td width="13%" class="tocenter">共 <s:property value="pageBean.totalPage" /> 页</td>
			<td width="17%" class="tocenter">共 <s:property value="pageBean.allRow" /> 条记录</td>
			<td width="15%" class="tocenter">当前第 <s:property value="pageBean.currentPage" /> 页</td>
			<td colspan="4" width="55%" class="tocenter">
				<s:if test="%{pageBean.currentPage == 1}">第一页&nbsp;&nbsp;&nbsp;&nbsp;上一页&nbsp;&nbsp;&nbsp;&nbsp;</s:if> 
				<s:else>
					<a href="commen!changshiList?page=1">第一页&nbsp;&nbsp;&nbsp;&nbsp;</a>
					<a href="commen!changshiList?page=<s:property value="%{pageBean.currentPage-1}"/>">上一页&nbsp;&nbsp;&nbsp;&nbsp;</a>
				</s:else> 
				<s:if test="%{pageBean.currentPage != pageBean.totalPage}">
					<a href="commen!changshiList?page=<s:property value="%{pageBean.currentPage+1}"/>">下一页&nbsp;&nbsp;&nbsp;&nbsp;</a>
					<a href="commen!changshiList?page=<s:property value="pageBean.totalPage"/>">最后一页</a>
				</s:if> 
				<s:else>下一页&nbsp;&nbsp;&nbsp;&nbsp; 最后一页</s:else>
			</td>
		</tr>
	</table>
</body>
</html>