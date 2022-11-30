<%@ page contentType="text/html; charset=UTF-8"%>

<%@ include file="/WEB-INF/views/common/header.jsp"%>

<div class="card m-2">
	<div class="card-header">requestParaInfo.jsp</div>
	<div class="card-body">
		<a href="ParaController?pageNo=5&kind=freeboard&writer=winter&hobby=book&hobby=game" class="btn btn-info btn-sm">Get 방식으로 전달</a>
		<hr />
		<form method="post" action="ParaController" novalidate>
			<div class="form-group">
				<label for="email">Email:</label> 
					<input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
			</div>
			<div class="form-group">
				<label for="pwd">Password:</label> 
					<input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pwd">
			</div>

			<div class="form-group">
				<div>hobby:</div>
				<div class="form-check-inline">
					<label class="form-check-label"> 
						<input class="form-check-input" type="checkbox" name="hobby" value="music" checked> 음악감상
					</label>
				</div>
				<div class="form-check-inline">
					<label class="form-check-label"> 
						<input class="form-check-input" type="checkbox" name="hobby" value="book"> 독서
					</label>
				</div>
				<div class="form-check-inline">
					<label class="form-check-label"> 
						<input class="form-check-input" type="checkbox" name="hobby" value="game"> 게임
					</label>
				</div>
			</div>

			<div class="form-group">
				<div>job:</div>
				<div class="form-check-inline">
					<label class="form-check-label"> 
						<input type="radio" class="form-check-input" name="job" value="developer" checked> 개발자
					</label>
				</div>
				<div class="form-check-inline">
					<label class="form-check-label"> 
						<input type="radio" class="form-check-input" name="job" value="president"> 대통령
					</label>
				</div>
				<div class="form-check-inline disabled">
					<label class="form-check-label"> 
						<input type="radio" class="form-check-input" name="job" value="supervisor"> 사장
					</label>
				</div>
			</div>
			
			<div class="form-group">
			  <label for="sel1">거주 도시:</label>
			  <select class="form-control" id="city" name="city">
			    <option value="seoul">서울</option>
			    <option value="suwon" selected>수원</option>
			    <option value="jeju">제주</option>
			  </select>
			</div>
			<button type="submit" class="btn btn-primary">Post 방식으로 전달</button>
		</form>
		
		<hr/>
		
		<form method="post" enctype="multipart/form-data" action="FileUploadController">
		<div class="form-group">
			<label for="title">Title:</label> 
			<input type="text" class="form-control" id="title" placeholder="Enter Title" name="title">
		</div>
		<div class="form-group">
			<label for="desc">Desc:</label> 
			<input type="text" class="form-control" id="desc" placeholder="Enter Desc" name="desc">
		</div>
		  <div class="form-group">
		    <label for="attachment">Attachment:</label>
				<input type="file" class="form-control-file" id="attachment1" name="attachment1">
				<input type="file" class="form-control-file" id="attachment2" name="attachment2">
				<input type="file" class="form-control-file" id="attachment3" name="attachment3">
		  </div>
		  <button type="submit" class="btn btn-danger">Post 방식/멀티 파트로 전달</button>
		</form>
	</div>
</div>


<%@ include file="/WEB-INF/views/common/footer.jsp"%>