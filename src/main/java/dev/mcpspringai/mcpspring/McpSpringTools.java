package dev.mcpspringai.mcpspring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springaicommunity.mcp.annotation.McpTool;
import org.springframework.stereotype.Component;



@Component
public class McpSpringTools {
    private static final Logger log = LoggerFactory.getLogger(McpSpringTools.class);

    //tools
    @McpTool(name = "mcpSpringAI-videos", description = "I will return Dan Vega's last 3 videos")
    public String getLatestVideos(){
        var videos = """
                TEST DATA
                ddddd
                TEST DATA
                """;

        return videos;
    }

    //resources

    //prompts
}
