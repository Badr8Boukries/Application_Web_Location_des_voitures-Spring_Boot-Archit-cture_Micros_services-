import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {RouterLink, RouterOutlet} from "@angular/router";
import { AceuilComponent } from './aceuil/aceuil.component';
import { LocationComponent } from './location/location.component';
import {HttpClientModule} from "@angular/common/http";
import {CommonModule, NgForOf} from "@angular/common";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";

@NgModule({
  declarations: [
    AppComponent,
    AceuilComponent,
    LocationComponent
  ],
    imports: [
      BrowserModule,
      AppRoutingModule,
      HttpClientModule,
      NgForOf,
      RouterLink,
      RouterOutlet,
      FormsModule,
      NgForOf,
      ReactiveFormsModule,
      RouterOutlet,
      FormsModule,
      NgForOf,
      FormsModule,
      NgForOf,
      FormsModule,
      NgForOf,
      CommonModule,
      FormsModule,
      ReactiveFormsModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
