import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HotelServiceService } from '../hotel-service.service';

@Component({
  selector: 'app-filterhotel',
  standalone: true,
  imports: [ReactiveFormsModule],
  templateUrl: './filterhotel.component.html',
  styleUrl: './filterhotel.component.css'
})
export class FilterhotelComponent  implements OnInit{

  constructor(private hoteservice:HotelServiceService){}

  city=new FormControl("",[])
  min=new FormControl("",[])
  max=new FormControl("",[])

filterForm=new FormGroup({
  city:this.city,
  min:this.min,
  max:this.max
})


  addFilter(){
    if(this.filterForm.valid){
      this.hoteservice.filterHotelDEtails(this.filterForm.value).subscribe((response)=>{
       console.log(response)
      })
      
    }

  }

  ngOnInit(): void {
      
  }
}
