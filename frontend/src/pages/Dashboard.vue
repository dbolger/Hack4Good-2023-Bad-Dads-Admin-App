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
  <h1>Good Dads Stockton Chapter</h1>
  <div>
    <h2>Chapter Overview</h2>
    <p>126 Active Students</p>

  </div>
  <div>
    <h2>Active Facilitators</h2>
    <p>5 Active Facilitators</p>
  </div>
</template>

<style scoped lang="scss">
h1 {
  text-align: center;
  margin-bottom: 40px;
}
div {
  display: inline-block;
  width: 50%;
}
p {
  font-size: 1em;
  text-align: center;
}
</style>
