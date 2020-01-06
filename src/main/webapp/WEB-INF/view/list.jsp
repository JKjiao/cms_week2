<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>列表查询</title>
<!-- 引入 css -->
<link rel="stylesheet" type="text/css" 
href="${pageContext.request.contextPath}/resource/bootstrap.css">
<!-- 引入js -->
<script type="text/javascript" src="${pageContext.request.contextPath}/resource/jquery-3.2.1.js"></script>
</head>
<body>
<div align="center">
	<form  action="/zhangjiaming-seriorFirst-week2/selectAll" method="post" id="fid" >
		id编号模糊查询：	<input type="text" name="id" value="${vo.id}">
		keywords模糊查询	<input type="text" name="keyword" value="${vo.keyword}"><br>
		message模糊查询	<input type="text" name="message" value="${vo.message}">
		公司名称模糊查询	<input type="text" name="company" value="${vo.company}"><br>
		主营产品模糊查询	<input type="text" name="thing" value="${vo.thing}">
		地址模糊查询		<input type="text" name="address" value="${vo.address}"><br>
		注册资本范围查询	<input type="text" name="startRegistMoney" value="${vo.startRegistMoney}">-<input type="text" name="endRegistMoney" value="${vo.endRegistMoney}">
		成立时间范围查询	<input type="date" name="startCreate_time" value="${vo.startCreate_time}">-<input type="date" name="endCreate_time" value="${vo.endCreate_time}"><br>
		年检日期范围查询	<input type="date" name="startYearcheck_date" value="${vo.startYearcheck_date}">-<input type="date" name="endYearcheck_date" value="${vo.endYearcheck_date}"><br>
	  	年检状态选择查询	<select name="yearcheck_status" id="sid">
							<option value="">所有</option>
						</select> 
		
						<input type="submit" value="查询" class="btn btn-info">
	</form>
</div>
<div align="center">
	<table class="table">
		<tr>
			<td>编号</td>
			<td>关键字</td>
			<td>信息</td>
			<td>公司名称</td>
			<td>主营产品</td>
			<td>地址</td>
			<td>注册资本</td>
			<td>成立时间</td>
			<td>年检日期</td>
			<td>年检状态</td>
			<td>操作</td>			
		</tr>
		<c:forEach items="${info.list}" var="l">
			<tr>
				<td>${l.id}</td>
				<td>${l.keyword}</td>
				<td>${l.message}</td>
				<td>${l.company}</td>
				<td>${l.thing}</td>
				<td>${l.address}</td>
				<td>${l.registMoney}</td>
				<td>
					<fmt:formatDate value="${l.create_time}" pattern="yyyy-MM-dd"/>
				</td>
				<td>
					<fmt:formatDate value="${l.yearcheck_date}" pattern="yyyy-MM-dd"/>
				</td>
				<td>${l.yearcheck_status==0?'未年检':'已年检'}</td>
				<td>${l.ps}</td>
				<td>
					<input type="button" value="年检审核" onclick="toCheck(${l.id})">
				</td>
			</tr>		
		</c:forEach>
		<tr align="center">
			<td colspan="100">
				<jsp:include page="/WEB-INF/pageUtil.jsp"></jsp:include>
			</td>		
		</tr>
	</table>
</div>
</body>
<script type="text/javascript">
	function goPage(page) {
		location.href = "/zhangjiaming-seriorFirst-week2/selectAll?page="+page
	}
	function toCheck(id) {
		location.href = "/zhangjiaming-seriorFirst-week2/toCheck?id="+id
	}
</script>
</html>