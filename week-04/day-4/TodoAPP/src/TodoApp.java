import java.io.*;
import java.nio.file.*;
import java.util.List;


public class TodoApp {

    private final Path filePath = Paths.get("Files/TodoTasks.txt");
    private final String uncheckedPrefix = "[ ];";
    private final String checkedPrefix = "[x];";


    public static void main(String[] args) {
        var app = new TodoApp();

        if (args.length == 0) {
                app.printUsage();
        } else if (args[0].equals("-l")) {
            try {
                app.listAllTasks();
            } catch (UnsupportedOperationException e) {
                System.out.println("No todos for today! :)");
            } catch (Exception e) {
            }
        } else if (args[0].equals("-a")) {
                app.addNewTodo(args[1]);
        } else if (args[0].equals("-c")) {
            var taskNo = app.castStrToInt(args[1]);
            app.check(taskNo);
        } else if (args[0].equals("-r")) {
            try {
                app.removeTodo(args[1]);
            } catch (Exception e) {
            }
        }
        else {
            System.out.println("Unsupported argument \n");
                app.printUsage();
        }
    }

    private Integer castStrToInt(String str) {
        return Integer.parseInt(str);
    }

    private List<String> getTodos() {
        Path filePath = Paths.get("Files/TodoTasks.txt");
        try {
            return Files.readAllLines(filePath);
        } catch (IOException e) {
            System.out.println(e);
            return null;
        }
    }

    private String[] parseTodoLine(String line) {
        return line.split(";");
    }

    private void printUsage() {
        //try catch here
        try {
            Path filePath = Paths.get("Files/Usage");

            List<String> lines1 = Files.readAllLines(filePath);
            for (String line : lines1) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Malformed file");
            System.out.println(e);
        } catch (InvalidPathException e) {
            System.out.println("Invalid path");
            System.out.println(e);
        }
    }

    private void listAllTasks() throws Exception {
        Path filePath = Paths.get("Files/TodoTasks.txt");
        List<String> lines = Files.readAllLines(filePath);
        if (lines.isEmpty()) {
            throw new UnsupportedOperationException("No todos for today! :)");
        }

        for (int i = 0; i < lines.size(); i++) {
            var split = lines.get(i).split(";");
            System.out.println((i + 1) + " - " + split[1]);
        }
    }

    private void addNewTodo(String newTodo) {

        //here try,catch
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("Files/TodoTasks.txt", true));
            out.newLine();
            out.write(uncheckedPrefix + newTodo);
            out.close();
        } catch (IOException e) {
            System.out.println("Path is a directory");
            System.out.println(e);
        }
    }

    private void removeTodo(String lineToRemove) {
        int intLineToRemove = Integer.parseInt(lineToRemove);
        List<String> lines = getTodos();
        lines.remove(intLineToRemove);
        try {
            Files.write(filePath, lines);
        } catch (IllegalArgumentException | IOException e) {
            System.out.println(e);
        }
    }

    private void check(Integer taskNumber) {
        var todos = getTodos();
        if (todos == null) {
            return;
        }
        var index = taskNumber - 1;
        var wantedTodoLine = todos.get(index);
        var parsedWantedTodo = parseTodoLine(wantedTodoLine);

        var checkedTodo = checkedPrefix + parsedWantedTodo[1];

        todos.set(index, checkedTodo);

        try {
            Files.write(filePath, todos);
        } catch (IllegalArgumentException | IOException e) {
            System.out.println(e);
        }
    }

}