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

<title>Chọn lịch xem phim</title>
</head>

<body>
	<!-- nav bar -->
	<jsp:include page="header.jsp" />
	<!-- end of navbar -->

	<br>
	<br>
	<br>
	<div class="container">

		<form action="choose_day" method="post">
			<h2> <center>Chọn lịch xem phim </center></h2>
			<br>
			<p align="center">Chọn ngày xem phim trong trong tuần</p>
			
			<br></br>
			
			<c:forEach items="${listDates}" var="date">
					<a href="choose_time?Date_id=${date.id}"
					class="btn btn-success btn-block"> <p> ${ date.date} </p></a>
				</c:forEach>
				
			
	
		</form>
	</div>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<jsp:include page="footer.jsp" />
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script>
		
	</script>

</body>

</html>