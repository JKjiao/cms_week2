<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>审核界面</title>
<!-- 引入 css -->
<link rel="stylesheet" type="text/css" 
href="${pageContext.request.contextPath}/resource/bootstrap.css">
<!-- 引入js -->
<script type="text/javascript" src="${pageContext.request.contextPath}/resource/jquery-3.2.1.js"></script>
</head>
<body>
<div align="center">
	<form id="fid">
		<table class="table">
			<tr>
				<td>关键字</td>
				<td>
					<input type="hidden" value="${yc.id}" name="id">
					<input type="text" value="${yc.keyword}" name="keyword">
				</td>
			</tr>
			<tr>
				<td>提示信息</td>
				<td>
					<input type="text" value="${yc.message}" name="message">
				</td>
			</tr>
			<tr>
				<td>公司名称</td>
				<td>
					<input type="text" value="${yc.company}" name="company">
				</td>
			</tr>
			<tr>
				<td>主营产品</td>
				<td>
					<input type="text" value="${yc.thing}" name="thing">
				</td>
			</tr>
			<tr>
				<td>地址</td>
				<td>
					<input type="text" value="${yc.address}" name="address">
				</td>
			</tr>
			<tr>
				<td>注册资本</td>
				<td>
					<input type="text" value="${yc.registMoney}" name="registMoney">
				</td>
			</tr>
			<tr>
				<td>创建时间</td>
				<td>
					<fmt:formatDate value="${yc.create_time}" pattern="yyyy-MM-dd"/>
				</td>
			</tr>
			<tr>
				<td>年检日期</td>
				<td>
					<input type="date" value="${yc.yearcheck_date}" name="yearcheck_date" pattern="yyyy-MM-dd">
				</td>
			</tr>
			<tr>
				<td>年检状态</td>
				<td>
					<input type="radio" name="yearcheck_date" checked="checked"/>待定
					<input type="radio" name="yearcheck_date" />未年检
					<input type="radio" name="yearcheck_date"/>已年检
				</td>
			</tr>
			<tr>
				<td>备注</td>
				<td>
					<input type="text" value="${yc.ps}" name="ps">
				</td>
			</tr>
			<tr>
				<td colspan="10">
					<input type="button" value="审核" onclick="doCheck()">
				</td>
			</tr>
		</table>
	</form>
</div>
</body>
<script type="text/javascript">
	function doCheck() {
		var data = $("#fid").serialize();
		$.post("/zhangjiaming-seriorFirst-week2/doCheck",data,
				function(obj) {
					alert(JSON.stringify(obj))
					if(obj != null){
						
					}
				},"json")
		
	}
</script>
</html>