<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Trang Quản Lý</title>

<!-- Custom fonts for this template-->
<link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet"
	type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">
<script src="https://kit.fontawesome.com/a076d05399.js"
	crossorigin="anonymous"></script>

<!-- Custom styles for this template-->
<link href="css/admin.min.css" rel="stylesheet" />
<link rel="stylesheet"
	href="https://fonts.googleapis.com/icon?family=Material+Icons">

</head>

<body id="page-top">

	<!-- Page Wrapper -->
	<div id="wrapper">

		<!-- Sidebar -->
		<ul
			class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion"
			id="accordionSidebar">

			<!-- Sidebar - Brand -->
			<a
				class="sidebar-brand d-flex align-items-center justify-content-center"
				href="home_admin">
				<div class="sidebar-brand-icon rotate-n-15">
					<i class="material-icons">computer</i>
				</div>
				<div class="sidebar-brand-text mx-3">Chức năng</div>
			</a>

			<!-- Divider -->
			<hr class="sidebar-divider my-0">

			<!-- Nav Item - Dashboard -->
			<li class="nav-item active"><a class="nav-link"
				href="adminMovie">
				 <i class="fas fa-film"></i> <span>Quản
						lý Phim</span></a></li>
			<li class="nav-item active"><a class="nav-link"
				href="adminRoom"> <i class="fab fa-buromobelexperte"></i> <span>Quản
						lý Phòng</span></a>
						
			
              
			<li class="nav-item active">
                <a class="nav-link" href="adminAcccount">
               <i class="far fa-user-circle"></i>
                    <span>Quản lý Tài Khoản</span>
			</a>
            </li>
               <li class="nav-item active">
                <a class="nav-link" href="trangchu">
              <i class="fas fa-house-user"></i>
                    <span>Về trang chủ</span>
			</a>
            </li>
            <!-- Divider -->
            <hr class="sidebar-divider">

            <!-- Heading -->
           
            <!-- Nav Item - Pages Collapse Menu -->
           

           

            <!-- Divider -->
          

            <!-- Heading -->
           
        
        

        </ul>
        <!-- End of Sidebar -->

        <!-- Content Wrapper -->
        <div id="content-wrapper" class="d-flex flex-column">

            <!-- Main Content -->
            <div id="content">

                <!-- Topbar -->
                <nav
					class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">

                    <!-- Sidebar Toggle (Topbar) -->
                    <button id="sidebarToggleTop"
						class="btn btn-link d-md-none rounded-circle mr-3">
                        <i class="fa fa-bars"></i>
                    </button>

                    <!-- Topbar Search -->
                    

                    <!-- Topbar Navbar -->
                    <ul class="navbar-nav ml-auto">

                        <!-- Nav Item - Search Dropdown (Visible Only XS) -->
                        <li class="nav-item dropdown no-arrow d-sm-none">
                            <a class="nav-link dropdown-toggle" href="#"
							id="searchDropdown" role="button" data-toggle="dropdown"
							aria-haspopup="true" aria-expanded="false">
                                <i class="fas fa-search fa-fw"></i>
                            </a>
                            <!-- Dropdown - Messages -->
                            <div
								class="dropdown-menu dropdown-menu-right p-3 shadow animated--grow-in"
								aria-labelledby="searchDropdown">
                                <form
									class="form-inline mr-auto w-100 navbar-search">
                                    <div class="input-group">
                                        <input type="text"
											class="form-control bg-light border-0 small"
											placeholder="Search for..." aria-label="Search"
											aria-describedby="basic-addon2">
                                        <div class="input-group-append">
                                            <button
												class="btn btn-primary" type="button">
                                                <i
													class="fas fa-search fa-sm"></i>
                                            </button>
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </li>

                        <!-- Nav Item - Alerts -->
                        <li class="nav-item dropdown no-arrow mx-1">
                            <a class="nav-link dropdown-toggle" href="#"
							id="alertsDropdown" role="button" data-toggle="dropdown"
							aria-haspopup="true" aria-expanded="false">
                                <i class="fas fa-bell fa-fw"></i>
                                <!-- Counter - Alerts -->
                                <span
								class="badge badge-danger badge-counter">3+</span>
                            </a>
                            <!-- Dropdown - Alerts -->
                      
                        </li>

                        <!-- Nav Item - Messages -->
               
                        <div class="topbar-divider d-none d-sm-block"></div>

                        <!-- Nav Item - User Information -->
                        <li class="nav-item dropdown no-arrow">
                            <a class="nav-link dropdown-toggle" href="#"
							id="userDropdown" role="button" data-toggle="dropdown"
							aria-haspopup="true" aria-expanded="false">
                                <span
								class="mr-2 d-none d-lg-inline text-gray-600 small">${sessionScope.acc.fullname }</span>
                                <img class="img-profile rounded-circle"
								src="image/avatar.jpg">
                            </a>
                            <!-- Dropdown - User Information -->
                           
                        </li>

                    </ul>

                </nav>
                <!-- End of Topbar -->

                <!-- Begin Page Content -->
                <div class="container-fluid">

                    <!-- Page Heading -->
                    <div
						class="d-sm-flex align-items-center justify-content-between mb-4">
                        <h1 class="h3 mb-0 text-gray-800">Thống Kê</h1>
                        <a href="#"
							class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"><i
							class="fas fa-download fa-sm text-white-50"></i> Lưu</a>
                    </div>

                    <!-- Content Row -->
                    <div class="row">

                        <!-- Earnings (Monthly) Card Example -->
                        <div class="col-xl-3 col-md-6 mb-4">
                            <div
								class="card border-left-primary shadow h-100 py-2">
                                <div class="card-body">
                                    <div
										class="row no-gutters align-items-center">
                                        <div class="col mr-2">
                                           <div
												class="text-xs font-weight-bold text-success text-uppercase mb-1">
                                                Doanh số (ngày)</div>
                                            <div
												class="h5 mb-0 font-weight-bold text-gray-800">${sessionScope.toltalearnmoney_day }</div>
                                        </div>
                                        <div class="col-auto">
                                            <i
												class="fas fa-calendar fa-2x text-gray-300"></i>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <!-- Earnings (Monthly) Card Example -->
                     
                        <div class="col-xl-3 col-md-6 mb-4">
                            <div
								class="card border-left-danger shadow h-100 py-2">
                                <div class="card-body">
                                    <div
										class="row no-gutters align-items-center">
                                        <div class="col mr-2">
                                            <div
												class="text-xs font-weight-bold text-success text-uppercase mb-1">
                                                Số lượng vé bán ra </div>
                                            <div
												class="h5 mb-0 font-weight-bold text-gray-800">${ sessionScope.toltalticket}</div>
                                        </div>
                                        <div class="col-auto">
                                      
                                           <i
												class="fas fa-calendar fa-2x text-gray-300"></i>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-xl-3 col-md-6 mb-4">
                            <div
								class="card border-left-primary shadow h-100 py-2">
                                <div class="card-body">
                                    <div
										class="row no-gutters align-items-center">
                                        <div class="col mr-2">
                                            <div
												class="text-xs font-weight-bold text-success text-uppercase mb-1">
                                                Số Lượng Khách Hàng</div>
                                            <div
												class="h5 mb-0 font-weight-bold text-gray-800"> ${sessionScope.listsize}
												</div>
												</div>
                                        <div class="col-auto">
                                      
                                        <i class="fas fa-users"></i>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <!-- Pending Requests Card Example -->
                       

                    <!-- Content Row -->

                    <div class="row">

                        <!-- Area Chart -->
                        <div class="col-xl-8 col-lg-7">
                            <div class="card shadow mb-4">
                                <!-- Card Header - Dropdown -->
                                <div
										class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
                                    <h6
											class="m-0 font-weight-bold text-success">Biểu Đồ Tăng Trưởng Doanh Thu</h6>
                                    <div class="dropdown no-arrow">
                                        <a class="dropdown-toggle"
												href="#" role="button" id="dropdownMenuLink"
												data-toggle="dropdown" aria-haspopup="true"
												aria-expanded="false">
                                            <i
												class="fas fa-ellipsis-v fa-sm fa-fw text-gray-400"></i>
                                        </a>
                                        
                                    </div>
                                </div>
                                <!-- Card Body -->
                                <div class="card-body">
                                    <div class="chart-area">
                                        <canvas id="myAreaChart"></canvas>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <!-- Pie Chart -->
                        <div class="col-xl-4 col-lg-5">
                            <div class="card shadow mb-4">
                                <!-- Card Header - Dropdown -->
                                <div
										class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
                                    <h6
											class="m-0 font-weight-bold text-success">Biểu đồ tròn (Khách)</h6>
                                    <div class="dropdown no-arrow">
                                        <a class="dropdown-toggle"
												href="#" role="button" id="dropdownMenuLink"
												data-toggle="dropdown" aria-haspopup="true"
												aria-expanded="false">
                                            <i
												class="fas fa-ellipsis-v fa-sm fa-fw text-gray-400"></i>
                                        </a>
                                       
                                    </div>
                                </div>
                                <!-- Card Body -->
                                <div class="card-body">
                                    <div class="chart-pie pt-4 pb-2">
                                        <canvas id="myPieChart"></canvas>
                                    </div>
                                    <div class="mt-4 text-center small">
                                       
                                       
                                        <span class="mr-2">
                                            <i
												class="fas fa-circle text-success"></i> Khách Mua Vé
                                        </span>
                                         <span class="mr-2">
                                            <i
												class="fas fa-circle text-info"></i> Khách Ghé Trang
                                        </span>
                                         <span class="mr-2">
                                            <i
												class="fas fa-circle text-danger"></i> Khách Huỷ Vé
                                        </span>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <!-- Content Row -->
                    <div class="row">

                        <!-- Content Column -->
                        <div class="col-lg-6 mb-4">

                            <!-- Project Card Example -->
                         

                            <!-- Color System -->
                   

                        </div>

                        <div class="col-lg-6 mb-4">

                            <!-- Illustrations -->
                          
                            <!-- Approach -->
                            
                        </div>
                    </div>

                </div>
                <!-- /.container-fluid -->

            </div>
            <!-- End of Main Content -->

            <!-- Footer -->
            <footer class="sticky-footer bg-white">
                <div class="container my-auto">
                    <div class="copyright text-center my-auto">
                        <span>2023</span>
                    </div>
                </div>
            </footer>
            <!-- End of Footer -->

        </div>
        <!-- End of Content Wrapper -->

    </div>
    <!-- End of Page Wrapper -->

    <!-- Scroll to Top Button-->
    <a class="scroll-to-top rounded" href="#page-top">
        <i class="fas fa-angle-up"></i>
    </a>

    <!-- Logout Modal-->
    <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog"
			aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
                    <button class="close" type="button"
							data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">×</span>
                    </button>
                </div>
                <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
                <div class="modal-footer">
                    <button class="btn btn-secondary" type="button"
							data-dismiss="modal">Cancel</button>
                    <a class="btn btn-primary" href="login.html">Logout</a>
                </div>
            </div>
        </div>
    </div>

    <!-- Bootstrap core JavaScript-->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Core plugin JavaScript-->
    <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

    <!-- Custom scripts for all pages-->
    <script src="js/sb-admin-2.min.js"></script>

    <!-- Page level plugins -->
    <script src="vendor/chart.js/Chart.min.js"></script>

    <!-- Page level custom scripts -->
    <script src="js/demo/chart-area-demo.js"></script>
    <script src="js/demo/chart-pie-demo.js"></script>


</body>

</html>