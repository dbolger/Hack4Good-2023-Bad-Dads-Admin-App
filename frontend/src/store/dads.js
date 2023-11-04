import { inject } from 'vue'
import axiosInstance from '../helpers/http.axios.js'
inject('$http', axiosInstance)
export const dads = {
    namespaced: true,
    state: () => ({
        all: [],
        endpoint: `${$http.defaults.baseURL}/dads/get/all`,
    }),
    mutations: {
        setDads(state, payload) {
            state.token = payload
        },
        removeToken(state) {
            state.token = null
        }
    },
    actions: {
        fetchDads: async ({ commit }) => {
            const { data } = await $http.get('/dads/get/all')
                                        .catch(err => console.error(err))
            commit('setDads', data)
        },
    },
    getters: {
        token: state => state.token,
        isLoggedIn: state => !!state.token
    }
}
export default dads
