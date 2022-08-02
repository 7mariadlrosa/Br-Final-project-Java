import { Component, OnInit } from '@angular/core';
import { Course } from 'src/app/models/course.model';
import { ApiService } from 'src/app/services/api.service';
import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';

@Component({
  selector: 'app-courses-list',
  templateUrl: './courses-list.component.html',
  styleUrls: ['./courses-list.component.css']
})
export class CoursesListComponent implements OnInit {

  courses: Course[];

  constructor(private apiService: ApiService) {
    this.courses = []
  }

  ngOnInit(): void {
    this.getCourses();
  }

  public getCourses(): void{
    this.apiService.getCourses().subscribe((data) => this.courses = data
     );
    console.log(this.courses);
  }

}
