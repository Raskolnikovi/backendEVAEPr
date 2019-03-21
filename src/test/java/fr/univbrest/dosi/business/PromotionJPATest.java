package fr.univbrest.dosi.business;

import fr.univbrest.dosi.bean.Formation;
import fr.univbrest.dosi.bean.Promotion;
import fr.univbrest.dosi.bean.PromotionPK;
import fr.univbrest.dosi.implementation.FormationRepositoryList;
import fr.univbrest.dosi.implementation.PromotionRepositoryList;
import fr.univbrest.dosi.repositories.*;
import fr.univbrest.dosi.business.FormationBussinessJPATest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class PromotionJPATest {

    private PromotionBussinessJPA promotionBusinessJPA;
    private PromotionRepository promotionRepository;

    private FormationBusinessJPA formationBusinessJPA;
    private FormationRepository formationRepository;

    @Before
    public void creationDesPromotion(){
        promotionRepository = new PromotionRepositoryList();
        promotionBusinessJPA = new PromotionBussinessJPA(promotionRepository);

        formationRepository = new FormationRepositoryList();
        formationBusinessJPA = new FormationBusinessJPA(formationRepository);


        formationBusinessJPA.creerFormation(new Formation("35",new Date(),"Form1", null, null, (byte) 2, null));
        formationBusinessJPA.creerFormation(new Formation("36",new Date(),"Form2", null, null, (byte) 2, null));
        formationBusinessJPA.creerFormation(new Formation("37",new Date(),"Form3", null, null, (byte) 2, null));

        promotionBusinessJPA.creerPromotion(new Promotion(new PromotionPK("2018-2019","35"),"Form2018","EC"));
        promotionBusinessJPA.creerPromotion(new Promotion(new PromotionPK("2019-2020","36"),"Form2019","RECH"));
        promotionBusinessJPA.creerPromotion(new Promotion(new PromotionPK("2020-2021","37"),"Form2020","EC"));

    }

    

    
    
   
    @Test
    public void doitCompterLesPromotions() {
        long count = promotionBusinessJPA.nombrePromotions();
        assertThat(count).isEqualTo(3L);
    }

}
