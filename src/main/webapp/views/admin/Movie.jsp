
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Quản lý phim</title>
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
	<div class="container">
		<div class="table-wrapper">
			<div class="table-title">
				<div class="row">
					<div class="col-sm-6">
						<h2>
							<b>Quản lý phim</b>
						</h2>
					</div>
					<div class="col-sm-6">
						<a href="#addEmployeeModal" class="btn btn-success"
							data-toggle="modal"><i class="material-icons">&#xE147;</i> <span>Thêm
								mới</span></a>

					</div>
				</div>
			</div>
			<table class="table table-striped table-hover">
				<thead>
					<tr>
						<th><span class="custom-checkbox"> <input
								type="checkbox" id="selectAll"> <label for="selectAll"></label>
						</span></th>
						<th>ID</th>
						<th>Tên Phim</th>
						<th>Ảnh Minh Hoạ</th>
						<th>Thời Lượng</th>
						<th>Thao Tác</th> 
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${listmovie}" var="o">
						<tr>
							<td><span class="custom-checkbox"> STT </label>
							</span></td>
							<td>${o.id}</td>
							<td>${o.tittle}</td>
							<td><img width="50px" height="70px" src="${o.image}">
							</td>
							<td>${o.total_time} phút</td>
							<td><a href="editmovie?mid=${o.id }" class="edit"
								data-toggle="modal"><i class="material-icons"
									data-toggle="tooltip" title="Edit">&#xE254;</i></a> <a
								href="delete?mid=${o.id}" class="delete" data-toggle="modal"><i
									class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i></a>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<div class="clearfix">
				
				<ul class="pagination">
					<li class="page-item disabled"><a href="#">trước</a></li>
					<li class="page-item"><a href="#" class="page-link">1</a></li>
					<li class="page-item"><a href="#" class="page-link">2</a></li>
					<li class="page-item active"><a href="#" class="page-link">3</a></li>
					<li class="page-item"><a href="#" class="page-link">4</a></li>
					<li class="page-item"><a href="#" class="page-link">5</a></li>
					<li class="page-item"><a href="#" class="page-link">tiếp</a></li>
				</ul>
			</div>
		</div>
		<a href="home_admin"><button type="button" class="btn btn-primary">quay
				về</button> </a>
	</div>
	<!-- Edit Modal HTML -->
	<div id="addEmployeeModal" class="modal fade">
		<div class="modal-dialog">
			<div class="modal-content">
				<form action="addmovie" method="post">
					<div class="modal-header">
						<h4 class="modal-title">Thêm Phim</h4>
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">&times;</button>
					</div>
					<div class="modal-body">
						<div class="form-group">
							<label>Tên Phim</label> <input name="name_movie" type="text"
								class="form-control" required> <label>Hình ảnh</label> <input
								name="image" type="text" class="form-control" required>
							<label>Thể Loại</label> <input name="description" type="text"
								class="form-control" required> <label>Thời Lượng</label>
								<label>Giới Thiệu</label> <input name="long_decrip" type="text"
								class="form-control" required> <label>Thời Lượng</label>
							<input name="total_time" type="text" class="form-control"
								required> <label>Diễn Viên</label> <input name="actors"
								type="text" class="form-control" required> <label>Đạo
								diễn</label> <input name="director" type="text" class="form-control"
								required> <label>Quốc Gia</label> <input name="language"
								type="text" class="form-control" required> <label>Ngày
								Công Chiếu</label> <input name="date" type="text" class="form-control"
								required>
								<label>Hình Bìa</label>  <input name="banner" type="text" class="form-control"
								required>
						</div>

					</div>
					<div class="modal-footer">

						
						<button class="btn btn-success btn-block" type="submit">
							<i class="fas fa-sign-in-alt"></i> Thêm
						</button>
						<br>
						<center>	<input type="button" class="btn btn-danger" data-dismiss="modal"
							value="Huỷ"> </center>
					</div>
				</form>

			</div>
		</div>
	</div>
	
	<script src="js/manager.js" type="text/javascript"></script>
</body>
</html>