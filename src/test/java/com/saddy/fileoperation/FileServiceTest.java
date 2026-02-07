package com.saddy.fileoperation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileServiceTest {


    @Test
    public void testFileService(@TempDir Path tempDir) throws IOException {
        Path filePath = tempDir.resolve("file.txt");
        Files.writeString(filePath, "Hello, JUnit!");
        assert Files.exists(filePath);
        // // After this method ends, tempDir is deleted automatically
    }
}
