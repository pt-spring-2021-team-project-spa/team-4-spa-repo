export default function Planets(planets) {
  return `
    <h1>Planets</h1>
    <ul class='planets-list'>
    ${planets.map(planet => {
        return `
        <li class ='planets-list__name'>${planet.name}
        <input type='hidden' id='planetId' value='${planet.id}'>
        </li>
        `
    }).join('')}
    </ul>

    <section class='favorite-fact'>
        <input class='add-favorite-fact' type='text' placeholder='Add a Favorite Fact to Save' />
        <button class='add-favorite-fact__submit'>Save</button>
    </section>
    `
  }
