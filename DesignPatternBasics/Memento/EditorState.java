public class EditorState {
    private final Stirng content; // once we intiialize this filed we cannot change it 

    public EditorState(Stirng content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}