<script setup>
import { inject, onMounted } from 'vue'
import HeaderNav from '../components/Navigation.vue'
const $http = inject('$http')
const dads = ref(null)
const endpoint = `${$http.defaults.baseURL}/dads/get/all`

$http.get(endpoint)
     .then(({ data }) => dads.value = data)
     .catch(e=>dads.value = [])
</script>

<template>
  <p>#Dashboard</p>
  <div>
    <ul>
      <li v-for="dad in dads">
        {{ dad.firstName }} {{ dad.lastName }}
      </li>
    </ul>
  </div>
  <header-nav></header-nav>
</template>

<style scoped lang="scss">
p {
  font-size: 2em;
  text-align: center;
}
</style>
