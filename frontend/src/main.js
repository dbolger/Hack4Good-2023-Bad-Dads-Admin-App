import { createApp } from 'vue'
import './style.scss'
import App from './App.vue'
import axiosInstance from './helpers/http.axios.js'
// Vuex
import store from './store'
// Vue Router
import { router } from './routing'
// Vuetify
import 'vuetify/styles'
import { createVuetify } from 'vuetify'
import * as components from 'vuetify/components'
import * as directives from 'vuetify/directives'

const app = createApp(App)

const vuetify = createVuetify({
    components,
    directives,
})

app.provide('$http', axiosInstance)

app.use(router)
app.use(vuetify)
app.use(store)

app.mount('#app')
