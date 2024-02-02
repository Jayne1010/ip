package Duke;

/**
 * The ExitCommand class represents a command to exit the Duke application.
 * It implements the Command interface.
 */
public class ExitCommand implements Command {

    /**
     * Executes the exit command, displaying a goodbye message and terminating the application.
     *
     * @param tasks   The TaskList (not used in exit command).
     * @param ui      The Ui object for displaying user interface messages.
     * @param storage The Storage object (not used in exit command).
     */
    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) {
        ui.showGoodbyeMessage();
        System.exit(0);
    }
}
