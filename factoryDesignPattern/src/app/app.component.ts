import { Component } from '@angular/core';
import { CssFactory }  from './CssFactory.model';
import { ITheme } from './ITheme';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'factoryDesignPattern';

  containerClass = ""
  buttonClass = "";
  headerClass = "";
  inputClass = "";
  cssFactory : CssFactory;
  cssClass : ITheme;
  ngOnInit(){
      this.cssFactory = new CssFactory();
      this.cssClass = this.cssFactory.getCssClass("basic");
      this.containerClass = this.cssClass.getcontainerClass();
      this.buttonClass = this.cssClass.getbuttonClass();
      this.headerClass = this.cssClass.getheaderClass();
      this.inputClass = this.cssClass.getinputClass();
  }

}

