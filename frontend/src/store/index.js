import { createStore } from 'vuex'
import { auth } from './auth.js'
import { dads } from './dads.js'

const store = createStore({
    namespaced: true,
    state:() => ({}),
    mutations: {},
    getters: {},
    modules: {
        auth,
        dads,
    }
})

export default store
