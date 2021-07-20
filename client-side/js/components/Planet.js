// import Planets from '../components/Planets';

// export default function Planet(planets) {
//     return `
//     <h1>Planet</h1>
//     ${Planets(planet)}
//     `;
// }

export default function Planet(planet) {
    return `
        <h1>${planet.name}</h1>
        <h2>${planet.description}</h2>
        <h2>${planet.distance}</h2>
        <h2>${planet.size}</h2>
        <div>
        ${planet.history.map(history => {
            return `
                <h2>
                    Bio: <span>${history.bio}</span>
                </h2>
                <h2>
                    Synopsis: <span>${history.synopsis}</span>
                </h2>
                    `
        }).join('')}
        </div>
    `
}