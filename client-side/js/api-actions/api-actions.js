function getRequest(location, callback) {
  fetch(location)
    .then((response) => response.json())
    .then((data) => callback(data))
    .catch((err) => console.log(err));
}

function getSmithsonianRequest(location, callback) {
  fetch(location, {
    headers: {
      api_key: '0ZxJcOQ0dSdHl9hWed4OfuXt19KJhcgTXpJcUpLr',
      'Content-Type': 'application/json',
    },
  })
    .then((response) => response.json())
    .then((data) => callback(data))
    .catch((err) => console.log(err));
}

function postRequest(location, requestBody, callback) {
  fetch(location, {
      method: 'POST',
      body: JSON.stringify(requestBody)
  })
      .then(response => response.json())
      .then(data => callback(data))
      .catch(err => console.log(err));
}

export default {
  getRequest,
  getSmithsonianRequest,
  postRequest
};