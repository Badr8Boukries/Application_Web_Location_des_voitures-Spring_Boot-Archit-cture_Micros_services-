import { Component } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Router} from "@angular/router";

@Component({
  selector: 'app-aceuil',
  templateUrl: './aceuil.component.html',
  styleUrl: './aceuil.component.css'
})
export class AceuilComponent {


  voitures: any;



  constructor(private http: HttpClient, public router: Router) {
  }

  ngOnInit(): void {
    this.fetchProduits();
  }

  fetchProduits(): void {
    this.http.get("http://localhost:8888/VOITURE-SERVICE/voiture")
      .subscribe({
        next: data => {

          this.voitures = data
        },
        error: err => {
          console.log(err);
        }
      })

  }}
