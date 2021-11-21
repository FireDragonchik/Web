import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RegistratePageComponent } from './registrate-page.component';

describe('RegistratePageComponent', () => {
  let component: RegistratePageComponent;
  let fixture: ComponentFixture<RegistratePageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RegistratePageComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RegistratePageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
