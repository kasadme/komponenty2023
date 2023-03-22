package com.mycompany.zastosowanieProgramowaniaKomponentowego.Enums;

public enum ErrorMessage {

    NEGATIVE_INPUT_ERROR,
    EMPTY_INPUT;

    public String toString(){
        switch (this){
            case EMPTY_INPUT:
                return "Uzupełnij wszystkie pola wejściowe.";
            case NEGATIVE_INPUT_ERROR:
                return "Wprowadzone wartości muszą być dodatnie.";
            default:
                return "Inny błąd";
        }
    }
}
