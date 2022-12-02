<%@ page contentType="text/html; charset=UTF-8" %>

<%@ include file="/WEB-INF/views/common/header.jsp" %>

<div class="card m-2">
	<div class="card-header">
		content.jsp
	</div>
	<div class="card-body">
      <a href="${pageContext.request.contextPath}/exam05/HttpHeaderInfoController?param1=value1&param2=value2" class="btn btn-info btn-sm">HTTP 시작행과 헤더행 정보 얻기</a>
      <a href="${pageContext.request.contextPath}/exam05/RequestParaInfoController" class="btn btn-info btn-sm">요청 파라미터 값 얻기</a>
   </div>
</div>


<%@ include file="/WEB-INF/views/common/footer.jsp" %>