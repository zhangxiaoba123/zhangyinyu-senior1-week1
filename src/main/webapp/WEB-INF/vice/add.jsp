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
<table>
	<tr>
		<td>商品名称</td>
		<td>
			<input type="text" name="name">
		</td>
	</tr>
	<tr>
		<td>英文名称</td>
		<td>
			<input type="text" name="name1">
		</td>
	</tr>
	<tr>
		<td>商品品牌</td>
		<td>
			<input type="text" name="bname">
		</td>
	</tr>
	<tr>
		<td>商品种类</td>
		<td>
			<input type="text" name="tname">
		</td>
	</tr>
	<tr>
		<td>尺寸</td>
		<td>
			<input type="text" name="measure">
		</td>
	</tr>
	<tr>
		<td>数量</td>
		<td>
			<input type="text" name="num">
		</td>
	</tr>
	<tr>
		<td>标签</td>
		<td>
			<input type="text" name="label">
		</td>
	</tr>
	<tr>
		<td>商品图片</td>
		<td>
			<input type="text" name="pic">
		</td>
	</tr>
	<tr>
		<td></td>
		<td>
			<input type="submit" value="提交" onclick="tj()">
		</td>
	</tr>
</table>
</body>
</html>