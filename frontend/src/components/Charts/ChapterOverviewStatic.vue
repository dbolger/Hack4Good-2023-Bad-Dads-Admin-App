<script setup>
import {
  Chart as ChartJS,
  Title,
  Tooltip,
  Legend,
  BarElement,
  CategoryScale,
  LinearScale
} from 'chart.js'
import { Bar } from 'vue-chartjs'
ChartJS.register(CategoryScale, LinearScale, BarElement, Title, Tooltip, Legend)
const barData = {
  labels: ['July', 'August', 'September', 'October', 'November'],
  datasets: [
    {
      label: 'Active Dads',
      backgroundColor: ['#D55F61', '#FAA532', '#2E5077', '#745D98', '#4da2a8'],
      data: [60, 72, 88, 85, 87]
    }
  ]
}
const barOptions = {
  responsive: false,
  maintainAspectRatio: false
}
</script>
<template>
  <div style="position: relative">
    <bar :data="barData" :options="barOptions" />
  </div>
</template>
