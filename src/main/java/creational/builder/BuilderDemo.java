package creational.builder;

public class BuilderDemo {
    public static void main(String[] args) {
        Email welcome = new EmailBuilder()
                .to("aluno@example.com")
                .subject("Bem-vindo ao catálogo")
                .body("Explore um padrão por pasta e execute o main de cada exemplo.")
                .build();

        Email alert = new EmailBuilder()
                .to("maintainer@example.com")
                .subject("Build falhou")
                .body("<p>Verifique o CI.</p>")
                .asHtml()
                .build();

        System.out.println(welcome);
        System.out.println(alert);
    }
}
