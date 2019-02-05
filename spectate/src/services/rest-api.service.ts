import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable()
export class RestApiService {

  constructor(private http: HttpClient) { }

  getGreeting(): Observable<Greeting> {
    return this.http.get<Greeting>('http://localhost:8080/greeting');
  }
}
