<?php

namespace App\Http\Controllers;

use Illuminate\Support\Facades\Http;
use Illuminate\Http\Request;
use Session;
use RealRashid\SweetAlert\Facades\Alert;


class MasterDataController extends Controller
{
    public function getRetailData(){
        $response = Http::get('http://localhost:9191/masterdata/retaildata', []);
        $user_json = json_decode($response->body());

        if($user_json->message == "Get Data Retail Sucess!"){
            return $user_json;
        }
    }

    public function getMasterData(){
        $response = Http::get('http://localhost:9191/masterdata/getallmasterdata', []);
        $user_json = json_decode($response->body());

        if($user_json->message == "Get All Master Data Sucess!"){
            return $user_json;
        }
    }

    public function getAllProvince(){
        $response = Http::get('http://localhost:9191/masterdata/get_all_province', []);
        $user_json = json_decode($response->body());

        if($user_json->message == "Get All Provinces Success!"){
            return $user_json;
        }
    }
    public function getCitybyProvinceId(Request $request){
        $response = Http::get('http://localhost:9191/masterdata/get_regencies_by_province_id/'.$request->province_id, []);
        $user_json = json_decode($response->body());

        if($user_json->message == "Get All Regencies By Province Id Success!"){
            return $user_json;
        }
    }

    public function getDistrictbyCityId(Request $request){
        $response = Http::get('http://localhost:9191/masterdata/get_district_by_regency_id/'.$request->city_id, []);
        $user_json = json_decode($response->body());

        if($user_json->message == "Get All District By Regency Id Success!"){
            return $user_json;
        }
    }

    public function getVillagebyDistrictId(Request $request){
        $response = Http::get('http://localhost:9191/masterdata/get_village_by_district_id/'.$request->district_id, []);
        $user_json = json_decode($response->body());

        if($user_json->message == "Get All Village By Province Id Success!"){
            return $user_json;
        }
    }

    public function getProvinceById(Request $request){
        $response = Http::get('http://localhost:9191/masterdata/get_province_data_by_id/'.$request->province_id, []);
        $user_json = json_decode($response->body());

        if($user_json->message == "Get Province Data Success!"){
            return $user_json;
        }
    }
    
    public function getRegencyById(Request $request){
        $response = Http::get('http://localhost:9191/masterdata/get_regency_data_by_id/'.$request->regency_id, []);
        $user_json = json_decode($response->body());

        if($user_json->message == "Get Regency Data Success!"){
            return $user_json;
        }
    }
    
    public function getDistrictById(Request $request){
        $response = Http::get('http://localhost:9191/masterdata/get_district_data_by_id/'.$request->district_id, []);
        $user_json = json_decode($response->body());

        if($user_json->message == "Get District Data Success!"){
            return $user_json;
        }
    }

    public function getVillageById(Request $request){
        $response = Http::get('http://localhost:9191/masterdata/get_village_data_by_id/'.$request->district_id, []);
        $user_json = json_decode($response->body());

        if($user_json->message == "Get Village Data Success!"){
            return $user_json;
        }
    }

    public function getCompanyDetailByCompanyAddress(Request $request){
        $response = Http::asForm()->get('http://localhost:9191/masterdata/get_company_detail_by_company_name', [
            'companyName'=> $request->company_name,
        ]);
        $user_json = json_decode($response->body());

        if($user_json->message == "Get Company Detail Success!"){
            return $user_json;
        }
    }

}




