<?php

namespace App\Http\Controllers;
use App\Models\User;


use Illuminate\Support\Facades\Http;
use Illuminate\Http\Request;
use Session;
use RealRashid\SweetAlert\Facades\Alert;

class LoginController extends Controller
{
    public function store(Request $request)
    {
        $response = Http::asForm()->post('http://localhost:9191/employee/login', [
            'username' => $request->username,
            'password' => $request->password,
        ]);
        $user_json = json_decode($response->body());
        if (Session::has('user')) {
            Session::forget('authenticated');
            Session::forget('user');
        }
        if($user_json->message == "Login Success"){
            $user = new User;
            $user->username = $user_json->data->username;
            // $user->name = $user_json->data->name;
            // $user->email = $user_json->data->email;
            // $user->branch_office_location = $user_json->data->branchOfficeLocation;
            $user->role = $user_json->data->role;
            if(Session::has('user')) {
              
                Session::forget('authenticated');
                Session::forget('user');
            }

            Session::put('authenticated',true);
            Session::put('user', $user);

            return redirect('/dashboard');
        }else{
            if (Session::has('user')) {
                //
                echo "salah ni bos";
                Session::forget('authenticated');
                Session::forget('user');
            }
            Alert::error('LOGIN FAILED', 'Wrong username or password!!');
            return back();
        }
    }

    public function logout(Request $request)
    {        
        if (Session::has('user')) {
            Session::forget('authenticated');
            Session::forget('user');
            return redirect('/landingpage');
        }else{
            Alert::error('LOGOUT FAILED', 'You dont have a data');
            return back();
        }
    }
}
