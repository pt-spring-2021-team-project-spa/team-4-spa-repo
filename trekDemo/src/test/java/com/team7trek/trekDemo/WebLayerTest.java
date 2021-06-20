package com.team7trek.trekDemo;
import com.team7trek.trekDemo.models.Continent;
import com.team7trek.trekDemo.repositories.ContinentRepository;
import com.team7trek.trekDemo.repositories.RegionRepository;
import com.team7trek.trekDemo.repositories.TrekRepository;
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
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
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
                .andExpect(model().attributeExists("region"));
    }
}