<%@ page contentType="text/html; charset=UTF-8"%>

<%@ include file="/WEB-INF/views/common/header.jsp"%>

<div class="card m-2">
	<div class="card-header">content.jsp</div>
	<div class="card-body">
		<form method="post" action="SaveSessionController">
			<div class="form-group">
				<label for="userId">ID</label> 
				<input type="text" class="form-control" id="userId" name="userId"> 
			</div>
			<div class="form-group">
				<label for="userPwd">Password</label> 
				<input type="password" class="form-control" id="userPwd" name="userPwd">
			</div>			
			<button type="submit" class="btn btn-primary">로그인</button>
		</form>
	</div>
</div>

<%@ include file="/WEB-INF/views/common/footer.jsp"%>