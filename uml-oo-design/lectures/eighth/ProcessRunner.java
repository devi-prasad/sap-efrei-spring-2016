import java.io.*;

class ProcessRunner {
    private static void runProcess(String[] args) 
                                     throws IOException, InterruptedException
    {
        ProcessBuilder pb = new ProcessBuilder(args);
        pb.directory(new File("."));
        File log = new File("runlog.txt");
        pb.redirectErrorStream(true);
        pb.redirectOutput(ProcessBuilder.Redirect.to(log));
        Process p = pb.start();
      
        p.waitFor();
        System.out.println("Process completes with exit code: " + p.exitValue());
	}

    public static void main(String[] args) {
        if (args.length > 0) {
            try {
                runProcess(args);
            } catch (IOException ex) {
                System.out.println(ex);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }
}