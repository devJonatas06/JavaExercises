package PathMatcher;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class FindAllExercises extends SimpleFileVisitor <Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        if(file.toString().endsWith(".java")){
            System.out.println(" - "+file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
        if(!dir.equals(Paths.get("/home/jonatasdev/IdeaProjects/JavaExercise/src/STUDYJAVA/exercises"))) {
            System.out.println("\n[DIRETORIO] " + dir.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}
class  PathMatcherTest{
    public static void main(String[] args) throws IOException {
        Path root = Paths.get("/home/jonatasdev/IdeaProjects/JavaExercise/src/STUDYJAVA/exercises");
        Files.walkFileTree(root,new FindAllExercises());

    }
}
