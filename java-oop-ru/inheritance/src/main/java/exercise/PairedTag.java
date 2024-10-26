package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// BEGIN
public final class PairedTag extends Tag {
    String body;
    List<Tag> tags;

    public PairedTag(String name, Map<String, String> attributes, String body, List<Tag> tags) {
        super(name, attributes);
        this.body = body;
        this.tags = new ArrayList<>(tags);
    }

    public String getBody() {
        return this.body;
    }

    public List<Tag> getTags() {
        return this.tags;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        SingleTag parent = new SingleTag(this.getName(), this.getAttributes());
        String openParentTag = parent.toString();
        result.append(openParentTag).append(this.getBody());

        for (Tag tag : this.getTags()) {
            result.append(tag.toString());
        }

        String closeParentTag = "</" + this.getName() + ">";
        result.append(closeParentTag);

        return result.toString();
    }
}
// END
