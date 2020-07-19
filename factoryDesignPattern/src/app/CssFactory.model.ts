import { BasicTheme } from './BasicTheme.model';
import { DarkTheme } from './DarkTheme.model';
import { ITheme } from './ITheme';

export class CssFactory {
    darkTheme : ITheme;
    basicTheme: ITheme;

    constructor() {
        this.darkTheme = null;
        this.basicTheme = null;
    }
     getCssClass(theme: string) : ITheme {
        if(theme.indexOf("dark")!==-1) {
            if(this.darkTheme == null) {
               this.darkTheme =  new DarkTheme();
            }
            return this.darkTheme;
        } else {
           
                if(this.basicTheme == null) {
                   this.basicTheme =  new BasicTheme();
                }
                return this.basicTheme;
        }
    }
}