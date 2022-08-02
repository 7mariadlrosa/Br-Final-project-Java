import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BackendComponent } from './components/backend/backend.component';
import { CourseDetailsComponent } from './components/course-details/course-details.component';
import { CourseComponent } from './components/course/course.component';
import { CoursesListComponent } from './components/courses-list/courses-list.component';
import { FrontendComponent } from './components/frontend/frontend.component';
import { HomeComponent } from './components/home/home.component';
import { LoginFormComponent } from './components/login-form/login-form.component';
import { PageNotFoundComponent } from './components/page-not-found/page-not-found.component';
import { SignupFormComponent } from './components/signup-form/signup-form.component';
import { UserProfileComponent } from './components/user-profile/user-profile.component';

const routes: Routes = [

  {
    path: '',
    component: HomeComponent
  },
  {
    path: 'courses',
    component: CoursesListComponent
  },
  {
    path: 'course-details',
    component: CourseDetailsComponent
  },
  {
    path: 'signup',
    component: SignupFormComponent
  },
  {
    path: 'login',
    component: LoginFormComponent
  },
  {
    path: 'user-profile',
    component: UserProfileComponent
  },
  {
    path: 'frontend',
    component: FrontendComponent
  },
  {
    path: 'backend',
    component: BackendComponent
  },
  {
    path: '**',
    component: PageNotFoundComponent
  },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
