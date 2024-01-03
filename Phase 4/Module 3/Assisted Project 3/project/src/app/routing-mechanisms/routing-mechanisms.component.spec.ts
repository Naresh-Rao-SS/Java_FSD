import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RoutingMechanismsComponent } from './routing-mechanisms.component';

describe('RoutingMechanismsComponent', () => {
  let component: RoutingMechanismsComponent;
  let fixture: ComponentFixture<RoutingMechanismsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [RoutingMechanismsComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(RoutingMechanismsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
