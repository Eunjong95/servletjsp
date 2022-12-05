<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ include file="/WEB-INF/views/common/header.jsp" %>

<div class="card m-2">
	<div class="card-header">
		게시물 보기
	</div>
	<div class="card-body">
      <div>
         <div>
            <div>
               <p>
                  <span>번호:</span> 
                  <span>${board.bno}</span>
               </p>
               
               <p>
                  <span>제목:</span> 
                  <span>${board.btitle}</span>
               </p>
               
               <p>
                  <span>글쓴이:</span> 
                  <span>${board.bwriter}</span>
               <p>
               <p>
                  <span>조회수:</span> 
                  <span>${board.bhitcount}</span>
               <p>
               <p>
                  <span>날짜:</span> 
                  <span><fmt:formatDate value="${board.bdate}" pattern="yyyy-MM-dd HH.mm.ss"/></span> <br/>
               </p>    
               <c:if test="${board.bfileName!=null}">
	                <p>
	                  <span>첨부:</span> 
	                  <span>
	                  	<a href="DownloadAttachController?bno=${board.bno}">
	                  		<img src="DownloadAttachController?bno=${board.bno}" width="100">
	                  	</a>
	                  </span> <br/>
	               </p>    
               </c:if>          
            </div>
            
            <div>
               <span class="title">내용:</span> <br/>
               <textarea style="width:100%" readonly>${board.bcontent}</textarea>
            </div>
            
            <a class="btn btn-info btn-sm mt-2" href="ContentController">목록</a>
            <a class="btn btn-info btn-sm mt-2" href="#">수정</a>
            <a class="btn btn-info btn-sm mt-2" href="#">삭제</a>
            
         </div>
      </div>
	</div>	
</div>

<%@ include file="/WEB-INF/views/common/footer.jsp" %>