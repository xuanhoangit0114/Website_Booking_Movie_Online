<%@ page language="java" contentType="text/html; charset=UTF-8"


    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
  <link href="css/bill.css" rel="stylesheet" type="text/css"/>
  <title>Trang Soát Vé</title>
</head>
<body>
<jsp:include page="header.jsp" />
<div class="container">
<div class="row">
 <c:if test="${sessionScope.seat.id eq null } ">
 
 <p align="center"> <b></b><font size= "35px"> Bạn chưa mua vé ?!  </font> </b> </p>
 </c:if>
 <c:forEach items="${listticket }" var="ticket">
    <div class="col-md-3">
        <div class="ibox">
         
            <div class="ibox-content product-box">
                <div class="product-imitation">
               
                    <img alt="" src="image/images_ticket.jpg">
                </div>
                <div class="product-desc">
                    <span class="product-price">
                   ${ticket.price } VND
                    </span>
                    <small class="text-muted"> </p></small>
                    <a href="#" class="product-name"> ${ticket.movie_name }</a>

                    <div class="small m-t-xs">
                      <p> Phòng : ${ticket.room_nam } <br></br> Ghế :  ${ticket.seat_name } </p>
                        <p> Thời Gian Chiếu <br></br> Ngày : ${ticket.date } <br></br>  giờ :  ${ticket.time } </p>
                    </div>
                    <div class="m-t text-righ">

                        <a href="bill?ticket_id=${ticket.id}" ref="bill?user_id=${ sessionScope.acc.id}" class="btn btn-xs btn-outline btn-dark">Huỷ Vé<i class="fa fa-long-arrow-right"></i> </a>
                    </div>
                </div>
            </div>
         
          
        </div>
    </div>
     </c:forEach>
    
</div>
</div>
  <p align="center"> <b>Tổng thanh toán : ${sessionScope.toltal }   VND</b>     </p>
<jsp:include page="footer.jsp" />
</body>
</html>