import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';
import {UserServiceService} from '../../services/user/user-service.service';
import {TokenStorage} from '../../token.storage';
import {User} from '../../model/user/user';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  login?: string;
  password?: string;
  private cUser ?: User;

  constructor(private router: Router,
              private tokenStorage: TokenStorage,
              private userService: UserServiceService) {
    this.cUser = new User();
  }


  logIn(): void {
    this.userService.authenticate(this.login, this.password).subscribe(data => {
        if (data == null){
          alert('wrong username or password please try again');
        }else {
          this.cUser = data;
          this.tokenStorage.setCurrentUser(this.cUser);

         // alert('hi ' + this.cUser.name + ' ' + this.cUser.surname);
          this.router.navigateByUrl('home');
        }
      },
      error => {
        alert('Error xxx');
        console.log(error);
      });
  }

  ngOnInit(): void {
  }
}

