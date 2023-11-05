<script setup>
import { inject, onMounted, ref } from 'vue'
import BarChartStatic from '../components/Charts/BarChartStatic.vue'
import DoughnutChartStatic from '../components/Charts/DoughnutChartStatic.vue'
import ChapterOverviewStatic from '../components/Charts/ChapterOverviewStatic.vue'
import ActiveFacilitatorsStatic from '../components/Charts/ActiveFacilitatorsStatic.vue'
const $http = inject('$http')
const dads = ref(null)
const endpoint = `${$http.defaults.baseURL}/dads/get/all`

$http.get(endpoint)
     .then(({ data }) => dads.value = data)
     .catch(e=>dads.value = [])

</script>

<template>
  <h1>Good Dads Stockton Chapter</h1>
  <section>
    <div>
      <h2>Chapter Overview</h2>
      <p>87 Active Dads</p>
      <chapter-overview-static />

    </div>
    <div>
      <h2>Active Facilitators</h2>
      <p>6 Active Facilitators</p>

      <active-facilitators-static />
      <div class="chartlabel">
        <p>9 Active Cohorts</p>
        <p>9.6 Dads per Cohort</p>
      </div>
    </div>
  </section>

  <form class="searchForm">
    <input type="text" placeholder="Search">
    <select>
      <option value="none" selected disabled hidden>Filter by Location</option>
      <option value="1">Stockton</option>
      <option value="2">Modesto</option>
      <option value="3">Sacramento</option>
    </select>
  </form>
  <table>
    <thead>
    <tr>
      <th>Facilitator Name</th>
      <th>Location</th>
      <th># of Active Cohorts</th>
      <th>Status</th>
      <th>Date Joined</th>
    </tr>
    </thead>
    <tbody>
    <tr>
      <td>Maria Smith</td>
      <td>Family Restoration Center</td>
      <td>2</td>
      <td>Active</td>
      <td>10/23/2021</td>
    </tr>
    <tr>
      <td>Elliott Smith</td>
      <td>Family Restoration Center</td>
      <td>2</td>
      <td>Active</td>
      <td>10/23/2021</td>
    </tr>
    <tr>
      <td>Jane Simmons</td>
      <td>Family Restoration Center
      </td>
      <td>1</td>
      <td>Active</td>
      <td>10/23/2021</td>
    </tr>
    <tr>
      <td>Reggie Wilkerson</td>
      <td>Family Restoration Center</td>
      <td>2</td>
      <td>Active</td>
      <td>10/23/2021</td>
    </tr>
    <tr>
      <td>George Ashland</td>
      <td>Family Restoration Center</td>
      <td>2</td>
      <td>Active</td>
      <td>10/23/2021</td>
    </tr>
    </tbody>
  </table>
</template>

<style scoped lang="scss">
.chartlabel {
  margin: 0 auto;
  display: flex;
  justify-content: space-around;
}
section {
  display: flex;
  align-items: flex-start;
}
table {
  width: 100%;
  border-collapse: collapse;
  margin: 0 auto 80px auto;
  max-width: 1024px;
  th, td {
    padding: 10px;
    border: 1px solid #ccc;
    text-align: left;
  }
  th {
    background: #e1ebe4;
    color: #000;
  }
  td {
    background: #fff;
  }
  tr:nth-child(even) {
    background: #eee;
  }
  button {
    padding: 2px 5px;
    display: block;
    width: 80px;
    margin: 0 auto 10px auto;
  }
  button:hover {
    padding: 2px 5px;
  }
}
.searchForm {
  display: flex;
  flex-direction: row;
  justify-content: flex-start;
  margin: 20px 0;
  input, select {
    padding: 10px;
    margin: 10px 0px;
    border-radius: 5px;
    border: 1px solid #ccc;
    font-size: 1em;
  }
  select {
    padding: 10px;
    margin: 10px 10px;
    border-radius: 5px;
    border: 1px solid #ccc;
    font-size: 1em;
    background: #fff;
  }
}
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
