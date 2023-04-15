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
<style type="text/css">
body {
	
}
.container{
background-image : url ('background.jpg') ;
}
.col-14 col-md-2 col-lg-3 {
 width: 100px;
  height: 200px;
}
 .carousel-inner
 {
  width: 100px;
  height: 440px;
 }
  .carousel-inner img
 {
  width: 100px;
  height: 440px;
 }
 .d-block w-100 {
   width: 100px;
  height: 440px;
 }
</style>
<title>Trang chủ</title>
</head>

<body>

	<!-- content -->
	<div class="container">
		<%--    navbar--%>
		<jsp:include page="header.jsp" />
		<!-- carousel -->
		<br> <br> <br> <br> <br>
		<h1>Phim Mới</h1>
		
	   <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
	 
  <ol class="carousel-indicators">
    <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
  </ol>

  <div class="carousel-inner">
    	
    <div class="carousel-item ">
    <c:forEach items="${listmovie}" var="o" begin="0" end="1">
      <img class="d-block w-100" src="${o.banner }" alt="First slide" >
     </c:forEach>
    </div>
     
    <div class="carousel-item ">
    <c:forEach items="${listmovie}" var="o" begin="3" end="4">
      <img class="d-block w-100" src="${o.banner }" alt="Third slide" > </c:forEach>
    </div>
   
   
    <div class="carousel-item active">
      <c:forEach items="${listmovie}" var="o" begin="2" end="3">
      <img class="d-block w-100" src="${o.banner }" alt="Third slide" >
      </c:forEach>
    </div>
    
  </div>
  
  <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a> 
</div> 

		
		</div>
		<br></br> 
		<!-- Indicators -->  
		<!-- The slideshow -->
		<br> <br>
		<center><h1>Phim Đang Chiếu</h1></center>
		 <br> <br> <br>
		<div class="col-sm-12" style="margin-right: 20px">
			<div class="row">
				<c:forEach items="${listmovie}" var="o">
					<div class="col-14 col-md-2 col-lg-3">
						<div class="card">
							<img class="card-img-top" src="${o.image}" alt="Card image cap">
							<div class="card-body">
								<h4 class="card-title show_txt">
									<a>  <p class="card-title show_txt"> <b></b><font face="" size="5px"> ${o.tittle}</font></b></p> 
									</a>
								</h4>

								<div class="row">
									<div class="col">
										<p class="card-title show_txt" >
											<b> Thời Lượng: ${o.total_time} phút </b>
										<p>
											<b> Thể Loại : ${o.decription} </b>
										<p></p>
									</div>
									<div class="col">
										<c:if test="${sessionScope.acc == null }">
											<a onclick="need_login()" href="#" class="btn btn-success btn-block">Mua
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

	
	
	
	<br>
	<br>
	
	

	<br>
	<br>
	<jsp:include page="footer.jsp" />
	<script type="text/javascript">
	$('.carousel').carousel({
		  interval:900
		})
		function need_login(){  
	 var result = confirm("Bạn cần đăng nhập để thao tác !");
	 if (result == true) {
		 window.location="http://localhost:8080/Website_Booking_Movie_Online/login";
		}
	  }  </script>
		
</body>

</html>