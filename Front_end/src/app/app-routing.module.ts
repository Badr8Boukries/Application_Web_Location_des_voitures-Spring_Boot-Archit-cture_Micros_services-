import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {AceuilComponent} from "./aceuil/aceuil.component";
import {LocationComponent} from "./location/location.component";

const routes: Routes = [

  { path : "aceuil", component : AceuilComponent },
  { path : "location", component : LocationComponent }


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
