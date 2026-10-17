package creational.builder;

public final class Email {
    private final String to;
    private final String subject;
    private final String body;
    private final boolean html;

    Email(String to, String subject, String body, boolean html) {
        this.to = to;
        this.subject = subject;
        this.body = body;
        this.html = html;
    }

    @Override
    public String toString() {
        return "Email{to='" + to + "', subject='" + subject + "', html=" + html + ", bodyLength=" + body.length() + "}";
    }
}
