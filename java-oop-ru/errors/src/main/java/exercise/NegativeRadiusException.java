package exercise;

// BEGIN
class NegativeRadiusException extends Exception {
    private final String message;

    NegativeRadiusException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
// END
