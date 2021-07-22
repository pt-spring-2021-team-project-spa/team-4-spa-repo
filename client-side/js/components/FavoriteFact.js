export default function FavoriteFact(favorite) {
    return `
    <div class="favorite-facts-div">
    <div class="favorite-facts-title-div">
    <h1 class='favorite-facts'>Favorite Facts</h1>
    </div>
    <ul class='favorite-facts-list'>
    ${favorite.map(favorite => {
        return `
        <li class='favorite-facts-list__name'>${favorite.favoriteFact}</li>
        `
    }).join('')}
    </ul>
    </div>
    `
}