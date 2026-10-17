package creational.builder;

public class EmailBuilder {
    private String to;
    private String subject = "";
    private String body = "";
    private boolean html;

    public EmailBuilder to(String to) {
        this.to = to;
        return this;
    }

    public EmailBuilder subject(String subject) {
        this.subject = subject;
        return this;
    }

    public EmailBuilder body(String body) {
        this.body = body;
        return this;
    }

    public EmailBuilder asHtml() {
        this.html = true;
        return this;
    }

    public Email build() {
        if (to == null || to.isBlank()) {
            throw new IllegalStateException("destinatário (to) é obrigatório");
        }
        return new Email(to, subject, body, html);
    }
}
