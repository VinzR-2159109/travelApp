import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Day } from './day.model';

@Injectable({
  providedIn: 'root'
})
export class DayService {

  private baseUrl = 'http://localhost:8080/api/days';

  constructor(private http: HttpClient) { }

  getAllDays(): Observable<Day[]> {
    return this.http.get<Day[]>(this.baseUrl);
  }

  createDay(day: Day): Observable<void> {
    return this.http.post<void>(this.baseUrl, day);
  }

  deleteDay(id: number): Observable<void> {
    return this.http.delete<void>(`${this.baseUrl}/${id}`);
  }
}
