import Command.Command;

public class Invoker {

    Command command;

    public Invoker(){

    }

    public void setCommand(Command c){
        command = c;
    }

    public void run(){
        command.execute();
    }
}
