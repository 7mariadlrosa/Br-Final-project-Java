import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Comment2Component } from './comment2.component';

describe('Comment2Component', () => {
  let component: Comment2Component;
  let fixture: ComponentFixture<Comment2Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ Comment2Component ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Comment2Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
