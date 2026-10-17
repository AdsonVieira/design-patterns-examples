package structural.composite;

public class CompositeDemo {
    public static void main(String[] args) {
        Directory src = new Directory("src");
        src.add(new File("Main.java", 1200));
        src.add(new File("Utils.java", 800));

        Directory project = new Directory("project");
        project.add(src);
        project.add(new File("README.md", 400));

        project.print("");
        System.out.println("Tamanho total: " + project.getSize() + " bytes");
    }
}
