import Planets from '../components/Planets';

export default function Planet(planets) {
    return `
    ${Planets(planet.id)}

    <section class='favorite-fact'>
        <input class='add-favorite-fact' type='text' placeholder='Add a Favorite Fact to Save' />
        <button class='add-favorite-fact__submit'>Save</button>
    </section>
    `
    ;
}