import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';

import {Observable} from 'rxjs';
import {Role} from '../../model/role/role';

@Injectable({
  providedIn: 'root'
})
export class RoleServiceService {

  private roleUrl: string;

  constructor(private http: HttpClient) {
    this.roleUrl = 'http://localhost:8080/role';
  }

  public getRole(page: number, size: number): Observable<any> {
    return this.http.get<Role[]>(this.roleUrl + '/find-all?page=' + page + '&size=' + size );
  }

}
