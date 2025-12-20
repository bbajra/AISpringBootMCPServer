package dev.mcpspringai.mcpspring;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class McpSpringToolsTests {

    @Autowired
    private McpSpringTools tools;

    @Test
    void getLatestVideos_returnsExpectedContent() {
        String result = tools.getLatestVideos();

        assertTrue(result.contains("TEST DATA"));
        assertTrue(result.contains("ddddd"));
        assertEquals(2, result.split("TEST DATA", -1).length - 1);
    }
}
