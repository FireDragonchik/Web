import {Injectable} from '@angular/core';
import {User} from './model/user/user';


@Injectable()
export class TokenStorage {

  private readonly CURRENT_USER: string = 'currentUser';

  private currentUser1: User;

  public setCurrentUser(currentUser: User): void {
    this.currentUser1 = currentUser;
    localStorage.setItem(this.CURRENT_USER, JSON.stringify(currentUser));
  }

  public getCurrentUser(): User {
    return this.currentUser1 || JSON.parse(localStorage.getItem(this.CURRENT_USER));
  }

  public clearUser(): void {
    localStorage.setItem(this.CURRENT_USER, null);
  }


}

