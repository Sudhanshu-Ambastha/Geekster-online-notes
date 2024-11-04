const apiKey = 'NASA_API_KEY';

async function fetchData() {
  try {
    const response = await fetch(`https://api.nasa.gov/planetary/apod?api_key=${apiKey}`);
    if (!response.ok) {
      throw new Error('Failed to fetch data');
    }
    const data = await response.json();
    showDataOnUI(data);
  } catch (error) {
    console.error('Error fetching data:', error);
  }
}

function showDataOnUI(data) {
  const imgContainer = document.getElementById("image-container");
  let img = document.createElement("img");
  img.src = data.hdurl;
  img.height = 500;
  img.width = 500;
  img.alt = data.title;
  imgContainer.appendChild(img);
}

fetchData();



// fetch('https://api.nasa.gov/planetary/apod?api_key=apiKey')
//   .then(response => response.json())
//   .then(data => console.log(data));