import Header from "./components/Header";
import Footer from "./components/Footer";
import '/style.css';

buildPage();

function buildPage() {
header();
footer();
}

function header() {
    const headerElem = document.querySelector('.header');
    headerElem.innerHTML = Header();
}

function footer() {
    const footerElem = document.querySelector('.footer');
    footerElem.innerHTML = Footer();
}


