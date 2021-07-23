export default function SmithsonianPage(info) {
    console.log(info);
    return `
      <h1>Planet Art From Smithsonian API</h1>
      ${info.response.title};
      `;
  }