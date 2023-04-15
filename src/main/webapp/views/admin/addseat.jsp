
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Thêm Ghế</title>
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link href="css/manager.css" rel="stylesheet" type="text/css" />
<style>
img {
	width: 200px;
	height: 120px;
}
</style>
<body>

	<div class="modal-dialog">
		<div class="modal-content">
				<form action="addseat" method="post">
				<div class="modal-header">
					<h4 class="modal-title">Thêm Ghế</h4>

				</div>
			<div class="modal-body">
			
						<div class="form-group">
							<label>Tên Ghế</label> <input name="name_seat" type="text"
								class="form-control" required> 
								 <label>Trạng Thái</label> <input name="" type="text" class="form-control"
								 placeholder="Mặc định là ghế trống" readonly="readonly"
								required>
								  <label>Thêm cho phòng </label> <input value="" name="" type="text" class="form-control"
								 placeholder="${sessionScope.room.room_name }" readonly="readonly"
								 
								required>
								<label>ID của phòng là : </label> <input value="${sessionScope.room.id }" name="id_room" type="text" class="form-control"
								 placeholder="${sessionScope.room.id }" readonly="readonly"
								 
								required>

							
						</div>
               
					</div>
				<div class="modal-footer">
				<button class="btn btn-success btn-block" type="submit">
							<i class="fas fa-sign-in-alt"></i> Thêm
						</button>
						<a href="adminRoom" class="btn btn-primary btn-block"> Huỷ </a>
				</div>
				 </form>
				</div>
				
		

		</div>
	</div>


	<script src="js/manager.js" type="text/javascript"></script>
</body>
</html>