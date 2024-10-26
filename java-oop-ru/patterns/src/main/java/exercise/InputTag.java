package exercise;

// BEGIN
public final class InputTag implements TagInterface {
    private final String type;
    private final String value;

    InputTag(String type, String value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return this.type;
    }

    public String getValue() {
        return this.value;
    }

    public String render() {
        return "<input type=\"" +getType() + "\" value=\"" +getValue() + "\">";
    }
}
// END
