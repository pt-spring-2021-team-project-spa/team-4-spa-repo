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
  StarWars();
  quizPage();
  navFacts();
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
      'https://api.si.edu/openaccess/api/v1.0/content/edanmdm-siris_sil_154895?api_key=0ZxJcOQ0dSdHl9hWed4OfuXt19KJhcgTXpJcUpLr',
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