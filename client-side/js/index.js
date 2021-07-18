import apiActions from "./api-actions/api-actions";
import Header from "./components/Header";
import Footer from "./components/Footer";
import History from "./components/History";
import '/style.css';

buildPage();

function buildPage() {
header();
footer();
NavHistory();
}

function header() {
    const headerElem = document.querySelector('.header');
    headerElem.innerHTML = Header();
}

function footer() {
    const footerElem = document.querySelector('.footer');
    footerElem.innerHTML = Footer();
}

function NavHistory() {
    const historySection = document.querySelector('.history-button');
    historySection.addEventListener('click', () => {
      const app = document.querySelector('#app');
      apiActions.getRequest('http://localhost:8080/api/history', history => {
          app.innerHTML = History(history);
      })
    });
}
      
    //     const app = document.querySelector('#app');
    //   apiActions.getRequest('http://localhost:8080/api/history', history => {
    //     app.innerHTML = History(history);
    //   });
//     });
//   }

// function navPlanets() {
//     const planetsElem = document.querySelector('.');
//     planetsElem.addEventListener('click', () => {
//         const app = document.querySelector(#app);
//         app.innerHTML = 
//     })
// }
