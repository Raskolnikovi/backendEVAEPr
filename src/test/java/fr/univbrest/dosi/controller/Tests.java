package fr.univbrest.dosi.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import fr.univbrest.dosi.bean.Formation;



public class Tests extends AbstractTest {
	   @Override
	   @Before
	   public void setUp() {
	      super.setUp();
	   }
	@Test
	public void getFormationList() throws Exception {
	   String uri = "/formations";
	   MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
	      .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
	   
	   int status = mvcResult.getResponse().getStatus();
	   assertEquals(200, status);
	   String content = mvcResult.getResponse().getContentAsString();
	   Formation[] formations = super.mapFromJson(content, Formation[].class);
	   assertTrue(formations.length > 0);
	}
}
