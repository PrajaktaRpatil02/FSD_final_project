import { Component, OnInit } from '@angular/core';
import { HotelServiceService } from '../hotel-service.service';
import { Data } from '../Interface/response';
import { CommonModule } from '@angular/common';
import { FormControl, FormGroup, ReactiveFormsModule } from '@angular/forms';

@Component({
  selector: 'app-view-hotel',
  standalone: true,
  imports: [CommonModule,ReactiveFormsModule],
  templateUrl: './view-hotel.component.html',
  styleUrl: './view-hotel.component.css'
})
export class ViewHotelComponent implements OnInit {


  constructor(private hoteservice:HotelServiceService){}

  hotelResponseList:Data[]=[]
  ngOnInit(): void {
      
    this.hoteservice.fetchHotelDetils().subscribe((response)=>{

      console.log(response)
     this. hotelResponseList=response.data

    })
  }









}
