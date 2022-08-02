import { Component, Input, OnInit } from '@angular/core';
import { Course } from 'src/app/models/course.model';
import { ActivatedRoute, Router } from '@angular/router';
import { JsonPlaceHolderService } from 'src/app/services/json-place-holder.service';

@Component({
  selector: 'app-course-details',
  templateUrl: './course-details.component.html',
  styleUrls: ['./course-details.component.css']
})
export class CourseDetailsComponent implements OnInit {

  course: Course;

  constructor(
    private jsonPlaceHolderService: JsonPlaceHolderService,
    private activatedRoute: ActivatedRoute,
    private router: Router
  ) {
    this.course = new Course(1, '', '', '', '', '');
  }

  ngOnInit(): void {
    console.log(this.activatedRoute.snapshot.params);
    const courseId: number = this.activatedRoute.snapshot.params['id'];

    this.jsonPlaceHolderService.getCourse(courseId).subscribe(
      (course) => {
        console.log(course);
        this.course = course;
      }
    );
  }

  goBack(): void {
    this.router.navigate(['/courses']); 
  }

}
