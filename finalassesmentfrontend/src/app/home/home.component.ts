import { Component } from '@angular/core';
import { Router, RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [RouterOutlet],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent {
  constructor(private router:Router){}

  viewHotelDetails(){
    this.router.navigate(['/view/hotel'])
  }

  filterHotelDetails(){
    this.router.navigate(['/filter'])
  }

}