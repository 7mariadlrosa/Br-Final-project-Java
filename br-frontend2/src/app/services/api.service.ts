import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Course } from '../models/course.model';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  private readonly BASE_URL = 'http://localhost:8089';
  constructor(
    private http: HttpClient
  ) { }

  public getCourses(): Observable<Course[]> {
    return this.http.get<Course[]>(this.BASE_URL + '/courses');
  }

}
