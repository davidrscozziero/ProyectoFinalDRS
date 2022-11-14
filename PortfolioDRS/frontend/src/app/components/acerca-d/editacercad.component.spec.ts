import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EditacercadComponent } from './editacercad.component';

describe('EditacercadComponent', () => {
  let component: EditacercadComponent;
  let fixture: ComponentFixture<EditacercadComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EditacercadComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EditacercadComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
