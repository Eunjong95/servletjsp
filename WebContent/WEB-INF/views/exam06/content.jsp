<%@ page contentType="text/html; charset=UTF-8" %>

<%@ include file="/WEB-INF/views/common/header.jsp" %>

<div class="card m-2">
	<div class="card-header">
		content.jsp
	</div>
	<div class="card-body">
      <a href="${pageContext.request.contextPath}/exam06/CreateCookieController" class="btn btn-info btn-sm">쿠키 생성 및 설정</a>
      <a href="${pageContext.request.contextPath}/exam06/UseCookieController" class="btn btn-info btn-sm">쿠키 사용</a>
      <hr/>
      <button onclick="readCookie()" class="btn btn-info btn-sm">쿠키 읽기</button> 
      <script>
      	function readCookie() {
      		console.log(document.cookie);
      	}
      </script>
   </div>
</div>


<%@ include file="/WEB-INF/views/common/footer.jsp" %>