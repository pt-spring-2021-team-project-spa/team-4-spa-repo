import Planets from './Planets';

buildPage();

function buildPage() {
    planets();
}

function planets() {
    const PlanetsElement = document.querySelector('Planets');
    planetsElement.innerHTML = Planets();
}