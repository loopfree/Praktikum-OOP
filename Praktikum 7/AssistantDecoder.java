import java.lang.reflect.*;

public class AssistantDecoder {

	Assistant assistant;

	AssistantDecoder(Assistant assistant) {
		this.assistant = assistant;
	}

	public void addPersonToRecommendations(String name) throws Exception {
		Method m = assistant.getClass().getDeclaredMethod("addPersonToRecommendations", String.class);
		m.setAccessible(true);
		m.invoke(assistant, name);
	}

	public int getSalary() throws Exception {
		Field f = assistant.getClass().getDeclaredField("salary");
		return f.getInt(assistant);
	}
}