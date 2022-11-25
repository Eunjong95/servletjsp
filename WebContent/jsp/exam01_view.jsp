<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, dto.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">			
		<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.min.js"></script>		
		<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>	
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
	</head>
	<body>
		<div class="card">
			<div class="card-header">exam01_view.jsp</div>
			<div class="card-body">
				<table class="table table-bordered">
			    <thead>
			      <tr>
			        <th>번호</th>
			        <th>제목</th>
			        <th>내용</th>
			        <th>글쓴이</th>
			        <th>날짜</th>
			      </tr>
			    </thead>
			    <tbody>			      
			      <c:forEach var="board" items="${list}">
			      	<tr>
			    	  <td>${board.bno}</td>
			    	  <td>${board.btitle}</td>
			    	  <td>${board.bcontent}</td>
			    	  <td>${board.bwriter}</td>
			    	  <td>${board.bdate}</td>
			    	</tr> 			    	  			    			    	  
			     </c:forEach> 
			    </tbody>
			  </table>
			</div>			
		</div>
	</body>
</html>