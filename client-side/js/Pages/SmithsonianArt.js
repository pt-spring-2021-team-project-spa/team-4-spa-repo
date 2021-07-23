// import planetarySystemImg from '../../images/beautyofheavens.jpg';

export default function SmithsonianPage(info) {
    console.log(info);
    return `
      <h1>Available Book From Smithsonian Library:</h1>

      <h2>Book Title</h2>
      ${info.response.title};

      <h2>Author</h2>
      ${info.response.content.indexedStructured.name};

      <h2>Topic</h2>
      ${info.response.content.indexedStructured.topic};
     
     <h2>Language</h2>
      ${info.response.content.indexedStructured.language};

      `;
  }