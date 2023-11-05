<template>
  <h1>Resources</h1>
  <p>Blog articles from the Good Dads Blog are automatically added to your clients' companion apps. If you want to write your own blog posts, you can do so here and they will seamlessly fit into the blogroll with Good Dads Blog's posts.</p>
  <button>Add New Post</button>
  <form class="newPost">
    <input type="text" placeholder="Title">
    <select>
      <option value="1">Community Development</option>
      <option value="2">Character</option>
      <option value="3">Health</option>
      <option value="4">Money & Finance</option>
      <option value="5">Over-the-Road Driver</option>
      <option value="6">Parenting</option>
      <option value="7">Relationship</option>
    </select>
    <textarea placeholder="Content"></textarea>
    <button>Save</button>
  </form>
  <form class="searchForm">
    <input type="text" placeholder="Search">
    <select>
      <option value="1">Community Development</option>
      <option value="2">Character</option>
      <option value="3">Health</option>
      <option value="4">Money & Finance</option>
      <option value="5">Over-the-Road Driver</option>
      <option value="6">Parenting</option>
      <option value="7">Relationship</option>
    </select>
  </form>
  <table>
    <thead>
      <tr>
        <th>Title</th>
        <th>Category</th>
        <th>Post Date</th>
        <th>Actions</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>Join Us in Congratulating The Good Dads 2023 Outstanding Fathers of The Year</td>
        <td>Character</td>
        <td>
          10/23/2021
        </td>
      </tr>
      <tr>
        <td>30 Days of Catch</td>
        <td>Relationship</td>
        <td>
          10/25/2021
        </td>
      </tr>
      <tr>
        <td>Springfield Area Outdoor Activities for Fall</td>
        <td>Seasonal</td>
        <td>
          10/25/2021
        </td>
        <td>
          <button>Edit</button>
          <button>Delete</button>
        </td>
      </tr>
      <tr>
        <td>Merry Christmas and Happy New Year From the Good Dads Team</td>
        <td>Community Development</td>
        <td>
          10/27/2021
        </td>
      </tr>
      <tr>
        <td>The Annual Holiday Argument for Single Parents and Stepfamilies</td>
        <td>Seasonal</td>
        <td>
          10/31/2021
        </td>
      </tr>
    </tbody>
  </table>
</template>
<style lang="scss">

.searchForm {
  display: flex;
  flex-direction: row;
  justify-content: flex-start;
  margin: 20px;
  input, select {
    padding: 10px;
    margin: 10px 10px;
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
form {
  display: flex;
  flex-direction: column;
  max-width: 600px;
  margin: 0 auto;
  input, textarea {
    padding: 10px;
    margin: 10px 0;
    border-radius: 5px;
    border: 1px solid #ccc;
    font-size: 1em;
  }
  textarea {
    height: 200px;
  }
  select {
    padding: 10px;
    margin: 10px 0;
    border-radius: 5px;
    border: 1px solid #ccc;
    font-size: 1em;
    background: #fff;
  }
}
.newPost {
  max-width: 1024px;

  input, select {
    display: inline-block;
    width: 48%;
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
    display: block;
    width: 80px;
    margin: 0 auto 10px auto;
  }
  button:hover {
    padding: 2px 5px;
  }
}
button {
  display: block;
  padding: 10px 20px;
  border-radius: 5px;
  background: #56A345;
  font-weight: 700;
  color: #fff;
  max-width: 200px;
  margin: 0 auto;
  border-bottom: 3px solid #3C6E3C;
  transition: all 250ms ease-in-out;
}
button:hover {
  background: #3C6E3C;
  padding: 12px 24px;
  cursor: pointer;
}
p {
  font-size: 1em;
  text-align: center;
  max-width: 70%;
  margin: 40px auto;
}
</style>
<script setup>
</script>
