import Header from "./components/Header";
import Footer from "./components/Footer";
import Home from "./components/Home";
import Planets from "./components/Planets";
import About from "./components/About";
import Contact from "./components/Contact";

buildPage();

function buildPage() {
  header();
  footer();
  HomePage();
  navPlanets();
  navAbout();
  navContact();
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
function navPlanets() {
  const planetsElem = document.querySelector(".nav-list__planets");
  planetsElem.addEventListener("click", () => {
    app.innerHTML = Planets();
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
