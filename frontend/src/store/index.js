import { createStore } from 'vuex'
import { auth } from './auth.js'

const store = createStore({
    namespaced: true,
    state:() => ({}),
    mutations: {},
    getters: {},
    modules: {
        auth,
    }
})

export default store
