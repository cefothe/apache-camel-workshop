import java.io.*;


/**
 * Copy files without Apache Camel
 */

public class FileCopier {
    public static void main(String args[]) throws Exception {
        File inboxDirectory = new File("/home/cefothe/workspace/apache-camel-workshop/data/input");
        File outboxDirectory = new File("/home/cefothe/workspace/apache-camel-workshop/data/output");
        outboxDirectory.mkdir();
        File[] files = inboxDirectory.listFiles();
        for (File source : files) {
            if (source.isFile()) {
                File dest = new File(outboxDirectory.getPath()
                        + File.separator
                        + source.getName());
                copyFile(source, dest);
            }
        }
    }
    private static void copyFile(File source, File dest)
            throws IOException {
        OutputStream out = new FileOutputStream(dest);
        byte[] buffer = new byte[(int) source.length()];
        FileInputStream in = new FileInputStream(source);
        in.read(buffer);
        try {
            out.write(buffer);
        } finally {
            out.close();
            in.close();
        }
    }
}