import axios from 'axios';
import config from '../config.js'

const axiosInstance = axios.create({
    baseURL: config.api_url ?? 'http://localhost:3000/api',
    headers: {
        Authorization: config.api_token ? `Bearer ${config.api_token}` : '',
        'Content-Type': 'application/json'
    }
})

export default axiosInstance
