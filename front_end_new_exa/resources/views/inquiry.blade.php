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


</head>

<body id="page-top">
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
                    <a class="nav-link" href="/account-otorisasi">
                        <p class="text-sidebar">Ubah Password</p>
                    </a>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="/account-maintenance">
                        <p class="text-sidebar">Maintenance</p>
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

                                    <p>Pembukaan Rekening</p>
                                <div class="card-body text-form">
                                    <p class="text-pembukaan">Informasi Pembukaan Rekening</p>
                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Produk (*)</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example">
                                                <option selected>- Silahkan Pilih -</option>
                                                <option value="1">TABUNGAN TAPENAS KOLEKTIF</option>
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
                                                <option value="12">TABUNGANKU</option>
                                                <option value="13">TABUNGAN EASY MUDHARABAH</option>
                                                <option value="14">TABUNGAN HAJI WADIAH</option>
                                                <option value="15">TABUNGAN HAJI MUDHARABAH</option>
                                                <option value="16">TABUNGAN BISNIS</option>
                                                <option value="17">TABUNGAN VALAS MUDHARABAH</option>
                                            </select>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Tujuan Buka Rekening (*)</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example">
                                                <option selected>- Silahkan Pilih -</option>                                          
                                                <option value="1">HAJI</option>
                                                <option value="2">INVESTASI</option>
                                                <option value="3">LAINNYA</option>
                                                <option value="4">MENYIMPAN DANA</option>
                                                <option value="5">PEMBAYARAN GAJI</option>
                                                <option value="6">PINJAMAN</option>                                               
                                                <option value="7">TRANSAKSI UMROH</option>                                             
                                            </select>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Jenis Identitas (*)</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example">
                                                <option selected>- Silahkan Pilih -</option>                                          
                                                <option value="1">KTP</option>                                        
                                            </select>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">No. Identitas (*)</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                        </div>
                                    </div>

                                    <hr>

                                    <!-- ======INFORMASI DATA E-KTP====== -->

                                    <p>Informasi Data e-KTP</p>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Nama Sesuai Identitas (*)</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Nama Ibu Kandung (*)</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                        </div>
                                    </div>


                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Tempat Lahir (*)</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Tanggal Lahir (yyyymmdd) (*)</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="date" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Jenis Kelamin (*)</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example">
                                                <option selected>- Silahkan Pilih -</option>
                                                <option value="1">Laki-laki</option>
                                                <option value="2">Perempuan</option>
                                            </select>
                                        </div>
                                    </div>
                                    <hr>
                                    <p>Informasi Data Nasabah</p>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Nama Lengkap (*)</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
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
                                            <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
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
                                            <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
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
                                            <select class="form-select" aria-label="Default select example">
                                                <option selected>- Silahkan Pilih -</option>
                                                <option value="1">DOKTER UMUM</option>
                                                <option value="2">DOKTOR</option>
                                                <option value="3">DOKTORANDUS</option>
                                                <option value="4">HAJI</option>
                                                <option value="5">HAJJAH</option>
                                                <option value="6">INSINYUR</option>
                                                <option value="7">MISS</option>
                                                <option value="8">MISTER</option>
                                                <option value="9">PROFESOR</option>
                                                <option value="10">RADEN RADEN RORO</option>                
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
                                            <select class="form-select" aria-label="Default select example">
                                                <option selected>- Silahkan Pilih -</option>
                                                <option value="1">AHLI MADYA</option>
                                                <option value="2">APOTEKER</option>
                                                <option value="3">DIPLOMA ENGINEERING</option>
                                                <option value="4">DOKTOR</option>
                                                <option value="5">MAGISTER MANAGEMENT</option>
                                                <option value="6">MASTER OF ARTS</option>
                                                <option value="7">MASTER OF ARTS IN ECONOMIC POLICY</option>
                                                <option value="8">MASTER OF BUSINESS ADMINISTRATION</option>
                                                <option value="9">SARJANA EKONOMI</option>    
                                                <option value="10">SARJANA HUKUM</option>
                                                <option value="11">SARJANA KESEHATAN</option>
                                                <option value="12">SARJANA KOMPUTER</option>  
                                                <option value="12">SCIENCE BACHELOR</option>             
                                            </select>
                                        </div>
                                    </div>

                                    <hr>
                                    <p>Informasi Alamat Identitas</p>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Alamat Sesuai Identitas (*)</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                            <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">RT/RW (*)</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                            <label for="exampleInputEmail1" class="form-label">/</label>
                                            <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Desa/Kelurahan (*)</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Kecamatan (*)</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Kabupaten/Kota (*)</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example">
                                                <option selected>- Silahkan Pilih -</option>
                                                <option value="1">JAKARTA BARAT, WIL. KOTA</option>
                                                <option value="2">JAKARTA SELATAN, WIL. KOTA</option>
                                                <option value="3">JAKARTA TIMUR, WIL. KOTA</option>
                                                <option value="4">JAKARTA UTARA, WIL. KOTA</option>
                                                <option value="5">JAKARTA PUSAT, WIL. KOTA</option>            
                                            </select>
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
                                            <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Propinsi (*)</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example">
                                                <option selected>- Silahkan Pilih -</option>
                                                <option value="1">JAWA BARAT</option>
                                                <option value="2">BANTEN</option>
                                                <option value="3">DKI JAKARTA</option>          
                                            </select>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Negara (*)</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example">
                                                <option selected>- Silahkan Pilih -</option>
                                                <option value="1">INDONESIA</option>
                                                <option value="2">JEPANG</option>
                                                <option value="3">ARAB</option>          
                                            </select>
                                        </div>
                                    </div>

                                    <hr>
                                    <p>Informasi Alamat Domisili</p>
                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Alamat Sesuai Domisili (*)</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                            <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">RT/RW (*)</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                            <label for="exampleInputEmail1" class="form-label">/</label>
                                            <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Propinsi (*)</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example">
                                                <option selected>- Silahkan Pilih -</option>
                                                <option value="1">JAWA BARAT</option>
                                                <option value="2">BANTEN</option>
                                                <option value="3">DKI JAKARTA</option>          
                                            </select>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Kabupaten/Kota (*)</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example">
                                                <option selected>- Silahkan Pilih -</option>
                                                <option value="1">JAKARTA BARAT, WIL. KOTA</option>
                                                <option value="2">JAKARTA SELATAN, WIL. KOTA</option>
                                                <option value="3">JAKARTA TIMUR, WIL. KOTA</option>
                                                <option value="4">JAKARTA UTARA, WIL. KOTA</option>
                                                <option value="5">JAKARTA PUSAT, WIL. KOTA</option>            
                                            </select>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Kecamatan (*)</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Desa/Kelurahan (*)</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
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
                                            <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Negara (*)</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example">
                                                <option selected>- Silahkan Pilih -</option>
                                                <option value="1">INDONESIA</option>
                                                <option value="2">JEPANG</option>
                                                <option value="3">ARAB</option>          
                                            </select>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Email (*)</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">No. Telepon</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                            <label for="exampleInputEmail1" class="form-label">-</label>
                                            <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">No. Telepon Seluler (*)</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                        </div>
                                    </div>


                                    <hr>
                                    <p>Informasi Dana Nasabah</p>
                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Sumber Dana (*)</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example">
                                                <option selected>- Silahkan Pilih -</option>
                                                <option value="1">GAJI (PER BULAN)</option>
                                                <option value="2">WARISAN/HIBAH/HADIAH (PER BULAN)</option>
                                                <option value="3">USAHA SAMPINGAN (PER BULAN)</option>   
                                                <option value="3">OMZET USAHA (PER BULAN)</option>    
                                                <option value="3">USAHA GROUP PERORANGAN (PER BULAN)</option>
                                                <option value="3">USAHA ANAK PERUSAHAAN (PER BULAN)</option>
                                                <option value="3">LAINNYA</option>   
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
                                            <select class="form-select" aria-label="Default select example">
                                                <option selected>- Silahkan Pilih -</option>
                                                <option value="1">S/D 5 JUTA</option>
                                                <option value="2">> 5 JUTA - 10 JUTA</option>
                                                <option value="3">> 10 JUTA - 25 JUTA</option>   
                                                <option value="3">> 25 JUTA - 50 JUTA</option>    
                                                <option value="3">> 50 JUTA - 100 JUTA</option>
                                                <option value="3">> 100 JUTA</option>
                                            </select>
                                        </div>
                                    </div>

                                    <hr>
                                    <p>Informasi Data Pekerjaan</p>
                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Status Pekerjaan (*)</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example">
                                                <option selected>- Silahkan Pilih -</option>
                                                <option value="1">KARYAWAN</option>
                                                <option value="2">IBU RUMAH TANGGA</option>
                                                <option value="3">PENSIUNAN</option>   
                                                <option value="3">PEKERJA BEBAS</option>    
                                                <option value="3">PELAJAR</option>
                                                <option value="3">PENGANGGURAN</option>
                                            </select>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Jenis Pekerjaan (*)</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example">
                                                <option selected>- Silahkan Pilih -</option>
                                                <option value="1">xxx</option>
                                                <option value="2">xxx</option>
                                                <option value="3">xxx</option>   
                                            </select>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Jabatan (*)</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                        </div>
                                    </div>

                                     <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Nama Perusahaan (*)</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example">
                                                <option selected>- Silahkan Pilih -</option>
                                                <option value="1">xxx</option>
                                                <option value="2">xxx</option>
                                                <option value="3">xxx</option>   
                                            </select>
                                            <label for="exampleInputEmail1" class="form-label">* Catatan: apabila tidak ada nama perusahaan yang dituju, silahkan pilih <b>lainnya</b></label>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Alamat Perusahaan (*)</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Bidang Usaha (*)</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example">
                                                <option selected>- Silahkan Pilih -</option>
                                                <option value="1">xxx</option>
                                                <option value="2">xxx</option>
                                                <option value="3">xxx</option>   
                                            </select>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Mulai Bekerja (yyyymmdd) (*)</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="date" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">No. Telp Kantor (*)</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">No. NPWP (*)</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                        </div>
                                    </div>

                                    <hr>
                                    <p>Informasi Lainnya</p>
                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Status Pernikahan (*)</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example">
                                                <option selected>- Silahkan Pilih -</option>
                                                <option value="1">BERCERAI</option>
                                                <option value="2">DUDA</option>
                                                <option value="3">JANDA</option> 
                                                <option value="1">LAIN-LAIN</option>
                                                <option value="2">LAJANG</option>
                                                <option value="3">MENIKAH</option> 
                                                <option value="1">NIKAH SIRIH</option>   
                                            </select>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Pendidikan (*)</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example">
                                                <option selected>- Silahkan Pilih -</option>
                                                <option value="1">D1</option>
                                                <option value="2">D2</option>
                                                <option value="3">D3</option> 
                                                <option value="1">D4</option>
                                                <option value="2">LAINNYA</option>
                                                <option value="3">S1</option> 
                                                <option value="1">S2</option>
                                                <option value="1">S3</option>
                                                <option value="2">SD</option>
                                                <option value="3">SMP</option> 
                                                <option value="1">SMA</option>
                                            </select>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Agama (*)</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example">
                                                <option selected>- Silahkan Pilih -</option>
                                                <option value="1">BUDHA</option>
                                                <option value="2">HINDU</option>
                                                <option value="3">ISLAM</option> 
                                                <option value="1">KATOLIK</option>
                                                <option value="2">KONGHUCU</option>
                                                <option value="3">KRISTEN</option> 
                                                <option value="1">LAINNYA</option>
                                            </select>
                                        </div>
                                    </div>

                                    <hr>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Account Officer (*)</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label class="btn btn-info button-open-1" role="button">Submit</label>
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