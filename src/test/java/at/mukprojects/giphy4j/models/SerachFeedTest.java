package at.mukprojects.giphy4j.models;

import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileInputStream;
import java.io.StringWriter;

import org.apache.commons.io.IOUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class SerachFeedTest {

    private final static String RESFILE = "src/test/resources/search-response.json";

    private StringWriter writer;
    private FileInputStream inputStream;
    
    private Gson gson;
    private String jsonResponse;


    @Before
    public void setUp() throws Exception {
	File inputFile = new File(RESFILE);
	
	inputStream = new FileInputStream(inputFile);
	writer = new StringWriter();
	
	IOUtils.copy(inputStream, writer, "UTF-8");
	jsonResponse = writer.toString();
	
	gson = new GsonBuilder().create();
    }

    @After
    public void tearDown() throws Exception {
	writer.close();
	inputStream.close();
    }

    @Test
    public void testSearchFeed() {
	SearchFeed searchFeed = gson.fromJson(jsonResponse, SearchFeed.class);
	System.out.println(searchFeed);
    }

}
