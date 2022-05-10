<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Models\User;
use Session;

class DashboardController extends Controller
{
    public function index() {
        if(Session::has('user')){
            $user = Session::get('user');
            if($user->role == "SuperAdmin"){
                return view('admin.dashboardadmin')->with('user', $user);
            }
            return view('dashboard')->with('user', $user);
        }else{
            return view('/landingpage');
        }
        
    }
    public function showAccountOpen(){
        if(Session::has('user')){
            $user = Session::get('user');
            return view('accountopen')->with('user', $user);
        }else{
            return view('/landingpage');
        }
    }
    public function showAccountOpenNew(){
        if(Session::has('user')){
            $user = Session::get('user');
            return view('accountopen.datanasabahbaru')->with('user', $user);
        }else{
            return view('/landingpage');
        }
    }
    public function showAccountOpenExisting(){
        if(Session::has('user')){
            $user = Session::get('user');
            return view('accountopen.datanasabahexisting')->with('user', $user);
        }else{
            return view('/landingpage');
        }
    }
    public function showAccountInquiry(){
        if(Session::has('user')){
            $user = Session::get('user');
            return view('accountinquiry')->with('user', $user);
        }else{
            return view('/landingpage');    
        }
    }
    public function showAccountAuthorization(){
        if(Session::has('user')){
            $user = Session::get('user');
            return view('accountauthorization')->with('user', $user);
        }else{

        }
    }
    public function showDetailAuthorization(){
        if(Session::has('user')){
            $user = Session::get('user');
            return view('detailauthorization')->with('user', $user);
        }else{
            return view('/landingpage');
        }
    }

    public function showChangePassword(){
        if(Session::has('user')){
            $user = Session::get('user');
            return view('changepassword')->with('user', $user);
        }else{
            return view('/landingpage');
        }
    }

    public function showChangePasswordAdmin(){
        if(Session::has('user')){
            $user = Session::get('user');
            return view('admin.changepasswordadmin')->with('user', $user);
        }else{
            return view('/landingpage');
        }
    }

    public function showAddUserAdmin(){
        if(Session::has('user')){
            $user = Session::get('user');
            return view('admin.adduseradmin')->with('user', $user);
        }else{
            return view('/landingpage');
        }
    }

    
}
