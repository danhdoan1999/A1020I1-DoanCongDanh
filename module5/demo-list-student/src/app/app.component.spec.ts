// @ts-ignore
import { TestBed } from '@angular/core/testing';
// @ts-ignore
import { RouterTestingModule } from '@angular/router/testing';
import { AppComponent } from './app.component';

// @ts-ignore
describe('AppComponent', () => {
  // @ts-ignore
  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [
        RouterTestingModule
      ],
      declarations: [
        AppComponent
      ],
    }).compileComponents();
  });

  // @ts-ignore
  it('should create the app', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    // @ts-ignore
    expect(app).toBeTruthy();
  });

  // @ts-ignore
  it(`should have as title 'demo-list-student'`, () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    // @ts-ignore
    expect(app.title).toEqual('demo-list-student');
  });

  // @ts-ignore
  it('should render title', () => {
    const fixture = TestBed.createComponent(AppComponent);
    fixture.detectChanges();
    const compiled = fixture.nativeElement as HTMLElement;
    // @ts-ignore
    expect(compiled.querySelector('.content span')?.textContent).toContain('demo-list-student app is running!');
  });
});
