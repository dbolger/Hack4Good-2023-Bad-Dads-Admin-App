import {
    createRouter,
    createWebHistory
} from 'vue-router'

import store from './store'

const formatImport = (name) => ()=>import(`./pages/${name}.vue`)

export const navItems = [
    {path: '', name: 'Home', component: () => import('./pages/Dashboard.vue')},
    {path: 'login', name: 'Login'},
]

export const routes = navItems.map((item) => ({
        path: '/' + item.path,
        name: item.name,
        component: item?.component ?? formatImport(item.name)
    })
).concat([
    {
        path: '/:pathMatch(.*)*',
        name: 'NotFound',
        component: formatImport('NotFound')
    }
])

export const router = createRouter({ history: createWebHistory(), routes })

router.beforeEach(async (to, from)=> {
    const isLoggedIn = store.getters['auth/isLoggedIn']
    console.log('isLoggedIn', isLoggedIn)
    if (!isLoggedIn && to.name !== 'Login') {
        return { name: 'Login' }
    }
    if (isLoggedIn && to.name === 'Login') {
        return { name: 'Home' }
    }
})
export default router
