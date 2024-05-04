package br.com.year.exception;

public class ErrorYearException extends RuntimeException {
    private String menssage;

    public ErrorYearException(String menssage) {
        this.menssage = menssage;

    }

    @Override
    public String getMessage() {
        return this.menssage;
    }
}

