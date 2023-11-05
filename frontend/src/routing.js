import {
    createRouter,
    createWebHistory
} from 'vue-router'

import store from './store'

const formatImport = (name) => ()=>import(`./pages/${name}.vue`)

export const sidebarItems = {
    "People": [
        {path: 'locations', name: 'Locations', icon: 'map-marker-alt'},
        {path: 'facilitators', name: 'Facilitators', icon: 'user-tie'},
        {path: 'staff', name: 'Staff', icon: 'user'},
        {path: 'dads', name: 'Dads', icon: 'user'},
    ],
    "Content": [
        {path: 'resources', name: 'Resources', icon: 'book'},
    ],
    "Communication": [
        {path: 'alerts', name: 'Alerts', icon: 'bell'},
        {path: 'feedback', name: 'Feedback', icon: 'comment'},
    ],
    "Intake": [
        {path: 'intake', name: 'New Intake', icon: 'plus', component: () => import('./pages/Intake.vue')},
        {path: 'edit-forms', name: 'Edit Forms', icon: 'edit', component: () => import('./pages/EditForms.vue')},
    ],
    "Reports": [
        {path: 'reports', name: 'Reports Dashboard', icon: 'chart-bar', component: () => import('./pages/Reports.vue')},
        {path: 'saved-reports', name: 'Saved Reports', icon: 'save', component: () => import('./pages/SavedReports.vue')},
        {path: 'new-report', name: 'New Report', icon: 'plus', component: () => import('./pages/NewReport.vue')},
    ],
}
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
]).concat(Object.entries(sidebarItems).map(([key, value]) => {
    return value.map((item) => ({
        path: '/' + item.path,
        name: item.name,
        component: item?.component ?? formatImport(item.name)
    }))
}).flat())

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
