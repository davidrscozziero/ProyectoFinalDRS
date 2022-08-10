import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-logoargp',
  templateUrl: './logoargp.component.html',
  styleUrls: ['./logoargp.component.css']
})
export class LogoargpComponent implements OnInit {

  constructor(private router:Router) { }

  ngOnInit(): void {
  }

login(){
  this.router.navigate(['/login']);
}

}
