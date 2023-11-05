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
  labels: ['Good Dads', 'Slipping Dads', 'Progressing Dads', 'Bad Dads'],
  datasets: [
    {
      label: 'Dads',
      backgroundColor: ['#41B883', '#E46651', '#00D8FF', '#DD1B16'],
      data: [40, 20, 80, 10]
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
