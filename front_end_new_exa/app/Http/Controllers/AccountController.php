<?php

namespace App\Http\Controllers;

use Illuminate\Support\Facades\Http;
use Illuminate\Http\Request;
use Session;
use RealRashid\SweetAlert\Facades\Alert;

class AccountController extends Controller
{
    public function showAllAccountInquiry(){
        $response = Http::get('http://localhost:9191/account/getallaccount', []);
        $user_json = json_decode($response->body());
        
        // print_r($user_json);
        if(Session::has('user')){
            $user = Session::get('user');
            return view('accountinquiry')->with('user', $user);
        }else{
            return view('/landingpage');
        }
    }

    public function showAllAccountAuthorization(){
        $response = Http::get('http://localhost:9191/account/getallaccount', []);
        $user_json = json_decode($response->body());
        
        // print_r($user_json);
        if(Session::has('user')){
            $user = Session::get('user');
            return view('accountauthorization')->with('user', $user);
        }else{
            return view('/landingpage');
        }
    }

    public function authorAccountMudharabah(Request $request){

        if(empty($request->cif_number)){
            $response = Http::post('http://localhost:9191/cif_perorangan/cifauthorization', [
                'username' => Session::get('user')->username,
                'id' => $request->id,
            ]);
            $user_json = json_decode($response->body());
            return $user_json;

        }else{
            $response = Http::post('http://localhost:9191/account/authormudharabahaccount', [
                'username' => Session::get('user')->username,
                'id' => $request->id,
            ]);
            $user_json = json_decode($response->body());

            return $user_json;
        }
    }

    public function authorAccountMudharabahRejected(Request $request){

        if(empty($request->cif_number)){
            $response = Http::post('http://localhost:9191/cif_perorangan/cifauthorizationrejected', [
                'username' => Session::get('user')->username,
                'id' => $request->id,
            ]);
            $user_json = json_decode($response->body());
            return $user_json;
            
        }else{
            $response = Http::post('http://localhost:9191/account/authormudharabahaccountrejected', [
                'username' => Session::get('user')->username,
                'id' => $request->id,
            ]);
            $user_json = json_decode($response->body());
            return $user_json;
        }
    }


    public function submitNewAccountExisting(Request $request){
        if($request->date_of_birth != ""){
            $dateofbirthString = explode("-", $request->date_of_birth);
        }else{
            $dateofbirthString = ["","",""];
        }
        
        $response = Http::post('http://localhost:9191/account/validatemudharabah', [
            'username' => Session::get('user')->username,
            'productCode' => $request->product_code,
            'shortName' => $request->short_name,
            'printedName' => $request->printed_name,
            'acopenPurpose' => $request->account_open_purpose,
            'accountOfficer' => $request->account_officer,
            'currency' => 'IDR',
            'cifNo' => $request->cif_number,
            'passBook' => 'N',
            'zakat' => $request->zakat,
            'placeBirth' => $request->place_of_birth,
            'dateOfBirth'=> $dateofbirthString[0].$dateofbirthString[1].$dateofbirthString[2],
            'mothMaiden' =>$request->mother_name

        ]);
        $user_json = json_decode($response->body());
        return $user_json;
    }

    public function getAllAccount(){
        $response = Http::get('http://localhost:9191/account/getallaccount', []);
        $user_json = json_decode($response->body());
        if($user_json->message == "Get all account success!"){
            return $user_json;
        }
    }


}
