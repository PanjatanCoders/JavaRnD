package com.saddy.fileoperation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SharedTempDirTest {

    @TempDir
    static Path tempDir;

    @Test
    void createTempDir() throws IOException {
        Path path = tempDir.resolve("file.txt");
        Files.createFile(path);
        assert Files.exists(path);

    }
    @Test
    void createTempFile() throws IOException {
        Path path = tempDir.resolve("file1.txt");
        Files.createFile(path);
        assert Files.exists(path);
    }
}
