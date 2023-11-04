export const auth = {
    namespaced: true,
    state: () => ({
        token: 'initial token',
    }),
    mutations: {
        setToken(state, payload) {
            state.token = payload
        },
        removeToken(state) {
            state.token = null
        }
    },
    getters: {
        token: state => state.token,
        isLoggedIn: state => !!state.token
    }
}
export default auth
