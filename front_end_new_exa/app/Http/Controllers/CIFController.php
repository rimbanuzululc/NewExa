<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use Illuminate\Support\Facades\Http;
use Session;
use RealRashid\SweetAlert\Facades\Alert;

class CIFController extends Controller
{
    public function getCIFDatabyCIFNumber(Request $request){
        $response = Http::asForm()->get('http://localhost:9191/cif_perorangan/getcifdatausingcifnumber', [
            'cifNumber' => $request->cif_number,
        ]);
        $user_json = json_decode($response->body());
        return $user_json;
    }

    public function submitNewCIF(Request $request){

        if($request->employment_start != ""){
            $dateofEmploymentStartString = explode("-", $request->employment_start);
        }else{
            $dateofEmploymentStartString = ["","",""];
        }

        if($request->date_of_birth != ""){
            $dateofbirthString = explode("-", $request->date_of_birth);
        }else{
            $dateofbirthString = ["","",""];
        }

        $response = Http::post('http://localhost:9191/cif_perorangan/makecif', [
            'username' => Session::get('user')->username,
            'ticketNo' => '',
            'cardNo'=> '',
            'productCode'=> $request->product_code,
            'resideYN'=>'',
            'legalType'=> $request->legal_type,
            'legalIdNo'=> $request->legal_id_number,
            'shortName'=> $request->short_name,
            'name1'=> $request->full_name,
            'givenName'=> $request->given_name,
            'familyName'=> $request->family_name,
            'custTitle1'=> $request->customer_title1,
            'custTitle2'=> $request->customer_title2,
            'placeBirth'=> $request->place_of_birth,
            'dateOfBirth'=> $dateofbirthString[0].$dateofbirthString[1].$dateofbirthString[2],
            'street'=> $request->street,
            'address'=>'jakarta',
            'rt'=> $request->rt,
            'rw'=> $request->rw,
            'province'=> $request->province,//0200
            'districtCode'=>'0294', //0294
            'country'=> $request->country,
            'townCountry'=> $request->town_country,
            'residence'=>'',
            'postCode'=>$request->postal_code,
            'addrType'=>'',
            'addrStreet'=>$request->addr_street,
            'addrRT'=>$request->addr_rt,
            'addrRW'=>$request->addr_rw,
            'addrProvince'=> $request->addr_province,
            'addrSuburBtwn'=> $request->addr_city,
            'addrMunicipal'=>'Indonesia',
            'addrCountry'=> $request->addr_country,
            'addrDistrict'=>'0294', //0294
            'addrPostCode'=> $request->addr_postal_code,
            'addrPhoneArea'=> $request->addr_phone_area,
            'addrPhoneNo'=> $request->addr_phone_number,
            'sms'=> $request->sms,
            'email'=> "cahyo.adhi97@gmail.com",
            'maritalStatus'=> $request->marital_status,
            'education'=> $request->education,
            'religion'=> $request->religion,
            'gender'=> $request->gender,
            'mothMaiden'=> $request->mother_name,
            'fundSource'=> $request->fund_source,
            'fundSourceAMT'=> $request->fund_source_amount,
            'employmentStatus'=>$request->employment_status,
            'employersName'=> $request->employers_name,
            'jobTitle'=> $request->job_title,
            'occupation'=> $request->occupation,
            'employersAdd'=> $request->employers_address,
            'employersBuss'=> $request->employers_buss,
            'employmentStart'=> $dateofEmploymentStartString[0].$dateofEmploymentStartString[1].$dateofEmploymentStartString[2],
            'fundProvName'=>'',
            'offPhone'=> $request->office_phone,
            'taxID'=> $request->tax_id,
            'fundProvJob'=>'',
            'fundProvAddr'=>'',
            'fundProvePhone'=>'',
            'guarantorCode'=>'',
            'sidRelatiBank'=>'',
            'lBuCustType'=>'',
            'customerRating'=>'',
            'currency'=>'IDR',
            'zakat'=> 'N',
            'bonus'=>'',
            'atm'=>'',
            'passBook'=>'N',
            'acopenPurpose'=> $request->account_purpose,
            'printedName'=>$request->short_name,
            'accountOfficer'=> $request->account_officer,
            'accountNo'=>'',
            'msgId'=>'EX20220215103647_9a05f6344c3226ceceff9170966494b6',
            'taggingCode'=>'',
            'taggingCIF'=>'',
            'taggingStatus'=>'',
            'fatherName'=>'',
            'eventCode'=>'',
            'addStreetDet'=>'',
            'ticketChannel'=>'',
            'openType'=>'',
            'customerType'=>'80140508',
            'riskLevelID'=>'1'
        ]);
        $user_json = json_decode($response->body());
        return $user_json;
    }
}
