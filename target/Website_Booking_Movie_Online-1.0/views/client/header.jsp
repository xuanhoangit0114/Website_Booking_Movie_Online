<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="vi">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.14.0/css/all.min.css"
	integrity="sha512-1PKOgIY59xJ8Co8+NE6FZ+LOAZKjy+KY8iq0G4B3CyeY6wYHN3yt9PW0XpSriVlkMXe40PTKnXrLnZ9+fkDaog=="
	crossorigin="anonymous" />
</head>
<!-- nav bar -->
<nav class="navbar navbar-expand-sm bg-dark navbar-dark fixed-top">
	<a class="navbar-brand" href="/">
		<p>
			<font szie="30px">XIAO Cinema </font>
		</p>
	</a>

	<div class="collapse navbar-collapse" id="navb">
		<ul class="navbar-nav mr-auto">
			<li class="nav-item"><a class="nav-link" href="trangchu">Trang
					chủ</a></li>
			<c:if test="${sessionScope.acc.roleid == 1 }">
				<li class="nav-item"><a class="nav-link" href="login">Quản
						Lý </a></li>
			</c:if>
			<c:if test="${sessionScope.acc == null }">
			
				<li class="nav-item"><a class="nav-link" href="login">Đăng
						Nhập </a></li>
			</c:if>
			<c:if test="${sessionScope.acc != null }">
				<li class="nav-item"><a class="nav-link" href="logout">Đăng
						Xuất</a></li>
				<li class="nav-item"><a class="nav-link" href="/">
						<p>Xin chào ,${sessionScope.acc.fullname}</p>
				</a></li>
			</c:if>
			<c:if test="${sessionScope.acc != null }">
				<li class="nav-item"><a class="nav-link" href="bill?user_id=${ sessionScope.acc.id}">Hòm vé
					</a></li>
				
				</a></li>
			</c:if>

			</li>
		</ul>
		<div class="form-inline my-2 my-lg-0"></div>
	</div>
</nav>
<body>

</body>