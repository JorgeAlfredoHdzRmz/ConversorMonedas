package com.ConversorMonedas.Exceptions;

import java.util.InputMismatchException;

public class ErrorIntroducirTextoException extends InputMismatchException {
    private String mensaje;

    public ErrorIntroducirTextoException(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage(){
        return this.mensaje;
    }
}
