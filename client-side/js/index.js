import crud from "./crud/crud.js"
import Header from "./components/Header";
import Footer from "./components/Footer";
import Home from "./components/Home";
import Planet from "./components/Planet";
import Planets from "./components/Planets";
import About from "./components/About";
import Contact from "./components/Contact";
import apiActions from './api-actions/api-actions';
import Quiz from './components/Quiz';
import FavoriteFact from './components/FavoriteFact'
import NasaPhotos from './Pages/NasaPhotos';
import SmithsonianArt from './Pages/SmithsonianArt'

buildPage();

function buildPage() {
  header();
  footer();
  HomePage();
  navPlanets();
  navAbout();
  navContact();
  quizPage();
  navFacts();
  kidetQuiz();
  renderNasaPhotos()
  renderSmithsonianArt()
}

function header() {
  const headerElem = document.querySelector(".header");
  headerElem.innerHTML = Header();
}
function footer() {
  const footerElem = document.querySelector(".footer");
  footerElem.innerHTML = Footer();
}

function HomePage() {
  const homeElem = document.querySelector(".nav-list__home");
  homeElem.addEventListener("click", () => {
    const app = document.querySelector("#app");
    app.innerHTML = Home();
  });
}

function quizPage() {
  const quizElem = document.querySelector(".nav-list__quiz");
  quizElem.addEventListener("click", () => {
    app.innerHTML = Quiz();
  });
}

function navAbout() {
  const aboutElem = document.querySelector(".nav-list__about");
  aboutElem.addEventListener("click", () => {
    app.innerHTML = About();
  });
}

function navContact() {
  const contactElem = document.querySelector(".nav-list__contact");
  contactElem.addEventListener("click", () => {
    const app = document.querySelector("#app");
    app.innerHTML = Contact();
  });
}

function navPlanets() {
    const planetsElem = document.querySelector(".nav-list__planets");
    planetsElem.addEventListener("click", () => {
        const app = document.querySelector('#app');
        apiActions.getRequest('http://localhost:8080/api/planets/', planets => {
        // console.log(planets);
        app.innerHTML = Planets(planets);
          });
          renderPlanetInfo();
        });
      }

      function navFacts() {
        const factsElem = document.querySelector(".nav-list__favorite");
        factsElem.addEventListener("click", () => {
            const app = document.querySelector('#app');
            apiActions.getRequest('http://localhost:8080/api/favoritefact/', (favorite) => {
            console.log(favorite);
            app.innerHTML = FavoriteFact(favorite);
              });
            });
          }

function renderPlanetInfo() {
  app.addEventListener('click', () => {
    if (event.target.classList.contains('planets-list__name')) {
      const planetId = event.target.querySelector('#planetId').value;
      apiActions.getRequest(`http://localhost:8080/api/planets/${planetId}`, planet => {
        app.innerHTML = Planet(planet);
      })
    }
  })
}

function renderNasaPhotos() {
  const nasaPhotosButton = document.querySelector('.nav-list__nasa-api-photos');
  nasaPhotosButton.addEventListener('click', () => {
    const app = document.querySelector('#app');
    apiActions.getRequest(
      'https://images-api.nasa.gov/search?q=planets', (photos) => {
        app.innerHTML = NasaPhotos(photos);
      }
    );
  });
}

function renderSmithsonianArt() {
  const smithsonianButton = document.querySelector('.nav-list__smithsonian-api');
  smithsonianButton.addEventListener('click', () => {
    const app = document.querySelector('#app');
    apiActions.getRequest(
      'https://api.si.edu/openaccess/api/v1.0/content/edanmdm-siris_sil_283188?api_key=0ZxJcOQ0dSdHl9hWed4OfuXt19KJhcgTXpJcUpLr',
      (info) => {
        app.innerHTML = SmithsonianArt(info);
      }
    );
  });
}

      function StarWars() {
        const planetElem = document.querySelector(".nav-list__planets");
        planetElem.addEventListener("click", () => {
            const app = document.querySelector('#app');
            apiActions.getRequest('https://swapi.dev/api/people', (luke) => {
               console.log(luke)
              });
            });
          }
          
          app.addEventListener('click', () =>{
            if (event.target.classList.contains('add-favorite-fact__submit')) {
              const favoriteFact = event.target.parentElement.querySelector('.add-favorite-fact').value;
              console.log(favoriteFact);
              apiActions.postRequest('http://localhost:8080/api/favoritefact/add', {
                  favoriteFact: favoriteFact
              }, (planet) => app.innerHTML = Planet(planet));
          }
      })

      function kidetQuiz() {
        const app = document.querySelector("#app");
        app.addEventListener("click", (event) => {
          if (event.target.classList.contains("submit_Btn")) {
            var score = 0;
            if (document.getElementById("correct1").checked) {
              score++;
            }
            if (document.getElementById("correct2").checked) {
              score++;
            }
            if (document.getElementById("correct3").checked) {
              score++;
            }
            if (document.getElementById("correct4").checked) {
              score++;
            }
            if (document.getElementById("correct5").checked) {
              score++;
          } 
        if (score == 0) {
            number_correct.textContent =
              "Oh no! You didn't answer any questions correctly. Please proceed to Space Camp.";
          } else if (score == 1) {
              number_correct.textContent =
                "Keep studying! You only answered 1 question right this round. Please spend a little more time in the app and come back!";
          } else if (score == 2) {
            number_correct.textContent =
              "You answered 2 questions correctly. We think you need to spend a little more time at Mission Control but I'm sure you'll be a Space KIDet soon!";
          } else if (score == 3) {
              number_correct.textContent =
                "Good job! You correctly answered 3 questions! If you spend just a little more time in the app, you'll be ready for BLAST OFF!!!";
            } else if (score == 4) {
              number_correct.textContent =
                "WOW! Great job! You answered 4 questions correctly! We'd like to offer you a spot in the Space KIDets!";
              } else {
                number_correct.textContent =
                  "PERFECT SCORE! Congratulations! You answered all 5 questions correctly! We'd love to have you join the Space KIDets team!";
            }
          }
        });
      }