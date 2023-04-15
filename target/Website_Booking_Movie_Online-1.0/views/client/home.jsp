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
     <link href="css/home.css" rel="stylesheet" type="text/css"/>

<title>Trang chủ</title>
</head>

<body>

	<!-- content -->
	<div class="container">
		<%--    navbar--%>
		<jsp:include page="header.jsp" />

		<!-- carousel -->
		<br> <br> <br>
		<h1>Phim Chiếu Tại Rạp</h1>
		<br></br> <br></br>


		<!-- Indicators -->
		<ul class="carousel-indicators">
			<li data-target="#demo" data-slide-to="0" class="active"></li>
			<li data-target="#demo" data-slide-to="1"></li>
			<li data-target="#demo" data-slide-to="2"></li>
			<li data-target="#demo" data-slide-to="3"></li>
			<li data-target="#demo" data-slide-to="4"></li>
		</ul>

		<!-- The slideshow -->
		<div class="col-sm-9" style="margin-right: 20px">
			<div class="row">
				<c:forEach items="${listmovie}" var="o">
					<div class="col-12 col-md-6 col-lg-4">
						<div class="card">
							<img class="card-img-top" src="${o.image}" alt="Card image cap">
							<div class="card-body">
								<h4 class="card-title show_txt">
									<a  title="View Movie"> ${o.tittle}
									</a>
								</h4>

								<div class="row">
									<div class="col">
										<p class="card-title show_txt" >
											<b> Thời Lượng: ${o.total_time} phút </b>
										<p>
											<b> Mô Tả : ${o.decription} </b>
										<p></p>
									</div>
									<div class="col">
										<c:if test="${sessionScope.acc == null }">
											<a href="login" class="btn btn-success btn-block">Mua
												Vé </a>
										</c:if>
										<c:if test="${sessionScope.acc != null }">
											<a  href="chose_day?movie_id=${o.id }" class="btn btn-success btn-block">Mua
												Vé </a>
										</c:if>
										<a href="show-movie?Mid=${o.id }" backgorund-color="red" class="btn btn-success btn-block">Chi
											 Tiết </a>
                                      
									</div>
								</div>
							</div>
						</div>
					</div>
				</c:forEach>
			</div>
		</div>

	</div>
	</div>


	<!-- Left and right controls -->

	</div>
	<!-- end of carousel -->

	<!-- movie selections-->
	<br>
	<br>



	<!-- end of movie selections -->
	</div>
	</div>

	<%--Nếu chưa đăng nhập mà đã click vào nút mua vé thì trả về trang có function toggle cái form đăng nhập--%>
	<c:choose>
		<c:when test="${sessionScope.jwtResponse eq null}">
			<script>
				$(document).ready(function() {
					$('.btn-buy-ticket-not-signed-in').on('click', function() {
						$('#modalLoginForm').modal('show');
					})
					// $('.close').on('click',function(){
					//     $('#modalLoginForm').modal({ show: false});
					//     // clear input fields
					//     $('#defaultForm-email').html("")
					//     $('#defaultForm-pass').html("")
					//     $('#orangeForm-name').html("")
					//     $('#orangeForm-email').html("")
					//     $('#orangeForm-password').html("")
					// })
				})
			</script>
		</c:when>
		<c:otherwise>

		</c:otherwise>
	</c:choose>

	<%--Nếu có lỗi đăng ký thì hiện cái form modal đăng ký ra--%>
	<c:choose>
		<c:when test="${hasErrors eq null}">

		</c:when>
		<c:otherwise>
			<script>
				$(window).on('load', function() {
					$('#modalRegisterForm').modal('show');
				});
			</script>
		</c:otherwise>
	</c:choose>

	<%-- Nếu có lỗi đăng nhập thì hiện form modal đăng nhập ra--%>
	<c:choose>
		<c:when test="${hasLoginErrors eq null}">

		</c:when>
		<c:otherwise>
			<script>
				$(window).on('load', function() {
					$('#modalLoginForm').modal('show');
				});
			</script>
		</c:otherwise>
	</c:choose>

	<br>
	<br>
	<jsp:include page="footer.jsp" />
</body>

</html>