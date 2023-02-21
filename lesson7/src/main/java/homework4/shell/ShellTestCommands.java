package homework4.shell;

import homework4.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@RequiredArgsConstructor
@ShellComponent
public class ShellTestCommands {

    private final TestService testService;

    @ShellMethod(value = "Commands to run the test", key = {"r", "run"})
    public void run() {
        testService.runTest();
    }
}
