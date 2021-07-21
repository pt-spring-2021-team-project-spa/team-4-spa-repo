export default function Planets(planets) {
  return `
  <p class="planets-pic-space">  *</p>
    <h1 class="planets-title">Planets</h1>
    <div class='planets-list'>
    ${planets.map(planet => {
        return `
        <h2 class='planets-list__name'>${planet.name}
          <input type='hidden' id='planetId' value='${planet.id}'>
        </h2>
        `
    }).join('')}
    </div>
    `
  }
