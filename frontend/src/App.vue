<script setup>
import Dashboard from './pages/dashboard.vue'
</script>

<template>
  <suspense>
    <template #fallback>
      <div class="flex flex-col items-center justify-center h-screen">
        <img class="logo" src="./assets/vue.png" alt="logo" />
        <p class="text-2xl font-bold text-gray-500">Loading...</p>
      </div>
    </template>
    <router-view />
  </suspense>
</template>
<style scoped>
.logo {
  height: 6em;
  padding: 1.5em;
  will-change: filter;
  transition: filter 300ms;
}
.logo:hover {
  filter: drop-shadow(0 0 2em #646cffaa);
}
.logo.vue:hover {
  filter: drop-shadow(0 0 2em #42b883aa);
}
</style>
