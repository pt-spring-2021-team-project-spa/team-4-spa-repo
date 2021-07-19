export default function Planets(planets) {
  return `
    <h1>Planets</h1>
    <ul class='planets-list'>
    ${planets.map(planet => {
        return `
        <li class='planets-list__name'>${planet.name}</li>
        `
    }).join('')}
    </ul>
    `
  }
