package ToDo;

public class ArgumentHandler {
    String[] arguments;

    public ArgumentHandler (String [] arguments) {
        this.arguments = arguments;
    }

    public void handleArguments () {
        if (arguments.length == 0) {
            PrintUsage printUsage = new PrintUsage();
            printUsage.printUsage();
        } else {
            int counter = 1;
            for (String arg : arguments) {
                System.out.println(counter + " : " + arg);
                counter++;
            }        }
    }




}
