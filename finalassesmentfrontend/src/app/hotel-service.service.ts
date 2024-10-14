import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HotelResponse } from './Interface/response';

@Injectable({
  providedIn: 'root'
})
export class HotelServiceService {


  fetchHotelUrl="http://localhost:8080/api/fetchHotels"
  filterUrl="http://localhost:8080/api/filterhotel"
  constructor(private httpclient:HttpClient) { }

   fetchHotelDetils():Observable<HotelResponse>{

    let headers = new HttpHeaders({
      "Content-Type":"application/json"
    })

    return this.httpclient.get<HotelResponse>(this.fetchHotelUrl,{headers:headers})

   }


   filterHotelDEtails(hotel:any):Observable<HotelResponse>{
    let headers = new HttpHeaders({
      "Content-Type":"application/json"
    })
  return this.httpclient.post<HotelResponse>(this.filterUrl,hotel,{headers:headers})
   }


}
