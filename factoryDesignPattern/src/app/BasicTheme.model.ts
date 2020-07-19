import {ITheme} from './ITheme';
export class BasicTheme implements ITheme {
    getcontainerClass() {
        return "basic-Container";
    }
    getbuttonClass() {
        return "basic-button";
    }
    getheaderClass() {
        return "basic-header";
    }
    getinputClass() {
        return "basic-input";
    }

}