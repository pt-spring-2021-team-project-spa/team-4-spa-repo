import Planets from '../components/Planets';

export default function PlanetsPage(planets) {
  return `
    <h1>The Planets Page</h1>
    ${Planets(planets)}
    `;
}