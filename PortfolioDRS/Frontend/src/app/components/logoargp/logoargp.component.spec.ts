import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LogoargpComponent } from './logoargp.component';

describe('LogoargpComponent', () => {
  let component: LogoargpComponent;
  let fixture: ComponentFixture<LogoargpComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LogoargpComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(LogoargpComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
