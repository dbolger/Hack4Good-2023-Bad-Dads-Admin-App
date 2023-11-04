<script setup>
import { inject, onMounted, ref } from 'vue'
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
</template>

<style scoped lang="scss">
p {
  font-size: 2em;
  text-align: center;
}
</style>
