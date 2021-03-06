package Command;

import Command.Command;
import Servers.Receiver;

public class RunDiagnosticsCommand implements Command {

    Receiver receiver;
    public RunDiagnosticsCommand(Receiver r)
    {
        receiver = r;
    }
    public void execute()
    {
        receiver.connect();
        receiver.diagnostics();
        receiver.disconnect();
        System.out.println();
    }

    public void undo()
    {
        System.out.println("Cant undo...");
        System.out.println();

    }
}
