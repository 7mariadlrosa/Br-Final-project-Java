import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Course } from '../models/course.model';

@Injectable({
  providedIn: 'root'
})
export class JsonPlaceHolderService {

  private readonly BASE_URL: string = 'https://jsonplaceholder.typicode.com';

  constructor(
    private http: HttpClient
  ) { }

  getCourses(): Observable<Course[]> {
    return this.http.get<Course[]>(`${this.BASE_URL}/courses`);
  }

  getCourse(id: number): Observable<Course> {
    return this.http.get<Course>(`${this.BASE_URL}/courses/${id}`);
  }

}
