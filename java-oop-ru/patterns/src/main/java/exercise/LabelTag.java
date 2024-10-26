package exercise;

// BEGIN
public final class LabelTag implements TagInterface {
    private final String label;
    private final TagInterface tag;

    LabelTag(String label, TagInterface tag) {
        this.label = label;
        this.tag = tag;
    }

    public String getLabel() {
        return this.label;
    }

    public TagInterface getTag() {
        return this.tag;
    }

    public String render() {
        return "<label>" + this.getLabel() + this.getTag().render() + "</label>";
    }
}
// END
