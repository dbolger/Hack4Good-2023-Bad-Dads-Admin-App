<script setup>
import { Chart as ChartJS, ArcElement, Tooltip, Legend, CategoryScale } from 'chart.js'
import { Chart } from 'vue-chartjs'
ChartJS.register(ArcElement, Tooltip, Legend, CategoryScale)
const data = {
  labels: [
    'January',
    'February',
    'March',
    'April',
    'May',
    'June',
    'July',
    'August',
    'September',
    'October',
    'November',
    'December'
  ],
  datasets: [
    {
      label: 'Data One',
      backgroundColor: '#f87979',
      data: [40, 20, 12, 39, 10, 40, 39, 80, 40, 20, 12, 11]
    }
  ]
}
const options = {
  responsive: true,
  maintainAspectRatio: true
}
</script>
<template>
  <div style="position: relative">
    <chart :data="data" :options="options" />
  </div>
</template>
