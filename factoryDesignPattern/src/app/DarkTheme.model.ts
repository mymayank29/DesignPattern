import {ITheme} from './ITheme';
export class DarkTheme implements ITheme {
    getcontainerClass() {
        return "dark-Container";
    }
    getbuttonClass() {
        return "dark-button";
    }
    getheaderClass() {
        return "dark-header";
    }
    getinputClass() {
        return "dark-input";
    }

}