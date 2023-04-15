<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="vi">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Chọn Chỗ Ngồi</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
<style>
.screen-container {
	perspective: 1000px;
	margin: 40px 0;
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
}

.screen {
	background: rgb(71, 165, 209);
	height: 70px;
	width: 70%;
	margin: 15px 0;
	transform: rotateX(-45deg);
	box-shadow: 0 3px 10px rgba(19, 120, 145, 0.7);
}

input.largerCheckbox {
	width: 80px;
	height: 80px;
	cursor: pointer;
}
</style>
</head>

<body>
	<!-- nav bar -->
	<jsp:include page="header.jsp" />
	<br>
	<br>
	<br>
	<!-- end of navbar -->
	<div class="container">
		<center><h1>Chọn Chỗ Ngồi</h1></center>
	</div>
	<div class="screen-container">
		<h2>Màn Hình</h2>
		<div class="screen"></div>
		<br>
		<br>
		<br>
		<p>
			<b>Quý khách chú ý : <font color="yellow">[CHÚ Ý]</font> <br>
					</br> <font color="red"> Màu đỏ là ghế đã được đặt</font>
			
			</b> <br></br> <font color="green"> <b>Màu xanh là ghế còn
					trống</font> </b>

		</p>

		<div class="container">
			<form action="infor_seat" name="seats" onsubmit="return validateform()">
			
				<table style="width: 100%">
					<tr>
						<th> Dãy | Số </th>
						<th>1</th>
						<th>2</th>
						<th>3</th>
						<th>4</th>
						<th>5</th>
						<th>6</th>
						<th>7</th>
						<th>8</th>

					</tr>

					<tr>
						<th>A</th>
						<c:forEach items="${listSeat}" var="seat" begin="0" end="7">

							<c:if test="${seat.status==0 }">
								<th><font color="red" size="12"> <a
										href="check_ticket?seats1=${seat.id }"
										class="btn btn-outline-success"> ${seat.seat_name } </a></font></th>
										
							</c:if>

							<c:if test="${seat.status==1 }">
								<th><font color="red" size="12"> <a name="check_seat"
								onclick="unknow()"
										href="#"
										class="btn btn-outline-danger"> ${seat.seat_name } </a></font></th>
							</c:if>



						</c:forEach>


					</tr>
					<tr>
						<th>B</th>
						<c:forEach items="${listSeat}" var="seat" begin="8" end="15">

							<c:if test="${seat.status==0 }">
								<th><font color="red" size="12"> <a
										href="check_ticket?seats1=${seat.id }"
										class="btn btn-outline-success"> ${seat.seat_name } </a></font></th>
							</c:if>

							<c:if test="${seat.status==1 }">
								<th><font color="red" size="12"> <a
									onclick="unknow()"
										href="#"
										class="btn btn-outline-danger"> ${seat.seat_name } </a></font></th>
							</c:if>



						</c:forEach>


					</tr>
                    <tr>
						<th>C</th>
						<c:forEach items="${listSeat}" var="seat" begin="16" end="23">

							<c:if test="${seat.status==0 }">
								<th><font color="red" size="12"> <a
										href="check_ticket?seats1=${seat.id }"
										class="btn btn-outline-success"> ${seat.seat_name } </a></font></th>
							</c:if>

							<c:if test="${seat.status==1 }">
								<th><font color="red" size="12"> <a
									onclick="unknow()"
										href="#"
										class="btn btn-outline-danger"> ${seat.seat_name } </a></font></th>
							</c:if>



						</c:forEach>


					</tr>
                   <tr>
						<th>D</th>
						<c:forEach items="${listSeat}" var="seat" begin="24" end="31">

							<c:if test="${seat.status==0 }">
								<th><font color="red" size="12"> <a
										href="check_ticket?seats1=${seat.id }"
										class="btn btn-outline-success"> ${seat.seat_name } </a></font></th>
							</c:if>

							<c:if test="${seat.status==1 }">
								<th><font color="red" size="12"> <a
									onclick="unknow()"
										href="#"
										class="btn btn-outline-danger"> ${seat.seat_name } </a></font></th>
							</c:if>
						</c:forEach>

					</tr>
				</table>
				
			</form>
<script>  
  function unknow(){  
    alert("Ghế này đã được người khác đặt");  
  }  
</script>
		</div>
	</div>
	<jsp:include page="footer.jsp" />
</body>

</html>