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

                                    <p>Pembukaan Rekening Nasabah Baru CIF Perusahaan</p>
                                <div class="card-body text-form">
                                    <p class="text-pembukaan">Informasi Pembukaan Rekening</p>
                                     <p><br>
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
                                            <label for="exampleInputEmail1" class="form-label">Bentuk Badan Usaha / Lembaga (*)</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example">
                                                <option selected>- Silahkan Pilih -</option>                                          
                                                <option selected>- Silahkan Pilih -</option>                                          
                                                <option value="1">Badan Usaha Unit Desa</option>
                                                <option value="2">Commanditer Venotschap (CV)</option>
                                                <option value="3">Eksepdisi Muatan Kapal Laut</option>
                                                <option value="4">Firma</option>
                                                <option value="5">Koperasi</option>
                                                <option value="6">Limited</option>                                               
                                                <option value="7">Maskapai Andil Indonesia</option>
                                                <option value="8">Namloose Venotschaap (NV)</option>
                                                <option value="9">Perusahaan Daerah</option>
                                                <option value="10">Persero</option>
                                                <option value="11">Persekutuan Perdata</option>
                                                <option value="12">Perusahaan Umum</option>
                                                <option value="13">Perseroan Terbatas</option>                                               
                                                <option value="14">Usaha Dagang</option>
                                                <option value="15">Unit Dagang Kredit Pedesaan</option>
                                                <option value="16">Yayasan</option>                                               
                                                <option value="17">Lainnya - Badan Usaha</option>                           
                                            </select>
                                        </div>
                                    </div>

                                    <hr>

                                    <!-- ======INFORMASI DATA Nasabah====== -->

                                    <p class="text-pembukaan">Informasi Data Nasabah</p>
                                    <p><br>
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
                                            <label for="exampleInputEmail1" class="form-label">Kewarganegaraan (*)</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example">
                                                <option selected>- Silahkan Pilih -</option>                                          
                                                <option value="">Andorra</option>
                                                <option value="">U.A.E</option>
                                                <option value="">Afghanistan</option>
                                                <option value="">Antigua</option>
                                                <option value="">Anguilla</option>
                                                <option value="">Albania</option>
                                                <option value="">Armenia</option>
                                                <option value="">Neth Ant.</option>
                                                <option value="">Angola</option>
                                                <option value="">Antarctica</option>
                                                <option value="">Argentina</option>
                                                <option value="">American Samoa</option>
                                                <option value="">Austria</option>
                                                <option value="">Austraoptiona</option>
                                                <option value="">Aruba</option>
                                                <option value="">Azerbaijan</option>
                                                <option value="">Bosnia-Herz</option>
                                                <option value="">Barbados</option>
                                                <option value="">Bangladesh</option>
                                                <option value="">Belgium</option>
                                                <option value="">Burkina Faso</option>
                                                <option value="">Bulgaria</option>
                                                <option value="">Bahrain</option>
                                                <option value="">Burundi</option>
                                                <option value="">Benin</option>
                                                <option value="">Bermuda</option>
                                                <option value="">Brunei</option>
                                                <option value="">Booptionvia</option>
                                                <option value="">Brazil</option>
                                                <option value="">Bahamas</option>
                                                <option value="">Bhutan</option>
                                                <option value="">Bouvet Island</option>
                                                <option value="">Botswana</option>
                                                <option value="">Belarus</option>
                                                <option value="">Beoptionze</option>
                                                <option value="">Canada</option>
                                                <option value="">Cocos Islands</option>
                                                <option value="">Congo</option>
                                                <option value="">Cent Afr</option>
                                                <option value="">Congo</option>
                                                <option value="">Switzerland</option>
                                                <option value="">Ivory</option>
                                                <option value="">Cook Islands</option>
                                                <option value="">Chile</option>
                                                <option value="">Cameroon</option>
                                                <option value="">China</option>
                                                <option value="">Columbia</option>
                                                <option value="">Costa Rica</option>
                                                <option value="">Cuba</option>
                                                <option value="">Cape Verde</option>
                                                <option value="">Christmas Is.</option>
                                                <option value="">Cyprus</option>
                                                <option value="">Czech Repuboptionc</option>
                                                <option value="">Germany</option>
                                                <option value="">Djibouti</option>
                                                <option value="">Denmark</option>
                                                <option value="">Dominica</option>
                                                <option value="">Dominican</option>
                                                <option value="">Algeria</option>
                                                <option value="">Ecuador</option>
                                                <option value="">Estonia</option>
                                                <option value="">Egypt</option>
                                                <option value="">Western Sahara</option>
                                                <option value="">Eritrea</option>
                                                <option value="">Spain</option>
                                                <option value="">Ethiopia</option>
                                                <option value="">EUR Countries</option>
                                                <option value="">Finland</option>
                                                <option value="">Fiji</option>
                                                <option value="">Falkland Is.</option>
                                                <option value="">Micronesia</option>
                                                <option value="">Faroe Islands</option>
                                                <option value="">France</option>
                                                <option value="">Gabon</option>
                                                <option value="">G.B.</option>
                                                <option value="">Grenada</option>
                                                <option value="">Georgia</option>
                                                <option value="">French Guiana</option>
                                                <option value="">Channel Islands</option>
                                                <option value="">Ghana</option>
                                                <option value="">Gibraltar</option>
                                                <option value="">Greenland</option>
                                                <option value="">Gambia</option>
                                                <option value="">Guinea</option>
                                                <option value="">GOLD</option>
                                                <option value="">Guadeloupe</option>
                                                <option value="">Equ. Guinea</option>
                                                <option value="">Greece</option>
                                                <option value="">S Georgia</option>
                                                <option value="">Guatemala</option>
                                                <option value="">Guam</option>
                                                <option value="">Guinea-Bissau</option>
                                                <option value="">Guyana</option>
                                                <option value="">H.K.</option>
                                                <option value="">Heard .McDonald</option>
                                                <option value="">Honduras</option>
                                                <option value="">Croatia</option>
                                                <option value="">Haiti</option>
                                                <option value="">Hungary</option>
                                                <option value="">Indonesia</option>
                                                <option value="">Ireland</option>
                                                <option value="">Israel</option>
                                                <option value="">Isle of Man</option>
                                                <option value="">India</option>
                                                <option value="">Br Ind. Oc. Ter</option>
                                                <option value="">Iraq</option>
                                                <option value="">Iran</option>
                                                <option value="">Iceland</option>
                                                <option value="">Italy</option>
                                                <option value="">Jersey</option>
                                                <option value="">Jamaica</option>
                                                <option value="">Jordan</option>
                                                <option value="">Japan</option>
                                                <option value="">Kenya</option>
                                                <option value="">Kyrgyzstan</option>
                                                <option value="">Cambodia</option>
                                                <option value="">Kiribati</option>
                                                <option value="">Comoro</option>
                                                <option value="">St Kitts .Nevis</option>
                                                <option value="">Korea</option>
                                                <option value="">Korea, Rep. of</option>
                                                <option value="">Kuwait</option>
                                                <option value="">Cayman Islands</option>
                                                <option value="">Kazakstan</option>
                                                <option value="">Lao</option>
                                                <option value="">Lebanon</option>
                                                <option value="">St. Lucia</option>
                                                <option value="">optionecht</option>
                                                <option value="">Sri Lanka</option>
                                                <option value="">optionberia</option>
                                                <option value="">Lesotho</option>
                                                <option value="">optionthuania</option>
                                                <option value="">Luxembourg</option>
                                                <option value="">Latvia</option>
                                                <option value="">optionbya</option>
                                                <option value="">Morocco</option>
                                                <option value="">Monaco</option>
                                                <option value="">Moldova, Rep of</option>
                                                <option value="">Madagascar</option>
                                                <option value="">Marshall Is.</option>
                                                <option value="">Macedonia</option>
                                                <option value="">Maoption</option>
                                                <option value="">Myanmar</option>
                                                <option value="">Mongooptiona</option>
                                                <option value="">Macau</option>
                                                <option value="">N. Mariana Is.</option>
                                                <option value="">Martinique</option>
                                                <option value="">Mauritania</option>
                                                <option value="">Monserrat</option>
                                                <option value="">Malta</option>
                                                <option value="">Mauritius</option>
                                                <option value="">Maldives</option>
                                                <option value="">Malawi</option>
                                                <option value="">Mexico</option>
                                                <option value="">Malaysia</option>
                                                <option value="">Mozambique</option>
                                                <option value="">Namibia</option>
                                                <option value="">New Caledonia</option>
                                                <option value="">Niger</option>
                                                <option value="">Norfolk Island</option>
                                                <option value="">Nigeria</option>
                                                <option value="">Nicaragua</option>
                                                <option value="">Netherlands</option>
                                                <option value="">Norway</option>
                                                <option value="">Nepal</option>
                                                <option value="">Nauru</option>
                                                <option value="">Niue</option>
                                                <option value="">N.Z.</option>
                                                <option value="">Oman</option>
                                                <option value="">Panama</option>
                                                <option value="">Peru</option>
                                                <option value="">Fr. Polynesia</option>
                                                <option value="">Pap. New Guinea</option>
                                                <option value="">Phioptionppines</option>
                                                <option value="">PLATINUM</option>
                                                <option value="">Pakistan</option>
                                                <option value="">Poland</option>
                                                <option value="">St. Pierre</option>
                                                <option value="">Pitcairn</option>
                                                <option value="">Puerto Rico</option>
                                                <option value="">Portugal</option>
                                                <option value="">Palau</option>
                                                <option value="">Paraguay</option>
                                                <option value="">Qatar</option>
                                                <option value="">Reunion</option>
                                                <option value="">Romania</option>
                                                <option value="">Serbia</option>
                                                <option value="">Russian Fed</option>
                                                <option value="">Rwanda</option>
                                                <option value="">Saudi Arabia</option>
                                                <option value="">Solomon Islands</option>
                                                <option value="">Seychelles</option>
                                                <option value="">Sudan</option>
                                                <option value="">Sweden</option>
                                                <option value="">Singapore</option>
                                                <option value="">St. Helena</option>
                                                <option value="">Slovenia</option>
                                                <option value="">Svalbard</option>
                                                <option value="">Slovakia</option>
                                                <option value="">Sierra Leone</option>
                                                <option value="">San Marino</option>
                                                <option value="">Senegal</option>
                                                <option value="">Somaoptiona</option>
                                                <option value="">Suriname</option>
                                                <option value="">SILVER</option>
                                                <option value="">Sao Tome</option>
                                                <option value="">El Salvador</option>
                                                <option value="">Syria</option>
                                                <option value="">Swaziland</option>
                                                <option value="">Turks . Caicos</option>
                                                <option value="">Chad</option>
                                                <option value="">Fr. S. Territ.</option>
                                                <option value="">Togo</option>
                                                <option value="">Thailand</option>
                                                <option value="">Tajikistan</option>
                                                <option value="">Tokelau</option>
                                                <option value="">Turkmenistan</option>
                                                <option value="">Tunisia</option>
                                                <option value="">Tonga</option>
                                                <option value="">East Timor</option>
                                                <option value="">Turkey</option>
                                                <option value="">Trinidad Tobago</option>
                                                <option value="">Tuvalu</option>
                                                <option value="">Taiwan</option>
                                                <option value="">Tanzania</option>
                                                <option value="">Ukraine</option>
                                                <option value="">Uganda</option>
                                                <option value="">US Minor Out Is</option>
                                                <option value="">USA</option>
                                                <option value="">Uruguay</option>
                                                <option value="">Uzbekistan</option>
                                                <option value="">Vatican</option>
                                                <option value="">St. Vincent</option>
                                                <option value="">Venezuala</option>
                                                <option value="">Virgin Islands</option>
                                                <option value="">Virgin Islands</option>
                                                <option value="">Vietnam</option>
                                                <option value="">Vanuatu</option>
                                                <option value="">Waloptions .Futuna</option>
                                                <option value="">Samoa</option>
                                                <option value="">XAU and XAG</option>
                                                <option value="">European Unit</option>
                                                <option value="">East Caribbean</option>
                                                <option value="">Special Drawing</option>
                                                <option value="">Europa</option>
                                                <option value="">Gold</option>
                                                <option value="">West Africa</option>
                                                <option value="">XPD AND XPT</option>
                                                <option value="">Silver</option>
                                                <option value="">Worldwide</option>
                                                <option value="">Yemen</option>
                                                <option value="">Mayotte</option>
                                                <option value="">Yugoslavia</option>
                                                <option value="">South Afr</option>
                                                <option value="">Zambia</option>
                                                <option value="">Zimbabwe</option>                                       
                                            </select>
                                        </div>
                                    </div>


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
                                                <option value="1">Gaji (per bulan)</option>
                                                <option value="2">Warisan/Hibah/Hadiah (per bulan)</option>    
                                                <option value="3">Usaha Sampingan (per bulan)</option>
                                                <option value="4">Omzet Usaha (per bulan)</option> 
                                                <option value="5">Usaha Group Perusahaan (per bulan)</option>
                                                <option value="6">Usaha Anak Perusahaan (per bulan)</option> 
                                                <option value="7">Lainnya</option>                                        
                                            </select>
                                        </div>
                                    </div>
                                
                                    <hr>
                                    <p class="text-pembukaan">Informasi Data Perusahaan</p>
                                     <p><br>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Nama Perusahaan (*)</label>
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
                                            <label for="exampleInputEmail1" class="form-label">NPWP Perusahaan</label>
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
                                            <label for="exampleInputEmail1" class="form-label">Bidang Usaha</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example">
                                            <option selected>- Silahkan Pilih -</option>
                                            <option value="">Kegiatan yang Belum Jelas Batasannya Perorangan (Produktif)</option>
                                            <option value="">Kegiatan yang Belum Jelas Batasannya Badan Usaha (Produktif)</option>
                                            <option value="">BANK                  </option>
                                            <option value="">LEMBAGA KEUANGAN BUKAN BANK</option>
                                            <option value="">PENUKARAN VALAS               </option>
                                            <option value="">USAHA EKSPOR IMPOR            </option>
                                            <option value="">TRADING                       </option>
                                            <option value="">Rumah Tangga untuk Pemilikan Rumah Tinggal s.d. Tipe 21 (Konsumtif)</option>
                                            <option value="">Rumah Tangga untuk Pemilikan Rumah Tinggal Tipe 22 s.d. 70 (Konsumtif)</option>
                                            <option value="">Rumah Tangga untuk Pemilikan Rumah Tinggal Tipe Diatas 70 (Konsumtif)</option>
                                            <option value="">Rumah Tangga untuk Pemilikan Flat atau Apartemen s.d. Tipe 21 (Konsumtif)</option>
                                            <option value="">Rumah Tangga untuk Pemilikan Flat atau Apartemen Tipe 22 s.d. 70 (Konsumtif)</option>
                                            <option value="">Rumah Tangga untuk Pemilikan Flat atau Apartemen Tipe Diatas 70 (Konsumtif)</option>
                                            <option value="">Rumah Tangga untuk Pemilikan Rumah Toko (Ruko) atau Rumah Kantor (Rukan) (Konsumtif)</option>
                                            <option value="">Rumah Tangga untuk Pemilikan Mobil Roda Empat (Konsumtif)</option>
                                            <option value="">Rumah Tangga untuk Pemilikan Sepeda Bermotor (Konsumtif)</option>
                                            <option value="">Rumah Tangga untuk Pemilikan Truk dan Kendaraan Bermotor Roda Enam atau Lebih (Konsumtif)</option>
                                            <option value="">Rumah Tangga untuk Pemilikan Kendaraan Bermotor Lainnya (Konsumtif)</option>
                                            <option value="">Rumah Tangga untuk Pemilikan Furnitur dan Peralatan Rumah Tangga (Konsumtif)</option>
                                            <option value="">Rumah Tangga untuk Pemilikan Televisi, Radio, dan Alat Elektronik (Konsumtif)</option>
                                            <option value="">Rumah Tangga untuk Pemilikan Komputer dan Alat Komunikasi (Konsumtif)</option>
                                            <option value="">Rumah Tangga untuk Pemilikan Peralatan Lainnya (Konsumtif)</option>
                                            <option value="">Rumah Tangga untuk Keperluan Multiguna (Konsumtif)</option>
                                            <option value="">Rumah Tangga untuk Keperluan yang Tidak Diklasifikasikan di Tempat Lain (Konsumtif)</option>
                                            <option value="">Bukan Lapangan Usaha Lainnya (Konsumtif)</option>
                                            <option value="">Pertanian Padi (Produktif)</option>
                                            <option value="">Pertanian Palawija Jagung (Produktif)</option>
                                            <option value="">Pertanian Palawija Ketela pohon (Produktif)</option>
                                            <option value="">Pertanian Palawija Ubi jalar (Produktif)</option>
                                            <option value="">Pertanian Palawija Umbiumbian lainnya (Produktif)</option>
                                            <option value="">Pertanian Palawija Kacang tanah (Produktif)</option>
                                            <option value="">Pertanian Palawija Kedele (Produktif)</option>
                                            <option value="">Pertanian Palawija Kacangkacangan lainnya (Produktif)</option>
                                            <option value="">Perkebunan Tebu dan Tanaman Pemanis Lainnya (Produktif)</option>
                                            <option value="">Perkebunan Tembakau (Produktif)</option>
                                            <option value="">Perkebunan Karet dan Penghasil Getah Lainnya (Produktif)</option>
                                            <option value="">Perkebunan Tanaman Bahan Baku Tekstil dan Sejenisnya (Produktif)</option>
                                            <option value="">Perkebunan Tanaman Obat / Bahan Farmasi (Produktif)</option>
                                            <option value="">Perkebunan Tanaman Minyak Atsiri (Produktif)</option>
                                            <option value="">Perkebunan Tanaman Lainnya yang Tidak Diklasifikasikan di Tempat Lain (Produktif)</option>
                                            <option value="">Pertanian Hortikultura Sayuran yang dipanen Sekali Bawang Merah (Produktif)</option>
                                            <option value="">Pertanian Hortikultura Sayuran yang dipanen Sekali Lainnya (Produktif)</option>
                                            <option value="">Pertanian Hortikultura Sayuran yang dipanen Lebih dari Sekali (Produktif)</option>
                                            <option value="">Pertanian Hortikultura Bunga-bungaan Anggrek (Produktif)</option>
                                            <option value="">Pertanian Hortikultura Bunga-bungaan Lainnya (Produktif)</option>
                                            <option value="">Pertanian Tanaman Hias Lainnya (Produktif)</option>
                                            <option value="">Pembibitan dan Pembenihan Hortikultura Sayuran dan Bunga-bungaan (Produktif)</option>
                                            <option value="">Pertanian Buah-buahan Musiman Jeruk (Produktif)</option>
                                            <option value="">Pertanian Buah-buahan Musiman Lainnya (Produktif)</option>
                                            <option value="">Pertanian Buah-buahan Sepanjang Tahun Pisang (Produktif)</option>
                                            <option value="">Pertanian Buah-buahan Sepanjang Tahun Lainnya (Produktif)</option>
                                            <option value="">Perkebunan Kelapa (Produktif)</option>
                                            <option value="">Perkebunan Kelapa Sawit (Produktif)</option>
                                            <option value="">Perkebunan Tanaman Kopi (Produktif)</option>
                                            <option value="">Perkebunan Tanaman Teh (Produktif)</option>
                                            <option value="">Perkebunan Tanaman Coklat (Kakao) (Produktif)</option>
                                            <option value="">Perkebunan Jambu Mete (Produktif)</option>
                                            <option value="">Perkebunan Lada (Produktif)</option>
                                            <option value="">Perkebunan Cengkeh (Produktif)</option>
                                            <option value="">Perkebunan Tanaman Rempah Panili (Produktif)</option>
                                            <option value="">Perkebunan Tanaman Rempah Pala (Produktif)</option>
                                            <option value="">Perkebunan Tanaman Rempah yang Tidak Diklasifikasikan di Tempat Lain (Produktif)</option>
                                            <option value="">Pembibitan dan Budidaya Sapi Potong (Produktif)</option>
                                            <option value="">Pembibitan dan Budidaya Domba dan Kambing Potong (Produktif)</option>
                                            <option value="">Pembibitan dan Budidaya Ternak Perah (Produktif)</option>
                                            <option value="">Pembibitan dan Budidaya Babi (Produktif)</option>
                                            <option value="">Pembibitan dan Budidaya Unggas (Produktif)</option>
                                            <option value="">Kombinasi Pertanian Atau Perkebunan Dengan Peternakan (Mixed Farming) (Produktif)</option>
                                            <option value="">Jasa Pertanian, Perkebunan dan Peternakan (Produktif)</option>
                                            <option value="">Perburuan Penangkapan dan Penangkaran Satwa Liar (Produktif)</option>
                                            <option value="">Pengusahaan Hutan Tanaman (Produktif)</option>
                                            <option value="">Pengusahaan Hutan Alam (Produktif)</option>
                                            <option value="">Pengusahaan Hasil Hutan Selain Kayu (Produktif)</option>
                                            <option value="">Jasa Kehutanan (Produktif)</option>
                                            <option value="">Usaha Kehutanan Lainnya (Produktif)</option>
                                            <option value="">Penangkapan Ikan Tuna (Produktif)</option>
                                            <option value="">Penangkapan Ikan Lainnya (Produktif)</option>
                                            <option value="">Penangkapan Udang Laut (Produktif)</option>
                                            <option value="">Penangkapan Crustacea Lainnya di Laut (Produktif)</option>
                                            <option value="">Perikanan Lainnya (Produktif)</option>
                                            <option value="">Budidaya Biota Laut Udang (Produktif)</option>
                                            <option value="">Budidaya Biota Laut Tuna (Produktif)</option>
                                            <option value="">Budidaya Biota Laut Rumput Laut (Produktif)</option>
                                            <option value="">Budidaya Biota Laut Lainnya (Produktif)</option>
                                            <option value="">Pembenihan Biota Laut (Produktif)</option>
                                            <option value="">Penangkapan Ikan di Perairan Umum (Produktif)</option>
                                            <option value="">Penangkapan Crustacea, Mollusca, dan Biota Lainnya di Perairan Umum (Produktif)</option>
                                            <option value="">Budidaya Biota Air Tawar Udang (Produktif)</option>
                                            <option value="">Budidaya Biota Air Tawar Lainnya (Produktif)</option>
                                            <option value="">Budidaya Biota Air Payau Udang (Produktif)</option>
                                            <option value="">Budidaya Biota Air Payau Lainnya (Produktif)</option>
                                            <option value="">Pembenihan Biota Air Tawar dan Air Payau (Produktif)</option>
                                            <option value="">Jasa Sarana Produksi Perikanan Laut (Produktif)</option>
                                            <option value="">Jasa Sarana Produksi Perikanan Darat (Produktif)</option>
                                            <option value="">Jasa Perikanan Lainnya (Produktif)</option>
                                            <option value="">Pertambangan Batubara, Penggalian Gambut, dan Gasifikasi Batubara (Produktif)</option>
                                            <option value="">Pembuatan Briket Batubara (Produktif)</option>
                                            <option value="">Pertambangan Minyak dan Gas Bumi (Produktif)</option>
                                            <option value="">Pengusahaan Tenaga Panas Bumi (Produktif)</option>
                                            <option value="">PANGAN PADI                   </option>
                                            <option value="">PANGAN KACANG-KACANGAN        </option>
                                            <option value="">PANGAN UMBI-UMBIAN            </option>
                                            <option value="">PANGAN JAGUNG                 </option>
                                            <option value="">PANGAN LAINNYA                </option>
                                            <option value="">Jasa Pertambangan Minyak dan Gas Bumi (Produktif)</option>
                                            <option value="">PANGAN HOLTIKULTURA           </option>
                                            <option value="">PERKEBUNAN KARET              </option>
                                            <option value="">PERKEBUNAN KELAPA             </option>
                                            <option value="">PERKEBUNAN KOPI               </option>
                                            <option value="">PERKEBUNAN TEMBAKAU           </option>
                                            <option value="">PERKEBUNAN KELAPA SAWIT       </option>
                                            <option value="">PERKEBUNAN LADA               </option>
                                            <option value="">PERKEBUNAN TEH                </option>
                                            <option value="">PERKEBUNAN TEBU               </option>
                                            <option value="">PERKEBUNAN KAPAS              </option>
                                            <option value="">PERKEBUNAN CENGKEH            </option>
                                            <option value="">PERKEBUNAN VANILI             </option>
                                            <option value="">PERKEBUNAN PALA               </option>
                                            <option value="">PERKEBUNAN COKLAT             </option>
                                            <option value="">PERKEBUNAN LAINNYA            </option>
                                            <option value="">PERIKANAN LAUT UDANG          </option>
                                            <option value="">PERIKANAN LAUT LAINNYA        </option>
                                            <option value="">PERIKANAN DARAT UDANG         </option>
                                            <option value="">PERIKANAN DARAT LAINNYA       </option>
                                            <option value="">PERIKANAN PAYAU UDANG         </option>
                                            <option value="">PERIKANAN PAYAU LAINNYA       </option>
                                            <option value="">PETERNAKAN UNGGAS             </option>
                                            <option value="">PETERNAKAN SAPI               </option>
                                            <option value="">PETERNAKAN LAINNYA            </option>
                                            <option value="">KEHUTANAN PENGUMPULAN KAYU    </option>
                                            <option value="">KEHUTANAN PENGUMPULAN LAINNYA </option>
                                            <option value="">KEHUTANAN PEMOTONGAN KAYU     </option>
                                            <option value="">Pertambangan Bijih Uranium dan Thorium (Produktif)</option>
                                            <option value="">Pertambangan Pasir Besi dan Bijih Besi (Produktif)</option>
                                            <option value="">SARANA POMPANISASI            </option>
                                            <option value="">SARANA ALAT GARAP TANAH       </option>
                                            <option value="">SARANA GUDANG/LT JEMUR        </option>
                                            <option value="">SARANA CETAK SAWAH            </option>
                                            <option value="">Pertambangan Bijih Timah (Produktif)</option>
                                            <option value="">Pertambangan Bijih Bauksit (Produktif)</option>
                                            <option value="">Pertambangan Bijih Tembaga (Produktif)</option>
                                            <option value="">Pertambangan Bijih Nikel (Produktif)</option>
                                            <option value="">Pertambangan Emas (Produktif)</option>
                                            <option value="">Pertambangan Perak (Produktif)</option>
                                            <option value="">Bahan Galian Lainnya yang Tidak Mengandung Bijih Besi (Produktif)</option>
                                            <option value="">SARANA PERIKANAN              </option>
                                            <option value="">SARANA PETERNAKAN             </option>
                                            <option value="">SARANA KEHUTANAN              </option>
                                            <option value="">SARANA LAINNYA                </option>
                                            <option value="">Penggalian Batubatuan, Tanah Liat dan Pasir (Produktif)</option>
                                            <option value="">Pertambangan Mineral, Bahan Kimia dan Bahan Pupuk (Produktif)</option>
                                            <option value="">Ekstraksi Garam (Produktif)</option>
                                            <option value="">Pertambangan dan Penggalian Lainnya (Produktif)</option>
                                            <option value="">Industri Pemotongan Hewan (Produktif)</option>
                                            <option value="">Industri Pengolahan dan Pengawetan Daging (Produktif)</option>
                                            <option value="">Industri Pengolahan dan Pengawetan Ikan dan Biota Perairan Lainnya (Produktif)</option>
                                            <option value="">Industri Pengolahan, Pengawetan Buah-buahan dan Sayuran (Produktif)</option>
                                            <option value="">Industri Minyak Mentah (Minyak Makan) dari Nabati dan Hewani (Produktif)</option>
                                            <option value="">lndustri Minyak Goreng dari Kelapa (Produktif)</option>
                                            <option value="">Industri Minyak Goreng dari Kelapa Sawit Mentah (Produktif)</option>
                                            <option value="">Industri Minyak Lainnya dari Nabati dan Hewani (Produktif)</option>
                                            <option value="">Industri Susu dan Makanan dari Susu (Produktif)</option>
                                            <option value="">Industri Penggilingan Padi dan Penyosohan Beras (Produktif)</option>
                                            <option value="">lndustri Kopra (Produktif)</option>
                                            <option value="">Industri Penggilingan Lainnya (Produktif)</option>
                                            <option value="">Industri Tepung dan Pati (Produktif)</option>
                                            <option value="">Industri Pakan Ternak (Produktif)</option>
                                            <option value="">Industri Roti dan Sejenisnya (Produktif)</option>
                                            <option value="">Industri Gula dan Pengolahan Gula (Produktif)</option>
                                            <option value="">Industri Coklat dan Kernbang Gula (Produktif)</option>
                                            <option value="">Industri Makaroni, Mie, Spagheti, Bihun, So&#039;un dan Sejenisnya (Produktif)</option>
                                            <option value="">Industri Pengolahan Teh (Produktif)</option>
                                            <option value="">Industri Pengolahan Kopi (Produktif)</option>
                                            <option value="">lndustri Kecap (Produktif)</option>
                                            <option value="">lndustri Tempe dan Tahu (Produktif)</option>
                                            <option value="">lndustri Makanan yang Tidak Diklasifikasikan di Tempat Lain (Produktif)</option>
                                            <option value="">Industri Minuman (Produktif)</option>
                                            <option value="">lndustri Pengeringan dan Pengolahan Tembakau (Produktif)</option>
                                            <option value="">Industri Rokok (Produktif)</option>
                                            <option value="">Industri Bumbu Rokok Serta Kelengkapan Rokok Lainnya (Produktif)</option>
                                            <option value="">Industri Pemintalan, Pertenunan, Pengolahan Akhir Tekstil (Produktif)</option>
                                            <option value="">Industri Barang Jadi Tekstil dan Permadani (Produktif)</option>
                                            <option value="">Industri Perajutan Industri Perajutan (Produktif)</option>
                                            <option value="">Industri Kapuk (Produktif)</option>
                                            <option value="">Industri Pakaian Jadi dan perlengkapannya, Kecuali Pakaian Jadi Berbulu (Produktif)</option>
                                            <option value="">Industri Pakaian Jadi Barang Jadi dari Kulit Berbulu dan Pencelupan Bulu (Produktif)</option>
                                            <option value="">Industri Kulit dan Barang dari Kulit (Termasuk Kulit Buatan) (Produktif)</option>
                                            <option value="">Industri Alas Kaki (Produktif)</option>
                                            <option value="">Industri Penggergajian dan Pengawetan Kayu, Rotan, Bambu, dan Sejenisnya (Produktif)</option>
                                            <option value="">Industri Kayu Lapis, Veneer, dan Sejenisnya (Produktif)</option>
                                            <option value="">Industri Anyamanyaman, Kerajinan, Ukiran dari Kayu, dan Industri Barang Lain dari Kayu (Produktif)</option>
                                            <option value="">Industri Bubur Kertas (Pulp), Kertas dan Karton / Paper Board (Produktif)</option>
                                            <option value="">Industri Kemasan dan Kotak dari Kertas dan Karton (Produktif)</option>
                                            <option value="">Industri Barang dari Kertas dan Kartan yang Tidak Diklasifikasikan di Tempat Lain (Produktif)</option>
                                            <option value="">PERTAMBANGAN MINYAK BUMI      </option>
                                            <option value="">PERTAMBANGAN GAS BUMI         </option>
                                            <option value="">PERTAMBANGAN TIMAH            </option>
                                            <option value="">Industri Penerbitan (Produktif)</option>
                                            <option value="">PERTAMBANGAN NIKEL            </option>
                                            <option value="">Industri Percetakan &amp; Kegiatan yang Berkaitan dgn Pencetakan Trmasuk Reproduksi / Cetak Ulang(Produk</option>
                                            <option value="">PERTAMBANGAN BAUKSIT          </option>
                                            <option value="">Reproduksi Media Rekaman, Film, dan Video (Produktif)</option>
                                            <option value="">PERTAMBANGAN TEMBAGA          </option>
                                            <option value="">PERTAMBANGAN LAINNYA          </option>
                                            <option value="">PERTAMBANGAN BATUBARA         </option>
                                            <option value="">Industri Barang-barang dari Batubara (Produktif)</option>
                                            <option value="">Industri Pengilangan/Industri Barang2 Hasil Pengilangan Minyak Bumi, dan Pengolahan Gas Bumi(Produkt</option>
                                            <option value="">Pengolahan Bahan Bakar Nuklir (Nuclear Fuel) (Produktif)</option>
                                            <option value="">Industri Kimia Dasar, Kecuali Pupuk (Produktif)</option>
                                            <option value="">Industri Pupuk (Produktif)</option>
                                            <option value="">Industri Plastik dan Karet Buatan (Produktif)</option>
                                            <option value="">Industri Bahan Baku Pemberantas Hama dan Pemberantas Hama Termasuk Zat Pengatur Tumbuh (Produktif)</option>
                                            <option value="">Industri Cat, Pernis dan Lak (Produktif)</option>
                                            <option value="">Industri Farmasi dan Jamu (Produktif)</option>
                                            <option value="">Industri Sabun dan Bahan Pembersih Keperluan Rumah Tangga, Kosmetik dan Sejenisnya (Produktif)</option>
                                            <option value="">Industri Minyak Atsiri (Produktif)</option>
                                            <option value="">Industri Bahan Kimia dan Barang Kimia Lainnya (Produktif)</option>
                                            <option value="">Industri Serat Buatan (Produktif)</option>
                                            <option value="">Industri Pengasapan Karet (Produktif)</option>
                                            <option value="">Industri Remilling Karet (Produktif)</option>
                                            <option value="">Industri Karet Remah (Crumb Rubber) (Produktif)</option>
                                            <option value="">Industri Barang-barang lain dari Karet (Produktif)</option>
                                            <option value="">Industri Barang dari Plastik (Produktif)</option>
                                            <option value="">Industri Gelas dan Barang dari Gelas (Produktif)</option>
                                            <option value="">Industri Barang-barang dari Porselin (Produktif)</option>
                                            <option value="">Industri Pengolahan Tanah Liat / Keramik (Produktif)</option>
                                            <option value="">Industri Semen, Kapur dan Gips, Serta Barang-barang dari Semen, dan Kapur (Produktif)</option>
                                            <option value="">Industri Barang-barang dari Batu (Produktif)</option>
                                            <option value="">Industri Barang-barang dari Asbes (Produktif)</option>
                                            <option value="">Industri Barang-barang Galian Bukan Logam Lainnya (Produktif)</option>
                                            <option value="">Industri Logam Dasar Besi dan Baja (Produktif)</option>
                                            <option value="">Industri Logam Dasar Bukan Besi (Produktif)</option>
                                            <option value="">Industri Pengecoran Besi dan Baja (Produktif)</option>
                                            <option value="">Industri pengecoran Logam Bukan Besi dan Baja (Produktif)</option>
                                            <option value="">Industri Barang-barang Logam Siap Pasang Untuk Bangunan, Pembuatan Tangki, dan Generator Uap (Produk</option>
                                            <option value="">Industri Alatalat Pertanian, Pertukangan, Pemotong, dan Peralatan lainnya dari Logam (Produktif)</option>
                                            <option value="">Industri Barang Logam yang Tidak Diklasifikasikan di Tempat Lain (Produktif)</option>
                                            <option value="">PERTAMB. BATU MULIA           </option>
                                            <option value="">Industri Mesin-mesin Umum (Produktif)</option>
                                            <option value="">PERTAMB. LOGAM MULIA          </option>
                                            <option value="">Industri Mesin Pertanian dan Kehutanan, Serta Jasa Penunjang Pemeliharaan dan Perbaikannya (Produkti</option>
                                            <option value="">Industri Mesin-mesin Untuk Pertambangan, Penggalian dan Konstruksi (Produktif)</option>
                                            <option value="">lndustri Mesin Untuk Pengolahan Makanan, Minuman dan Tembakau (Produktif)</option>
                                            <option value="">Industri Mesin-mesin Tekstil, Produk Tekstil, dan Barang-barang dari Kulit (Produktif)</option>
                                            <option value="">Industri Mesin-mesin Khusus Lainnya (Produktif)</option>
                                            <option value="">PERTAMB. BATUAN &amp; SEJENISNYA  </option>
                                            <option value="">Industri Peralatan Rumah Tangga yang Tidak Diklasifikasikan di Tempat Lain (Produktif)</option>
                                            <option value="">PERTAMB. PASIR &amp; SEJENISNYA   </option>
                                            <option value="">PERTAMB. LAINNYA              </option>
                                            <option value="">Industri Mesin dan Peralatan Kantor, Akuntansi, dan Pengolahan Data (Produktif)</option>
                                            <option value="">INDUSTRI TERIGU               </option>
                                            <option value="">Industri Motor Listrik, Generator, dan Transformator (Produktif)</option>
                                            <option value="">INDUSTRI GULA                 </option>
                                            <option value="">Industri Peralatan Pengontrol dan Pendistribusian Listrik (Produktif)</option>
                                            <option value="">INDUSTRI PENGILINGAN PADI     </option>
                                            <option value="">Industri Kabel Listrik dan Telepon (Produktif)</option>
                                            <option value="">Industri Akumulator Listrik dan Batu Baterai (Produktif)</option>
                                            <option value="">INDUSTRI MINYAK KLP SWT MENTAH</option>
                                            <option value="">INDUSTRI MINYAK BIJI KLP SWT  </option>
                                            <option value="">INDUSTRI MINYAK LAINNYA       </option>
                                            <option value="">INDUSTRI GARAM                </option>
                                            <option value="">Industri Bola Lampu Pijar dan Lampu Penerangan (Produktif)</option>
                                            <option value="">INDUSTRI MINUMAN              </option>
                                            <option value="">INDUSTRI TEMBAKAU             </option>
                                            <option value="">INDUSTRI MAKANAN LAINNYA      </option>
                                            <option value="">Industri Peralatan Listrik yang Tidak Diklasifikasikan di Tempat lain (Produktif)</option>
                                            <option value="">INDUSTRI PAKAN HEWAN TERNAK   </option>
                                            <option value="">Industri Tabung dan Katup Elektronik Serta Komponen Elektronik lainnya (Produktif)</option>
                                            <option value="">INDUSTRI PAKAN IKAN           </option>
                                            <option value="">Industri Alat Transmisi Komunikasi (Produktif)</option>
                                            <option value="">Industri Radio, Televisi, Alatalat Rekaman Suara dan Gambar, dan Sejenisnya (Produktif)</option>
                                            <option value="">INDUSTRI TEKSTIL              </option>
                                            <option value="">Industri Pralatan Kedokteran &amp; Pralatan utk Mngukur,Priksa,Uji,&amp; Bagian Lain,Kcuali Alat Optik(Produ</option>
                                            <option value="">INDUSTRI SANDANG              </option>
                                            <option value="">Industri Instrumen Optik dan Peralatan Fotografi (Produktif)</option>
                                            <option value="">INDUSTRI KULIT                </option>
                                            <option value="">Industri Jam, Lonceng, dan Sejenisnya (Produktif)</option>
                                            <option value="">INDUSTRI ALAS KAKI DARI KULIT </option>
                                            <option value="">INDUSTRI KULIT LAINNYA        </option>
                                            <option value="">INDUSTRI BAHAN KAYU           </option>
                                            <option value="">Industri Kendaraan Bermotor Roda Empat Atau Lebih (Produktif)</option>
                                            <option value="">INDUSTRI KAYU LAPIS           </option>
                                            <option value="">INDUSTRI BAHAN KAYU LAINNYA   </option>
                                            <option value="">INDUSTRI PERABOT DR KAYU      </option>
                                            <option value="">Industri Karoseri Kendaraan Bermotor Roda Empat Atau Lebih (Produktif)</option>
                                            <option value="">INDUSTRI FURNITUR DR KAYU     </option>
                                            <option value="">IND. PERABOT LAINNYA DR KAYU  </option>
                                            <option value="">Industri Perlengkapan dan Komponen Kendaraan Bermotor Roda Empat Atau Lebih (Produktif)</option>
                                            <option value="">INDUSTRI KAYU LAINNYA         </option>
                                            <option value="">KERTAS &amp; HASIL-HASIL KERTAS   </option>
                                            <option value="">Industri Pembuatan dan Perbaikan Kapal dan Perahu (Produktif)</option>
                                            <option value="">PERCETAKAN &amp; PENERBITAN       </option>
                                            <option value="">Industri Kereta Api, Bagianbagian dan Perlengkapannya, Serta Perbaikan Kereta Api (Produktif)</option>
                                            <option value="">BAHAN KERTAS (PULP)           </option>
                                            <option value="">Industri Pesawat Terbang dan Perlengkapannya Serta Perbaikan Pesawat Terbang (Produktif)</option>
                                            <option value="">Industri Kendaraan Bermotor Roda Dua dan Tiga Serta Komponen dan Perlengkapannya (Produktif)</option>
                                            <option value="">Industri Alat Angkut yang Tidak Diklasifikasikan di Tempat Lain (Produktif)</option>
                                            <option value="">INDUSTRI PUPUK &amp; OBAT HAMA    </option>
                                            <option value="">Industri Furnitur (Produktif)</option>
                                            <option value="">INDUSTRI FARMASI              </option>
                                            <option value="">INDUSTRI PLASTIK              </option>
                                            <option value="">IND. HSL KIMIA LAINNYA&amp; BHNNYA</option>
                                            <option value="">IND. REMILLING &amp; RMH ASAP     </option>
                                            <option value="">INDUSTRI CRUMB RUBBER         </option>
                                            <option value="">IND. HSL KARET LAINNYA        </option>
                                            <option value="">IND. BAN DR HSL KARET LAINNYA </option>
                                            <option value="">IND. ALAS KAKI DR HSL KRT     </option>
                                            <option value="">IND. HSL KARET LAINNYA        </option>
                                            <option value="">IND. MINYAK ATSIRI            </option>
                                            <option value="">IND. HSL MINYAK BUMI          </option>
                                            <option value="">INDUSTRI BATU BARA            </option>
                                            <option value="">IND. BAHAN KIMIA....LAINNYA   </option>
                                            <option value="">Industri Pengolahan Lainnya (Produktif)</option>
                                            <option value="">INDUSTRI SEMEN                </option>
                                            <option value="">Daur Ulang Barang-barang Logam (Produktif)</option>
                                            <option value="">IND. BATU BATA/GENTENG        </option>
                                            <option value="">Daur Ulang Barang-barang Bukan logam (Produktif)</option>
                                            <option value="">INDUSTRI KERAMIK              </option>
                                            <option value="">IND. NON LOGAM LAINNYA        </option>
                                            <option value="">INDUSTRI BESI BAJA            </option>
                                            <option value="">INDUSTRI LOGAM DASAR LAINNYA  </option>
                                            <option value="">IND. PERALATAN MARITIM LN     </option>
                                            <option value="">IND. PERALATAN OTOMOTIF LN    </option>
                                            <option value="">IND. PERALATAN ELEKTRO LN     </option>
                                            <option value="">IND. ALAT PERTANIAN LN        </option>
                                            <option value="">IND. PERALATAN LAINNYA LN     </option>
                                            <option value="">IND. PERALATAN MARITIM DN     </option>
                                            <option value="">IND. PERALATAN OTOMOTIF DN    </option>
                                            <option value="">IND. PERALATAN ELEKTRO DN     </option>
                                            <option value="">IND. ALAT PERTANIAN DN        </option>
                                            <option value="">IND. PERALATAN LAINNYA DN     </option>
                                            <option value="">IND. KOMPONEN MARITIM         </option>
                                            <option value="">IND. KOMPONEN OTOMOTIF        </option>
                                            <option value="">IND. KOMPONEN ELEKTRONIKA     </option>
                                            <option value="">IND. KOMPONEN ALAT PERTANIAN  </option>
                                            <option value="">INDUSTRI KOMPONEN LAINNYA     </option>
                                            <option value="">INDUSTRI LAINNYA              </option>
                                            <option value="">Ketenagalistrikan Pedesaan (Produktif)</option>
                                            <option value="">Ketenagalistrikan Lainnya (Produktif)</option>
                                            <option value="">Gas (Produktif)</option>
                                            <option value="">Uap dan Air Panas (Produktif)</option>
                                            <option value="">Pengadaan dan Penyaluran Air Bersih (Produktif)</option>
                                            <option value="">LISTRIK PEDESAAN              </option>
                                            <option value="">LISTRIK LAINNYA               </option>
                                            <option value="">PENGADAAN GAS                 </option>
                                            <option value="">DISTRIBUSI GAS                </option>
                                            <option value="">AIR                           </option>
                                            <option value="">Penyiapan Tanah Pemukiman Transmigrasi (PTPT) (Produktif)</option>
                                            <option value="">Pencetakan Lahan Sawah (Produktif)</option>
                                            <option value="">Penyiapan Lahan Lainnya (Produktif)</option>
                                            <option value="">Konstruksi Perumahan Sederhana Bank Tabungan Negara (Produktif)</option>
                                            <option value="">Konstruksi Perumahan Sederhana Perumnas (Produktif)</option>
                                            <option value="">Konstruksi Perumahan Sederhana Lainnya Tipe s.d. 21 (Produktif)</option>
                                            <option value="">Konstruksi Perumahan Sederhana Lainnya Tipe 22 s.d. 70 (Produktif)</option>
                                            <option value="">Konstruksi Perumahan Menengah, Besar, Mewah (Tipe Diatas 70) (Produktif)</option>
                                            <option value="">Konstruksi Gedung Perkantoran (Produktif)</option>
                                            <option value="">Konstruksi Gedung Industri (Produktif)</option>
                                            <option value="">Konstruksi Gedung Perbelanjaan Pasar Inpres (Produktif)</option>
                                            <option value="">Konstruksi Gedung Perbelanjaan Lainnya (Produktif)</option>
                                            <option value="">Konstruksi Gedung Lainnya (Produktif)</option>
                                            <option value="">Bangunan Jalan Raya (Produktif)</option>
                                            <option value="">Bangunan Jalan Tol (Produktif)</option>
                                            <option value="">Bangunan Jalan Jembatan dan Landasan (Produktif)</option>
                                            <option value="">Bangunan Jalan dan Jembatan Kereta Api (Produktif)</option>
                                            <option value="">Bangunan Pengairan (Irigasi) (Produktif)</option>
                                            <option value="">Bangunan Dermaga (Pelabuhan) (Produktif)</option>
                                            <option value="">Bangunan Sipil Lainnya (Produktif)</option>
                                            <option value="">Konstruksi Bangunan Listrik Pedesaan (Produktif)</option>
                                            <option value="">Konstruksi Bangunan Elektrikal dan Komunikasi Lainnya (Produktif)</option>
                                            <option value="">Konstruksi Khusus (Produktif)</option>
                                            <option value="">Instalasi Gedung (Produktif)</option>
                                            <option value="">Instalasi Bangunan Sipil (Produktif)</option>
                                            <option value="">Penyelesaian Konstruksi Gedung (Produktif)</option>
                                            <option value="">Penghancur Bangunan Dengan Operatornya (Produktif)</option>
                                            <option value="">Penjualan Mobil (Produktif)</option>
                                            <option value="">Penjualan Suku Cadang dan Aksesoris Mobil (Produktif)</option>
                                            <option value="">Penjualan Sepeda Motor (Produktif)</option>
                                            <option value="">Penjualan Suku Cadang dan Aksesoris Sepeda Motor (Produktif)</option>
                                            <option value="">Perdagangan Eceran Bahan Bakar Kendaraan (Produktif)</option>
                                            <option value="">KONSTRUKSI RS BTN             </option>
                                            <option value="">Perdagangan Besar Berdasarkan Balas Jasa (Fee) Atau Kontrak (Produktif)</option>
                                            <option value="">KONSTRUKSI RS PERUMNAS        </option>
                                            <option value="">Perdagangan Jagung (Produktif)</option>
                                            <option value="">Perdagangan Tembakau (Produktif)</option>
                                            <option value="">Perdagangan Karet (Produktif)</option>
                                            <option value="">Perdagangan Cengkeh (Produktif)</option>
                                            <option value="">Perdagangan Lada (Produktif)</option>
                                            <option value="">Perdagangan Kelapa dan Kelapa Sawit (Produktif)</option>
                                            <option value="">Perdagangan Kapas (Produktif)</option>
                                            <option value="">Perdagangan Besar Dalam Negeri Hasil Pertanian Lainnya (Produktif)</option>
                                            <option value="">Perdagangan Besar Dalam Negeri Binatang Hidup (Produktif)</option>
                                            <option value="">Perdagangan Besar Dalam Negeri Hasil Perikanan (Produktif)</option>
                                            <option value="">Perdagangan Kayu (Produktif)</option>
                                            <option value="">Perdagangan Besar Dalam Negeri Hasil Kehutanan dan Perburuan Lainnya (Produktif)</option>
                                            <option value="">Perdagangan Dalam Negeri Beras (Produktif)</option>
                                            <option value="">Perdagangan Dalam Negeri Gula (Produktif)</option>
                                            <option value="">Perdagangan Dalam Negeri Kopi (Produktif)</option>
                                            <option value="">Perdagangan Dalam Negeri Teh (Produktif)</option>
                                            <option value="">Perdagangan Dalam Negeri Garam (Produktif)</option>
                                            <option value="">Perdagangan Dalam Negeri Minyak Kelapa Sawit (Produktif)</option>
                                            <option value="">Perdagangan Dalam Negeri Kopra (Produktif)</option>
                                            <option value="">Perdagangan Dalam Negeri Rokok (Produktif)</option>
                                            <option value="">Perdagangan Dalam Negeri Makanan, Minuman dan Tembakau Lainnya (Produktif)</option>
                                            <option value="">Perdagangan Besar Tekstil, Pakaian Jadi, dan Kulit (Produktif)</option>
                                            <option value="">Perdagangan Besar Barang-barang Keperluan Rumah Tangga lainnya (Produktif)</option>
                                            <option value="">Perdagangan Besar Bahan Bakar Gas, Cair, dan Padat, Serta Produk Sejenis (Produktif)</option>
                                            <option value="">Perdagangan Besar Logam dan Bijih Logam (Produktif)</option>
                                            <option value="">Perdagangan Dalam Negeri Semen (Produktif)</option>
                                            <option value="">Perdagangan Dalam Negeri Besi Beton (Produktif)</option>
                                            <option value="">Perdagangan Dalam Negeri Bahanbahan Konstruksi Lainnya (Produktif)</option>
                                            <option value="">Perdagangan Dalam Negeri Pupuk dan Obat Hama (Produktif)</option>
                                            <option value="">Perdagangan Dalam Negeri Barang Antara Lainnya (Produktif)</option>
                                            <option value="">Perdagangan Besar Mesin-mesin, Suku Cadang dan Perlengkapannya (Produktif)</option>
                                            <option value="">KONSTRUKSI RS LAINNYA         </option>
                                            <option value="">Perdagangan Dalam Negeri Kertas Koran (Produktif)</option>
                                            <option value="">Perdagangan Dalam Negeri yang Tidak Diklasifikasikan di Tempat Lain (Produktif)</option>
                                            <option value="">KONSTRUKSI PASAR INPRES       </option>
                                            <option value="">Perdagangan Eceran Berbagai Macam Barang yang Didominasi Makanan, Minuman dan Tembakau (Produktif)</option>
                                            <option value="">Perdagangan Eceran Brbagai Macam Brng yg didominasi oleh Barang bkn Makanan, Minuman &amp; Tmbakau(Produ</option>
                                            <option value="">Perdagangan Eceran Komoditi Makanan dari Hasil Pertanian (Produktif)</option>
                                            <option value="">Perdagangan Eceran Komoditi Makanan, Minuman, Atau Tembakau Hasil Industri Pengolahan (Produktif)</option>
                                            <option value="">Perdagangan Eceran Bahan Kimia, Farmasi, Kosmetik, dan Alat Laboratorium (Produktif)</option>
                                            <option value="">Perdagangan Eceran Tekstil, Pakaian Jadi, Alas Kaki, dan Barang Keperluan Pribadi (Produktif)</option>
                                            <option value="">Perdagangan Eceran Perlengkapan Rumah Tangga dan Perlengkapan Dapur (Produktif)</option>
                                            <option value="">Perdagangan Eceran Bahan Konstruksi (Produktif)</option>
                                            <option value="">Perdagangan Eceran Bahan Bakar dan Minyak Pelumas (Produktif)</option>
                                            <option value="">Perdagangan Eceran Kertas,Brng2 dr Kertas, Alat Tulis/ATK,Alat Olahraga/Musik/Ftografi,Kmputer(Produ</option>
                                            <option value="">Perdagangan Eceran Mesin2(Kcuali Mobil &amp; Spd Motor)&amp; Onderdil,trmasuk Alat2 Transportasi(Produktif)</option>
                                            <option value="">Perdagangan Eceran Barang-barang Kerajinan, Mainan Anakanak, dan Lukisan (Produktif)</option>
                                            <option value="">Perdagangan Eceran Komoditi Lainnya (Bukan Makanan, Minuman, Atau Tembakau) (Produktif)</option>
                                            <option value="">Perdagangan Eceran Barang Bekas (Produktif)</option>
                                            <option value="">Perdagangan Eceran Kaki Lima Komoditi dari Hasil Pertanian (Produktif)</option>
                                            <option value="">Perdagangan Eceran Kaki Lima Komoditi Makanan, Minuman Hasil Industri Pengolahan (Produktif)</option>
                                            <option value="">Perdagangan Eceran Kaki Lima Bahan Kimia, Frmasi, Kosmetik, dan Alat Laboratorium (Produktif)</option>
                                            <option value="">Perdagangan Eceran Kaki Lima Tekstil, Pakaian Jadi, Alas Kaki, dan Barang Keperluan Pribadi (Produkt</option>
                                            <option value="">Perdagangan Eceran Kaki Lima Perlengkapan Rumah Tangga dan Perlengkapan Dapur (Produktif)</option>
                                            <option value="">Perdagangan Eceran Kaki Lima Bahan Bakar dan Pelumas (Produktif)</option>
                                            <option value="">Prdgngan Eceran Kaki 5 -Krtas,Brg2 dr Krtas,ATK,Alat Olahraga/Musik/Ftografi,&amp; Kmputer(Produktif)</option>
                                            <option value="">Perdagangan Eceran Kaki Lima Barang-barang kerajinan, mainan anakanak, dan ILlkisan (Produktif)</option>
                                            <option value="">Perdagangan Eceran Kaki Lima Barang-barang Bekas (Produktif)</option>
                                            <option value="">Perdagangan Eceran Kaki Lima Lainnya (Produktif)</option>
                                            <option value="">Perdagangan Eceran Melalui Media (Produktif)</option>
                                            <option value="">Perdagangan Eceran Keliling (Produktif)</option>
                                            <option value="">TANAH PEMUKIMAN TRANSMIGRASI  </option>
                                            <option value="">Perdagangan Ekspor Berdasarkan Balas Jasa (Fee) Atau Kontrak (Produktif)</option>
                                            <option value="">Perdagangan Ekspor Biji Kelapa Sawit (Produktif)</option>
                                            <option value="">Perdagangan Ekspor Hasil Tanaman Pangan dan Perkebunan (Produktif)</option>
                                            <option value="">Perdagangan Ekspor Bahan Baku Hasil Pertanian Lainnya (Produktif)</option>
                                            <option value="">Perdagangan Ekspor Binatang Hidup (Produktif)</option>
                                            <option value="">Perdagangan Ekspor Hasil Perikanan (Produktif)</option>
                                            <option value="">Perdagangan Ekspor Kayu (Produktif)</option>
                                            <option value="">Perdagangan Ekspor Rotan (Produktif)</option>
                                            <option value="">Perdagangan Ekspor Hasil Hutan Selain Kayu dan Rotan (Produktif)</option>
                                            <option value="">Perdagangan Ekspor Udang Olahan (Produktif)</option>
                                            <option value="">Perdagangan Ekspor Teh (Produktif)</option>
                                            <option value="">Perdagangan Ekspor Kopi Bubuk (Produktif)</option>
                                            <option value="">Perdagangan Ekspor Tembakau (Produktif)</option>
                                            <option value="">Perdagangan Ekspor Makanan dan Minuman Lainnya (Produktif)</option>
                                            <option value="">Perdagangan Ekspor Tekstil (Produktif)</option>
                                            <option value="">Perdagangan Ekspor Pakaian Jadi (Produktif)</option>
                                            <option value="">Perdagangan Ekspor Kulit (Produktif)</option>
                                            <option value="">Perdagangan Ekspor Barang-barang Keperluan Rumah Tangga Lainnya (Produktif)</option>
                                            <option value="">Perdagangan Ekspor Bahan Bakar Gas, Cair, dan Padat Serta Produk Sejenis (Produktif)</option>
                                            <option value="">Perdagangan Ekspor Bijih Timah (Produktif)</option>
                                            <option value="">Perdagangan Ekspor Bijih Logam Selain Timah (Produktif)</option>
                                            <option value="">Perdagangan Ekspor Batu Bara (Produktif)</option>
                                            <option value="">Perdagangan Ekspor Logam dan Bijih Logam (hasil Pertambangan dan Penggalian) Lainnya (Produktif)</option>
                                            <option value="">Perdagangan Ekspor Kayu Lapis (Produktif)</option>
                                            <option value="">Perdagangan Ekspor Bahanbahan Konstruksi (kecuali Bahan Hasil Penggalian) Lainnya (Produktif)</option>
                                            <option value="">Prdagangan Ekspor Produk Antara (Intrmdiate Products), Brng2 Bekas &amp; Sisa2 Tak Trpakai(Scrap) (Produ</option>
                                            <option value="">Perdagangan Ekspor Mesin-mesin, Suku Cadang dan Perlengkapannya (Produktif)</option>
                                            <option value="">Perdagangan Ekspor Kayu Gergajian (Produktif)</option>
                                            <option value="">Perdagangan Ekspor Kopi Bijian (Produktif)</option>
                                            <option value="">Perdagangan Ekspor Tembakau (Produktif)</option>
                                            <option value="">Perdagangan Ekspor Karet (Produktif)</option>
                                            <option value="">Perdagangan Ekspor Lada (Produktif)</option>
                                            <option value="">Perdagangan Ekspor Minyak Kelapa Sawit Mentah (Produktif)</option>
                                            <option value="">Perdagangan Ekspor Minyak Biji Kelapa Sawit (Produktif)</option>
                                            <option value="">Perdagangan Ekspor Bungkil Kopra (Produktif)</option>
                                            <option value="">Perdagangan Ekspor Hasil Pertanian, Perkebunan, dan Kehutanan Lainnya (Produktif)</option>
                                            <option value="">Perdagangan Ekspor Hewan yang Sudah Diolah (Produktif)</option>
                                            <option value="">Perdagangan Ekspor Bahan Makanan Lainnya (Produktif)</option>
                                            <option value="">Perdagangan Ekspor Hasil Tambang Setengah Jadi (Produktif)</option>
                                            <option value="">Perdagangan Ekspor Barang Setengah Jadi Lainnya (Produktif)</option>
                                            <option value="">Perdagangan Ekspor Barang Kerajinan dari Kayu dan Rotan (Produktif)</option>
                                            <option value="">Perdagangan Ekspor Barang Kerajinan selain dari Kayu dan Rotan (Produktif)</option>
                                            <option value="">Perdagangan Ekspor Jasa Konstruksi (Produktif)</option>
                                            <option value="">Perdagangan Ekspor yang Tidak Diklasifikasikan di Tempat Lain (Produktif)</option>
                                            <option value="">KONST. PENCETAKAN SAWAH       </option>
                                            <option value="">Perdagangan Impor Berdasarkan Balas Jasa (Fee) Atau Kontrak (Produktif)</option>
                                            <option value="">Perdagangan Impor Cengkeh (Produktif)</option>
                                            <option value="">Perdagangan Impor Biji Gandum (Produktif)</option>
                                            <option value="">Perdagangan Impor Jagung (Produktif)</option>
                                            <option value="">Perdagangan Impor Kacang Kedelai (Produktif)</option>
                                            <option value="">Perdagangan Impor Bahan Baku Hasil Pertanian, dan Binatang Hidup Lainnya (Produktif)</option>
                                            <option value="">Perdagangan Impor Beras (Produktif)</option>
                                            <option value="">Perdagangan Impor Gula (Produktif)</option>
                                            <option value="">Perdagangan Impor Makanan, Minuman, dan Tembakau Lainnya (Produktif)</option>
                                            <option value="">Perdagangan Impor Tekstil, Pakaian Jadi, dan Kulit (Produktif)</option>
                                            <option value="">Perdagangan Impor Barang-barang Keperluan Rumah Tangga lainnya (Produktif)</option>
                                            <option value="">Perdagangan Impor Bahan Bakar Gas, Cair, dan Padat Serta Produk Sejenis (Produktif)</option>
                                            <option value="">Perdagangan Impor Logam dan Bijih Logam (Produktif)</option>
                                            <option value="">Perdagangan Impor Besi Beton (Produktif)</option>
                                            <option value="">Perdagangan Impor Bahanbahan Konstruksi Lainnya (Produktif)</option>
                                            <option value="">Perdagangan Impor Pupuk dan Obat Hama (Produktif)</option>
                                            <option value="">Perdagangan Impor Farmasi (Produktif)</option>
                                            <option value="">Perdagangan Impor Barang Antara Lainnya (Produktif)</option>
                                            <option value="">Perdagangan Impor Suku Cadang Industri (Produktif)</option>
                                            <option value="">Perdagangan Impor Suku Cadang Mesin-mesin, Suku Cadang dan Perlengkapannya Lainnya (Produktif)</option>
                                            <option value="">Perdagangan Impor Lainnya (Produktif)</option>
                                            <option value="">KONSTRUKSI JL RAYA &amp; JEMBATAN </option>
                                            <option value="">Hotel Bintang (Produktif)</option>
                                            <option value="">Hotel Melati (Produktif)</option>
                                            <option value="">Jasa Akomodasi Lainnya (Produktif)</option>
                                            <option value="">Penyediaan Makan Minum Lainnya (Produktif)</option>
                                            <option value="">Restoran / Rumah Makan (Produktif)</option>
                                            <option value="">KONSTRUKSI PELABUHAN          </option>
                                            <option value="">KONSTRUKSI IRIGASI            </option>
                                            <option value="">KONSTRUKSI LISTRIK PEDESAAN   </option>
                                            <option value="">KONSTRUKSI LISTRIK LAINNYA    </option>
                                            <option value="">PROYEK PINJAMAN LN            </option>
                                            <option value="">KONSTRUKSI LAINNYA            </option>
                                            <option value="">KONSTRUKSI TELEKOMUNIKASI BTS </option>
                                            <option value="">KONST. TELEKOMUNIKASI LAINNYA </option>
                                            <option value="">KONST. PERUM NON SEDERHANA    </option>
                                            <option value="">KONST. APARTEMEN/KONDOMINIUM  </option>
                                            <option value="">KONST. PERKANTORAN            </option>
                                            <option value="">KONST. PUSAT PERBELANJAAN     </option>
                                            <option value="">KONST. BANGUNAN LAINNYA       </option>
                                            <option value="">Angkutan Jalan Rel (Produktif)</option>
                                            <option value="">Angkutan Jalan Dalam Trayek Untuk Penumpang (Produktif)</option>
                                            <option value="">Angkutan Jalan Tidak Dalam Trayek Untuk Penumpang (Produktif)</option>
                                            <option value="">Angkutan Jalan Untuk Barang (Produktif)</option>
                                            <option value="">Angkutan Dengan Saluran Pipa (Produktif)</option>
                                            <option value="">Angkutan Laut Domestik (Produktif)</option>
                                            <option value="">Angkutan Laut Internasional (Produktif)</option>
                                            <option value="">Angkutan Sungai dan Danau (Produktif)</option>
                                            <option value="">Angkutan Penyeberangan Domestik (Produktif)</option>
                                            <option value="">PERDAG. EKSPOR BRG BHN BAKU   </option>
                                            <option value="">PERDAG. EKSPOR BRG 1/2 JADI   </option>
                                            <option value="">PERDAG. EKSPOR BRG JADI       </option>
                                            <option value="">PERDAG. EKSPOR JASA KONSTRUKSI</option>
                                            <option value="">PERDAG. EKSPOR JASA LAINNYA   </option>
                                            <option value="">Angkutan Udara Berjadwal (Produktif)</option>
                                            <option value="">PERDAG. BJ GANDUM BANTUAN LN  </option>
                                            <option value="">PERDAG. BERAS BANTUAN LN      </option>
                                            <option value="">PERDAG. KAPAS BANTUAN LN      </option>
                                            <option value="">PERDAG. BENANG TENUN LN       </option>
                                            <option value="">PERDAG. LAINNYA BANTUAN LN    </option>
                                            <option value="">Angkutan Udara Tidak Berjadwal (Produktif)</option>
                                            <option value="">PERDAG. PUPUK &amp; OBAT HAMA     </option>
                                            <option value="">PERDAG. BESI BETON NON BANTUAN</option>
                                            <option value="">PERDAG. KERTAS KORAN          </option>
                                            <option value="">PERDAG. CENGKEH NON BANTUAN   </option>
                                            <option value="">PERDAG. BERAS NON BANTUAN     </option>
                                            <option value="">PERDAG. GULA NON BANTUAN      </option>
                                            <option value="">PERDAG. BJ GANDUM NON BANTUAN </option>
                                            <option value="">PERDAG. JAGUNG NON BANTUAN    </option>
                                            <option value="">PERDAG KCG KEDELAI NON BANTUAN</option>
                                            <option value="">PERDAG. FARMASI NON BANTUAN   </option>
                                            <option value="">Angkutan Udara Khusus (Produktif)</option>
                                            <option value="">PERDAG SUKU CDG KB NON BANTUAN</option>
                                            <option value="">PERDAG SK CDG IND. NON BANTUAN</option>
                                            <option value="">PERDAG OTOMOTIF NON BANTUAN   </option>
                                            <option value="">PERDAG ELEKTRONIKA NON BANTUAN</option>
                                            <option value="">PERDAG TPT NON BANTUAN        </option>
                                            <option value="">PERDAG LAINNYA NON BANTUAN    </option>
                                            <option value="">Jasa Pelayanan Bongkar Muat Barang (Produktif)</option>
                                            <option value="">PERDAGANGAN BERAS DN          </option>
                                            <option value="">PERDAGANGAN JAGUNG DN         </option>
                                            <option value="">PERDAGANGAN GARAM DN          </option>
                                            <option value="">PERDAGANGAN STOK GULA DN      </option>
                                            <option value="">PERDAGANGAN KAYU DN           </option>
                                            <option value="">PERDAGANGAN KARET DN          </option>
                                            <option value="">PERDAGANGAN KLP SWT DN        </option>
                                            <option value="">PERDAGANGAN KAPAS DN          </option>
                                            <option value="">PERDAGANGAN KOPRA DN          </option>
                                            <option value="">PERDAGANGAN CENGKEH DN        </option>
                                            <option value="">Pergudangan, Jasa Cold Storage, dan Jasa Wilayah Berikat (Produktif)</option>
                                            <option value="">PERDAGANGAN LADA DN           </option>
                                            <option value="">PERDAGANGAN TEMBAKAU DN       </option>
                                            <option value="">PERDAGANGAN KOPI DN           </option>
                                            <option value="">PERDAGANGAN TEH DN            </option>
                                            <option value="">PERDAG. HWN HDP &amp; HSLNYA DN   </option>
                                            <option value="">PERDAGANGAN OTOMOTIF DN       </option>
                                            <option value="">PERDAGANGAN ELEKTRONIKA DN    </option>
                                            <option value="">PERDAGANGAN TPT DN            </option>
                                            <option value="">PERDAGANGAN FURNITUR DN       </option>
                                            <option value="">Jasa Penunjang Angkutan Kecuali Jasa Bongkar Muat dan Pergudangan (Produktif)</option>
                                            <option value="">Jasa Perjalanan Wisata (Produktif)</option>
                                            <option value="">Jasa Pengiriman dan Pengepakan (Produktif)</option>
                                            <option value="">PERDAGANGAN LAINNYA DN        </option>
                                            <option value="">Pos Nasional, Unit Pelayanan Pos dan Jasa Kurir (Produktif)</option>
                                            <option value="">PERDAG. DISTRIBUSI SEMEN TIGA RODA</option>
                                            <option value="">PERDAG. DIS. PUPUK &amp; OBAT HAMA</option>
                                            <option value="">PERDAG. DISTRIBUSI KAPAS KASAR</option>
                                            <option value="">PERDAG. DISTRIBUSI BESI BETON </option>
                                            <option value="">PERDAG DISTRIBUSI KERTAS KORAN</option>
                                            <option value="">PERDAG. DISTRIBUSI BERAS      </option>
                                            <option value="">PERDAG. DISTRIBUSI GULA       </option>
                                            <option value="">PERDAG. DIST. TEPUNG TERIGU   </option>
                                            <option value="">PERDAG. DISTRIBUSI GARAM      </option>
                                            <option value="">PERDAG. DISTRIBUSI BBM        </option>
                                            <option value="">Jaringan Telekomunikasi (Produktif)</option>
                                            <option value="">PERDAG. DISTRIBUSI OTOMOTIF   </option>
                                            <option value="">PERDAG. DISTRIBUSI ELEKTRONIKA</option>
                                            <option value="">PERDAG. DISTRIBUSI TPT        </option>
                                            <option value="">PERDAG. DISTRIBUSI FURNITUR   </option>
                                            <option value="">Jasa Telekomunikasi (Produktif)</option>
                                            <option value="">Telekomunikasi Khusus (Produktif)</option>
                                            <option value="">PERDAG. DISTRIBUSI LAINNYA    </option>
                                            <option value="">PERDAGANGAN ECERAN            </option>
                                            <option value="">Perantara Moneter (Bank) (Produktif)</option>
                                            <option value="">Perantara Keuangan Lainnya (Non Bank) Leasing (Produktif)</option>
                                            <option value="">Perantara Keuangan Lainnya (Non Bank) Selain Leasing (Produktif)</option>
                                            <option value="">Asuransi dan Dana Pensiun (Produktif)</option>
                                            <option value="">RESTORAN</option>
                                            <option value="">HOTEL                         </option>
                                            <option value="">Jasa Penukaran Mata Uang atau Pedagang Valuta Asing (Money Changer) (Produktif)</option>
                                            <option value="">Jasa Penunjang Perantara Keuangan Lainnya (Produktif)</option>
                                            <option value="">Jasa Penunjang Asuransi dan dana Pensiun (Produktif)</option>
                                            <option value="">PERDAGANGAN LAINNYA           </option>
                                            <option value="">Real Estate Perumahan Sederhana Perumnas (Produktif)</option>
                                            <option value="">Real Estate Perumahan Sederhana Selain Perumnas s.d. Tipe 21 (Produktif)</option>
                                            <option value="">Real Estate Perumahan Sederhana Selain Perumnas s.d. Tipe 22 s.d. 70 (Produktif)</option>
                                            <option value="">Real Estate Perumahan Menengah, Besar Atau Mewah (Tipe Diatas 70) (Produktif)</option>
                                            <option value="">Real Estate Perumahan Flat / Apartemen (Produktif)</option>
                                            <option value="">Real Estate Gedung Perbelanjaan (Mal, Plaza) (Produktif)</option>
                                            <option value="">Real Estate Gedung Perkantoran (Produktif)</option>
                                            <option value="">Real Estate Gedung Rumah Toko (Ruko) atau Rumah Kantor (Rukan) (Produktif)</option>
                                            <option value="">Real Estate Lainnya (Produktif)</option>
                                            <option value="">Real Estate Atas Dasar Balas Jasa (Fee) Atau Kontrak (Produktif)</option>
                                            <option value="">Kawasan Pariwisata dan Penyediaan Sarana Wisata Tirta Kawasan Pariwisata (Produktif)</option>
                                            <option value="">PENGANGKUTAN, GUDANG &amp; KOM    </option>
                                            <option value="">ANGKUTAN UMUM DARAT TAKSI     </option>
                                            <option value="">Persewaan Alat Transportasi Darat (Produktif)</option>
                                            <option value="">ANGKUTAN UMUM DARAT BIS/ANGKOT</option>
                                            <option value="">Persewaan Alat Transportasi Air (Produktif)</option>
                                            <option value="">Persewaan Alat Transportasi Udara (Produktif)</option>
                                            <option value="">ANGKUTAN UMUM DARAT LAINNYA   </option>
                                            <option value="">ANGKUTAN UMUM SUNGAI/DANAU    </option>
                                            <option value="">Persewaan Mesin Pertanian dan Peralatannya (Produktif)</option>
                                            <option value="">Persewaan Mesin Konstruksi dan Teknik Sipil dan Peralatannya (Produktif)</option>
                                            <option value="">Persewaan Mesin Kantor dan Peralatannya (Termasuk Komputer) (Produktif)</option>
                                            <option value="">Persewaan Mesin Lainnya dan Peralatannya yang Tidak Diklasifikasikan di Tempat Lain (Produktif)</option>
                                            <option value="">ANGKUTAN UMUM LAUT            </option>
                                            <option value="">Persewaan Barang2 Keperluan Rumah Tangga dan Pribadi yang tdk Diklasifikasikan di Tempat Lain(Produk</option>
                                            <option value="">ANGKUTAN UMUM UDARA           </option>
                                            <option value="">BIRO PERJALANAN               </option>
                                            <option value="">Jasa Konsultasi Piranti Keras (Hardware Consulting) (Produktif)</option>
                                            <option value="">Jasa Konsultasi Piranti Lunak (Software Consulting) (Produktif)</option>
                                            <option value="">Pengolahan Data (Produktif)</option>
                                            <option value="">Jasa Kegiatan Data Base (Produktif)</option>
                                            <option value="">Perawatan dan Reparasi Mesin-mesin Kantor, Akuntansi, dan Komputer (Produktif)</option>
                                            <option value="">Kegiatan Lain yang Berkaitan Dengan Komputer (Produktif)</option>
                                            <option value="">PERGUDANGAN                   </option>
                                            <option value="">Penelitian dan Pengembangan Ilmu Pengetahuan Alam dan Teknologi (Produktif)</option>
                                            <option value="">Penelitian dan Pengembangan Ilmu Pengetahuan Sosial dan Humaniora (Produktif)</option>
                                            <option value="">KOMUNIKASI                    </option>
                                            <option value="">KOMUNIKASI POSTEL             </option>
                                            <option value="">Jasa Hukum, Akuntansi &amp; Pembukuan,Konsultasi Pajak/Bisnis/Manajemen,Penelitian Pasar(Produktif)</option>
                                            <option value="">Jasa Konsultasi Arsitek, Kegiatan Teknik dan Rekayasa, Serta Analisis dan Testing (Produktif)</option>
                                            <option value="">Jasa Periklanan (Produktif)</option>
                                            <option value="">KOMUNIKASI LAINNYA            </option>
                                            <option value="">Jasa Perusahaan Lainnya yang Tidak Diklasifikasikan di Tempat Lain (Produktif)</option>
                                            <option value="">Administrasi Pemerintahan, dan Kebijaksanaan Ekonomi dan Sosial (Produktif)</option>
                                            <option value="">Hubungan Luar Negeri, Pertahanan, dan Keamanan (Produktif)</option>
                                            <option value="">Jaminan Sosial Wajib (Produktif)</option>
                                            <option value="">Jasa Pendidikan Dasar (Produktif)</option>
                                            <option value="">Jasa Pendidikan Menengah (Produktif)</option>
                                            <option value="">Jasa Pendidikan Tinggi (Produktif)</option>
                                            <option value="">Jasa Pendidikan Lainnya (Produktif)</option>
                                            <option value="">JASA REAL ESTAT PERUM PERUMNAS</option>
                                            <option value="">JAS. RE PERUM NON PERUMNAS    </option>
                                            <option value="">REAL ESTATE PASAR INPRES      </option>
                                            <option value="">APARTEMEN                     </option>
                                            <option value="">NON APARTEMEN                 </option>
                                            <option value="">JASA RE  PERKANTORAN          </option>
                                            <option value="">JASA RE PUSAT BELANJA.        </option>
                                            <option value="">JASA RE SELAIN KTR &amp; PB       </option>
                                            <option value="">PROFESI SELAIN DOKTER         </option>
                                            <option value="">JASA KEUANGAN LEASING         </option>
                                            <option value="">JASA KEUANGAN MULTIFINANCE    </option>
                                            <option value="">JASA KEUANGAN BPR/BPRS        </option>
                                            <option value="">JASA KEUANGAN ASURANSI        </option>
                                            <option value="">JASA KEUANGAN BMT             </option>
                                            <option value="">JASA KEUANGAN LAINNYA         </option>
                                            <option value="">JASA RENTAL KENDARAAN         </option>
                                            <option value="">Jasa Kesehatan Manusia Rumah sakit (Produktif)</option>
                                            <option value="">Jasa Kesehatan Manusia Poliklinik / Rumah Bersalin (Produktif)</option>
                                            <option value="">Jasa Kesehatan Manusia Tempat Perawatan / Pengobatan (Produktif)</option>
                                            <option value="">Jasa Kesehatan Manusia Profesi Dokter (Produktif)</option>
                                            <option value="">Jasa Kesehatan Hewan (Produktif)</option>
                                            <option value="">Jasa Kegiatan Sosial (Produktif)</option>
                                            <option value="">JASA RENTAL NON KENDARAAN     </option>
                                            <option value="">JASA DUNIA USAHA LAINNYA      </option>
                                            <option value="">Jasa Kebersihan (Produktif)</option>
                                            <option value="">Organisasi Bisnis, Pengusaha dan Profesional (Produktif)</option>
                                            <option value="">HIBURAN RADIO, TV, FILM       </option>
                                            <option value="">Organisasi Buruh (Produktif)</option>
                                            <option value="">JASA HIBURAN &amp; BUDAYA LAINNYA </option>
                                            <option value="">Organisasi Lainnya (Produktif)</option>
                                            <option value="">Kegiatan Perfilman, Radio, Televisi, dan Hiburan Lainnya (Produktif)</option>
                                            <option value="">JASA DOKTER &amp; PARAMEDIK       </option>
                                            <option value="">JASA KES LAINNYA              </option>
                                            <option value="">Kegiatan Kantor Berita (Produktif)</option>
                                            <option value="">RAWAT/OBAT RS &amp; KLINIK KES    </option>
                                            <option value="">JASA TEMPAT RAWAT/OBAT LAINNYA</option>
                                            <option value="">Perpustakaan, Arsip, Museum, dan Kegiatan Kebudayaan Lainnya (Produktif)</option>
                                            <option value="">Jasa Kegiatan Lainnya (Produktif)</option>
                                            <option value="">Jasa Pendidikan Perguruan Tinggi</option>
                                            <option value="">JASA PENDIDIKAN LAINNYA FORMAL</option>
                                            <option value="">JASA DIDIK LAINNYA NON FORMAL </option>
                                            <option value="">Jasa Perorangan yang Melayani Rumah Tangga (Produktif)</option>
                                            <option value="">Badan Internasional dan Badan Ekstra Internasional Lainnya (Produktif)</option>
                                            <option value="">JASA BENGKEL/REPARASI         </option>
                                            <option value="">JASA SOSIAL/MASYARAKAT LAINNYA</option>
                                            <option value="">LAIN-LAIN KONSUMTIF RS        </option>
                                            <option value="">LAIN-LAIN KONSUMTIF NON RS    </option>
                                            <option value="">LAIN-LAIN KONSUMTIF APRT/KONDO</option>
                                            <option value="">LAIN-LAIN KONSUMTIF MOBIL     </option>
                                            <option value="">LAIN-LAIN KONSUMTIF MOTOR     </option>
                                            <option value="">LAIN2 KONSUMTIF KEND. LAINNYA </option>
                                            <option value="">KONSUMTIF ALAT RUMAH TANGGA   </option>
                                            <option value="">Konsumtif lainnya</option>
                                            <option value="">Lain-lain, Lainnya</option>
                                            </select>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Laporan Keuangan</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example">
                                                <option selected>- Silahkan Pilih -</option>
                                                <option value="1">YA</option>    
                                                <option value="1">Tidak</option>     
                                            </select>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Deskripsi Kegiatan Usaha</label>
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
                                            <label for="exampleInputEmail1" class="form-label">Alamat Perusahaan</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                            <p><br>
                                            <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">RT / RW</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="col-lg-2">
                                            <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                        </div>
                                        <div class="mb-3 col-lg-2">
                                            <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
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
                                            <select class="form-select" aria-label="Default select example">
                                                <option selected>- Silahkan Pilih -</option>
                                                <option value="">Jawa Barat</option>
                                                <option value="">Banten</option>
                                                <option value="">DKI Jakarta</option>
                                                <option value="">Daerah Istimewa Yogyakarta</option>
                                                <option value="">Jawa Tengah</option>
                                                <option value="">Jawa Timur</option>
                                                <option value="">Bengkulu</option>
                                                <option value="">Jambi</option>
                                                <option value="">Nanggroe Aceh D</option>
                                                <option value="">Sumatera Utara</option>
                                                <option value="">Sumatera Barat</option>
                                                <option value="">Riau</option>
                                                <option value="">Sumatera Selatan</option>
                                                <option value="">Kep Bangka Belitung</option>
                                                <option value="">Kepulauan Riau</option>
                                                <option value="">Lampung</option>
                                                <option value="">Kalimantan Selatan</option>
                                                <option value="">Kalimantan Barat</option>
                                                <option value="">Kalimantan Timur</option>
                                                <option value="">Kalimantan Utara</option>
                                                <option value="">Kalimantan Tengah</option>
                                                <option value="">Sulawesi Tengah</option>
                                                <option value="">Sulawesi Selatan</option>
                                                <option value="">Sulawesi Utara</option>
                                                <option value="">Gorontalo</option>
                                                <option value="">Sulawesi Barat</option>
                                                <option value="">Sulawesi Tenggara</option>
                                                <option value="">Nusa Tenggara Barat</option>
                                                <option value="">Bali</option>
                                                <option value="">Nusa Tenggara Timur</option>
                                                <option value="">Maluku</option>
                                                <option value="">Papua</option>
                                                <option value="">Maluku Utara</option>
                                                <option value="">Papua Barat</option>
                                                <option value="">DI LUAR INDONESIA</option>           
                                            </select>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Kabupaten / Kota</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example">
                                                <option selected>- Silahkan Pilih -</option>
                                                <option value="">Provinsi Riau</option>
                                                <option value="">Kampar, Kab.</option>
                                                <option value="">Bengkaoptions, Kab.</option>
                                                <option value="">Indragiri Hulu, Kab.</option>
                                                <option value="">Indragiri Hioptionr, Kab.</option>
                                                <option value="">Rokan Hulu, Kab.</option>
                                                <option value="">Rokan Hioptionr, Kab.</option>
                                                <option value="">Pelalawan, Kab.</option>
                                                <option value="">Siak, Kab.</option>
                                                <option value="">Kuantan Singingi, Kab.</option>
                                                <option value="">Kab. Kepulauan Meranti</option>
                                                <option value="">Prov. Riau, Kab./Kota Lainnya.</option>
                                                <option value="">Pekanbaru, Kota.</option>
                                                <option value="">Dumai, Kota.</option>
                                                <option value="">Provinsi Sumatera Selatan</option>
                                                <option value="">Musi Banyuasin, Kab.</option>
                                                <option value="">Ogan Komering Ulu, Kab.</option>
                                                <option value="">Lematang Ioptionr Ogan Tengah (Muara Enim), Kab.</option>
                                                <option value="">Lahat, Kab.</option>
                                                <option value="">Musi Rawas, Kab.</option>
                                                <option value="">Ogan Komering Ioptionr, Kab.</option>
                                                <option value="">Pangkalan Balai, Kab.</option>
                                                <option value="">Kab. Banyuasin</option>
                                                <option value="">Kab. Ogan Komering Ulu Selatan</option>
                                                <option value="">Kab. Ogan Komering Ulu Timur</option>
                                                <option value="">Kab. Ogan Ioptionr</option>
                                                <option value="">Kab. Empat Lawang</option>
                                                <option value="">Prov Sumatera Selatan, Kab./Kota Lainnya.</option>
                                                <option value="">Palembang, Kota.</option>
                                                <option value="">Lubukoptionnggau, Kota.</option>
                                                <option value="">Prabumuoptionh, Kota.</option>
                                                <option value="">Baturaja, Kota.</option>
                                                <option value="">Pagar Alam, Kota.</option>
                                                <option value="">Kab. Penukal Abab Lematang Ioptionr</option>
                                                <option value="">Kab. Musi Rawas Utara</option>
                                                <option value="">Provinsi Kep. Bangka Beoptiontung</option>
                                                <option value="">Bangka, Kab.</option>
                                                <option value="">Beoptiontung, Kab.</option>
                                                <option value="">Prov. Babel, Kab./Kota Lainnya.</option>
                                                <option value="">Pangkal Pinang, Kota.</option>
                                                <option value="">Provinsi Kep. Riau</option>
                                                <option value="">Karimun, Kab.</option>
                                                <option value="">Kab. optionngga</option>
                                                <option value="">Natuna, Kab.</option>
                                                <option value="">Kab. Bintan</option>
                                                <option value="">Kab. Kepulauan Anambas</option>
                                                <option value="">Tanjungpinang, Kota.</option>
                                                <option value="">Batam, Kota.</option>
                                                <option value="">Kab/Kota Lainnya</option>
                                                <option value="">Provinsi Lampung</option>
                                                <option value="">Lampung Selatan, Kab.</option>
                                                <option value="">Lampung Tengah, Kab.</option>
                                                <option value="">Lampung Utara, Kab.</option>
                                                <option value="">Lampung Barat, Kab.</option>
                                                <option value="">Tulang Bawang, Kab.</option>
                                                <option value="">Tanggamus, Kab.</option>
                                                <option value="">Lampung Timur, Kab.</option>
                                                <option value="">Way Kanan, Kab.</option>
                                                <option value="">Kab. Pesawaran</option>
                                                <option value="">Kab. Pringsewu</option>
                                                <option value="">Kab. Tulang Bawang Barat</option>
                                                <option value="">Kab. Mesuji</option>
                                                <option value="">Prov. Lampung, Kab./Kota Lainnya.</option>
                                                <option value="">Bandar Lampung, Kota.</option>
                                                <option value="">Metro, Kota.</option>
                                                <option value="">Kab. Pesisir Barat</option>
                                                <option value="">Provinsi Kaoptionmantan Selatan</option>
                                                <option value="">Banjar, Kab.</option>
                                                <option value="">Tanah Laut, Kab.</option>
                                                <option value="">Tapin, Kab.</option>
                                                <option value="">Hulu Sungai Selatan, Kab.</option>
                                                <option value="">Hulu Sungai Tengah, Kab.</option>
                                                <option value="">Hulu Sungai Utara, Kab.</option>
                                                <option value="">Barito Kuala, Kab.</option>
                                                <option value="">Kota Baru, Kab.</option>
                                                <option value="">Tabalong, Kab.</option>
                                                <option value="">Tanah Bumbu, Kab.</option>
                                                <option value="">Balangan, Kab.</option>
                                                <option value="">Prov. Kal-Sel, Kab./Kota Lainnya.</option>
                                                <option value="">Banjarmasin, Kota.</option>
                                                <option value="">Banjarbaru, Kota.</option>
                                                <option value="">Provinsi Kaoptionmantan Barat</option>
                                                <option value="">Pontianak, Kab.</option>
                                                <option value="">Sambas, Kab.</option>
                                                <option value="">Ketapang, Kab.</option>
                                                <option value="">Sanggau, Kab.</option>
                                                <option value="">Sintang, Kab.</option>
                                                <option value="">Kapuas Hulu, Kab.</option>
                                                <option value="">Bengkayang, Kab.</option>
                                                <option value="">Landak, Kab.</option>
                                                <option value="">Kab. Sekadau</option>
                                                <option value="">Kab. Melawi</option>
                                                <option value="">Kab. Kayong Utara</option>
                                                <option value="">Kab. Kubu Raya</option>
                                                <option value="">Prov. Kal-Bar, Kab./Kota Lainnya.</option>
                                                <option value="">Pontianak, Kota.</option>
                                                <option value="">Singkawang, Kota.</option>
                                                <option value="">Provinsi Kaoptionmantan Timur</option>
                                                <option value="">Kutai Kartanegara, Kab.</option>
                                                <option value="">Berau, Kab.</option>
                                                <option value="">Pasir, Kab.</option>
                                                <option value="">Kutai Barat, Kab.</option>
                                                <option value="">Kutai Timur, Kab.</option>
                                                <option value="">Bulungan Selatan, Kab.</option>
                                                <option value="">Bulungan Utara, Kab.</option>
                                                <option value="">Penajam Paser Utara, Kab.</option>
                                                <option value="">Prov. Kal-Tim, Kab./Kota Lainnya.</option>
                                                <option value="">Samarinda, Kota.</option>
                                                <option value="">Baoptionkpapan, Kota.</option>
                                                <option value="">Bontang, Kota.</option>
                                                <option value="">Kab. Mahakam Ulu</option>
                                                <option value="">Provinsi Kaoptionmantan Utara</option>
                                                <option value="">Bulungan, Kab.</option>
                                                <option value="">Nunukan, Kab.</option>
                                                <option value="">Maoptionnau, Kab.</option>
                                                <option value="">Kab. Tana Tidung</option>
                                                <option value="">Tarakan, Kota.</option>
                                                <option value="">Kab/Kota Lainnya</option>
                                                <option value="">Provinsi Kaoptionmantan Tengah</option>
                                                <option value="">Kapuas, Kab.</option>
                                                <option value="">Kotawaringin Barat, Kab.</option>
                                                <option value="">Kotawaringin Timur, Kab.</option>
                                                <option value="">Murung Raya, Kab.</option>
                                                <option value="">Barito Timur, Kab.</option>
                                                <option value="">Barito Selatan, Kab.</option>
                                                <option value="">Gunung Mas, Kab.</option>
                                                <option value="">Barito Utara, Kab.</option>
                                                <option value="">Pulang Pisau, Kab.</option>
                                                <option value="">Seruyan, Kab.</option>
                                                <option value="">Katingan, Kab.</option>
                                                <option value="">Sukamara, Kab.</option>
                                                <option value="">Lamandau, Kab.</option>
                                                <option value="">Prov. Kal-Teng, Kab./Kota Lainnya.</option>
                                                <option value="">Palangkaraya, Kota.</option>
                                                <option value="">Provinsi Sulawesi Tengah</option>
                                                <option value="">Donggala, Kab.</option>
                                                <option value="">Poso, Kab.</option>
                                                <option value="">Parimo/Banggai, Kab.</option>
                                                <option value="">Tooption-Tooption, Kab.</option>
                                                <option value="">Kab.Banggai Kepulauan</option>
                                                <option value="">Morowaoption, Kab.</option>
                                                <option value="">Buol, Kab.</option>
                                                <option value="">Kab. Parigi Moutong</option>
                                                <option value="">Prov. Sulawesi Tengah, Kab./Kota Lainnya.</option>
                                                <option value="">Palu, Kota.</option>
                                                <option value="">Provinsi Sulawesi Selatan</option>
                                                <option value="">Pinrang, Kab.</option>
                                                <option value="">Gowa, Kab.</option>
                                                <option value="">Wajo, Kab.</option>
                                                <option value="">Mamuju, Kab.</option>
                                                <option value="">Bone, Kab.</option>
                                                <option value="">Tana Toraja, Kab.</option>
                                                <option value="">Maros, Kab.</option>
                                                <option value="">Majene, Kab.</option>
                                                <option value="">Luwu, Kab.</option>
                                                <option value="">Sinjai, Kab.</option>
                                                <option value="">Bulukumba, Kab.</option>
                                                <option value="">Bantaeng, Kab.</option>
                                                <option value="">Jeneponto, Kab.</option>
                                                <option value="">Selayar, Kab.</option>
                                                <option value="">Takalar, Kab.</option>
                                                <option value="">Barru, Kab.</option>
                                                <option value="">Sidenreng Rappang, Kab.</option>
                                                <option value="">Pangkajene Kepulauan, Kab.</option>
                                                <option value="">Watansoppeng, Kab.</option>
                                                <option value="">Polewaoption, Kab.</option>
                                                <option value="">Enrekang, Kab.</option>
                                                <option value="">Luwu Selatan, Kab.</option>
                                                <option value="">Mamasa, Kab.</option>
                                                <option value="">Luwu Utara, Kab.</option>
                                                <option value="">Kab. Toraja Utara</option>
                                                <option value="">Prov. Sulawesi Selatan, Kab./Kota Lainnya.</option>
                                                <option value="">Makassar, Kota.</option>
                                                <option value="">Pare-Pare, Kota.</option>
                                                <option value="">Palopo, Kota.</option>
                                                <option value="">Watampone, Kota.</option>
                                                <option value="">Watampone, Kota.</option>
                                                <option value="">Provinsi Sulawesi Utara</option>
                                                <option value="">Minahasa, Kab.</option>
                                                <option value="">Bolaang Mongondow, Kab.</option>
                                                <option value="">Sangihe, Kab.</option>
                                                <option value="">kepulauan Talaud, Kab.</option>
                                                <option value="">Minahasa Selatan, Kab.</option>
                                                <option value="">Kab. Minahasa Utara</option>
                                                <option value="">Kab. Minahasa Tenggara</option>
                                                <option value="">Kab. Bolaang Mongondow Utara</option>
                                                <option value="">Kab. Kepulauan Siau Tagulandang Biaro</option>
                                                <option value="">Kab. Bolaang Mongondow Selatan</option>
                                                <option value="">Kab. Bolaang Mongondow Timur</option>
                                                <option value="">Sulawesi Utara, Kab./Kota Lainnya.</option>
                                                <option value="">Menado, Kota.</option>
                                                <option value="">Kota Kotamobagu</option>
                                                <option value="">Bitung, Kota.</option>
                                                <option value="">Kota. Tomohon</option>
                                                <option value="">Provinsi Gorontalo</option>
                                                <option value="">Gorontalo, Kab.</option>
                                                <option value="">Bualemo, Kab.</option>
                                                <option value="">Bonebolango, Kab.</option>
                                                <option value="">Pohuwato, Kab.</option>
                                                <option value="">Kab. Gorontalo Utara</option>
                                                <option value="">Prov. Gorontalo, Kab./Kota Lainnya.</option>
                                                <option value="">Gorontalo, Kota.</option>
                                                <option value="">Provinsi Sulawesi Tenggara</option>
                                                <option value="">Kab. Polewaoption Mandar</option>
                                                <option value="">Kab. Majene</option>
                                                <option value="">Kab. Mamasa</option>
                                                <option value="">Kab. Mamuju Utara</option>
                                                <option value="">Kab. Mamuju Tengah</option>
                                                <option value="">Kota Mamuju</option>
                                                <option value="">Kab/Kota Lainnya</option>
                                                <option value="">Provinsi Sulawesi Tenggara</option>
                                                <option value="">Kab. Buton</option>
                                                <option value="">Kab. Kendari</option>
                                                <option value="">Kab. Muna</option>
                                                <option value="">Kab. Kolaka</option>
                                                <option value="">Kab. Wakatobi</option>
                                                <option value="">Kab. Konawe</option>
                                                <option value="">Kab. Konawe Selatan</option>
                                                <option value="">Kab. Bombana</option>
                                                <option value="">Kab. Kolaka Utara</option>
                                                <option value="">Kab. Buton Utara</option>
                                                <option value="">Kab. Konawe Utara</option>
                                                <option value="">Kab. Kolaka Timur</option>
                                                <option value="">Kab. Konawe Kepulauan</option>
                                                <option value="">Kota Bau-Bau</option>
                                                <option value="">Kota Kendari</option>
                                                <option value="">Prov. Sulawesi Tenggara, Kab./Kota Lainnya.</option>
                                                <option value="">Provinsi Nusa Tenggara Barat</option>
                                                <option value="">Kab. Lombok Barat</option>
                                                <option value="">Kab. Lombok Tengah</option>
                                                <option value="">Kab. Lombok Timur</option>
                                                <option value="">Kab. Sumbawa</option>
                                                <option value="">Kab. Bima</option>
                                                <option value="">Kab. Dompu</option>
                                                <option value="">Kab. Sumbawa Barat</option>
                                                <option value="">Kab. Lombok Utara</option>
                                                <option value="">Kota Mataram</option>
                                                <option value="">Kota Bima</option>
                                                <option value="">Prov. NTB, Kab./Kota Lainnya.</option>
                                                <option value="">Provinsi Baoption</option>
                                                <option value="">Kab. Buleleng</option>
                                                <option value="">Kab. Jembrana</option>
                                                <option value="">Kab. Tabanan</option>
                                                <option value="">Kab. Badung</option>
                                                <option value="">Kab. Gianyar</option>
                                                <option value="">Kab. Klungkung</option>
                                                <option value="">Kab. Bangoption</option>
                                                <option value="">Kab. Karangasem</option>
                                                <option value="">Kota Denpasar</option>
                                                <option value="">Prov. Baoption, Kab./Kota Lainnya.</option>
                                                <option value="">Provinsi Nusa Tenggara Timur</option>
                                                <option value="">Kab. Kupang</option>
                                                <option value="">Kab. Timor-Tengah Selatan</option>
                                                <option value="">Kab. Timor-Tengah Utara</option>
                                                <option value="">Kab. Belu</option>
                                                <option value="">Kab. Alor</option>
                                                <option value="">Kab. Flores Timur</option>
                                                <option value="">Kab. Sikka</option>
                                                <option value="">Kab. Ende</option>
                                                <option value="">Kab. Ngada</option>
                                                <option value="">Kab. Manggarai</option>
                                                <option value="">Kab. Sumba Timur</option>
                                                <option value="">Kab. Sumba Barat</option>
                                                <option value="">Kab. Lembata</option>
                                                <option value="">Kab. Rote</option>
                                                <option value="">Kab. Manggarai Barat</option>
                                                <option value="">Kab. Sumba Tengah</option>
                                                <option value="">Kab. Sumba Barat Daya</option>
                                                <option value="">Kab. Manggarai Timur</option>
                                                <option value="">Kab. Nagekeo</option>
                                                <option value="">Kab. Sabu Raijua</option>
                                                <option value="">Kab. Malaka</option>
                                                <option value="">Kota Kupang</option>
                                                <option value="">Prov. NTT, Kab./Kota Lainnya.</option>
                                                <option value="">Provinsi Maluku</option>
                                                <option value="">Kab. Maluku Tengah</option>
                                                <option value="">Kab. Maluku Tenggara</option>
                                                <option value="">Kab. Maluku Tenggara Barat</option>
                                                <option value="">Kab. Buru</option>
                                                <option value="">Kab. Seram Bagian Barat</option>
                                                <option value="">Kab. Seram Bagian Timur</option>
                                                <option value="">Kab. Kepulauan Aru</option>
                                                <option value="">Kab. Maluku Barat Daya</option>
                                                <option value="">Kab. Buru Selatan</option>
                                                <option value="">Kota Ambon</option>
                                                <option value="">Kota Tual</option>
                                                <option value="">Prov. Maluku, Kab./Kota Lainnya.</option>
                                                <option value="">Provinsi Papua</option>
                                                <option value="">Kab. Jayapura</option>
                                                <option value="">Kab. Biak Numfor</option>
                                                <option value="">Kab. Yapen-Waropen</option>
                                                <option value="">Kab. Merauke</option>
                                                <option value="">Kab. Paniai</option>
                                                <option value="">Kab. Jayawijaya</option>
                                                <option value="">Kab. Nabire</option>
                                                <option value="">Kab. Mimika</option>
                                                <option value="">Kab. Puncak Jaya</option>
                                                <option value="">Kab. Sarmi</option>
                                                <option value="">Kab. Keerom</option>
                                                <option value="">Kab. Pegunungan Bintang</option>
                                                <option value="">Kab. Yahukimo</option>
                                                <option value="">Kab. Tooptionkara</option>
                                                <option value="">Kab. Waropen</option>
                                                <option value="">Kab. Boven Digoel</option>
                                                <option value="">Kab. Mappi</option>
                                                <option value="">Kab. Asmat</option>
                                                <option value="">Kab. Supiori</option>
                                                <option value="">Kab. Mamberamo Raya</option>
                                                <option value="">Kab. Dogiyai</option>
                                                <option value="">Kab. Lanny Jaya</option>
                                                <option value="">Kab. Mamberamo Tengah</option>
                                                <option value="">Kab. Nduga</option>
                                                <option value="">Kab. Yaoptionmo</option>
                                                <option value="">Kab. Puncak</option>
                                                <option value="">Kab. Intan Jaya</option>
                                                <option value="">Kab. Deiyai</option>
                                                <option value="">Kota Jayapura</option>
                                                <option value="">Prov. Papua, Kab./Kota Lainnya.</option>
                                                <option value="">Provinsi Maluku Utara</option>
                                                <option value="">Kab. Halmahera Tengah</option>
                                                <option value="">Kab. Halmahera Utara</option>
                                                <option value="">Kab. Halmahera Timur</option>
                                                <option value="">Kab. Halmahera Barat</option>
                                                <option value="">Kab. Halmahera Selatan</option>
                                                <option value="">Kab. Kepulauan Sula</option>
                                                <option value="">Kab. Maluku Utara</option>
                                                <option value="">Kab. Pulau Morotai</option>
                                                <option value="">Kab. Pulau Taoptionabu</option>
                                                <option value="">Kota Ternate</option>
                                                <option value="">Kota Tidore</option>
                                                <option value="">Prov. Maluku Utara, Kab./Kota Lainnya.</option>
                                                <option value="">Provinsi Papua Barat</option>
                                                <option value="">Kab. Sorong</option>
                                                <option value="">Kab. Fak Fak</option>
                                                <option value="">Kab. Manokwari</option>
                                                <option value="">Kab. Sorong Selatan</option>
                                                <option value="">Kab. Raja Ampat</option>
                                                <option value="">Kab. Kaimana</option>
                                                <option value="">Kab. Teluk Bintuni</option>
                                                <option value="">Kab. Teluk Wondama</option>
                                                <option value="">Kab. Tambrauw</option>
                                                <option value="">Kab. Maybrat</option>
                                                <option value="">Kab. Pegunungan Arfak</option>
                                                <option value="">Kab. Manokwari Selatan</option>
                                                <option value="">Kota Sorong</option>
                                                <option value="">Kab/Kota Lainnya</option>
                                                <option value="">Pasuruan, Kota.</option>
                                                <option value="">Probooptionnggo, Kota.</option>
                                                <option value="">Boptiontar, Kota.</option>
                                                <option value="">Kediri, Kota.</option>
                                                <option value="">Madiun, Kota.</option>
                                                <option value="">Jember, Kota.</option>
                                                <option value="">Provinsi Bengkulu</option>
                                                <option value="">Bengkulu Selatan, Kab.</option>
                                                <option value="">Bengkulu Utara, Kab.</option>
                                                <option value="">Rejang Lebong, Kab.</option>
                                                <option value="">Kab. Lebong</option>
                                                <option value="">Kab. Kepahiang</option>
                                                <option value="">Kab. Muko-Muko</option>
                                                <option value="">Kab. Seluma</option>
                                                <option value="">Kab. Kaur</option>
                                                <option value="">Prov. Bengkulu, Kab./Kota Lainnya.</option>
                                                <option value="">Bengkulu, Kota.</option>
                                                <option value="">Kab. Bengkulu Tengah</option>
                                                <option value="">Provinsi Jambi</option>
                                                <option value="">Batanghari, Kab.</option>
                                                <option value="">Sarolangun, Kab.</option>
                                                <option value="">Kerinci, Kab.</option>
                                                <option value="">Muaro Jambi, Kab.</option>
                                                <option value="">Tanjung Jabung Barat, Kab.</option>
                                                <option value="">Tanjung Jabung Timur, Kab.</option>
                                                <option value="">Tebo, Kab.</option>
                                                <option value="">Muara Bungo, Kab.</option>
                                                <option value="">Merangin, Kab.</option>
                                                <option value="">Prov. Jambi, Kab./Kota Lainnya.</option>
                                                <option value="">Jambi, Kota.</option>
                                                <option value="">Kota Sungai Penuh</option>
                                                <option value="">Provinsi NAD</option>
                                                <option value="">Aceh Besar, Kab.</option>
                                                <option value="">Pidie, Kab.</option>
                                                <option value="">Aceh Utara, Kab.</option>
                                                <option value="">Aceh Timur, Kab.</option>
                                                <option value="">Aceh Selatan, Kab.</option>
                                                <option value="">Aceh Barat, Kab.</option>
                                                <option value="">Aceh Tengah, Kab.</option>
                                                <option value="">Aceh Tenggara, Kab.</option>
                                                <option value="">Aceh Singkil, Kab.</option>
                                                <option value="">Aceh Jeumpa/Bireuen, Kab.</option>
                                                <option value="">Aceh Tamiang, Kab.</option>
                                                <option value="">Gayo Luwes, Kab.</option>
                                                <option value="">Aceh Barat Daya, Kab.</option>
                                                <option value="">Aceh Jaya, Kab.</option>
                                                <option value="">Nagan Raya, Kab.</option>
                                                <option value="">Aceh Simeuleu, Kab.</option>
                                                <option value="">Kab. Bener Meriah</option>
                                                <option value="">Kab. Pidie Jaya</option>
                                                <option value="">Kota Subulussalam</option>
                                                <option value="">Prov. NAD, Kab./Kota Lainnya.</option>
                                                <option value="">Banda Aceh, Kota.</option>
                                                <option value="">Sabang, Kota.</option>
                                                <option value="">Lhokseumawe, Kota.</option>
                                                <option value="">Langsa, Kota.</option>
                                                <option value="">Simeulue, Kota.</option>
                                                <option value="">Provinsi Sumatera Utara</option>
                                                <option value="">Deoption Serdang, Kab.</option>
                                                <option value="">Langkat, Kab.</option>
                                                <option value="">Karo, Kab.</option>
                                                <option value="">Simalungun, Kab.</option>
                                                <option value="">Labuhan Batu, Kab.</option>
                                                <option value="">Asahan, Kab.</option>
                                                <option value="">Dairi, Kab.</option>
                                                <option value="">Tapanuoption Utara, Kab.</option>
                                                <option value="">Tapanuoption Tengah, Kab.</option>
                                                <option value="">Tapanuoption Selatan, Kab.</option>
                                                <option value="">Nias, Kab.</option>
                                                <option value="">Rantau Prapat, Kota.</option>
                                                <option value="">Toba Samosir, Kab.</option>
                                                <option value="">Mandaioptionng Natal, Kab.</option>
                                                <option value="">Kab. Nias Selatan</option>
                                                <option value="">Kab. Humbang Hasundutan</option>
                                                <option value="">Kab. Pakpak Bharat</option>
                                                <option value="">Toba Samosir, Kab.</option>
                                                <option value="">Kab. Serdang Bedagai</option>
                                                <option value="">Kab. Batu Bara</option>
                                                <option value="">Kab. Padang Lawas</option>
                                                <option value="">Kab. Padang Lawas Utara</option>
                                                <option value="">Kab. Labuhan Batu Selatan</option>
                                                <option value="">Kab. Labuhan Batu Utara</option>
                                                <option value="">Kab. Nias Barat</option>
                                                <option value="">Kab. Nias Utara</option>
                                                <option value="">Prov. Sumatera Utara, Kab./Kota Lainnya.</option>
                                                <option value="">Tebing Tinggi, Kota.</option>
                                                <option value="">Binjai, Kota.</option>
                                                <option value="">Pematang Siantar, Kota.</option>
                                                <option value="">Tanjung Balai, Kota.</option>
                                                <option value="">Sibolga, Kota.</option>
                                                <option value="">Medan, Kota.</option>
                                                <option value="">Kota Gunungsitooption</option>
                                                <option value="">Kisaran, Kota.</option>
                                                <option value="">Padang Sidempuan, Kota.</option>
                                                <option value="">Provinsi Sumatera Barat</option>
                                                <option value="">Agam, Kab.</option>
                                                <option value="">Pasaman, Kab.</option>
                                                <option value="">optionmapuluh Koto, Kab.</option>
                                                <option value="">Solok, Kab.</option>
                                                <option value="">Padang Pariaman, Kab.</option>
                                                <option value="">Pesisir Selatan, Kab.</option>
                                                <option value="">Tanah Datar, Kab.</option>
                                                <option value="">Sawahlunto/Sijunjung, Kab.</option>
                                                <option value="">Kepulauan Mentawai, Kab.</option>
                                                <option value="">Kab. Pasaman Barat</option>
                                                <option value="">Kab. Dharmasraya</option>
                                                <option value="">Solok, Kab.</option>
                                                <option value="">Prov. Sumatera Barat, Kab./Kota Lainnya.</option>
                                                <option value="">Bukittinggi, Kota.</option>
                                                <option value="">Padang, Kota.</option>
                                                <option value="">Sawahlunto, Kota.</option>
                                                <option value="">Padang Panjang, Kota.</option>
                                                <option value="">Solok, Kota.</option>
                                                <option value="">Payakumbuh, Kota.</option>
                                                <option value="">Pariaman, Kota.</option>
                                                <option value="">DI LUAR INDONESIA</option>
                                                <option value="">Kab. Sigi</option>
                                                <option value="">Jawa Barat</option>
                                                <option value="">Kab. Bekasi</option>
                                                <option value="">Kab. Purwakarta</option>
                                                <option value="">Kab. Karawang</option>
                                                <option value="">Kab. Bogor</option>
                                                <option value="">Kab. Sukabumi</option>
                                                <option value="">Kab. Cianjur</option>
                                                <option value="">Kab. Bandung</option>
                                                <option value="">Kab. Sumedang</option>
                                                <option value="">Kab. Tasikmalaya</option>
                                                <option value="">Kab. Garut</option>
                                                <option value="">Kab. Ciamis</option>
                                                <option value="">Kab. Cirebon</option>
                                                <option value="">Kab. Kuningan</option>
                                                <option value="">Kab. Indramayu</option>
                                                <option value="">Kab. Majalengka</option>
                                                <option value="">Kab. Subang</option>
                                                <option value="">Kab. Bandung Barat</option>
                                                <option value="">Kab. Pangandaran</option>
                                                <option value="">Kota Banjar</option>
                                                <option value="">Kota Bandung</option>
                                                <option value="">Kota Bogor</option>
                                                <option value="">Kota Sukabumi</option>
                                                <option value="">Kota Cirebon</option>
                                                <option value="">Kota Tasikmalaya</option>
                                                <option value="">Kota Cimahi</option>
                                                <option value="">Kota Depok</option>
                                                <option value="">Kota Bekasi</option>
                                                <option value="">Prov. Jawa Barat, Kab./Kota Lainnya.</option>
                                                <option value="">Provinsi Banten</option>
                                                <option value="">Kab. Lebak</option>
                                                <option value="">Kab. Pandeglang</option>
                                                <option value="">Kab. Serang</option>
                                                <option value="">Kab. Tangerang</option>
                                                <option value="">Kota Cilegon</option>
                                                <option value="">Kota Tangerang</option>
                                                <option value="">Kota Serang</option>
                                                <option value="">Tangerang Selatan, Kota</option>
                                                <option value="">Prov. Banten, Kab./Kota Lainnya.</option>
                                                <option value="">DKI Jaya</option>
                                                <option value="">Jakarta Pusat, Wil. Kota</option>
                                                <option value="">Jakarta Utara, Wil. Kota</option>
                                                <option value="">Jakarta Barat, Wil. Kota</option>
                                                <option value="">Jakarta Selatan, Wil. Kota</option>
                                                <option value="">Jakarta Timur, Wil. Kota</option>
                                                <option value="">Kab. Adm. Kepulauan Seribu</option>
                                                <option value="">Daerah Istimewa Yogyakarta</option>
                                                <option value="">Bantul, Kab.</option>
                                                <option value="">Sleman, Kab.</option>
                                                <option value="">Gunung Kidul, Kab.</option>
                                                <option value="">Kulon Progo, Kab.</option>
                                                <option value="">DI Yogyakarta, Kab./Kota Lainnya.</option>
                                                <option value="">Yogyakarta, Kota.</option>
                                                <option value="">Prov. Jawa Tengah</option>
                                                <option value="">Semarang, Kab.</option>
                                                <option value="">Kendal, Kab.</option>
                                                <option value="">Demak, Kab.</option>
                                                <option value="">Grobogan, Kab.</option>
                                                <option value="">Pekalongan, Kab.</option>
                                                <option value="">Tegal, Kab.</option>
                                                <option value="">Brebes, Kab.</option>
                                                <option value="">Pati, Kab.</option>
                                                <option value="">Kudus, Kab.</option>
                                                <option value="">Pemalang, Kab.</option>
                                                <option value="">Jepara, Kab.</option>
                                                <option value="">Rembang, Kab.</option>
                                                <option value="">Blora, Kab.</option>
                                                <option value="">Banyumas, Kab.</option>
                                                <option value="">Cilacap, Kab.</option>
                                                <option value="">Purbaoptionngga, Kab.</option>
                                                <option value="">Banjarnegara, Kab.</option>
                                                <option value="">Magelang, Kab.</option>
                                                <option value="">Temanggung, Kab.</option>
                                                <option value="">Wonosobo, Kab.</option>
                                                <option value="">Purworejo, Kab.</option>
                                                <option value="">Kebumen, Kab.</option>
                                                <option value="">Klaten, Kab.</option>
                                                <option value="">Boyolaoption, Kab.</option>
                                                <option value="">Sragen, Kab.</option>
                                                <option value="">Sukoharjo, Kab.</option>
                                                <option value="">Karanganyar, Kab.</option>
                                                <option value="">Wonogiri, Kab.</option>
                                                <option value="">Batang, Kab.</option>
                                                <option value="">Prov. Jawa Tengah, Kab./Kota Lainnya.</option>
                                                <option value="">Semarang, Kota.</option>
                                                <option value="">Salatiga, Kota.</option>
                                                <option value="">Pekalongan, Kota.</option>
                                                <option value="">Tegal, Kota.</option>
                                                <option value="">Magelang, Kota.</option>
                                                <option value="">Surakarta, Kota.</option>
                                                <option value="">Kotif Klaten</option>
                                                <option value="">Kotif Cilacap</option>
                                                <option value="">Kotif Purwokerto</option>
                                                <option value="">Prov. Jawa Timur</option>
                                                <option value="">Gresik, Kab.</option>
                                                <option value="">Sidoarjo, Kab.</option>
                                                <option value="">Mojokerto, Kab.</option>
                                                <option value="">Jombang, Kab.</option>
                                                <option value="">Sampang, Kab.</option>
                                                <option value="">Pamekasan, Kab.</option>
                                                <option value="">Sumenep, Kab.</option>
                                                <option value="">Bangkalan, Kab.</option>
                                                <option value="">Bondowoso, Kab.</option>
                                                <option value="">Banyuwangi, Kab.</option>
                                                <option value="">Jember, Kab.</option>
                                                <option value="">Malang, Kab.</option>
                                                <option value="">Pasuruan, Kab.</option>
                                                <option value="">Probooptionnggo, Kab.</option>
                                                <option value="">Lumajang, Kab.</option>
                                                <option value="">Kediri, Kab.</option>
                                                <option value="">Nganjuk, Kab.</option>
                                                <option value="">Tulungagung, Kab.</option>
                                                <option value="">Trenggalek, Kab.</option>
                                                <option value="">Boptiontar, Kab.</option>
                                                <option value="">Madiun, Kab.</option>
                                                <option value="">Ngawi, Kab.</option>
                                                <option value="">Magetan, Kab.</option>
                                                <option value="">Ponorogo, Kab.</option>
                                                <option value="">Pacitan, Kab.</option>
                                                <option value="">Bojonegoro, Kab.</option>
                                                <option value="">Tuban, Kab.</option>
                                                <option value="">Lamongan, Kab.</option>
                                                <option value="">Situbondo, Kab.</option>
                                                <option value="">Batu, Kota.</option>
                                                <option value="">Prov. Jawa Timur, Kab./Kota Lainnya.</option>
                                                <option value="">Surabaya, Kota.</option>
                                                <option value="">Mojokerto, Kota.</option>
                                                <option value="">Malang, Kota.</option>        
                                            </select>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Kode Pos</label>
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
                                            <label for="exampleInputEmail1" class="form-label">Negara</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example">
                                                <option selected>- Silahkan Pilih -</option>
                                                <option value="">Andorra</option>
                                                <option value="">U.A.E</option>
                                                <option value="">Afghanistan</option>
                                                <option value="">Antigua</option>
                                                <option value="">Anguilla</option>
                                                <option value="">Albania</option>
                                                <option value="">Armenia</option>
                                                <option value="">Neth Ant.</option>
                                                <option value="">Angola</option>
                                                <option value="">Antarctica</option>
                                                <option value="">Argentina</option>
                                                <option value="">American Samoa</option>
                                                <option value="">Austria</option>
                                                <option value="">Austraoptiona</option>
                                                <option value="">Aruba</option>
                                                <option value="">Azerbaijan</option>
                                                <option value="">Bosnia-Herz</option>
                                                <option value="">Barbados</option>
                                                <option value="">Bangladesh</option>
                                                <option value="">Belgium</option>
                                                <option value="">Burkina Faso</option>
                                                <option value="">Bulgaria</option>
                                                <option value="">Bahrain</option>
                                                <option value="">Burundi</option>
                                                <option value="">Benin</option>
                                                <option value="">Bermuda</option>
                                                <option value="">Brunei</option>
                                                <option value="">Booptionvia</option>
                                                <option value="">Brazil</option>
                                                <option value="">Bahamas</option>
                                                <option value="">Bhutan</option>
                                                <option value="">Bouvet Island</option>
                                                <option value="">Botswana</option>
                                                <option value="">Belarus</option>
                                                <option value="">Beoptionze</option>
                                                <option value="">Canada</option>
                                                <option value="">Cocos Islands</option>
                                                <option value="">Congo</option>
                                                <option value="">Cent Afr</option>
                                                <option value="">Congo</option>
                                                <option value="">Switzerland</option>
                                                <option value="">Ivory</option>
                                                <option value="">Cook Islands</option>
                                                <option value="">Chile</option>
                                                <option value="">Cameroon</option>
                                                <option value="">China</option>
                                                <option value="">Columbia</option>
                                                <option value="">Costa Rica</option>
                                                <option value="">Cuba</option>
                                                <option value="">Cape Verde</option>
                                                <option value="">Christmas Is.</option>
                                                <option value="">Cyprus</option>
                                                <option value="">Czech Repuboptionc</option>
                                                <option value="">Germany</option>
                                                <option value="">Djibouti</option>
                                                <option value="">Denmark</option>
                                                <option value="">Dominica</option>
                                                <option value="">Dominican</option>
                                                <option value="">Algeria</option>
                                                <option value="">Ecuador</option>
                                                <option value="">Estonia</option>
                                                <option value="">Egypt</option>
                                                <option value="">Western Sahara</option>
                                                <option value="">Eritrea</option>
                                                <option value="">Spain</option>
                                                <option value="">Ethiopia</option>
                                                <option value="">EUR Countries</option>
                                                <option value="">Finland</option>
                                                <option value="">Fiji</option>
                                                <option value="">Falkland Is.</option>
                                                <option value="">Micronesia</option>
                                                <option value="">Faroe Islands</option>
                                                <option value="">France</option>
                                                <option value="">Gabon</option>
                                                <option value="">G.B.</option>
                                                <option value="">Grenada</option>
                                                <option value="">Georgia</option>
                                                <option value="">French Guiana</option>
                                                <option value="">Channel Islands</option>
                                                <option value="">Ghana</option>
                                                <option value="">Gibraltar</option>
                                                <option value="">Greenland</option>
                                                <option value="">Gambia</option>
                                                <option value="">Guinea</option>
                                                <option value="">GOLD</option>
                                                <option value="">Guadeloupe</option>
                                                <option value="">Equ. Guinea</option>
                                                <option value="">Greece</option>
                                                <option value="">S Georgia</option>
                                                <option value="">Guatemala</option>
                                                <option value="">Guam</option>
                                                <option value="">Guinea-Bissau</option>
                                                <option value="">Guyana</option>
                                                <option value="">H.K.</option>
                                                <option value="">Heard .McDonald</option>
                                                <option value="">Honduras</option>
                                                <option value="">Croatia</option>
                                                <option value="">Haiti</option>
                                                <option value="">Hungary</option>
                                                <option value="">Indonesia</option>
                                                <option value="">Ireland</option>
                                                <option value="">Israel</option>
                                                <option value="">Isle of Man</option>
                                                <option value="">India</option>
                                                <option value="">Br Ind. Oc. Ter</option>
                                                <option value="">Iraq</option>
                                                <option value="">Iran</option>
                                                <option value="">Iceland</option>
                                                <option value="">Italy</option>
                                                <option value="">Jersey</option>
                                                <option value="">Jamaica</option>
                                                <option value="">Jordan</option>
                                                <option value="">Japan</option>
                                                <option value="">Kenya</option>
                                                <option value="">Kyrgyzstan</option>
                                                <option value="">Cambodia</option>
                                                <option value="">Kiribati</option>
                                                <option value="">Comoro</option>
                                                <option value="">St Kitts .Nevis</option>
                                                <option value="">Korea</option>
                                                <option value="">Korea, Rep. of</option>
                                                <option value="">Kuwait</option>
                                                <option value="">Cayman Islands</option>
                                                <option value="">Kazakstan</option>
                                                <option value="">Lao</option>
                                                <option value="">Lebanon</option>
                                                <option value="">St. Lucia</option>
                                                <option value="">optionecht</option>
                                                <option value="">Sri Lanka</option>
                                                <option value="">optionberia</option>
                                                <option value="">Lesotho</option>
                                                <option value="">optionthuania</option>
                                                <option value="">Luxembourg</option>
                                                <option value="">Latvia</option>
                                                <option value="">optionbya</option>
                                                <option value="">Morocco</option>
                                                <option value="">Monaco</option>
                                                <option value="">Moldova, Rep of</option>
                                                <option value="">Madagascar</option>
                                                <option value="">Marshall Is.</option>
                                                <option value="">Macedonia</option>
                                                <option value="">Maoption</option>
                                                <option value="">Myanmar</option>
                                                <option value="">Mongooptiona</option>
                                                <option value="">Macau</option>
                                                <option value="">N. Mariana Is.</option>
                                                <option value="">Martinique</option>
                                                <option value="">Mauritania</option>
                                                <option value="">Monserrat</option>
                                                <option value="">Malta</option>
                                                <option value="">Mauritius</option>
                                                <option value="">Maldives</option>
                                                <option value="">Malawi</option>
                                                <option value="">Mexico</option>
                                                <option value="">Malaysia</option>
                                                <option value="">Mozambique</option>
                                                <option value="">Namibia</option>
                                                <option value="">New Caledonia</option>
                                                <option value="">Niger</option>
                                                <option value="">Norfolk Island</option>
                                                <option value="">Nigeria</option>
                                                <option value="">Nicaragua</option>
                                                <option value="">Netherlands</option>
                                                <option value="">Norway</option>
                                                <option value="">Nepal</option>
                                                <option value="">Nauru</option>
                                                <option value="">Niue</option>
                                                <option value="">N.Z.</option>
                                                <option value="">Oman</option>
                                                <option value="">Panama</option>
                                                <option value="">Peru</option>
                                                <option value="">Fr. Polynesia</option>
                                                <option value="">Pap. New Guinea</option>
                                                <option value="">Phioptionppines</option>
                                                <option value="">PLATINUM</option>
                                                <option value="">Pakistan</option>
                                                <option value="">Poland</option>
                                                <option value="">St. Pierre</option>
                                                <option value="">Pitcairn</option>
                                                <option value="">Puerto Rico</option>
                                                <option value="">Portugal</option>
                                                <option value="">Palau</option>
                                                <option value="">Paraguay</option>
                                                <option value="">Qatar</option>
                                                <option value="">Reunion</option>
                                                <option value="">Romania</option>
                                                <option value="">Serbia</option>
                                                <option value="">Russian Fed</option>
                                                <option value="">Rwanda</option>
                                                <option value="">Saudi Arabia</option>
                                                <option value="">Solomon Islands</option>
                                                <option value="">Seychelles</option>
                                                <option value="">Sudan</option>
                                                <option value="">Sweden</option>
                                                <option value="">Singapore</option>
                                                <option value="">St. Helena</option>
                                                <option value="">Slovenia</option>
                                                <option value="">Svalbard</option>
                                                <option value="">Slovakia</option>
                                                <option value="">Sierra Leone</option>
                                                <option value="">San Marino</option>
                                                <option value="">Senegal</option>
                                                <option value="">Somaoptiona</option>
                                                <option value="">Suriname</option>
                                                <option value="">SILVER</option>
                                                <option value="">Sao Tome</option>
                                                <option value="">El Salvador</option>
                                                <option value="">Syria</option>
                                                <option value="">Swaziland</option>
                                                <option value="">Turks . Caicos</option>
                                                <option value="">Chad</option>
                                                <option value="">Fr. S. Territ.</option>
                                                <option value="">Togo</option>
                                                <option value="">Thailand</option>
                                                <option value="">Tajikistan</option>
                                                <option value="">Tokelau</option>
                                                <option value="">Turkmenistan</option>
                                                <option value="">Tunisia</option>
                                                <option value="">Tonga</option>
                                                <option value="">East Timor</option>
                                                <option value="">Turkey</option>
                                                <option value="">Trinidad Tobago</option>
                                                <option value="">Tuvalu</option>
                                                <option value="">Taiwan</option>
                                                <option value="">Tanzania</option>
                                                <option value="">Ukraine</option>
                                                <option value="">Uganda</option>
                                                <option value="">US Minor Out Is</option>
                                                <option value="">USA</option>
                                                <option value="">Uruguay</option>
                                                <option value="">Uzbekistan</option>
                                                <option value="">Vatican</option>
                                                <option value="">St. Vincent</option>
                                                <option value="">Venezuala</option>
                                                <option value="">Virgin Islands</option>
                                                <option value="">Virgin Islands</option>
                                                <option value="">Vietnam</option>
                                                <option value="">Vanuatu</option>
                                                <option value="">Waloptions .Futuna</option>
                                                <option value="">Samoa</option>
                                                <option value="">XAU and XAG</option>
                                                <option value="">European Unit</option>
                                                <option value="">East Caribbean</option>
                                                <option value="">Special Drawing</option>
                                                <option value="">Europa</option>
                                                <option value="">Gold</option>
                                                <option value="">West Africa</option>
                                                <option value="">XPD AND XPT</option>
                                                <option value="">Silver</option>
                                                <option value="">Worldwide</option>
                                                <option value="">Yemen</option>
                                                <option value="">Mayotte</option>
                                                <option value="">Yugoslavia</option>
                                                <option value="">South Afr</option>
                                                <option value="">Zambia</option>
                                                <option value="">Zimbabwe</option>
           
                                            </select>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">No. Telp. Kantor</label>
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
                                            <label for="exampleInputEmail1" class="form-label">Kel. Fasilitas</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                        </div>
                                    </div>

                                    <hr>
                                    <p class="text-pembukaan">Informasi Surat Perizinan Pendirian Perusahaan</p>
                                     <p><br>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">No. Akta Pendirian (*)</label>
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
                                            <label for="exampleInputEmail1" class="form-label">Tgl. Akta Pendirian (*)</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-2">
                                            <input type="date" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                        </div>
                                    </div>

                                    <hr style="width:25%">

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">No. Akta SIUP (*)</label>
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
                                            <label for="exampleInputEmail1" class="form-label">Penerbitan SIUP (*)</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-2">
                                            <input type="date" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Tgl. Berakhir SIUP (*)</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-2">
                                            <input type="date" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                        </div>
                                    </div>

                                    <hr style="width:25%">

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">No. SITU (*)</label>
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
                                            <label for="exampleInputEmail1" class="form-label">Penerbitan SITU (*)</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-2">
                                            <input type="date" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Tgl. Berakhir SITU (*)</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-2">
                                            <input type="date" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                        </div>
                                    </div>

                                    <hr style="width:25%">

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">No. SK Menteri (*)</label>
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
                                            <label for="exampleInputEmail1" class="form-label">Penerbitan SK Menteri (*)</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-2">
                                            <input type="date" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Tgl. Berakhir SK Menteri (*)</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-2">
                                            <input type="date" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                        </div>
                                    </div>

                                    <hr style="width:25%">

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">No. TDP (*)</label>
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
                                            <label for="exampleInputEmail1" class="form-label">Penerbitan TDP (*)</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-2">
                                            <input type="date" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Tgl. Berakhir TDP (*)</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-2">
                                            <input type="date" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                        </div>
                                    </div>

                                    <hr>
                                    <p class="text-pembukaan">Informasi Data Pengurus Perusahaan</p>
                                     <p><br>
                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Nama Pengurus (*)</label>
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
                                            <label for="exampleInputEmail1" class="form-label">Jabatan Pengurus (*)</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example">
                                                <option selected>- Silahkan Pilih -</option>
                                                <option value="">PENGURUS - PEMILIK</option>
                                                <option value="">PEMILIK - Direktur Utama / Pres. Dir</option>
                                                <option value="">PEMILIK - Direktur</option>
                                                <option value="">PEMILIK - Komisaris Utama / Pres. Kom</option>
                                                <option value="">PEMILIK - Komisaris</option>
                                                <option value="">PEMILIK - Kuasa Direksi</option>
                                                <option value="">PEMILIK - Pemilik Bukan Pengurus</option>
                                                <option value="">PEMILIK - Masyarakat</option>
                                                <option value="">PEMILIK - Ketua Umum</option>
                                                <option value="">PEMILIK - Ketua</option>
                                                <option value="">PEMILIK - Sekretaris</option>
                                                <option value="">PEMILIK - Bendahara</option>
                                                <option value="">PEMILIK - Lainnya</option>
                                                <option value="">PENGURUS BUKAN PEMILIK</option>
                                                <option value="">BUKAN PEMILIK - Direktur Utama/Pres. Dir</option>
                                                <option value="">BUKAN PEMILIK - Direktur</option>
                                                <option value="">BUKAN PEMILIK - Komisaris Utm/Pres. Kom</option>
                                                <option value="">BUKAN PEMILIK - Komisaris</option>
                                                <option value="">BUKAN PEMILIK - Kuasa Direksi</option>
                                                <option value="">BUKAN PEMILIK - Ketua Umum</option>
                                                <option value="">BUKAN PEMILIK - Ketua</option>
                                                <option value="">BUKAN PEMILIK - Sekretaris</option>
                                                <option value="">BUKAN PEMILIK - Bendahara</option>
                                                <option value="">BUKAN PEMILIK - Lainnya</option>      
                                            </select>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Kelompok Nasabah (*)</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example">
                                                <option selected>- Silahkan Pilih -</option>
                                                <option value="">Pemerintah Pusat</option>
                                                <option value="">Pemerintah Daerah</option>
                                                <option value="">Pemerintah Lainnya</option>
                                                <option value="">Badan Usaha Mioptionk Negara</option>
                                                <option value="">Badan Usaha Mioptionk Daerah</option>
                                                <option value="">Asuransi</option>
                                                <option value="">Lembaga Pembiayaan</option>
                                                <option value="">Perusahaan Lainnya</option>
                                                <option value="">Dana Pensiun</option>
                                                <option value="">Perusahaan Investasi</option>
                                                <option value="">Yayasan</option>
                                                <option value="">Lembaga Pendidikan</option>
                                                <option value="">Koperasi</option>
                                                <option value="">Kantor Perwakilan</option>
                                                <option value="">Individual</option>
                                                <option value="">Bukan Lembaga Pemerintah Lainnya</option>
                                                <option value="">Bukan Penduduk</option>
                                                <option value="">Bank Indonesia</option>
                                                <option value="">Bank Afioptionasi Lainnya</option>
                                                <option value="">Bank Lainnya</option>
                                                <option value="">Bank Pedesaan</option>
                                                <option value="">Afioptionasi Lainnya</option>
                                                <option value="">Karyawan</option>         
                                            </select>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Segment BUC (*)</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example">
                                                <option selected>- Silahkan Pilih -</option>
                                                <option value="">General Customer</option>
                                                <option value="">Walk In Customer</option>
                                                <option value="">Beneficiary Owner</option>
                                                <option value="">Corporate</option>
                                                <option value="">Comm KC JAKARTA THAMRIN</option>
                                                <option value="">Comm KC JAKARTA HASANUDIN</option>
                                                <option value="">Comm KC JAKARTA MAYESTIK</option>
                                                <option value="">Comm KC JAKARTA WARUNG BUNCIT</option>
                                                <option value="">Comm KC MEDAN</option>
                                                <option value="">Comm KC BANDUNG</option>
                                                <option value="">Comm KC SURABAYA</option>
                                                <option value="">Comm KC SOLO</option>
                                                <option value="">Comm KC MAKASSAR</option>
                                                <option value="">Comm KC BANJARMASIN</option>
                                                <option value="">Comm KC PALEMBANG</option>
                                                <option value="">Comm KC PEKANBARU</option>
                                                <option value="">Comm KC BAoptionKPAPAN</option>
                                                <option value="">Comm KC BATAM</option>
                                                <option value="">Comm KC JAKARTA RAWAMANGUN</option>
                                                <option value="">Comm KC BANDARLAMPUNG</option>
                                                <option value="">Comm KC SEMARANG</option>
                                                <option value="">Comm KC JAKARTA KELAPA GADING</option>
                                                <option value="">Comm KC JAKARTA PONDOK KELAPA</option>
                                                <option value="">Comm KC SURABAYA BOULEVARD</option>
                                                <option value="">Small Business</option>
                                                <option value="">Consumer (Produk Consumer Banking)</option>
                                                <option value="">Micro Banking</option>      
                                            </select>
                                        </div>
                                    </div>

                                    <hr>
                                    <p class="text-pembukaan">Informasi Tambahan</p>
                                     <p><br>
                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Zakat (*)</label>
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
                                            <label for="exampleInputEmail1" class="form-label">Biaya Kartu (*)</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
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
                                        <div class="col text-center">
                                            <label class="btn btn-info" >Submit</label>
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