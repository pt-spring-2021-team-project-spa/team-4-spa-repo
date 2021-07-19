export default function History(history) {
    return `
    <h1>History</h1>
    <ul class="books-list">
    ${history.map(history => {
        return `
        <li class='books-list__title'>${history.bio}
            <input type='hidden' id='bookId' value='${history.id}'>
        </li>
        `
    }).join('')}
    </ul>
    `
}