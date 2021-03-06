import ContactUs from "../../css/assets/contactUsStyle.css";
export default function Contact() {
    return `

<title>JacKr Enterprises</title>
<body class = "cliffBody">
    <!-- Header Showcase-->
    <header id="showcase" class="grid">
        <div class="bg-image"></div>
        <div class="content-wrap">
            <h1>Welcome to JacKr Enterprises</h1>
            <p>We are an organization that specializes in offering niche adventures dedicated to learning about Earth's various ecosystems and unique terrains. Our motto is, "Vincit Qui Se Vincit" which means, "He/she conquers who conquers him/herself."</p>
            <!--a href="#section-b" class="btn">Read More</a-->
        </div>
    </header>

    <!-- Main Area-->
    <main id="main">
        <!-- Section A -->
        <section id="section-a" class="grid">
            <div class="content-wrap">
                <h2 class="content-title">Adventure Offerings</h2>
                <div class="content-text">
                    <p>JacKr prides itself on educating all their clients on what adventures are provided and what can be expected on a chosen adventure.  JacKr is constantly changing and seeking to innovate adventures that offer the ultimate in adventure excitement in a fun and safe way.  Past adventures offered include JacKr's Spelunking!, EYA! bka Experience Your Aquarium!, and JT,B! bka Just Trek Baby! adventures.</p>
                </div>
            </div>
        </section>

        <!-- Section B-->
        <section id="section-b" class="grid">
            <ul>
                <li>
                    <div class="card">
                        <img class = "cliffImage" src ="https://i.ibb.co/bzjcMW3/redsea-1-1024x768.jpg" alt="">
                        <div class="card-content">
                            <h3 class="card-title">EYA!&#8482</h3>
                            <p>Own an aquarium?  Enjoy visiting major aquariums? Love to visit the tropical fish store?  This adventure is all 3 of those questions...<strong>LIVE AND IN LIVING COLOR!</strong> So come Enjoy Your Aquarium!...EYA!&#8482</p>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="card">
                        <img class = "cliffImage" src="https://i.ibb.co/T4qtfvC/cavern.jpg" alt="" srcset="">
                        <div class="card-content">
                            <h3 class="card-title">Spelunking!&#8482</h3>
                            <p>Sure.  The tourist caves are beautiful, fun, and unique to visit.  But why do the tourist thing when you can tame the wilds and mark new paths for future tourists to follow.</p>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="card">
                        <img class = "cliffImage" src="https://i.ibb.co/CQ83Jnh/trek-to-k2-2.jpg" alt="" srcset="">
                        <div class="card-content">
                            <h3 class="card-title">JT,B!&#8482</h3>
                            <p>"Just Trek Baby!&#8482" is what we say here at JacKr.  Come test your fortitude with treks that make you forget that the word civilization even exists. </p>
                        </div>
                    </div>
                </li>
            </ul>
        </section>

        <!-- Section C-->
        <section id="section-c" class="grid">
            <div class="content-wrap">
                <h2 class="content-title">JacKr will handle all your cravings for adventure</h2>
                <p>EYA!&#8482, Spelunking!&#8482, and JT,B!&#8482 are just a sampling of the various exhilarating and thrilling eco-friendly global outdoor adventure.</p>
            </div>
        </section>

        <!-- Section D-->
        <section id="section-d" class="grid">
            <div class="box">
                <h2 class="content-title">Contact Us</h2>
                <p>2645 N High Street Columbus, OH 43202</p>
                <p>1.844.932.2626</p>
                <p>greatadventures@jackr.biz</p>
            </div>
            <div class="box">
                <h2 class="content-title">About Our Company</h2>
                <p>Founded in 2019 by a group of wild and crazy individuals for a tremendous love for the great outdoors and the many adventures the Earth has to offer.  These fab people chose to start guiding friends, family, and co-workers on the many adventures that they had experienced over their many years.  And due to the number of requests for guiding, <strong>JacKr</strong> was born.</p>
            </div>
        </section>
    </main>

    <!-- Footer -->
    <footer id="main-footer" class="grid">
        <div>JacKr Enterprises</div>
        <div>Web Site Created By <a href="http://wecancodeit.org" target="_blank">We Can Code IT</a></div>
    </footer>
</body>
`;
}
