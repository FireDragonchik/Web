import { Component, OnInit } from '@angular/core';
import {User} from '../../model/user/user';
import {Subscription} from 'rxjs';
import {ActivatedRoute, Router} from '@angular/router';
import {UserServiceService} from '../../services/user/user-service.service';

@Component({
  selector: 'app-registrate',
  templateUrl: './registrate.component.html',
  styleUrls: ['./registrate.component.css']
})
export class RegistrateComponent implements OnInit {

  user: User;

  private subscriptionsRxjs: Subscription[] = [];

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private userService: UserServiceService) {

    this.user = new User();
    this.user.roleId = 2;
  }

  signIn(): void {
    this.subscriptionsRxjs.push(
      this.userService.registration(this.user).subscribe(data => {
          this.user = data;
          alert('Ok');
          this.router.navigateByUrl('login');

        },
        error => {
          alert('Error xxx');
          console.log(error);
        })
    );
  }

  ngOnInit(): void {
  }
}
