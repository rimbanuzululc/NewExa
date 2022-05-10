<?php

namespace App\Http\Controllers;

use Illuminate\Support\Facades\Http;
use Illuminate\Http\Request;
use Session;
use RealRashid\SweetAlert\Facades\Alert;


class AdminController extends Controller
{

    public function storeNewUser(Request $request)
    {

        $response = Http::post('http://localhost:9191/register/', [
            'username' => $request->username,
            'name' => $request->name,
            'email' => $request->email,
            'branchOfficeLocation' => $request->branch_office_location,
            'password' => $request->password,
            'role' => $request->role
        ]);
        $user_json = json_decode($response->body());
        return $user_json;
        // if($user_json->message == "Register Successfully"){
        //     Alert::success('Add New User', 'Add New User Success!!');
        //     return back();
        // }else{
        //     Alert::error('Add New User Failed', $user_json->message);
        //     return back();
        // }
    }

    public function showUserListAdmin(){
        $response = Http::get('http://localhost:9191/employee/getallusers', []);
        $user_json = json_decode($response->body());
        if($user_json->message == "Get all users sucess!"){
            $user_list_data = $user_json->data;
        }else{
            Alert::error('Get all User Failed', $user_json->message);
            return back();
        }
        // print_r($user_json);
        if(Session::has('user')){
            $user = Session::get('user');
            return view('admin.userlistadmin')->with('user', $user)->with('user_list_data', $user_list_data);
        }else{
            return view('/landingpage');
        }
    }

    public function resetPassword(Request $request){
        $response = Http::put('http://localhost:9191/employee/resetpassword/'.$request->adminusername, [
            'username' => $request->username,
        ]);
        $user_json = json_decode($response->body());

        return $user_json;
        // if($user_json->message == "Reset password sucess!"){
        //     Alert::success('Reset Password', 'Reset Password Success!!');
        //     return back();
        // }else{
        //     Alert::error('Reset Password', $user_json->message);
        //     return back();
        // }
    }
}
