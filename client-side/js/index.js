import Header from "./components/Header";
import Footer from "./components/Footer";
import Home from "./components/Home";
import Planets from "./components/Planets";
import About from "./components/About";
import Contact from "./components/Contact";
import apiActions from './api-actions/api-actions';

buildPage();

function buildPage() {
  header();
  footer();
  HomePage();
  navPlanets();
  navAbout();
  navContact();
  StarWars();
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
        apiActions.getRequest('http://localhost:8080/api/planets/', (planets) => {
        console.log(planets);
        app.innerHTML = Planets(planets);
          });
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