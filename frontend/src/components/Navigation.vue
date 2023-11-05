<script setup>
import { inject, onMounted, ref } from 'vue'
import { sidebarItems as sItem } from '../routing.js'
const $http = inject('$http')
</script>
<template>
    <v-navigation-drawer v-show="true" style="text-align: left;" class="s-nav">
    <v-list-item class="d-flex justify-center" height="100">
        <v-img
          :width="100"
          :height="75"
          cover
          src="./../../public/Good Dads Square logo.png"
          style="padding-bottom: 15px;"
        />
        <v-list-item-title style="vertical-align: center; text-align: center;">Springfield</v-list-item-title>
    </v-list-item>
    <v-divider></v-divider>
    <v-list-item >
        <v-list-item-title style="font-weight: bold;">People</v-list-item-title>
    </v-list-item>
    <v-list-item style="font-weight: bold;" v-for="link in sItem['People']">
      <router-link :to="link.path">{{ link.name }}</router-link>
    </v-list-item>
    <v-list-item>
        <v-list-item-title style="font-weight: bold;">Content</v-list-item-title>
    </v-list-item>
      <v-list-item style="font-weight: bold;" v-for="link in sItem['Content']">
        <router-link :to="link.path">{{ link.name }}</router-link>
      </v-list-item>
    <v-list-item>
        <v-list-item-title style="font-weight: bold;">Communication</v-list-item-title>
    </v-list-item>
      <v-list-item style="font-weight: bold;" v-for="link in sItem['Communication']">
        <router-link :to="link.path">{{ link.name }}</router-link>
      </v-list-item>
    <v-list-item>
        <v-list-item-title style="font-weight: bold;">Intake</v-list-item-title>
    </v-list-item>
      <v-list-item style="font-weight: bold;" v-for="link in sItem['Intake']">
        <router-link :to="link.path">{{ link.name }}</router-link>
      </v-list-item>
    <v-list-item>
        <v-list-item-title style="font-weight: bold;">Reports</v-list-item-title>
    </v-list-item>
    <v-list-item style="font-weight: bold;" v-for="link in sItem['Reports']">
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
}
</style>
