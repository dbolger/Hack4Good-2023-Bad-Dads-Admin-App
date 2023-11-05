<script setup>
import { reactive, ref } from 'vue';

const show = ref(false)

const toggleDisplay = async () => {
  show.value = !show.value
}

</script>
<template>
  <h1>Alerts</h1>
  <h2>Active Dads</h2>
  <form class="searchForm">
    <input type="text" placeholder="Search">
    <select>
      <option value="none" selected disabled hidden>Filter by:</option>
      <option value="1">Status</option>
      <option value="2">Facilitator</option>
      <option value="3">Location</option>
      <option value="4">Active Course</option>
      <option value="5">Status</option>
      <option value="6">Joined Before</option>
      <option value="7">Joined After</option>
    </select>
    <input type="text" placeholder="Filter">
  </form>



  <table>
    <thead>
    <tr>
      <th><input type="checkbox" /></th>
      <th>Name</th>
      <th>Cohort Name</th>
      <th>Active Course</th>
      <th>Status Flag</th>
      <th>Date Joined</th>
    </tr>
    </thead>
    <tbody>
    <tr>
      <td><input type="checkbox" /></td>
      <td>Jeremy Long</td>
      <td>Wednesday Evening Cohort</td>
      <td>Good Dads 2.0</td>
      <td>Active</td>
      <td>09-20-2023</td>
    </tr>
    </tbody>
  </table>
  <p>0 Dads Selected</p>
  <button @click="toggleDisplay">Add New Alert</button>
  <form class="newAlert" v-show="show">
    <input type="text" placeholder="Alert Title">
    <input type="text" placeholder="Alert Content">
    <p>need to</p>
    <p>0 Dads Selected</p>
    <button>Save</button>
  </form>

  <br><br>
  <h2>Scheduled Alerts</h2>
  <table>
    <thead>
      <tr>
        <th>Title</th>
        <th>Content</th>
        <th>Scheduled For</th>
        <th>Audience</th>
        <th>Action</th>
      </tr>
    </thead>
    <tbody>
    <tr>
      <td>Class is Cancelled</td>
      <td>Due to Inclement Weather, Class is Cancelled Today</td>
      <td>
        11/06/2021 @ 9:00am
      </td>
      <td>
        <button>View Audience</button>
      </td>
      <td>
        <button>Edit</button>
        <button>Delete</button>
      </td>
    </tr>
    </tbody>
  </table>
</template>
<style>
p {
  text-align: left;
   margin-bottom: 10px;
}
h2 {
  text-align: center;
  margin: 40px 0;
}
.newAlert {
  max-width: 1024px;
  margin-bottom: 60px;
  display: block;
  input, select {
    display: inline-block;
    width: 45%;
  }
  input {
    margin-right: 10px
  }
  textarea {
    width: 92%;
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
  input[type='checkbox'] {
    margin: 20px 10px;
  }
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
    &:hover {
      padding: 2px 5px;
    }
  }
}
button {
  display: block;
  padding: 10px 20px;
  float: left;
  border-radius: 5px;
  background: #56A345;
  font-weight: 700;
  color: #fff;
  max-width: 200px;
  margin: 0 auto;
  border-bottom: 3px solid #20421d;
  transition: all 250ms ease-in-out;
}
button:hover {
  background: #20421d;
  border-bottom: 3px solid #20421d;
  padding: 12px 24px;
  cursor: pointer;
}
</style>
