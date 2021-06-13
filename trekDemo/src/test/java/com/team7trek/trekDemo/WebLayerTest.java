package com.team7trek.trekDemo;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(SpringExtension.class)
@WebMvcTest
public class WebLayerTest {
    @MockBean
    private ContinentRepository continentRepo;
    @MockBean
    private RegionRepository regionRepo;
    @MockBean
    private TrekRepository trekRepo;
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void continentsShouldBeOkAndReturnContinentsViewWithContinentsModelAttribute() throws Exception {
        mockMvc.perform(get("/continents"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("continentsView"))
                .andExpect(model().attributeExists("continents"));
    }
    @Test
    public void regionsShouldBeOkAndReturnRegionsViewWithRegionsModelAttribute() throws Exception {
        mockMvc.perform(get("/regions"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("regionsView"))
                .andExpect(model().attributeExists("regions"));


    }
    @Test
    public void treksShouldBeOkAndReturnTreksViewWithTreksModelAttribute() throws Exception {
        mockMvc.perform(get("/treks"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("treksView"))
                .andExpect(model().attributeExists("treks"));


    }
    @Test
    public void shouldBeOkForASingleContinentEndPointWithContinentViewAndContinentModelAttribute() throws Exception {
        Continent testContinent = new Continent("Africa");
        when(continentRepo.findContinentByLocation("Africa")).thenReturn(testContinent);
        mockMvc.perform(get("/continents/Africa"))
                .andExpect(status().isOk())
                .andExpect(view().name("continentView"))
                .andExpect(model().attributeExists("continent"));
    }
}