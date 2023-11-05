<script setup>
import { Chart as ChartJS, ArcElement, Tooltip, Legend } from 'chart.js'
import { Doughnut } from 'vue-chartjs'
ChartJS.register(ArcElement, Tooltip, Legend)
const data = {
  labels: ['Good Dads', 'Slipping Dads', 'Progressing Dads', 'Bad Dads'],
  datasets: [
    {
      backgroundColor: ['#41B883', '#E46651', '#00D8FF', '#DD1B16'],
      data: [40, 20, 80, 10]
    }
  ]
}

const options = {
  responsive: false,
  maintainAspectRatio: true
}

</script>
<template>
  <doughnut :data="data" :options="options" />
</template>
