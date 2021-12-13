import axios from 'axios';

const api = axios.create({
    baseURL: "https://api-prj.herokuapp.com"
})

export default api;
