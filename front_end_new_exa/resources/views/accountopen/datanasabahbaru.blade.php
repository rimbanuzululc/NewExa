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
    <div class="dashboard-main">

        <!-- Topbar -->
        <nav class="navbar navbar-dashboard navbar-expand navbar-light bg-white topbar static-top shadow">

            <a class="sidebar-brand d-flex align-items-center justify-content-center logo-dashboard" href="/dashboard">
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
                    <button type="button" class="buttonLogout", align="center-left" onclick="location.href='{{ url('/logout') }}'" > LOGOUT <button>
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
                                </select>
                            </div>

                            <hr>

                            <div class="card shadow">


                                <!-- ======PEMBUKAAN REKENING====== -->

                                     <p>Pembukaan Rekening Nasabah Baru CIF Perorangan</p>
                                <div class="card-body text-form">
                                    <p class="text-pembukaan">Informasi Pembukaan Rekening</p>
                                     <p><br>
                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Produk </label>
                                        </div>
                                        <label  style="color:red" for="exampleInputEmail1" class="form-label">*</label>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example" id="account_type">
                                                <option selected>- Silahkan Pilih -</option>
                                               
                                                <!-- <option value="6010">TABUNGAN EASY MUDHARABAH</option> -->
                                             
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
                                            <select class="form-select" aria-label="Default select example" id="account_purpose">
                                                <option selected>- Silahkan Pilih -</option>                                          
                                                                                            
                                            </select>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Jenis Identitas *</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example" id="legal_type">                                         
                                                <option selected>- Silahkan Pilih -</option>                                          
                                                                        
                                            </select>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">No Identitas *</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="number" class="form-control" id="legal_id_number" aria-describedby="emailHelp" >
                                        </div>
                                    </div>

                                    <hr>

                                    <!-- ======INFORMASI DATA Nasabah====== -->

                                    <p class="text-pembukaan">Informasi Data E-KTP</p>
                                    <p><br>
                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Nama Sesuai Identitas *</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="text" class="form-control" id="name_based_on_identity" aria-describedby="emailHelp" pattern="[A-Za-z]" onkeyup ="onChangeName()">
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
                                            <input type="text" class="form-control" pattern="[A-Za-z]" id="mother_name" aria-describedby="emailHelp" onkeyup="onChangeMotherName()">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Tempat Lahir</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="text" class="form-control"  pattern="[A-Za-z]" id="place_of_birth" aria-describedby="emailHelp" onkeyup="onChangePlaceBirth()">
                                        </div>
                                        
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Tanggal Lahir (ddmmyyyy) *</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-2">
                                            <input type="date" class="form-control" id="date_of_birth" aria-describedby="emailHelp">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Jenis Kelamin *</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example" id="gender">                                         
                                                <option selected>- Silahkan Pilih -</option>                                          
                                                               
                                            </select>
                                        </div>
                                    </div>
                                
                                    <hr>
                                    <p class="text-pembukaan">Informasi Data Nasabah</p>
                                     <p><br>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Nama Lengkap *</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="text" class="form-control" pattern="[A-Za-z]" id="full_name" aria-describedby="emailHelp" readonly>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Nama Panggilan</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="text" class="form-control"  pattern="[A-Za-z]" id="given_name" aria-describedby="emailHelp">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Nama Alias</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="text" class="form-control" pattern="[A-Za-z]" id="family_name" aria-describedby="emailHelp">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Gelar Depan Nama</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example" id="advance_title">
                                            <option selected>- Silahkan Pilih -</option>
                         
                                            </select>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Gelar Belakang Nama</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example" id="back_degree">
                                            <option selected>- Silahkan Pilih -</option>
                                         
                                            </select>
                                        </div>
                                    </div>

                                    <hr>
                                    <p class="text-pembukaan">Informasi Alamat Identitas</p>
                                     <p><br>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Alamat Sesuai Identitas *</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="text" class="form-control" id="street" aria-describedby="emailHelp" onkeyup="autoFillResidenceAddress(); onChangeStreet()">
                                            <!-- <p><br> -->
                                            <!-- <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"> -->
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">RT / RW *</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="col-lg-2">
                                            <input type="text" class="form-control" id="rt" aria-describedby="emailHelp" onkeyup="autoFillResidenceAddress()">
                                        </div>
                                        <div class="mb-3 col-lg-2">
                                            <input type="text" class="form-control" id="rw" aria-describedby="emailHelp" onkeyup="autoFillResidenceAddress()">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Negara</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example" id="country" onchange="onChangeCountry(); autoFillResidenceAddress()">
                                                <option selected>- Silahkan Pilih -</option>
                                                <option value="ID">Indonesia</option>

                                             
                                            </select>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Provinsi</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example" id="province" onchange="onChangeProvince(); autoFillResidenceAddress()">
                                                <option selected>- Silahkan Pilih -</option>
                                        
                                                         
                                            </select>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Kabupaten / Kota *</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example" id="city" onchange="onChangeCity(); autoFillResidenceAddress()">
                                                <option selected>- Silahkan Pilih -</option>
                                                <option value="Jakarta">Jakarta</option>
                                                      
                                            </select>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Kecamatan *</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example" id="districts" onchange="onChangeDistrict(); autoFillResidenceAddress()">
                                                <option selected>- Silahkan Pilih -</option>
                                                    
                                            </select>
                                        </div>
                                    </div>
                                        

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Desa/Kelurahan *</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example" id="villages" onchange="autoFillResidenceAddress()">
                                                <option selected>- Silahkan Pilih -</option>
                                                 
                                            </select>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Kode Pos *</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="text" class="form-control" id="postal_code" aria-describedby="emailHelp" onkeyup="autoFillResidenceAddress()">
                                        </div>
                                    </div>

                                    

                                    

                                    <hr>
                                    <p class="text-pembukaan">Informasi Alamat Domisili</p>
                                     <p><br>
                                    <div>
                                        <div class="row">
                                            <div class="col-lg-3">
                                                <input type="checkbox" id="same_with_address_based_on_identity" value="same_or_not" onclick="validate()">
                                            </div >
                                            <div class="col-lg-3">
                                                <label for="same_with_address_based_on_identity"> Sama Dengan Alamat Identitas</label>
                                            </div>
                                            
                                        </div>
                                    </div>
                                    <div id="residence_address">
                                         <div class="row">
                                            <div class="col-lg-3">
                                                <label for="exampleInputEmail1" class="form-label">Alamat Sesuai Domisili (*)</label>
                                            </div>
                                            <div class="col-lg-1">
                                                <label for="exampleInputEmail1" class="form-label">:</label>
                                            </div>
                                            <div class="mb-3 col-lg-6">
                                                <input type="text" class="form-control" id="addr_street" aria-describedby="emailHelp" onkeyup ="onChangeAddrStreet()">
                                            </div>
                                        </div>

                                        <div class="row">
                                            <div class="col-lg-3">
                                                <label for="exampleInputEmail1" class="form-label">RT / RW *</label>
                                            </div>
                                            <div class="col-lg-1">
                                                <label for="exampleInputEmail1" class="form-label">:</label>
                                            </div>
                                            <div class="col-lg-2">
                                                <input type="text" class="form-control" id="addr_rt" aria-describedby="emailHelp">
                                            </div>
                                            <div class="mb-3 col-lg-2">
                                                <input type="text" class="form-control" id="addr_rw" aria-describedby="emailHelp">
                                            </div>
                                        </div>

                                        <div class="row">
                                            <div class="col-lg-3">
                                                <label for="exampleInputEmail1" class="form-label">Negara</label>
                                            </div>
                                            <div class="col-lg-1">
                                                <label for="exampleInputEmail1" class="form-label">:</label>
                                            </div>
                                            <div class="mb-3 col-lg-6">
                                                <select class="form-select" aria-label="Default select example" id="addr_country" onchange="onChangeAddrCountry()">
                                                    <option selected>- Silahkan Pilih -</option>
                                                    <option value="ID">Indonesia</option>
                                                
                                                    
                                                </select>
                                            </div>
                                        </div>

                                        <div class="row">
                                            <div class="col-lg-3">
                                                <label for="exampleInputEmail1" class="form-label">Provinsi</label>
                                            </div>
                                            <div class="col-lg-1">
                                                <label for="exampleInputEmail1" class="form-label">:</label>
                                            </div>
                                            <div class="mb-3 col-lg-6">
                                                <select class="form-select" aria-label="Default select example" id="addr_province" onchange="onChangeAddrProvince()">
                                                    <option selected>- Silahkan Pilih -</option>
                                      
                                                    
                                                </select>
                                            </div>
                                        </div>

                                        <div class="row">
                                            <div class="col-lg-3">
                                                <label for="exampleInputEmail1" class="form-label">Kabupaten / Kota *</label>
                                            </div>
                                            <div class="col-lg-1">
                                                <label for="exampleInputEmail1" class="form-label">:</label>
                                            </div>
                                            <div class="mb-3 col-lg-6">
                                                <select class="form-select" aria-label="Default select example" id="addr_city" onchange="onChangeAddrCity()">
                                                    <option selected>- Silahkan Pilih -</option>
                                              
                                                         
                                                </select>
                                            </div>
                                        </div>

                                         <div class="row">
                                            <div class="col-lg-3">
                                                <label for="exampleInputEmail1" class="form-label">Kecamatan *</label>
                                            </div>
                                            <div class="col-lg-1">
                                                <label for="exampleInputEmail1" class="form-label">:</label>
                                            </div>
                                            <div class="mb-3 col-lg-6">
                                                <select class="form-select" aria-label="Default select example" id="addr_district"  onchange="onChangeAddrDistrict()">
                                                    <option selected>- Silahkan Pilih -</option>
                                                    <option value="Jakarta">Jakarta</option>
                                                             
                                                </select>
                                            </div>
                                        </div>

                                        <div class="row">
                                            <div class="col-lg-3">
                                                <label for="exampleInputEmail1" class="form-label">Desa/Kelurahan *</label>
                                            </div>
                                            <div class="col-lg-1">
                                                <label for="exampleInputEmail1" class="form-label">:</label>
                                            </div>
                                            <div class="mb-3 col-lg-6">
                                                <select class="form-select" aria-label="Default select example" id="addr_village">
                                                    <option selected>- Silahkan Pilih -</option>
                                                    <option value="Jakarta">Jakarta</option>
                                                             
                                                </select>
                                            </div>
                                        </div>

                                        <div class="row">
                                            <div class="col-lg-3">
                                                <label for="exampleInputEmail1" class="form-label">Kode Pos *</label>
                                            </div>
                                            <div class="col-lg-1">
                                                <label for="exampleInputEmail1" class="form-label">:</label>
                                            </div>
                                            <div class="mb-3 col-lg-6">
                                                <input type="text" class="form-control" id="addr_postal_code" aria-describedby="emailHelp">
                                            </div>
                                        </div>

                                    </div>

                                    <div id="residence_address2" >
                                         <div class="row">
                                            <div class="col-lg-3">
                                                <label for="exampleInputEmail1" class="form-label">Alamat Sesuai Domisili *</label>
                                            </div>
                                            <div class="col-lg-1">
                                                <label for="exampleInputEmail1" class="form-label">:</label>
                                            </div>
                                            <div class="mb-3 col-lg-6">
                                                <input type="text" class="form-control" id="addr_street2" aria-describedby="emailHelp" readonly>
                                            </div>
                                        </div>

                                        <div class="row">
                                            <div class="col-lg-3">
                                                <label for="exampleInputEmail1" class="form-label">RT / RW *</label>
                                            </div>
                                            <div class="col-lg-1">
                                                <label for="exampleInputEmail1" class="form-label">:</label>
                                            </div>
                                            <div class="col-lg-2">
                                                <input type="text" class="form-control" id="addr_rt2" aria-describedby="emailHelp" readonly>
                                            </div>
                                            <div class="mb-3 col-lg-2">
                                                <input type="text" class="form-control" id="addr_rw2" aria-describedby="emailHelp" readonly>
                                            </div>
                                        </div>

                                        <div class="row">
                                            <div class="col-lg-3">
                                                <label for="exampleInputEmail1" class="form-label">Negara</label>
                                            </div>
                                            <div class="col-lg-1">
                                                <label for="exampleInputEmail1" class="form-label">:</label>
                                            </div>
                                            <div class="mb-3 col-lg-6">
                                                <input type="text" class="form-control" id="addr_country2" aria-describedby="emailHelp" readonly>
                                             
                                            </div>
                                        </div>

                                        <div class="row">
                                            <div class="col-lg-3">
                                                <label for="exampleInputEmail1" class="form-label">Provinsi</label>
                                            </div>
                                            <div class="col-lg-1">
                                                <label for="exampleInputEmail1" class="form-label">:</label>
                                            </div>
                                            <div class="mb-3 col-lg-6">
                                                
                                                <input type="text" class="form-control" id="addr_province2" aria-describedby="emailHelp" readonly>
                                                
                                            </div>
                                        </div>

                                        <div class="row">
                                            <div class="col-lg-3">
                                                <label for="exampleInputEmail1" class="form-label">Kabupaten / Kota *</label>
                                            </div>
                                            <div class="col-lg-1">
                                                <label for="exampleInputEmail1" class="form-label">:</label>
                                            </div>
                                            <div class="mb-3 col-lg-6">
                                                
                                                <input type="text" class="form-control" id="addr_city2" aria-describedby="emailHelp" readonly>
                                             
                                                
                                            </div>
                                        </div>

                                         <div class="row">
                                            <div class="col-lg-3">
                                                <label for="exampleInputEmail1" class="form-label">Kecamatan *</label>
                                            </div>
                                            <div class="col-lg-1">
                                                <label for="exampleInputEmail1" class="form-label">:</label>
                                            </div>
                                            <div class="mb-3 col-lg-6">
                                            
                                                <input type="text" class="form-control" id="addr_district2" aria-describedby="emailHelp" readonly>
                                               
                                            </div>
                                        </div>

                                        <div class="row">
                                            <div class="col-lg-3">
                                                <label for="exampleInputEmail1" class="form-label">Desa/Kelurahan *</label>
                                            </div>
                                            <div class="col-lg-1">
                                                <label for="exampleInputEmail1" class="form-label">:</label>
                                            </div>
                                            <div class="mb-3 col-lg-6">
                                                
                                                <input type="text" class="form-control" id="addr_village2" aria-describedby="emailHelp" readonly>
                                              
                                                
                                            </div>
                                        </div>

                                        <div class="row">
                                            <div class="col-lg-3">
                                                <label for="exampleInputEmail1" class="form-label">Kode Pos (*)</label>
                                            </div>
                                            <div class="col-lg-1">
                                                <label for="exampleInputEmail1" class="form-label">:</label>
                                            </div>
                                            <div class="mb-3 col-lg-6">
                                       
                                                <input type="text" class="form-control" id="addr_postal_code2" aria-describedby="emailHelp" readonly>
                                         
                                               
                                            </div>
                                        </div>

                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">No. Telp</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="text" class="form-control" id="addr_phone_number" aria-describedby="emailHelp">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">No. Telp. Selular *</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="text" class="form-control" id="addr_celular_phone" aria-describedby="emailHelp">
                                        </div>
                                    </div>

                                    <hr>
                                    <p class="text-pembukaan">Informasi Dana Nasabah</p>
                                     <p><br>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Sumber Dana *</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example" id="fund_source">
                                                <option selected>- Silahkan Pilih -</option>
                                               
                                                </select>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Jumlah Sumber Dana (Bulanan) (*)</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example" id="fund_source_amt">
                                                <option selected>- Silahkan Pilih -</option>
                                                
                                                </select>
                                        </div>
                                    </div>

                                    <hr>
                                    <p class="text-pembukaan">Informasi Data Pekerjaan</p>
                                     <p><br>

                                     <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Status Pekerjaan *</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example" id="job_status">
                                                <option selected>- Silahkan Pilih -</option>
                                      
                                            </select>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Jenis Pekerjaan *</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example" id="job_title">
                                                <option selected>- Silahkan Pilih -</option>
                                            
                                            </select>
                                        </div>
                                    </div>



                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Jabatan *</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="text" class="form-control" id="occupations" aria-describedby="emailHelp" onkeyup ="onChangeOccupations()">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Nama Perusahaan *</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example" id="company" onchange="onChangeCompany()">
                                                <option selected>- Silahkan Pilih -</option>
                                                <!-- <option value="">Astra</option>
                                                <option value="">Saratoga  -->Tbk</option>     
                                            </select>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Alamat Perusahaan *</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="text" class="form-control" id="employers_address" aria-describedby="emailHelp" onkeyup="onChangeEmployersAddress()">
                                            
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Bidang Usaha *</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example" id="business_type">
                                                <option selected>- Silahkan Pilih -</option>
                                    
                                            </select>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Mulai Bekerja (ddmmyyyy) *</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-2">
                                            <input type="date" class="form-control" id="employment_start" aria-describedby="emailHelp">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">No. Telp Kantor</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="text" class="form-control" id="office_phone" aria-describedby="emailHelp">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">No. NPWP *</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input  class="form-control" id="tax_id" type="number" aria-describedby="emailHelp">
                                        </div>
                                    </div>

                                    
                                    <hr>
                                    <p class="text-pembukaan">Informasi Lainnya</p>
                                     <p><br>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Status Pernikahan *</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example" id="marital_status">
                                                <option selected>- Silahkan Pilih -</option>
                                           
                                            </select>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Pendidikan *</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example" id="education">
                                                <option selected>- Silahkan Pilih -</option>
                                                 
                                            </select>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Agama *</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example" id="religion">
                                                <option selected>- Silahkan Pilih -</option>
                                                    
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
                                            <label class="btn btn-info" onclick="submitNewCIF(this)" >Submit</label>
                                        </div>
                                    </div>

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
                <center>
                    <p style="color:white"> (c) 2016 - 2022 PT. Bank Syariah Indonesia Tbk, All Right Reserved.
                </center>
            </div>
        </div>
        </div>
    </footer>

    <!-- Scroll to Top Button-->
    <a class="scroll-to-top rounded" href="#page-top">
        <i class="fas fa-angle-up"></i>
    </a>
    <script>

        function autoFillResidenceAddress(){
            if (document.getElementById('same_with_address_based_on_identity').checked) {
                $('#addr_street2').val(document.getElementById("street").value);
                $('#addr_rt2').val(document.getElementById("rt").value);
                $('#addr_rw2').val(document.getElementById("rw").value);
                $('#addr_postal_code2').val(document.getElementById("postal_code").value);
                
                console.log("coun " +document.getElementById("country").value);
                if(document.getElementById("country").value==="ID"){
                    $("#addr_country2").val("Indonesia");
                }else{
                    $("#addr_country2").val("");
                }
                console.log(document.getElementById("province").value);

                if(document.getElementById("province").value!=="- Silahkan Pilih -"){
                    $.ajax({
                        url: "/get-province-by-id",
                        method:"get",
                        data:{
                            _token:"{{ csrf_token() }}",
                            province_id:document.getElementById("province").value
                        },
                        success:function(response){
                            if(response.message === "Get Province Data Success!") {
                                $("#addr_province2").val(response.data.name);
                            }            
                        },
                        error: function(error) {
                            console.log(error);
                        }
                    });
                }else if(document.getElementById("province").value==="- Silahkan Pilih -"){
                    $("#addr_province2").val("");
                }

                if(document.getElementById("city").value!=="- Silahkan Pilih -"){
                    $.ajax({
                        url: "/get-regency-by-id",
                        method:"get",
                        data:{
                            _token:"{{ csrf_token() }}",
                            regency_id:document.getElementById("city").value
                        },
                        success:function(response){
                            if(response.message === "Get Regency Data Success!") {
                                $("#addr_city2").val(response.data.name);
                            }            
                        },
                        error: function(error) {
                            console.log(error);
                        }
                    });
                }else if(document.getElementById("city").value==="- Silahkan Pilih -"){
                    $("#addr_city2").val("");
                }

                if(document.getElementById("districts").value!=="- Silahkan Pilih -"){
                    $.ajax({
                        url: "/get-district-by-id",
                        method:"get",
                        data:{
                            _token:"{{ csrf_token() }}",
                            district_id:document.getElementById("districts").value
                        },
                        success:function(response){
                            if(response.message === "Get District Data Success!") {
                                $("#addr_district2").val(response.data.name);
                            }            
                        },
                        error: function(error) {
                            console.log(error);
                        }
                    });
                }else if(document.getElementById("districts").value==="- Silahkan Pilih -"){
                    $("#addr_district2").val("");
                }

                if(document.getElementById("villages").value!=="- Silahkan Pilih -"){
                    $.ajax({
                        url: "/get-village-by-id",
                        method:"get",
                        data:{
                            _token:"{{ csrf_token() }}",
                            district_id:document.getElementById("villages").value
                        },
                        success:function(response){
                            if(response.message === "Get Village Data Success!") {
                                $("#addr_village2").val(response.data.name);
                            }            
                        },
                        error: function(error) {
                            console.log(error);
                        }
                    });
                }else if(document.getElementById("villages").value==="- Silahkan Pilih -"){
                    $("#addr_village2").val("");
                }
            }
        }

        function onChangeName(){
            const arr = document.getElementById("name_based_on_identity").value.split(" ");
            for (var i = 0; i < arr.length; i++) {
                arr[i] = arr[i].trim().charAt(0).toUpperCase() + arr[i].slice(1);

            }
            const str2 = arr.join(" ");
            $("#name_based_on_identity").val(str2);
            $("#full_name").val(str2);
            $("#given_name").val(str2.split(" ")[0]);
            if(str2.split(" ").at(-1) ==="" ){
                $("#family_name").val(str2.split(" ").at(-2));
            }else{
                $("#family_name").val(str2.split(" ").at(-1));
            }
            
        }

        function onChangeMotherName(){
            const arr = document.getElementById("mother_name").value.split(" ");
            for (var i = 0; i < arr.length; i++) {
                arr[i] = arr[i].trim().charAt(0).toUpperCase() + arr[i].slice(1);

            }
            const str2 = arr.join(" ");
            $("#mother_name").val(str2);
        }

        function onChangeStreet(){
            const arr = document.getElementById("street").value.split(" ");
            for (var i = 0; i < arr.length; i++) {
                arr[i] = arr[i].trim().charAt(0).toUpperCase() + arr[i].slice(1);

            }
            const str2 = arr.join(" ");
            $("#street").val(str2);
        }

        function onChangeAddrStreet(){
            const arr = document.getElementById("addr_street").value.split(" ");
            for (var i = 0; i < arr.length; i++) {
                arr[i] = arr[i].trim().charAt(0).toUpperCase() + arr[i].slice(1);

            }
            const str2 = arr.join(" ");
            $("#addr_street").val(str2);
        }
        onChangeStreet

        function onChangeOccupations(){
            const arr = document.getElementById("occupations").value.split(" ");
            for (var i = 0; i < arr.length; i++) {
                arr[i] = arr[i].trim().charAt(0).toUpperCase() + arr[i].slice(1);

            }
            const str2 = arr.join(" ");
            $("#occupations").val(str2);
        }

        function onChangePlaceBirth(){
            const arr = document.getElementById("place_of_birth").value.split(" ");
            for (var i = 0; i < arr.length; i++) {
                arr[i] = arr[i].trim().charAt(0).toUpperCase() + arr[i].slice(1);

            }
            const str2 = arr.join(" ");
            $("#place_of_birth").val(str2);
        }

        function onChangeEmployersAddress() {
            const arr = document.getElementById("employers_address").value.split(" ");
            for (var i = 0; i < arr.length; i++) {
                arr[i] = arr[i].trim().charAt(0).toUpperCase() + arr[i].slice(1);

            }
            const str2 = arr.join(" ");
            $("#employers_address").val(str2);
        }

        function validate() {
            if (document.getElementById('same_with_address_based_on_identity').checked) {
                // alert("checked");
                document.getElementById("residence_address").style.display = "none";
                document.getElementById("residence_address2").style.display = "block";
                autoFillResidenceAddress();
 
            } else {
                document.getElementById("residence_address2").style.display = "none";
                document.getElementById("residence_address").style.display = "block";
            }
        }

        function onChangeCompany(){
            if(document.getElementById("company").value !="- Silahkan Pilih -"){
                $.ajax({
                    url: "/get-company-detail-by-company-address",
                    method:"get",
                    data:{
                        _token:"{{ csrf_token() }}",
                        company_name:document.getElementById("company").value
                    },
                    success:function(response){
                        if(response.message === "Get Company Detail Success!") {
                            console.log("berhasil");
                            $('#employers_address').val(response.data.address);
                            
                        }else{
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
                        }              
                    },
                    error: function(error) {
                        console.log(error);
                    }
                });
            }else{
                $('#employers_address').val("");
            }    
        }


        

        function onChangeCountry(){
            if(document.getElementById("country").value =="ID"){
                $.ajax({
                    url: "/get-all-province",
                    method:"get",
                    data:{
                        _token:"{{ csrf_token() }}",
                    },
                    success:function(response){
                        if(response.message === "Get All Provinces Success!") {
                            $('#province').empty();
                            $('#province').append('<option selected>- Silahkan Pilih -</option>'); 
                            var len = response.data.length;
                            for( var i = 0; i<len; i++){
                                var id = response.data[i]['id'];
                                var name = response.data[i]['name'];
                                $("#province").append("<option value='"+id+"'>"+name+"</option>");
                            }
                            $('#city').empty();
                            $('#city').append('<option selected>- Silahkan Pilih -</option>');
                            $('#districts').empty();
                            $('#districts').append('<option selected>- Silahkan Pilih -</option>');
                            $('#villages').empty();
                            $('#villages').append('<option selected>- Silahkan Pilih -</option>');
                                
                        }else{
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
                        }              
                    },
                    error: function(error) {
                        console.log(error);
                    }
                });
            }else{
                $('#province').empty();
                $('#province').append('<option selected>- Silahkan Pilih -</option>');
                $('#city').empty();
                $('#city').append('<option selected>- Silahkan Pilih -</option>');
                $('#districts').empty();
                $('#districts').append('<option selected>- Silahkan Pilih -</option>');
                $('#villages').empty();
                $('#villages').append('<option selected>- Silahkan Pilih -</option>');
            }    
        }

        function onChangeProvince(){
            if(document.getElementById("province").value !="- Silahkan Pilih -"){
                $.ajax({
                    url: "/get-city-by-province-id",
                    method:"get",
                    data:{
                        _token:"{{ csrf_token() }}",
                        province_id:document.getElementById("province").value
                    },
                    success:function(response){
                        if(response.message === "Get All Regencies By Province Id Success!") {
                            $('#city').empty();
                            $('#city').append('<option selected>- Silahkan Pilih -</option>'); 
                            var len = response.data.length;
                            for( var i = 0; i<len; i++){
                                var id = response.data[i]['id'];
                                var name = response.data[i]['name'];
                                $("#city").append("<option value='"+id+"'>"+name+"</option>");
                            }
                            $('#districts').empty();
                            $('#districts').append('<option selected>- Silahkan Pilih -</option>');
                            $('#villages').empty();
                            $('#villages').append('<option selected>- Silahkan Pilih -</option>');
                                            
                        }else{
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
                        }              
                    },
                    error: function(error) {
                        console.log(error);
                    }
                });
            }else{
                $('#city').empty();
                $('#city').append('<option selected>- Silahkan Pilih -</option>');
                $('#districts').empty();
                $('#districts').append('<option selected>- Silahkan Pilih -</option>');
                $('#villages').empty();
                $('#villages').append('<option selected>- Silahkan Pilih -</option>');
            }    
        }

        function onChangeCity(){
            if(document.getElementById("city").value !="- Silahkan Pilih -"){
                $.ajax({
                    url: "/get-district-by-city-id",
                    method:"get",
                    data:{
                        _token:"{{ csrf_token() }}",
                        city_id:document.getElementById("city").value
                    },
                    success:function(response){
                        if(response.message === "Get All District By Regency Id Success!") {
                            $('#districts').empty();
                            $('#districts').append('<option selected>- Silahkan Pilih -</option>'); 
                            var len = response.data.length;
                            for( var i = 0; i<len; i++){
                                var id = response.data[i]['id'];
                                var name = response.data[i]['name'];
                                $("#districts").append("<option value='"+id+"'>"+name+"</option>");
                            }
                            $('#villages').empty();
                            $('#villages').append('<option selected>- Silahkan Pilih -</option>');
                                
                        }else{
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
                        }              
                    },
                    error: function(error) {
                        console.log(error);
                    }
                });
            }else{
                $('#districts').empty();
                $('#districts').append('<option selected>- Silahkan Pilih -</option>');
                $('#villages').empty();
                $('#villages').append('<option selected>- Silahkan Pilih -</option>');
            }    
        }

        function onChangeDistrict(){
            if(document.getElementById("districts").value !="- Silahkan Pilih -"){
                $.ajax({
                    url: "/get-village-by-district-id",
                    method:"get",
                    data:{
                        _token:"{{ csrf_token() }}",
                        district_id:document.getElementById("districts").value
                    },
                    success:function(response){
                        if(response.message === "Get All Village By Province Id Success!") {
                            $('#villages').empty();
                            $('#villages').append('<option selected>- Silahkan Pilih -</option>'); 
                            var len = response.data.length;
                            for( var i = 0; i<len; i++){
                                var id = response.data[i]['id'];
                                var name = response.data[i]['name'];
                                $("#villages").append("<option value='"+id+"'>"+name+"</option>");
                            }
                                
                        }else{
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
                        }              
                    },
                    error: function(error) {
                        console.log(error);
                    }
                });
            }else{
                $('#villages').empty();
                $('#villages').append('<option selected>- Silahkan Pilih -</option>');
            }    
        }

        function onChangeAddrCountry(){
            if(document.getElementById("addr_country").value =="ID"){
                $.ajax({
                    url: "/get-all-province",
                    method:"get",
                    data:{
                        _token:"{{ csrf_token() }}",
                    },
                    success:function(response){
                        if(response.message === "Get All Provinces Success!") {
                            $('#addr_province').empty();
                            $('#addr_province').append('<option selected>- Silahkan Pilih -</option>'); 
                            var len = response.data.length;
                            for( var i = 0; i<len; i++){
                                var id = response.data[i]['id'];
                                var name = response.data[i]['name'];
                                $("#addr_province").append("<option value='"+id+"'>"+name+"</option>");
                            }
                            $('#addr_city').empty();
                            $('#addr_city').append('<option selected>- Silahkan Pilih -</option>');
                            $('#addr_district').empty();
                            $('#addr_district').append('<option selected>- Silahkan Pilih -</option>');
                            $('#addr_village').empty();
                            $('#addr_village').append('<option selected>- Silahkan Pilih -</option>');
                                
                        }else{
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
                        }              
                    },
                    error: function(error) {
                        console.log(error);
                    }
                });
            }else{
                $('#addr_province').empty();
                $('#addr_province').append('<option selected>- Silahkan Pilih -</option>');
                $('#addr_city').empty();
                $('#addr_city').append('<option selected>- Silahkan Pilih -</option>');
                $('#addr_district').empty();
                $('#addr_district').append('<option selected>- Silahkan Pilih -</option>');
                $('#addr_village').empty();
                $('#addr_village').append('<option selected>- Silahkan Pilih -</option>');
            }    
        }

        function onChangeAddrProvince(){
            if(document.getElementById("addr_province").value !="- Silahkan Pilih -"){
                $.ajax({
                    url: "/get-city-by-province-id",
                    method:"get",
                    data:{
                        _token:"{{ csrf_token() }}",
                        province_id:document.getElementById("addr_province").value
                    },
                    success:function(response){
                        if(response.message === "Get All Regencies By Province Id Success!") {
                            $('#addr_city').empty();
                            $('#addr_city').append('<option selected>- Silahkan Pilih -</option>'); 
                            var len = response.data.length;
                            for( var i = 0; i<len; i++){
                                var id = response.data[i]['id'];
                                var name = response.data[i]['name'];
                                $("#addr_city").append("<option value='"+id+"'>"+name+"</option>");
                            }
                            $('#addr_districts').empty();
                            $('#addr_districts').append('<option selected>- Silahkan Pilih -</option>');
                            $('#addr_villages').empty();
                            $('#addr_villages').append('<option selected>- Silahkan Pilih -</option>');
                                
                        }else{
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
                        }              
                    },
                    error: function(error) {
                        console.log(error);
                    }
                });
            }else{
                $('#addr_city').empty();
                $('#addr_city').append('<option selected>- Silahkan Pilih -</option>');
                $('#addr_districts').empty();
                $('#addr_districts').append('<option selected>- Silahkan Pilih -</option>');
                $('#addr_villages').empty();
                $('#addr_villages').append('<option selected>- Silahkan Pilih -</option>');
            }    
        }

        function onChangeAddrCity(){
            if(document.getElementById("addr_city").value !="- Silahkan Pilih -"){
                $.ajax({
                    url: "/get-district-by-city-id",
                    method:"get",
                    data:{
                        _token:"{{ csrf_token() }}",
                        city_id:document.getElementById("addr_city").value
                    },
                    success:function(response){
                        if(response.message === "Get All District By Regency Id Success!") {
                            $('#addr_district').empty();
                            $('#addr_district').append('<option selected>- Silahkan Pilih -</option>'); 
                            var len = response.data.length;
                            for( var i = 0; i<len; i++){
                                var id = response.data[i]['id'];
                                var name = response.data[i]['name'];
                                $("#addr_district").append("<option value='"+id+"'>"+name+"</option>");
                            }
                            $('#addr_village').empty();
                            $('#addr_village').append('<option selected>- Silahkan Pilih -</option>');
                                
                        }else{
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
                        }              
                    },
                    error: function(error) {
                        console.log(error);
                    }
                });
            }else{
                $('#addr_district').empty();
                $('#addr_district').append('<option selected>- Silahkan Pilih -</option>');
                $('#addr_village').empty();
                $('#addr_village').append('<option selected>- Silahkan Pilih -</option>');
            }    
        }

        function onChangeAddrDistrict(){
            if(document.getElementById("addr_district").value !="- Silahkan Pilih -"){
                $.ajax({
                    url: "/get-village-by-district-id",
                    method:"get",
                    data:{
                        _token:"{{ csrf_token() }}",
                        district_id:document.getElementById("addr_district").value
                    },
                    success:function(response){
                        if(response.message === "Get All Village By Province Id Success!") {
                            $('#addr_village').empty();
                            $('#addr_village').append('<option selected>- Silahkan Pilih -</option>'); 
                            var len = response.data.length;
                            for( var i = 0; i<len; i++){
                                var id = response.data[i]['id'];
                                var name = response.data[i]['name'];
                                $("#addr_village").append("<option value='"+id+"'>"+name+"</option>");
                            }
                                
                        }else{
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
                        }              
                    },
                    error: function(error) {
                        console.log(error);
                    }
                });
            }else{
                $('#addr_village').empty();
                $('#addr_village').append('<option selected>- Silahkan Pilih -</option>');
            }    
        }

        function masterData(){
            document.getElementById("residence_address2").style.display = "none";
            $.ajax({
                url: "/get-master-data",
                method:"get",
                data:{
                    _token:"{{ csrf_token() }}",
                },
                success:function(response){
                    if(response.message === "Get All Master Data Sucess!") {

                        $('#account_purpose').empty();
                        $('#account_purpose').append('<option selected>- Silahkan Pilih -</option>');
                        var len = response.data.retail.length;
                        for( var i = 0; i<len; i++){
                            var id = response.data.retail[i]['id'];
                            var name = response.data.retail[i]['description'];
                            $("#account_purpose").append("<option value='"+id+"'>"+name+"</option>");
                        }

                        $('#gender').empty();
                        $('#gender').append('<option selected>- Silahkan Pilih -</option>');
                        var len = response.data.gender.length;
                        for( var i = 0; i<len; i++){
                            var id = response.data.gender[i]['id'];
                            var name = response.data.gender[i]['description'];
                            $("#gender").append("<option value='"+id+"'>"+name+"</option>");
                        }

                        $('#advance_title').empty();
                        $('#advance_title').append('<option selected>- Silahkan Pilih -</option>');
                        var len = response.data.advanceTitle.length;
                        for( var i = 0; i<len; i++){
                            var id = response.data.advanceTitle[i]['id'];
                            var name = response.data.advanceTitle[i]['description'];
                            $("#advance_title").append("<option value='"+id+"'>"+name+"</option>");
                        }

                        $('#back_degree').empty();
                        $('#back_degree').append('<option selected>- Silahkan Pilih -</option>');
                        var len = response.data.backDegree.length;
                        for( var i = 0; i<len; i++){
                            var id = response.data.backDegree[i]['id'];
                            var name = response.data.backDegree[i]['description'];
                            $("#back_degree").append("<option value='"+id+"'>"+name+"</option>");
                        }
           
                        $('#business_type').empty();
                        $('#business_type').append('<option selected>- Silahkan Pilih -</option>');
                        var len = response.data.businessTypes.length;
                        for( var i = 0; i<len; i++){
                            var id = response.data.businessTypes[i]['id'];
                            var name = response.data.businessTypes[i]['description'];
                            $("#business_type").append("<option value='"+id+"'>"+name+"</option>");
                        }

                        $('#company').empty();
                        $('#company').append('<option selected>- Silahkan Pilih -</option>');
                        var len = response.data.companies.length;
                        for( var i = 0; i<len; i++){
                            var id = response.data.companies[i]['id'];
                            var name = response.data.companies[i]['companyName'];
                            $("#company").append("<option value='"+name+"'>"+name+"</option>");
                        }

                        $('#fund_source').empty();
                        $('#fund_source').append('<option selected>- Silahkan Pilih -</option>');
                        var len = response.data.fundSource.length;
                        for( var i = 0; i<len; i++){
                            var id = response.data.fundSource[i]['id'];
                            var name = response.data.fundSource[i]['description'];
                            $("#fund_source").append("<option value='"+id+"'>"+name+"</option>");
                        }

                        $('#fund_source_amt').empty();
                        $('#fund_source_amt').append('<option selected>- Silahkan Pilih -</option>');
                        var len = response.data.fundSourceAmt.length;
                        for( var i = 0; i<len; i++){
                            var id = response.data.fundSourceAmt[i]['id'];
                            var name = response.data.fundSourceAmt[i]['description'];
                            $("#fund_source_amt").append("<option value='"+id+"'>"+name+"</option>");
                        }

                        $('#job_status').empty();
                        $('#job_status').append('<option selected>- Silahkan Pilih -</option>');
                        var len = response.data.jobStatus.length;
                        for( var i = 0; i<len; i++){
                            var id = response.data.jobStatus[i]['id'];
                            var name = response.data.jobStatus[i]['description'];
                            $("#job_status").append("<option value='"+id+"'>"+name+"</option>");
                        }

                        $('#legal_type').empty();
                        $('#legal_type').append('<option selected>- Silahkan Pilih -</option>');
                        var len = response.data.legalTypes.length;
                        for( var i = 0; i<len; i++){
                            var id = response.data.legalTypes[i]['id'];
                            var name = response.data.legalTypes[i]['description'];
                            $("#legal_type").append("<option value='"+id+"'>"+name+"</option>");
                        }

                        $('#marital_status').empty();
                        $('#marital_status').append('<option selected>- Silahkan Pilih -</option>');
                        var len = response.data.maritalStatus.length;
                        for( var i = 0; i<len; i++){
                            var id = response.data.maritalStatus[i]['id'];
                            var name = response.data.maritalStatus[i]['description'];
                            $("#marital_status").append("<option value='"+id+"'>"+name+"</option>");
                        }

                        $('#education').empty();
                        $('#education').append('<option selected>- Silahkan Pilih -</option>');
                        var len = response.data.education.length;
                        for( var i = 0; i<len; i++){
                            var id = response.data.education[i]['id'];
                            var name = response.data.education[i]['description'];
                            $("#education").append("<option value='"+id+"'>"+name+"</option>");
                        }

           
                        $('#job_title').empty();
                        $('#job_title').append('<option selected>- Silahkan Pilih -</option>');
                        var len = response.data.occupations.length;
                        for( var i = 0; i<len; i++){
                            var id = response.data.occupations[i]['id'];
                            var name = response.data.occupations[i]['description'];
                            $("#job_title").append("<option value='"+id+"'>"+name+"</option>");
                        }

                        $('#account_type').empty();
                        $('#account_type').append('<option selected>- Silahkan Pilih -</option>');
                        var len = response.data.products.length;
                        for( var i = 0; i<len; i++){
                            var id = response.data.products[i]['id'];
                            var name = response.data.products[i]['description'];
                            $("#account_type").append("<option value='"+id+"'>"+name+"</option>");
                        }

                        $('#religion').empty();
                        $('#religion').append('<option selected>- Silahkan Pilih -</option>');
                        var len = response.data.religion.length;
                        for( var i = 0; i<len; i++){
                            var id = response.data.religion[i]['id'];
                            var name = response.data.religion[i]['description'];
                            $("#religion").append("<option value='"+id+"'>"+name+"</option>");
                        }

                        // $('#place_birth').empty();
                        // $('#place_birth').append('<option hidden>Silahkan Pilih</option>'); 
                        // var len = response.data.villages.length;
                        // for( var i = 0; i<len; i++){
                        //     // var id = response.data.villages[i]['id'];
                        //     var name = response.data.villages[i]['name'];
                        //     $("#place_birth").append("<option value='"+name+"'>"+name+"</option>");
                        // }

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
        function submitNewCIF(element){
        
            var addr_street = document.getElementById("addr_street").value;
            var addr_rt = document.getElementById("addr_rt").value;
            var addr_rw = document.getElementById("addr_rw").value;
            var addr_province = document.getElementById("addr_province").value;
            var addr_country = document.getElementById("addr_country").value;
            var addr_city = document.getElementById("addr_city").value;
            var addr_postal_code = document.getElementById("addr_postal_code").value;
            
            if (document.getElementById('same_with_address_based_on_identity').checked) {
                var addr_street = document.getElementById("street").value;
                var addr_rt = document.getElementById("rt").value;
                var addr_rw = document.getElementById("rw").value;
                var addr_province = document.getElementById("province").value;
                var addr_country = document.getElementById("country").value;
                var addr_city = document.getElementById("city").value;
                var addr_postal_code = document.getElementById("postal_code").value;
            }

            console.log("1"+document.getElementById("account_type").value);
            console.log("2"+document.getElementById("legal_type").value);
            console.log("3"+document.getElementById("legal_id_number").value);
            console.log("4"+document.getElementById("name_based_on_identity").value);
            console.log("5"+document.getElementById("full_name").value);
            console.log("6"+document.getElementById("given_name").value);
            console.log("7"+document.getElementById("family_name").value);
            console.log("8"+document.getElementById("advance_title").value);
            console.log("9"+document.getElementById("back_degree").value);
            console.log("10"+document.getElementById("place_of_birth").value);
            console.log("11"+document.getElementById("date_of_birth").value);
            console.log("12"+document.getElementById("street").value);
            console.log("13"+document.getElementById("rt").value);
            console.log("14"+document.getElementById("rw").value);
            console.log("15"+document.getElementById("province").value);
            console.log("16"+document.getElementById("city").value);
            console.log("17"+document.getElementById("addr_street").value);
            console.log("18"+document.getElementById("addr_rt").value);
            console.log("19"+document.getElementById("addr_rw").value);
            console.log("20"+document.getElementById("addr_province").value);
            console.log("21"+document.getElementById("addr_city").value);
            console.log("22"+document.getElementById("addr_postal_code").value);
            console.log("23"+document.getElementById("addr_celular_phone").value);
            console.log("24"+document.getElementById("addr_phone_number").value);
            console.log("25"+document.getElementById("marital_status").value);
            console.log("26"+document.getElementById("education").value);
            console.log("27"+document.getElementById("religion").value);
            console.log("28"+document.getElementById("mother_name").value);
            console.log("29"+document.getElementById("fund_source").value);
            console.log("30"+document.getElementById("fund_source_amt").value);
            console.log("31"+document.getElementById("job_status").value);
            console.log("32"+document.getElementById("company").value);
            console.log("33"+document.getElementById("job_title").value);
            console.log("34"+document.getElementById("occupations").value);
            console.log("35"+document.getElementById("employers_address").value);
            console.log("36"+document.getElementById("business_type").value);
            console.log("37"+document.getElementById("employment_start").value);
            console.log("38"+document.getElementById("office_phone").value);
            console.log("39"+document.getElementById("tax_id").value);
            console.log("40"+document.getElementById("account_purpose").value);
            console.log("41"+document.getElementById("account_officer").value);
      
        

            $.ajax({
                url: "/submit-new-cif",
                method:"post",
                data:{
                    _token:"{{ csrf_token() }}",
                    product_code : document.getElementById("account_type").value,
                    legal_type : document.getElementById("legal_type").value,
                    legal_id_number : document.getElementById("legal_id_number").value,
                    short_name: document.getElementById("name_based_on_identity").value,
                    full_name : document.getElementById("full_name").value,
                    given_name: document.getElementById("given_name").value,
                    family_name : document.getElementById("family_name").value,
                    customer_title1 : document.getElementById("advance_title").value,
                    customer_title2 : document.getElementById("back_degree").value,
                    place_of_birth: document.getElementById("place_of_birth").value,
                    date_of_birth : document.getElementById("date_of_birth").value,
                    street : document.getElementById("street").value,
                    rt : document.getElementById("rt").value,
                    rw : document.getElementById("rw").value,
                    province :  document.getElementById("province").value,
                    country  : document.getElementById("country").value,
                    town_country : document.getElementById("city").value,
                    postal_code: document.getElementById("postal_code").value ,
                    addr_street: addr_street ,
                    addr_rt : addr_rt,
                    addr_rw : addr_rw,
                    addr_province : addr_province,
                    addr_country : addr_country, 
                    addr_city : addr_city, 
                    addr_postal_code : addr_postal_code,
                    addr_phone_area : document.getElementById("addr_celular_phone").value,
                    addr_phone_number : document.getElementById("addr_phone_number").value,
                    sms : document.getElementById("addr_celular_phone").value,
                    marital_status : document.getElementById("marital_status").value,
                    education : document.getElementById("education").value,
                    religion : document.getElementById("religion").value,
                    gender  : document.getElementById("gender").value, 
                    mother_name : document.getElementById("mother_name").value,
                    fund_source : document.getElementById("fund_source").value,
                    fund_source_amount : document.getElementById("fund_source_amt").value,
                    employment_status : document.getElementById("job_status").value,
                    employers_name : document.getElementById("company").value,
                    job_title : document.getElementById("job_title").value,
                    occupation : document.getElementById("occupations").value,
                    employers_address : document.getElementById("employers_address").value,
                    employers_buss : document.getElementById("business_type").value,
                    employment_start : document.getElementById("employment_start").value,
                    office_phone : document.getElementById("office_phone").value,
                    tax_id : document.getElementById("tax_id").value,
                    account_purpose: document.getElementById("account_purpose").value,
                    account_officer: document.getElementById("account_officer").value

                },
                success:function(response){
                    if(response.message === "Create CIF Success!") {
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