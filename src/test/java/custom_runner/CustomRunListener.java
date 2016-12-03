package custom_runner;

import org.junit.runner.Description;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CustomRunListener extends RunListener {

    @Override
    public void testFinished(Description description) throws Exception {
        System.out.println(description);
        createFile(description, "testFinished");
    }

    @Override
    public void testFailure(Failure failure) throws Exception {
        System.out.println(failure.getDescription());
        createFile(failure, "testFailure");
    }

    @Override
    public void testIgnored(Description description) throws Exception {
        System.out.println(description);
        createFile(description, "testIgnored");
    }

    public void createFile(Description description, String name) throws IOException {
        String info = "<html>\n" +
                "<head>\n" +
                "<title></title>\n" +
                "</head>\n" +
                "<body style=\"margin:0\">\n" +
                "<div style=\"background-size: cover;text-align: center;width: 100%;height: 100%\">\n" +
                description +
                "</div> \n" +
                "</body>\n" +
                "</html>";

        File file = new File("/Users/viktor/Desktop/Java EE/git_repos/spring-beginning/src/main/webapp/" + name + ".html");

        FileWriter fileWriter = new FileWriter(file, true);
        fileWriter.write(info);
        fileWriter.flush();
        fileWriter.close();
    }

    public void createFile(Failure failure, String name) throws IOException {
        String info = "<html>\n" +
                "<head>\n" +
                "<title></title>\n" +
                "</head>\n" +
                "<body style=\"margin:0\">\n" +
                "<div style=\"background-size: cover;text-align: center;width: 100%;height: 100%\">\n" +
                failure.getDescription() +
                "</div> \n" +
                "</body>\n" +
                "</html>";

        File file = new File("/Users/viktor/Desktop/Java EE/git_repos/spring-beginning/src/main/webapp/" + name + ".html");

        FileWriter fileWriter = new FileWriter(file, true);
        fileWriter.write(info);
        fileWriter.flush();
        fileWriter.close();
    }
}
