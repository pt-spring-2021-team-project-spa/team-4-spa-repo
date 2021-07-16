import apiActions from "./api-actions/api-actions";
import Header from "./components/Header";
import Footer from "./components/Footer";
import '/style.css';

buildPage();

function buildPage() {
header();
footer();
}

function header() {
    const headerElem = document.querySelector('.header');
    headerElem.innerHTML = Header();
}

function footer() {
    const footerElem = document.querySelector('.footer');
    footerElem.innerHTML = Footer();
}

// // function renderHistory() {
// //     const historyButton = document.querySelector('.history-button');
// //     historyButton.addEventListener('click', () => {
// //       const app = document.querySelector('#app');
// //       apiActions.getRequest('http://localhost:8080/api/history/', (history) => {
// //         app.innerHTML = HistoryPage(history);
// //       });
//     });
//   }


