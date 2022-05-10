<?php

namespace App\Http\Controllers;

use Illuminate\Support\Facades\Http;
use Illuminate\Http\Request;
use Session;
use RealRashid\SweetAlert\Facades\Alert;

class UserController extends Controller
{
    public function changePassword(Request $request)
    {
        $response = Http::put('http://localhost:9191/employee/changepassword', [
            'username' => Session::get('user')->username,
            'oldPassword' => $request->old_password,
            'newPassword' => $request->new_password
        ]);
        // print_r($response->body());
        $user_json = json_decode($response->body());
        // print_r("ss". $user_json->message);
        return $user_json;
    }
}
