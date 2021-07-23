export default function NasaPhotos(images) {
    //console.log(images);
    const items = images.collection.items;
    // console.log(items);
  
    return `
    <div class='home__container'>
      <h1>NASA API Planet Photos</h1>
      ${items
        .map((item) => {
          console.log(item.links);
          const itemImage = item.links[0].href;
          return `
            <img src=${itemImage} alt='' />
            `;
        })
        .join('')}
        </div>
      `;
  }