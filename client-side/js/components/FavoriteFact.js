export default function FavoriteFact(favorite) {
    return `
    <h1>Favorite Facts</h1>
    <ul class='favorite-facts-list'>
    ${favorite.map(favorite => {
        return `
        <li class='favorite-facts-list__name'>${favorite.favoriteFact}</li>
        `
    }).join('')}
    </ul>
    `
}