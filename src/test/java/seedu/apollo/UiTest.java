package seedu.apollo;

import org.junit.jupiter.api.Test;
import seedu.apollo.task.TaskList;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class UiTest {

    @Test
    void printList_normalInput_noExceptionThrown() throws IOException {
        Storage storage = new Storage("test.txt", "moduleData.txt", "/data/data.json");
        Ui ui = new Ui();
        TaskList taskList = storage.loadTaskList(ui);
        assertDoesNotThrow(() -> ui.printList(taskList));
    }
}
