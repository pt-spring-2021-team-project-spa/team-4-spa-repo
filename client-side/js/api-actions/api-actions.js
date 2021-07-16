function getRequest(location, callback) {
  fetch('http://localhost:8080/api/history')
    .then((response) => response.json())
    .then((data) => callback(data))
    .catch((err) => console.log(err));
}

export default {
  getRequest,
};