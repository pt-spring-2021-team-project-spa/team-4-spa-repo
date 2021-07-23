import SpaceKidsImg from "../../images/space-kids.jpg";
// import earthImg from "../../images/earth-photo.jpg";
export default function Home() {

     return `
          <h1 class="main-title">JacKr Enterprises</h1>
          <h1 class="main-title-line-two">Space KIDet</h1>
          <img
               class="space-kids"
               src="images/space-kids.jpg"
               alt="astronaut-kids">
          <p class="company-para">JacKr Enterprises has taken you on exciting and challenging trekking adventures all over Earth. Now we
               are expanding our services to offer once-in-a-lifetime trips to outer space! Prepare for your next adventure beyond Earth
               and become a JacKr Enterprises Space KIDet by expanding your planet knowledge using this new app!</p>
          <div class="solar-system-video">
               <iframe width="560" height="315" src="https://www.youtube.com/embed/BZ-qLUIj_A0" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
          </div>
     `;

  return `
  <h1 class="main-title">JacKr Enterprises</h1>
  <h1 class="main-title-line-two">Space KIDet</h1>
  <img class="space-kids" src="${SpaceKidsImg}" alt="kids">
  <p class="company-para">JacKr Enterprises has taken you on exciting and challenging trekking adventures all over Earth. Now we
      are expanding our services to offer once-in-a-lifetime trips to outer space! Prepare for your next adventure beyond Earth
      and become a JacKr Enterprises Space KIDet by expanding your planet knowledge using this new app!</p>
  
      `;

}
