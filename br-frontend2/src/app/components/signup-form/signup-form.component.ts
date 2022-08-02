import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { User } from 'src/app/models/user.model';
import { AuthService } from 'src/app/services/auth.service';
import { CustomValidators } from 'src/app/utils/custom.validation';

@Component({
  selector: 'app-signup-form',
  templateUrl: './signup-form.component.html',
  styleUrls: ['./signup-form.component.css']
})
export class SignupFormComponent implements OnInit {

  signupForm: FormGroup;
  usernameInput: FormControl;
  passwordInput: FormControl;
  passwordConfirmationInput: FormControl;

  constructor(
    private authService: AuthService,
    private router: Router
  ) {
    this.usernameInput = new FormControl('', [Validators.required]);
    this.passwordInput = new FormControl('', [Validators.required]);
    this.passwordConfirmationInput = new FormControl('', [Validators.required]);
    this.signupForm = new FormGroup({
      username: this.usernameInput,
      password: this.passwordInput,
      passwordConfirmation: this.passwordConfirmationInput
    }, [CustomValidators.passwordMatch]);
  }

  ngOnInit(): void {
  }

  signup() {
    this.authService.signup(this.signupForm.value.username, this.signupForm.value.password).subscribe(
      (user: User) => {
        alert('signup successful');
        console.log(user);

        this.router.navigate(['/login']);
      },
      (error) => {
        alert('signup failed');
        console.log(error);
      }
    );
  }



}
