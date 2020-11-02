package com.brownfiled.controller;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.stubbing.Answer;
import org.springframework.web.client.RestTemplate;

import com.brownfield.pss.client.BrownFieldSiteController;
import com.brownfield.pss.client.Flight;
class BrownFieldSiteControllerTest {

    
    @Mock
    BrownFieldSiteController brownFieldSiteController;
    
    @Mock
	RestTemplate searchClient;

    @Test
    void greetingSubmit() throws Exception {
    	//List flights = new ArrayList<>(5);
    	//when(searchClient.postForObject("test" , null, Flight[].class)).then(flights);
    	//List<Flight> lst = brownFieldSiteController.greetingSubmit("123-123", null);
    	
    	//System.out.println(lst.size());
    	
    }

}
