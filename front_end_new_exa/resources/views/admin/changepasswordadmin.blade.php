<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Dashboard Main Menu EXA V2</title>

    <!-- Custom fonts for this template-->
    <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="{{asset('css/sb-admin-2.css')}}" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="{{asset('vendor/bootstrap/css/bootstrap.min.css')}}">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="{{asset('fonts/font-awesome-4.7.0/css/font-awesome.min.css')}}">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="{{asset('fonts/Linearicons-Free-v1.0.0/icon-font.min.css')}}">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="{{asset('vendor/animate/animate.css')}}">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="{{asset('vendor/css-hamburgers/hamburgers.min.css')}}">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="{{asset('vendor/animsition/css/animsition.min.css')}}">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="{{asset('vendor/select2/select2.min.css')}}">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="{{asset('vendor/daterangepicker/daterangepicker.css')}}">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="{{asset('css/util.css')}}">
    <link rel="stylesheet" type="text/css" href="{{asset('css/main.css')}}">
    <link rel="stylesheet" type="text/css" href="{{asset('css/bootsrap.css')}}">

    <script language="JavaScript" type="text/javascript" src="/js/jquery-1.2.6.min.js"></script>
    <script language="JavaScript" type="text/javascript" src="/js/jquery-ui-personalized-1.5.2.packed.js"></script>
    <script language="JavaScript" type="text/javascript" src="/js/sprinkle.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/10.5.1/sweetalert2.min.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/10.5.1/sweetalert2.all.min.js"></script>


</head>

<body id="page-top">
    @include('sweetalert::alert')
    <div class="dashboard-main">

        <!-- Topbar -->
        <nav class="navbar navbar-dashboard navbar-expand navbar-light bg-white topbar static-top shadow">

            <a class="sidebar-brand d-flex align-items-center justify-content-center logo-dashboard" href="index.html">
                <img src="{{asset('/images/logo_putih.png')}}" class="img-fluid">
            </a>


            <!-- Topbar Navbar -->
            <ul class="navbar-nav ml-auto">

                <!-- Nav Item - Search Dropdown (Visible Only XS) -->

                <div class=" d-none d-sm-block"></div>

                <!-- Nav Item - User Information -->
                <li class="nav-item dropdown no-arrow">
                    <p class="text-header ">Selamat Datang {{ $user->name }} </p>
                    <br>
                    <p class="text-header ">{{ $user->role }} | 2101670159 - {{ $user->branch_office_location }}</p>
                    <button type="button" class="buttonLogout", align="center" onclick="location.href='{{ url('/logout') }}'"> > LOGOUT </button>
                </li>
                <br>
            </ul>
        </nav>
        <!-- End of Topbar -->

        <!-- Page Wrapper -->
        <div id="wrapper">

            <!-- Sidebar -->
            <ul class="navbar-nav  sidebar sidebar-dark accordion" id="accordionSidebar">

                <!-- Nav Item - Pages Collapse Menu -->
                <li class="nav-item">
                    <a class="nav-link" href="/add-user-page">
                        <p class="text-sidebar">Tambah Pengguna</p>
                    </a>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="/user-list-page">
                        <p class="text-sidebar">Daftar Pengguna</p>
                    </a>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="/change-password-admin-page">
                        <p class="text-sidebar">Ganti Password</p>
                    </a>
                </li>

            </ul>
            <!-- End of Sidebar -->

            <div id="content-wrapper" class="d-flex flex-column">

                <!-- Main Content -->
                <div id="content">

                    <!-- Begin Page Content -->
                    <div class="container-fluid">

                        <!-- Page Heading -->
                        <div class="d-sm-flex align-items-center justify-content-between">
                            <h1 class="h3 mb-0 text-gray-800">Ubah Password</h1>
                        </div>

                        <!-- <form method="post" action="{{ url('/change-password-admin')}}"> -->
                        <form id="change-password-form">
                            @csrf
                            <hr>
                            <div class="card shadow">
                                <div class="card-body text-form">

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Password Lama</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="password" class="form-control"  name="oldPassword" aria-describedby="emailHelp">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Password Baru</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="password" class="form-control" name="newPassword" aria-describedby="emailHelp">
                                        </div>
                                    </div>


                                    <button id="btn_change_password" type="submit" onclick="changePassword(this)" class="buttonLogin" align="center">Change Password</button>
                                </div>

                            </div>


                        </form>

                    </div>
                    <!-- /.container-fluid -->

                </div>
                <!-- End of Main Content -->


                <!-- End of Footer -->

            </div>
            <!-- End of Content Wrapper -->

        </div>
        <!-- End of Page Wrapper -->
        <!-- Footer -->
        <footer class="sticky-footer" style="background-color: #00A39D;">
            <div class="container my-auto">
                <div class="copyright text-center my-auto">
                    <p class="text-footer">(c) 2016 - 2022 PT. Bank Syariah Indonesia Tbk, All Right Reserved.</p>
                </div>
            </div>
    </div>
    </footer>

    <!-- Scroll to Top Button-->
    <a class="scroll-to-top rounded" href="#page-top">
        <i class="fas fa-angle-up"></i>
    </a>

    <!-- Logout Modal-->
    <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
                    <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">×</span>
                    </button>
                </div>
                <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
                <div class="modal-footer">
                    <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
                    <a class="btn btn-primary" href="login.html">Logout</a>
                </div>
            </div>
        </div>
    </div>
    </div>
    <script>
        function changePassword(element) {
            $('#change-password-form').one('submit',function(e){
                e.preventDefault();
                let inputOldPassword = document.getElementById("change-password-form").elements.item(1).value;
                let inputNewPassword = document.getElementById("change-password-form").elements.item(2).value;
 
                $.ajax({
                    url: "/change-password-admin",
                    method:"POST",
                    data:{
                        _token:"{{ csrf_token() }}",
                        // username: "{{ Session::get('user')->username }}",
                        old_password:inputOldPassword,
                        new_password:inputNewPassword
                    },
                    success:function(response){
                        console.log(response.message);
                        if(response.message === "Change password sucess!") {
                            Swal.fire({
                                title: 'Info',
                                text: "Change password success",
                                icon: 'success',
                                showCancelButton: false,
                                confirmButtonText: 'Yes!',
                            }).then(function (e) {
                                if (e.value === true) {
                                    window.location="{{url('/change-password-admin-page')}}";
                                }

                            }, function (dismiss) {
                                return false;
                            })
                        }else{
                            Swal.fire({
                                title: 'Change Password Failed',
                                text: response.message,
                                icon: 'error',
                                showCancelButton: false,
                                confirmButtonText: 'Ok!',
                            })
                        }
                    },
                error: function(error) {
                        console.log(error);
                    }
                });
            });

        }
    </script>
    <!-- Bootstrap core JavaScript-->
    <script src="{{asset('vendor/jquery/jquery.min.js')}}"></script>
    <script src="{{asset('vendor/bootstrap/js/bootstrap.bundle.min.js')}}"></script>

    <!-- Core plugin JavaScript-->
    <script src="{{asset('vendor/jquery-easing/jquery.easing.min.js')}}"></script>

    <!-- Custom scripts for all pages-->
    <script src="{{asset('js/sb-admin-2.min.js')}}"></script>

    <!-- Page level plugins -->
    <script src="{{asset('vendor/chart.js/Chart.min.js')}}"></script>

    <!-- Page level custom scripts -->
    <script src="{{asset('js/demo/chart-area-demo.js')}}"></script>
    <script src="{{asset('js/demo/chart-pie-demo.js')}}"></script>

</body>

</html>