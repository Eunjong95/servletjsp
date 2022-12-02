<%@ page contentType="text/html; charset=UTF-8" %>

<%@ include file="/WEB-INF/views/common/header.jsp" %>

<div class="card m-2">
	<div class="card-header">
		content.jsp
	</div>
	<div class="card-body">
      <a href="${pageContext.request.contextPath}/exam07/SaveSessionController" class="btn btn-info btn-sm">세션에 정보 저장하기</a>
      <a href="${pageContext.request.contextPath}/exam07/UseSessionController" class="btn btn-info btn-sm">세션에 저장된 정보 얻기</a>  
      <a href="${pageContext.request.contextPath}/exam07/RemoveSessionController" class="btn btn-info btn-sm">세션에 저장된 정보 삭제하기</a>      
          
   </div>
</div>

<div class="card m-2">
	<div class="card-header">
		Cart에 상품 추가
	</div>
	<div class="card-body">
		<form method="post" action="AddProductToCartController">
	      	상품명: <input type="text" name="productName">
	      	<input type="submit" value="장바구니 넣기" class="btn btn-primary btn-sm"/>
      	</form>
   </div>
</div>

<%@ include file="/WEB-INF/views/common/footer.jsp" %>