export default function Header() {
    return `
    <header class="header">
              <nav class="nav-bar">
                  <div class="learning-dropdown-menu">
                      <button class="learning-button">Learn About Planets</button>
                      <div class="planet-learning-content">
                          <a href="#planet-science-section"><button id="planetScienceBtn" class="planet-science-button">Planet Science</button></a>
                          <a href="#planet-history-section"><button id="planetHistoryBtn" class="history-button">Planet History</button></a>
                          <a href="#planet-art-section"><button id="planetArtBtn" class="art-button">Planet Art</button></a>
                      </div>
                  </div>
                  <a href=#about-us-section><button id="about-us-button" class="about-us-btn">About Us</button></a>
                  <a href=#contact-us-section><button id="contact-button" class="contact-btn">Contact</button></a>
              </nav>
          </header>
    `
}