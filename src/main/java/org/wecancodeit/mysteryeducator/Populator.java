package org.wecancodeit.mysteryeducator;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.mysteryeducator.models.Art;
import org.wecancodeit.mysteryeducator.models.History;
import org.wecancodeit.mysteryeducator.models.Planets;
import org.wecancodeit.mysteryeducator.repositories.ArtRepository;
import org.wecancodeit.mysteryeducator.repositories.FavoriteFactRepository;
import org.wecancodeit.mysteryeducator.repositories.HistoryRepository;
import org.wecancodeit.mysteryeducator.repositories.PlanetsRepository;

import javax.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    private PlanetsRepository planetsRepo;
    @Resource
    private HistoryRepository historyRepo;
    @Resource
    private ArtRepository artRepo;
    @Resource
    private FavoriteFactRepository favoriteFactRepo;

    @Override
    public void run(String... args) throws Exception {

        History mercuryHistory = new History("Mercury in Roman religion was a god of shopkeepers, merchants, travelers, transporters of goods, thieves, and tricksters.","The planet was named Mercury because it was the fastest planet as it moved around the sun.");
        historyRepo.save(mercuryHistory);
        History venusHistory = new History("Venus in Roman religion was the goddess of love, beauty, maternal care, desire, and passion.", "The planet Venus received its name due to the fact that it was the brightest planet in the night sky. Venus is also the only planet named after a female Roman deity. ");
        historyRepo.save(venusHistory);
        History earthHistory = new History("Earth is the only planet whose name is not derived from a Roman or Greek deity.", "The name Earth simply comes from German and Old English words meaning ground.");
        historyRepo.save(earthHistory);
        History marsHistory = new History("Mars in Roman religion was the god of war, father to Romulus and Remus, the mythical founders of Rome, and second to only the Roman god Jupiter in Roman deity hierarchy.", "Mars is named after the Roman god of war which seems fitting due to the planet's reddish appearance. Even Mars' two moons are named after the mythical horses that Mars drove, Phobos and Deimos.");
        historyRepo.save(marsHistory);
        History jupiterHistory = new History("Jupiter in Roman religion was the king of all the gods as well as the god of thunder and sky.", "The planet Jupiter received its name due to the fact that it was the largest planet that the Romans could view.");
        historyRepo.save(jupiterHistory);
        History saturnHistory = new History("Saturn in Roman religion was the god of agriculture, harvest, and time. He was viewed as the god of abundance.", "The planet Saturn is believed to be named due to the fact that it was the slowest orbiting planet that the Romans could identify in the solar system.");
        historyRepo.save(saturnHistory);
        History uranusHistory = new History("Uranus in Greek religion was considered the father of the sky, and the personification of heaven.", "The planet Uranus was not bright enough for the Romans to see. It was later named after the invention of telescopes. Interestingly, it is the only planet named after a Greek deity rather than a Roman deity." );
        historyRepo.save(uranusHistory);
        History neptuneHistory = new History("Neptune in Roman religion was the god of water and sea.", "Similar to Uranus, Neptune was not able to be seen by the Romans and was discovered later via telescope. Due to the blueish nature of the planet, Neptune was named after the Roman god of the sea.");
        historyRepo.save(neptuneHistory);

        Art neptuneArt = new Art("https://collectionapi.metmuseum.org/api/collection/v1/iiif/10534/39804/main-image", "A prodigious talent at fifteen, John Singleton Copley learned his trade by copying reproductions of Italian mythological paintings. This charming juvenilia depicting Neptune and his retinue reminds us that Copley and the sitters in his later, mature portraits lived along the New England Coast and were deeply connected—economically and psychologically—to the sea.");
        artRepo.save(neptuneArt);
        Art venusArt = new Art("https://collectionapi.metmuseum.org/api/collection/v1/iiif/250153/541602/main-image","The missing lower portion of this statuette makes it difficult to determine if the woman depicted was clothed. However, her preserved left hand, which pulls back her hair, recalls the gesture of Venus after she emerged newly born from the sea, the subject of a famous Greek sculptural type of the third to second century B.C.");
        artRepo.save(venusArt);
        Art earthArt = new Art("https://www.metmuseum.org/art/collection/search/208976","Our terracotta girl formerly grasped an olive branch of peace along with the drapery in her lowered hand, while the upraised hand once brandished a trumpet.");
        artRepo.save(earthArt);
        Art marsArt = new Art("https://collectionapi.metmuseum.org/api/collection/v1/iiif/250709/533111/main-image", "Mars was one of the more important gods of the Roman pantheon. Numerous temples, shrines, and altars were dedicated to him in Rome and throughout the Empire. As the god of war, he had many of the same attributes as the Greek god Ares, but he was also closely associated with the imperial cult, since the emperor's power and popularity depended heavily on the army and its military successes. Mars was therefore often depicted on monuments celebrating imperial victories, notably on triumphal arches, a distinctively Roman type of public building. This fragment presumably comes from one such monument, perhaps even from the now lost Portico of Septimius Severus in Rome. Mars is represented in the canonical guise of an older, bearded man wearing a Corinthian helmet tipped back on his head.");
        artRepo.save(marsArt);
        Art jupiterArt = new Art("https://collectionapi.metmuseum.org/api/collection/v1/iiif/209020/485809/main-image","This group is the sculptor's working model for one of two monumental stone sculptures completed in 1870 and still in the garden of the palace at Fontainbleau");
        Art saturnArt = new Art ("https://collectionapi.metmuseum.org/api/collection/v1/iiif/700983/1690803/main-image", "One of eight numbered plates from the series 'Statues of Roman Gods', after Jacques Jonghelinck. The plates illustrate Bacchus and the seven planetary gods and was originally displayed in the town hall of Antwerp. The series was published by Philips Galle in 1585 in Antwerp and again in 1586.");
        artRepo.save(saturnArt);
        artRepo.save(jupiterArt);
        Art uranusArt = new Art("https://collectionapi.metmuseum.org/api/collection/v1/iiif/460164/912801/main-image", "The story of Hercules: the gods called upon Hercules to help them defend Olympus against the attack of the Giants, sons of Uranus and Gaea (Heaven and Earth)");
        artRepo.save(uranusArt);
        Art mercuryArt = new Art("https://collectionapi.metmuseum.org/api/collection/v1/iiif/380572/773414/main-image", "1 of 30 illustrations etched by Hollar for an edition of The Aeneid." + "In a square in Carthage, Mercury approaching Aeneas from the air, warning him to leave the city; Ascanius and a middle-aged man standing by at right; stone mason working at centre foreground, workmen shovelling stones and carrying stone blocks at left, others working on buildings in background; statue of Diana in a niche at right; coat of arms below image at centre.");
        artRepo.save(mercuryArt);




       Planets mercury = new Planets("Mercury", "Mercury is sometimes referred to as 'The Swift Planet.' The planet Mercury is the planet closest to the sun. Due to its proximity, it orbits the sun faster than any of the other planets. A year on Mercury is only 88 days. Mercury is also the smallest planet recognized by our solar system.", "30,915 million miles from the sun.", "Mercury has a diameter of 3,030 miles. Mercury is a little more than 1/3 the size of Earth.", mercuryHistory, mercuryArt);
       planetsRepo.save(mercury);
       Planets venus = new Planets("Venus", "Despite being a planet and not a star, Venus is sometimes referred to by the nicknames of 'The Morning Star' and 'The Evening Star.' A day on Venus is longer than a year. It takes the planet longer to rotate once around its own axis than to rotate around the sun. From Earth, Venus is the second brightest object in the sky next to the moon. Also, despite being further from the sun than Mercury, Venus is actually the warmer planet.", "66,958 million miles from the sun.", "Venus has a diameter of 7,520 miles. Venus is often referred to as Earth's twin due to the fact it is 95% of the size of Earth.", venusHistory, venusArt);
       planetsRepo.save(venus);
       Planets earth = new Planets("Earth", "Often referred to as 'The Blue Planet,' the Earth is made up of 70% water. Earth's abundance of water and oxygen make it the only planet known to contain life, in fact, millions of different forms of life. " , "94,488 million miles from the sun.", "Earth has a diameter of 7,918 miles.", earthHistory,earthArt);
       planetsRepo.save(earth);
       Planets mars = new Planets("Mars", "Mars is the fourth planet from the Sun and the second-smallest planet in the Solar System, being larger than only Mercury. ", "155,780 million miles from the sun.","Mars has a diameter of 4,212 miles. Mars is slightly larger than half the size of Earth.", marsHistory, marsArt);
       planetsRepo.save(mars);
       Planets jupiter = new Planets("Jupiter", "Nicknamed the Gas Giant, Jupiter has a mass more than two and a half times that of all the other planets in the Solar System combined. Jupiter is actually so large you can see it with your own eyes in the night time sky. Despite being the largest planet, it has the shortest day of all the other planets at approximately ten hours long.", "468,280 million miles from the sun.", "Jupiter has a diameter of 86,881 miles. Jupiter is almost 318 times as large as Earth.", jupiterHistory, jupiterArt);
       planetsRepo.save(jupiter);
       Planets saturn = new Planets("Saturn", "Saturn is often referred to as The Ringed Planet due to its most distinguishable feature, its large ring that encircles the planet. Another unique fact about Saturn is it actually gives off more energy than it receives from the sun. Saturn also has the fastest winds of any other planet in our solar system.", "923.55 million miles from the sun.", "Saturn has a diameter of 72,367 miles.", saturnHistory, saturnArt);
       planetsRepo.save(saturn);
       Planets uranus = new Planets("Uranus", "Uranus is known as the Sideways Planet because it actually rotates on its side. Unlike Jupiter and Saturn, considered to be gas giants, Uranus is considered to be an ice giant. It is mostly made of icy materials above its core. Uranus also spins in the opposite direction of most other plants including Earth.", "1.835 billion miles from the sun." , "Uranus has a diameter of 31,518 miles. Uranus is four times larger than Earth.", uranusHistory, uranusArt);
       planetsRepo.save(uranus);
       Planets neptune = new Planets("Neptune", "One of Neptune's first names was THe Planet Exterior to Uranus. More recently, it has adopted the nickname, The Last of the Gas Giants. Neptune is very cold, dark, and windy. Temperatures can reach -353 F. Neptune was also the first planet to be discovered by mathematical calculations and predictions.", "2.785 billion miles from the sun.", "Neptune has a diameter of 30,599 miles. Neptune is very similar in size to Uranus and is 3.9 times larger than Earth.", neptuneHistory, neptuneArt);
       planetsRepo.save(neptune);

    }
}
