import $http from '../helpers/http.axios.js'
import { helpers } from '@vuelidate/validators'
export const auth = {
    namespaced: true,
    state: () => ({
        token: null,
    }),
    mutations: {
        setToken(state, payload) {
            state.token = payload
        },
        removeToken(state) {
            state.token = null
        },
    },
    getters: {
        token: state => state.token,
        isLoggedIn: state => true//!!state.token
    },
    actions: {

    }
}
export default auth
