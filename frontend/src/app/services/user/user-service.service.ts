import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';

import {Observable} from 'rxjs';
import {User} from '../../model/user/user';

@Injectable({
  providedIn: 'root'
})
export class UserServiceService {

  private userUrl: string;

  constructor(private http: HttpClient) {
    this.userUrl = 'http://localhost:8080/user';
  }

  public authenticate(login: string, password: string): Observable<any> {
    return this.http.get<User>(this.userUrl + '/find-by-login-and-password' + '?login=' + login + '&password=' + password );
  }

  public registration(user: User): Observable<User> {
    return this.http.post<User>(this.userUrl, user);
  }

}

