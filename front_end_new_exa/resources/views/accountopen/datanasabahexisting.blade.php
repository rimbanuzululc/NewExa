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

<body id="page-top" onload ="masterData()">
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
                    <button type="button" class="buttonLogout", align="center" onclick="location.href='{{ url('/logout') }}'">LOGOUT </button>
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
                    <a class="nav-link" href="/account-open">
                        <p class="text-sidebar">Pembukaan Rekening</p>
                    </a>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="/account-inquiry">
                        <p class="text-sidebar">Inquiry Pembukaan CIF & Rekening</p>
                    </a>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="/account-otorisasi">
                        <p class="text-sidebar">Otorisasi Pembukaan CIF & Rekening</p>
                    </a>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="/change-password">
                        <p class="text-sidebar">Ubah Password</p>
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
                            <h1 class="h3 mb-0 text-gray-800">Pembukaan Rekening</h1>
                        </div>

                        <form action="" method="post">
                            <div class="mb-3">
                                <label for="exampleFormControlInput1" class="form-label">Pilih Jenis Nasabah</label>
                                <select class="form-select" aria-label="Default select example">
                                    <option selected>Select CIF</option>
                                    <option value="1">CIF Perorangan</option>
                                    <option value="2">CIF Anak</option>
                                    <option value="3">CIF Perusahaan</option>
                                    <option value="3">CIF Perseroan Perorangan</option>
                                </select>
                            </div>

                            <hr>

                            <div class="card shadow">


                                <!-- ======PEMBUKAAN REKENING====== -->

                                
                                <div class="card-body text-form">
                                    <p class="text-pembukaan mb-4">Informasi Pembukaan Rekening</p>
                                  

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Jenis Produk *</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select id="account_type" class="form-select" aria-label="Default select example" >
                                                <option selected>- Silahkan Pilih -</option>
                                              <!--   <option value="1">TABUNGAN TAPENAS KOLEKTIF</option>
                                                <option value="2">TABUNGAN TAPENAS REGULER</option>
                                                <option value="3">TABUNGANKU WADIAH BANSOS</option>
                                                <option value="4">TABUNGAN PENSIUN MUDHARABAH</option>
                                                <option value="5">TABUNGAN PENSIUN WADIAH</option>
                                                <option value="6">GIRO PERORANGAN </option>
                                                <option value="7">GIRO WADIAH ESCROW</option>
                                                <option value="8">GIRO PERORANGAN KHUSUS</option>
                                                <option value="9">GIRO PERORANGAN UMUM</option>
                                                <option value="10">TABUNGAN VALAS WADIAH</option>
                                                <option value="11">TABUNGAN EASY WADIAH</option>
                                                <option value="12">TABUNGANKU</option> -->
                                                <!-- <option value="6010">TABUNGAN EASY MUDHARABAH</option> -->
                                               <!--  <option value="14">TABUNGAN HAJI WADIAH</option>
                                                <option value="15">TABUNGAN HAJI MUDHARABAH</option>
                                                <option value="16">TABUNGAN BISNIS</option>
                                                <option value="17">TABUNGAN VALAS MUDHARABAH</option> -->
                                            </select>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Tujuan Buka Rekening *</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select id="account_purpose"  class="form-select" aria-label="Default select example">
                                                <option selected>- Silahkan Pilih -</option>                                          
                                               <!--  <option value="22">HAJI</option>
                                                <option value="13">INVESTASI</option>
                                                <option value="11">MENYIMPAN DANA</option>
                                                <option value="12">PEMBAYARAN GAJI</option>
                                                <option value="14">PINJAMAN</option>                                          
                                                <option value="21">TRANSAKSI</option>
                                                <option value="16">UMROH</option>
                                                <option value="15">LAINNYA</option> -->                                             
                                            </select>
                                        </div>
                                    </div>


                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">No CIF *</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="text" class="form-control" id="input_cif_number" aria-describedby="emailHelp">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                           
                                        </div>
                                        <div class="col-lg-1">
                                          
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                        <button type="button" class="btn btn-info btn-cif" onclick="getCIFDataUsingCIFAccount(this)">Cek CIF</button>
                                        </div>
                                    </div>

                                    <hr>

                                    <p class="text-pembukaan mb-4">Informasi Nasabah</p>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Nama Lengkap *</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="text" class="form-control" id="input_full_name" aria-describedby="emailHelp"  readonly="readonly">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Nama Tercetak *</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="text" class="form-control" id="input_printed_name" aria-describedby="emailHelp" readonly="readonly">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Tempat Lahir *</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="text" class="form-control" id="input_place_of_birth" aria-describedby="emailHelp" readonly="readonly">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Tanggal Lahir (ddmmyyyy) *</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="date" class="form-control" id="input_date_of_birth" aria-describedby="emailHelp" readonly="readonly">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Nama Ibu Kandung *</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="text" class="form-control" id="input_mother_name" aria-describedby="emailHelp" readonly="readonly">
                                        </div>
                                    </div>

                                    <hr>

                                    <p class="text-pembukaan mb-4">Informasi Tambahan (Opsional)</p>

                                    <div class="row">
                                    <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Zakat *</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select id="zakat" class="form-select" aria-label="Default select example">
                                                <option selected>- Silahkan Pilih -</option>
                                               <!-- <option value="Y">YA</option> -->
                                                <!-- <option value="N">TIDAK</option> -->
                                            </select>
                                        </div>
                                    </div>

                                    <hr>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Account Officer *</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="text" class="form-control" id="account_officer" aria-describedby="emailHelp">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col text-center">
                                            <label class="btn btn-info" onclick="submitMakeNewAccountExisting(this)">Submit</label>
                                        </div>
                                    </div>

                                </div>
                            </div>

                        </form>

                    </div>
                    <!-- /.container-fluid

                </div>
                <!-- End of Main Content -->


                <!-- End of Footer -->

            </div>
            <!-- End of Content Wrapper -->

        </div>
        <!-- End of Page Wrapper -->
        <!-- Footer -->
      

    <!-- Scroll to Top Button-->
    <a class="scroll-to-top rounded" href="#page-top">
        <i class="fas fa-angle-up"></i>
    </a>
    <script>

        function masterData(){
            $.ajax({
                url: "/get-master-data",
                method:"get",
                data:{
                    _token:"{{ csrf_token() }}",
                },
                success:function(response){
                    if(response.message === "Get All Master Data Sucess!") {

                        $('#account_purpose').empty();
                        $('#account_purpose').append('<option hidden>Silahkan Pilih</option>'); 
                        var len = response.data.retail.length;
                        for( var i = 0; i<len; i++){
                            var id = response.data.retail[i]['id'];
                            var name = response.data.retail[i]['description'];
                            $("#account_purpose").append("<option value='"+id+"'>"+name+"</option>");
                        }

                        
                        $('#account_type').empty();
                        $('#account_type').append('<option hidden>Silahkan Pilih</option>'); 
                        var len = response.data.products.length;
                        for( var i = 0; i<len; i++){
                            var id = response.data.products[i]['id'];
                            var name = response.data.products[i]['description'];
                            $("#account_type").append("<option value='"+id+"'>"+name+"</option>");
                        }

                        $('#zakat').empty();
                        $('#zakat').append('<option hidden>Silahkan Pilih</option>'); 
                        var len = response.data.zakats.length;
                        for( var i = 0; i<len; i++){
                            var id = response.data.zakats[i]['id'];
                            var name = response.data.zakats[i]['description'];
                            $("#zakat").append("<option value='"+id+"'>"+name+"</option>");
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
        function getCIFDataUsingCIFAccount(element) {
            // let $td         = $(element).closest('tr').children('td');
            let cif_number = document.getElementById("input_cif_number").value;
            if(cif_number === ""){
                Swal.fire({
                    title: 'Error!!',
                    text: "CIF Number cannot empty",
                    icon: 'error',
                    showCancelButton: false,
                    confirmButtonText: 'Yes!',
                }).then(function (e) {
                    $("#input_full_name").val("");
                    $("#input_printed_name").val("");
                    $("#input_place_of_birth").val("");
                    $("#input_date_of_birth").val("");
                    $("#input_mother_name").val("");

                }, function (dismiss) {
                    return false;
                })
            }else{
                $.ajax({
                    url: "/get-cif-data-by-cif-number",
                    method:"post",
                    data:{
                        _token:"{{ csrf_token() }}",
                        cif_number:cif_number
                    },
                    success:function(response){
                        if(response.message !== "Get CIF Data Succesfully") {
                            Swal.fire({
                                title: 'Error!!',
                                text: response.message,
                                icon: 'error',
                                showCancelButton: false,
                                confirmButtonText: 'Yes!',
                            }).then(function (e) {
                                // console("masuk"+e.value);
                                // if (e.value === true) {
                                
                                // }

                            }, function (dismiss) {
                                console("masuk 1"+e.value);
                                return false;
                            })
                            
                        }else{
                            // console.log
                            $("#input_full_name").val(response.data.shortName);
                            $("#input_printed_name").val(response.data.shortName);
                            $("#input_place_of_birth").val(response.data.placeBirth);
                            const myArray = response.data.dateOfBirth.split("");
                            year = myArray[0]+myArray[1]+myArray[2]+myArray[3];
                            month = myArray[4]+myArray[5];
                            date = myArray[6]+myArray[7];
                            // document.getElementById("input_date_of_birth").value = "2014-02-09";
                            $("#input_date_of_birth").val(year+"-"+month+"-"+date);
                            $("#input_mother_name").val(response.data.mothMaiden);

                        }              
                    },
                    error: function(error) {
                        console.log(error);
                    }
                });
            }
        }

        function submitMakeNewAccountExisting(element){

            $.ajax({
                url: "/submit-account-existing",
                method:"post",
                data:{
                    _token:"{{ csrf_token() }}",
                    product_code:document.getElementById("account_type").value,
                    short_name:document.getElementById("input_full_name").value,
                    printed_name:document.getElementById("input_printed_name").value,
                    account_open_purpose:document.getElementById("account_purpose").value,
                    account_officer:document.getElementById("account_officer").value,
                    cif_number:document.getElementById("input_cif_number").value,
                    zakat:document.getElementById("zakat").value,
                    place_of_birth:document.getElementById("input_place_of_birth").value,
                    date_of_birth:document.getElementById("input_date_of_birth").value,
                    mother_name:document.getElementById("input_mother_name").value
                },
                success:function(response){
           
                    if(response.message === "Mudharabah account created!") {
                        Swal.fire({
                            title: 'Success!!',
                            text: response.message,
                            icon: 'success',
                            showCancelButton: false,
                            confirmButtonText: 'Yes!',
                        }).then(function (e) {
                            if (e.value === true) {
                                window.location="{{url('/account-otorisasi')}}";
                            }

                        }, function (dismiss) {
                            return false;
                        })

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
    </script>
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

    <footer class="sticky-footer" style="background-color: #00A39D;">
        <div class="container my-auto">
            <div class="copyright text-center my-auto">
                <center>
                    <p style="color:white"> (c) 2016 - 2022 PT. Bank Syariah Indonesia Tbk, All Right Reserved.
                </center>
            </div>
        </div>
        </div>
    </footer>

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