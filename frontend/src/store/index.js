import { createStore } from 'vuex'

const store = createStore({
    state() {
        return {
            token: null,
        }
    },
    mutations: {
       setToken(state, payload) {
          state.token = payload
        },
    },
    getters: {
        token(state) {
            return state.token
        },
        isLoggedIn(state) {
            return !!state.token
        }
    },
})

export default store
