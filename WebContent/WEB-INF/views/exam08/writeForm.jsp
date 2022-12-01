<%@ page contentType="text/html; charset=UTF-8"%>

<%@ include file="/WEB-INF/views/common/header.jsp"%>

<div class="card m-2">
	<div class="card-header">content.jsp</div>
	<div class="card-body">
		<form method="post" action="BoardWriteController">
			<div class="form-group">
				<label for="btitle">Title</label> 
				<input type="text" class="form-control" id="btitle" name="btitle"> 
			</div>
			<div class="form-group">
				<label for="bcontent">Content</label> 
				<textarea rows="5" cols="50" name="bcontent"></textarea>
			</div>
			<button type="submit" class="btn btn-primary">게시물 쓰기</button>
		</form>
	</div>
</div>

<%@ include file="/WEB-INF/views/common/footer.jsp"%>