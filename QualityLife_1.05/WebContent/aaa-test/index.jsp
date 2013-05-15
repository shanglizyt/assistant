<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<head>
<base href="<%=basePath%>" />
<title>利用DefaultCategoryDataset数据集绘制柱形图</title>
</head>

<body topmargin="0">
	<table width="100%" border="0" cellspacing="0" cellpadding="0">
		<tr>
			<td width="11%"></td>
			<td width="78%"></td>
			<td width="11%"></td>
		</tr>
		<tr>
			<td>&nbsp;</td>
			<td><table width="100%" bgcolor="#99CCFF" border="0"
					cellspacing="0" cellpadding="4">
					<tr>
						<td>&nbsp;</td>
					</tr>
					<tr align="center">
						<td><font size="6" color="#FF3300"><b>利用DefaultCategoryDataset数据集绘制柱形图</b></font></td>
					</tr>
					<tr>
						<td>&nbsp;</td>
					</tr>
					<tr align="center">
						<td><img alt="" src="jfreechart/JFreeChartAction!draw"
							style="margin: auto;"></td>
					</tr>
					<tr>
						<td><img alt="" src="jfc!draw"
							style="margin: auto;"></td>
					</tr>

					<tr align="center">
						<td></td>
					</tr>
					<tr>
						<td></td>
					</tr>
				</table></td>
			<td>&nbsp;</td>
		</tr>
	</table>
</body>

</html>
