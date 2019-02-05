import { Component, OnInit } from '@angular/core';
import { RestApiService } from 'src/services/rest-api.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {
  greeting: string;

  constructor(private restService: RestApiService) {}

  ngOnInit() {
    this.restService.getGreeting().subscribe((res) => {
      this.greeting = res.content;
    });
  }
}
