<script setup>
import { inject, onMounted } from 'vue'
const $http = inject('$http')

const endpoint = `${$http.defaults.baseURL}/dashboard`
onMounted(async () => {
  const { data } = $http.get(endpoint)
})
</script>

<template>
  <p>#Dashboard</p>
</template>

<style scoped lang="scss">
p {
  font-size: 2em;
  text-align: center;
}
</style>
