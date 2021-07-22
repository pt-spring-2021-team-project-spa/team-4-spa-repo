// import Planets from '../components/Planets';

// export default function Planet(planets) {
//     return `
//     <h1>Planet</h1>
//     ${Planets(planet)}
//     `;
// }

export default function Planet(planet) {
    return `
        <div class="planet-name-div">
        <h1 class="planet-name">${planet.name}</h1>
        </div>

        <div>
        <center><img src = ${planet.planetImage}></center>
        </div>
        <div class="planet-info-container">

        <div class="planet-info-div">
        <h2 class="planet-description-title">Description:</h2>
        <p class="planet-description">${planet.description}</p>
        </div>

        <div class="planet-info-div">
        <h2 class="planet-distance-title">Distance:</h2>
        <p class="planet-distance">${planet.distance}</p>
        </div>

        <div class="planet-info-div">
        <h2 class="planet-size-title">Size:</h2>
        <p class="planet-size">${planet.size}</p>
        </div>
        <div>
        <div class="planet-info-div">
        ${planet.history.map(history => {
            return `
                <h2>Bio:</h2>
                <p class="planet-bio">
                     <span>${history.bio}</span>
                </p>
                </div>
                <div class="planet-info-div">
                <h2>Synopsis:</h2>
                <p class"planet-history">
                     <span>${history.synopsis}</span>
                </p>
                </div>
                    `
        }).join('')}
        </div>
        </div>

        <section class='favorite-fact'>
        <h1 class="submit-fact-directions">Have a favorite fact or just want to take some notes?</h1>
        <h1 class="submit-fact-directions">Just enter them here and then click on the favorite facts tab.</h1>
        <input class='add-favorite-fact' type='text' placeholder='Notes' />
        <button class='add-favorite-fact__submit'>Save</button>
        </section>
    `
}