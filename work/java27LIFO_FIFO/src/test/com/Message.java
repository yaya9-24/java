package test.com;

public class Message {

    private String command;
    private String to;

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    @Override
    public String toString() {
        return "Message{" +
                "command='" + command + '\'' +
                ", to='" + to + '\'' +
                '}';
    }

    public Message(String command, String to) {
        this.command = command;
        this.to = to;
    }

    public Message() {
    }
}
