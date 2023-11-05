<script setup>
import { sidebarItems as sItem } from '../routing.js'
</script>
<template>
  <v-navigation-drawer
      style="text-align: left;"
      class="s-nav"
  >
    <v-list-item height="100">
      <div style="display: flex; justify-content: space-evenly; align-items: center; padding: 10px;">
        <v-img
            :max-width="100"
            :max-height="75"
            cover="true"
            src="./../../public/Good Dads Square logo.png"
            style="padding-bottom: 15px;"
        />
        <v-list-item-title style="vertical-align: center; text-align: center;">Stockton</v-list-item-title>
      </div>
    </v-list-item>
    <v-divider></v-divider>
    <v-list-item >
      <v-list-item-title style="font-weight: bold;">People</v-list-item-title>
    </v-list-item>
    <v-list-item v-for="link in sItem['People']">
      <router-link :to="link.path">{{ link.name }}</router-link>
    </v-list-item>
    <v-divider />
    <v-list-item>
      <v-list-item-title style="font-weight: bold;">Content</v-list-item-title>
    </v-list-item>
    <v-list-item v-for="link in sItem['Content']">
      <router-link :to="link.path">{{ link.name }}</router-link>
    </v-list-item>
    <v-divider />
    <v-list-item>
      <v-list-item-title style="font-weight: bold;">Communication</v-list-item-title>
    </v-list-item>
    <v-list-item v-for="link in sItem['Communication']">
      <router-link :to="link.path">{{ link.name }}</router-link>
    </v-list-item>
    <v-divider />
    <v-list-item>
      <v-list-item-title style="font-weight: bold;">Intake</v-list-item-title>
    </v-list-item>
    <v-list-item v-for="link in sItem['Intake']">
      <router-link :to="link.path">{{ link.name }}</router-link>
    </v-list-item>
    <v-divider />
    <v-list-item>
      <v-list-item-title style="font-weight: bold;">Reports</v-list-item-title>
    </v-list-item>
    <v-list-item v-for="link in sItem['Reports']">
      <router-link :to="link.path">{{ link.name }}</router-link>
    </v-list-item>
  </v-navigation-drawer>
</template>
<style lang="scss">
.s-nav {
  background-color: #f5f5f5;
  color: black;
  font-size: 1.2em;
  font-weight: bold;
  width: 250px;
  height: 100%;
  position: fixed;
  top: 0;
  left: 0;
  box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
  transition: all 0.3s ease-in-out;
  .v-list-item {
    transition: all 0.3s ease-in-out;
    padding: 0;
  }
  a {
    height: 100%;
    width: 100%;
    transition: all 0.3s ease-in-out;
    display: block;
    &.router-link-active, &:hover {
      background-color: #42b883;
      color: white;
    }
  }
}
</style>
