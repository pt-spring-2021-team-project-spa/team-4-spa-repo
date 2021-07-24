// import planetarySystemImg from '../../images/beautyofheavens.jpg';

export default function SmithsonianPage(info) {
    console.log(info);
    return `
      <h1 class="smithsonian-title">Available Book From Smithsonian Library:</h1>

      <img src="https://i.ibb.co/XpsrKK6/The-Beauty-of-Heavens.jpg"/>

      <h2 class="book-title">Book Title</h2>
      <p class="book-title-info">${info.response.title}</p>

      <h2 class="author-title">Author</h2>
      <p class="author-name">${info.response.content.indexedStructured.name}</p>

      <h2 class="book-topic-title">Topic</h2>
      <p class="book-topic-info">${info.response.content.indexedStructured.topic}</p>
     
     <h2 class="language-title">Language</h2>
      <p class="language-info">${info.response.content.indexedStructured.language}</p>

      `;
  }