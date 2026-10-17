package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemNode {
    private final String name;
    private final List<FileSystemNode> children = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(FileSystemNode node) {
        children.add(node);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return children.stream().mapToInt(FileSystemNode::getSize).sum();
    }

    public void print(String indent) {
        System.out.println(indent + name + "/ (" + getSize() + " bytes)");
        for (FileSystemNode child : children) {
            if (child instanceof Directory directory) {
                directory.print(indent + "  ");
            } else {
                System.out.println(indent + "  " + child.getName() + " (" + child.getSize() + " bytes)");
            }
        }
    }
}
