<%@ page contentType="text/html; charset=UTF-8" %>

<%@ include file="/WEB-INF/views/common/header.jsp" %>

<div class="card m-2">
	<div class="card-header">
		content.jsp
	</div>
	<div class="card-body">
      <a href="${pageContext.request.contextPath}/exam08/UserJoinController" class="btn btn-info btn-sm">회원가입</a>
      <a href="${pageContext.request.contextPath}/exam08/BoardWriteController" class="btn btn-info btn-sm">게시물 쓰기</a>  
   </div>
</div>

<%@ include file="/WEB-INF/views/common/footer.jsp" %>