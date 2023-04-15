
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Cập nhật phim</title>
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
			<form action="update_movie" method="post">
				<div class="modal-header">
					<h4 class="modal-title">Cập nhật phim</h4>

				</div>
				<div class="modal-body">
					<div class="form-group">
						<label>ID PHIM:</label> <input readonly="readonly" name="mid"
							type="text" class="form-control"
							value="${sessionScope.movie.id }" required> <label>Tên
							phim</label> <input name="name_movie" type="text" class="form-control"
							value="${sessionScope.movie.tittle }" required> <label>Hình
							ảnh</label> <input name="image" type="text" class="form-control"
							value="${sessionScope.movie.image }" required> <label>Thể
							Loại </label> <input name="description" type="text" class="form-control"
							value="${sessionScope.movie.decription }" required> <label>Giới
							Thiệu</label> <input name="long_decrip" type="text" class="form-control"
							value="${sessionScope.movie.long_decrip }" required> <label>Thời
							Lượng</label> <input name="total_time" type="text" class="form-control"
							value="${sessionScope.movie.total_time }" required> <label>Diễn
							Viên</label> <input name="actors" type="text" class="form-control"
							value="${sessionScope.movie.actor }" required> <label>Đạo
							diễn</label> <input name="director" type="text" class="form-control"
							value="${sessionScope.movie.director }" required> <label>Quốc
							Gia</label> <input name="language" type="text" class="form-control"
							value="${sessionScope.movie.language }" required> <label>Ngày
							Công Chiếu</label> <input name="date" type="text" class="form-control"
							value="${sessionScope.movie.datestart }" required>
							<label>Hình Bìa</label>  <input name="banner" type="text" class="form-control"
							value="${sessionScope.movie.banner }" required>

					</div>

				</div>
				<div class="modal-footer">
					<button class="btn btn-success btn-block" type="submit">
						<i class="fas fa-sign-in-alt"></i> Cập Nhật
					</button>
				</div>
			</form>

		</div>
	</div>


	<script src="js/manager.js" type="text/javascript"></script>
</body>
</html>