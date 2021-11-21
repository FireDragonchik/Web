import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';
import {TokenStorage} from '../../token.storage';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(private router: Router,
              private tokenStorage: TokenStorage) {
  }

  logOut(): void {
    this.tokenStorage.clearUser();
    this.router.navigateByUrl('login');
    alert('Вы покинули нас :(');
  }

  ngOnInit(): void {
  }

}

