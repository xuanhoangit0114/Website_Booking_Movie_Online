<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="vi">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Thông tin vé</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
<style type="text/css">
th {
	padding: 0px 20px 5px 0px;
	border: 1
}
</style>
</head>

<body>
	<!-- nav bar -->
	<jsp:include page="header.jsp" />
	<!-- end of navbar -->

	<br>
	<br>
	<br>
	<div class="container">

		<h2>Chi tiết vé đã đặt</h2>
		<br>
		<div style="display: flex">

			<br></br>
			<table>
				<tr>

					<th><b> Quý khách hàng : ${sessionScope.acc.fullname } </b></th>
					<th></th>
				</tr>
				<tr>

					<th><b> ID Khách Hàng : ${sessionScope.acc.id } </b></th>
					<th></th>
				</tr>
				<tr>

					<th><b> Tên phim : ${sessionScope.tenphim.tittle } </b></th>
					<th></th>
				</tr>


				<tr>
					<th><b>Ngày chiếu: ${sessionScope.date.date } </b></th>
					<th></th>
				</tr>
				<tr>
					<th><b>Chiếu vào lúc: ${sessionScope.time.time } </b></th>
					<th></th>
				</tr>
				<tr>
					<th><b>Tên Phòng: ${sessionScope.room.room_name } </b></th>
					<th></th>
				</tr>
				<tr>
					<c:if test="${sessionScope.seat.id !=null }">
						<th><b>Số ghế: ${sessionScope.seat.seat_name }</b></th>
						<th></th>
					</c:if>

				</tr>
				<tr>
					<th><b>Tiền Vé Đơn: ${sessionScope.ok} .VND</b></th>
					<th></th>
				</tr>
				<tr>
					<c:if test="${sessionScope.seat.id !=null }">
						<th> <p align="center"><font face="Garamond" color="green" size="35px"><b>Đặt vé hoàn
									tất mời quý khách check lại thông tin!</b></font> </p></th>
						<th></th>
					</c:if>
				</tr>
			</table>







			<div style="margin-left: 50px">
				<img src="/views/client/image/film2.jpg" alt="">
			</div>

		</div>
		<br> <a href="trangchu" class="btn btn-outline-danger btn-block">
			Quay về trang chủ</a>
			<a href="bill" class="btn btn-outline-success btn-block">
			Đến trang quản lý vé</a>
	</div>
	<br>
	<br>
	<br>
	<jsp:include page="footer.jsp" />
</body>

</html>