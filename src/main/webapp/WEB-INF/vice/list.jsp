<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/resource/css/index3.css"/>
<script type="text/javascript" src="/resource/js/jquery-1.8.3.min.js"></script>
<script type="text/javascript"></script>
</head>
<body>
<form action="/selects" method="post">
	<input type="hidden" name="pageNum">
	<input type="submit" value="添加" onclick="add()">
	种类:<input type="text" name="tname">
	品牌:<input type="text" name="bname">
	单价范围:<input type="text" name="p1">
	-<input type="text" name="p2">
	商品名称:<input type="text" name="name">
	<button>搜索</button>
</form>
<table>
	<tr>
		<td>商品编号</td>
		<td>商品名称</td>
		<td>英文名称</td>
		<td>商品品牌</td>
		<td>商品种类</td>
		<td>尺寸</td>
		<td>单价</td>
		<td>数量</td>
		<td>标签</td>
		<td>商品图片上传</td>
	</tr>
	<c:forEach items="${page.list}" var="c" varStatus="count">
		<tr>
			<td>${count.count+pageStartrow-1}</td>
			<td>${c.name}</td>
			<td>${c.name1}</td>
			<td>${c.bname}</td>
			<td>${c.tname}</td>
			<td>${c.price}</td>
			<td>${c.measure}</td>
			<td>${c.num}</td>
			<td>${c.label}</td>
			<td>${c.pic}</td>
		</tr>
	</c:forEach>
	<tr>
		<td>
			<button onclick="fenye(1)">首页</button>
			<button onclick="fenye(${page.prePage==0?1:page.prePage})">上一页</button>
			<button onclick="fenye(${page.nextPage==0?page.pages:nextPage})">下一页</button>
			<button onclick="fenye(${page.pages})">尾页</button>
			当前${page.pageNum}/${page.pages}页，共${page.total}条
		</td>
	</tr>
</table>
</body>
</html>