<script setup>
import { Chart as ChartJS, ArcElement, Tooltip, Legend } from 'chart.js'
import { Doughnut } from 'vue-chartjs'
ChartJS.register(ArcElement, Tooltip, Legend)
const data = {
  labels: ['Average Fullness of Cohorts'],
  datasets: [
    {
      backgroundColor: ['#D55F61', '#FFFFFF'],
      data: [96, 4]
    }
  ]
}
const options = {
  responsive: false,
  maintainAspectRatio: true
}
</script>
<template>
  <div style="position: relative">
    <doughnut :data="data" :options="options" />
  </div>
</template>
