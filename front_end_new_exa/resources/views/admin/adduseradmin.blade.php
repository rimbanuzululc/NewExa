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

<body id="page-top" onload="masterData()">
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
                            <h1 class="h3 mb-0 text-gray-800">Tambah Pengguna</h1>
                        </div>

                        <!-- <form method="post" action="{{ url('/add-user') }}"> -->
                        <form id="add-user-form">
                            @csrf
                            <hr>
                            <div class="card shadow">
                                <div class="card-body text-form">
                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Username</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="text" class="form-control"  name="username" aria-describedby="emailHelp">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Nama</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="text" class="form-control" onkeyup="onChangeName()" id="input_name" name="name" aria-describedby="emailHelp">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Email</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="email" class="form-control" name="email" aria-describedby="emailHelp">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Branch Office Location</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                       <!--  <div class="mb-3 col-lg-6">
                                            <input type="text" class="form-control" name="branch_office_location" aria-describedby="emailHelp">
                                        </div> -->
                                        <div class="mb-3">
                                            
                                            <select id="branch_office_location" class="form-select" aria-label="Default select example" name="role">
                                                <option selected>Select Role</option>
                                               <!--  <option value="BOSM">BOSM</option>
                                                <option value="BM">BM</option>
                                                <option value="CS">CS</option>
                                                <option value="SuperAdmin">SuperAdmin</option> -->
                                            </select>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Password</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="password" class="form-control" name="password" aria-describedby="emailHelp">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Role</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3">
                                            
                                            <select id="role" class="form-select" aria-label="Default select example" name="role">
                                                <option selected>Select Role</option>
                                               <!--  <option value="BOSM">BOSM</option>
                                                <option value="BM">BM</option>
                                                <option value="CS">CS</option>
                                                <option value="SuperAdmin">SuperAdmin</option> -->
                                            </select>
                                        </div>
                                    </div>

                                    <button type="submit" class="buttonLogin", align="center" onclick="addUser(this)" >Add New User</button>
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
        function onChangeName(){
            const arr = document.getElementById("input_name").value.split(" ");
            for (var i = 0; i < arr.length; i++) {
                arr[i] = arr[i].trim().charAt(0).toUpperCase() + arr[i].slice(1);

            }
            const str2 = arr.join(" ");
            $("#input_name").val(str2);
        }
        function masterData(){
            $.ajax({
                url: "/get-master-data",
                method:"get",
                data:{
                    _token:"{{ csrf_token() }}",
                },
                success:function(response){
                    if(response.message === "Get All Master Data Sucess!") {

                        $('#role').empty();
                        $('#role').append('<option hidden>Silahkan Pilih</option>'); 
                        var len = response.data.userRoles.length;
                        for( var i = 0; i<len; i++){
                            var id = response.data.userRoles[i]['id'];
                            var name = response.data.userRoles[i]['description'];
                            $("#role").append("<option value='"+id+"'>"+name+"</option>");
                        }

                        $('#branch_office_location').empty();
                        $('#branch_office_location').append('<option hidden>Silahkan Pilih</option>'); 
                        var len = response.data.branchs.length;
                        for( var i = 0; i<len; i++){
                            var id = response.data.branchs[i]['id'];
                            var name = response.data.branchs[i]['description'];
                            $("#branch_office_location").append("<option value='"+name+"'>"+name+"</option>");
                        }

                       
                    }else{
                        Swal.fire({
                            title: 'Error!!',
                            text: response.message,
                            icon: 'error',
                            showCancelButton: false,
                            confirmButtonText: 'Yes!',
                        }).then(function (e) {
                            // if (e.value === true) {
                            //     window.location="{{url('/account-otorisasi')}}";
                            // }

                        }, function (dismiss) {
                            return false;
                        })
                    }              
                },
                error: function(error) {
                    console.log(error);
                }
            });
        }

        function addUser(element) {
            // alert("ok");
            $('#add-user-form').one('submit',function(e){
                // alert("ok");
                e.preventDefault();
                let username = document.getElementById("add-user-form").elements.item(1).value;
                let name  = document.getElementById("add-user-form").elements.item(2).value;
                let email  = document.getElementById("add-user-form").elements.item(3).value;
                let branch_office_location  = document.getElementById("add-user-form").elements.item(4).value;
                let password  = document.getElementById("add-user-form").elements.item(5).value;
                let role  = document.getElementById("add-user-form").elements.item(6).value;
                // alert(username+" "+name+" "+email+" "+branch_office_location +" "+password+" "+role);
                $.ajax({
                    url: "/add-user",
                    method:"POST",
                    data:{
                        _token:"{{ csrf_token() }}",
                        // username: "{{ Session::get('user')->username }}",
                        username : username,
                        name : name,
                        email: email,
                        branch_office_location : branch_office_location,
                        password :password,
                        role :role
                    },
                    success:function(response){
                        console.log(response.message);
                        if(response.message === "Register Successfully") {
                            Swal.fire({
                                title: 'Adding new user success',
                                text: "Will you add user again?",
                                icon: 'success',
                                showCancelButton: !0,
                                confirmButtonText: "Yes",
                                cancelButtonText: "No",
                                reverseButtons: !0
                            }).then(function (e) {
                                if (e.value === true) {
                                    window.location="{{url('/add-user-page')}}";
                                } else {
                                    window.location="{{url('/user-list-page')}}";
                                }

                            }, function (dismiss) {
                                return false;
                            })
                        }else{
                            Swal.fire({
                                title: 'ERROR',
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