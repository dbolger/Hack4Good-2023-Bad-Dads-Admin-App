<script setup>
defineProps({
  msg: String,
})
</script>
<template>
  <div>
    <a href="https://vitejs.dev" target="_blank">
      <img src="/vite.svg" class="logo" alt="Vite logo" />
    </a>
    <a href="https://vuejs.org/" target="_blank">
      <img src="./assets/vue.svg" class="logo vue" alt="Vue logo" />
    </a>
  </div>
  <p>#Dashboard {{ msg }}</p>
</template>

<style scoped lang="scss">
p {
  font-size: 2em;
  text-align: center;
}
</style>
