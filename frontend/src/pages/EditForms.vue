<script setup>
import { reactive, ref } from 'vue';

const show = ref(false)

const toggleDisplay = async () => {
  show.value = !show.value
}
</script>
<template>
  <h1>Edit Forms</h1>
  <h2>Additional Forms</h2>
  <p>These forms are paper forms distributed to potential Dads to be completed during their intake process.
  If you have additional forms you would like to add to this list beyond the ones required by your local jurisdiction, please add them below and retain copies of the forms to distribute to clients upon intake so that they can be completed and returned to you.
  </p>
  <h3>Forms Required by Missouri</h3>
  <ul>
    <li>Missouri Child Support Form</li>
    <li>Missouri Parenting Plan</li>
    <li>Missouri Parenting Plan Addendum</li>
  </ul>
  <h3>Additional Forms</h3>
  <button @click="toggleDisplay" class="newForm">Add New Form</button>
  <form class="newPost" v-show="show">
    <input type="text" placeholder="Form Name">
    <button>Save</button>
  </form>
  <table>
    <thead>
    <tr>
      <th>Form Name</th>
      <th>Actions</th>
    </tr>
    </thead>
    <tbody>
    <tr>
      <td>Springfield Specific Intake Form</td>
     <td>
       <button>Edit</button>
       <button>Delete</button>
     </td>
    </tr>

    </tbody>
  </table>
</template>
<style>
.newForm {
  margin-bottom: 40px;
}
table {
  border-collapse: collapse;
  width: 100%;
  margin: 40px auto 80px auto;
}
ul {
  margin-bottom: 40px;
  li {
    list-style-type: none;
  }
}
h3 {
  font-size: 1.5rem;
  font-weight: bold;
  margin-bottom: 20px;
}
</style>
