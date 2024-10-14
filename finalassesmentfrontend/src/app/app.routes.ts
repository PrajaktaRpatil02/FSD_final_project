import { Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { ViewHotelComponent } from './view-hotel/view-hotel.component';
import { FilterhotelComponent } from './filterhotel/filterhotel.component';

export const routes: Routes = [
    {path:"",component:HomeComponent},
    {path:"view/hotel",component:ViewHotelComponent},
    {path:"filter",component:FilterhotelComponent}
];
