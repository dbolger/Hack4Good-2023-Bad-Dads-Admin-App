<template>
    <v-navigation-drawer v-show="true" style="text-align: left;">
    <v-list-item class="d-flex justify-center" height="100">
        <v-img
          :width="100"
          :height="75"
          cover
          src="./../../public/Good Dads Square logo.png"
          style="padding-bottom: 15px;"
        />
        <v-list-item-title style="vertical-align: center;">Springfield</v-list-item-title>
    </v-list-item>
    <v-divider></v-divider>
    <v-list-item >
        <v-list-item-title style="font-weight: bold;">People</v-list-item-title>
    </v-list-item>
    <v-list-item link title="Locations" ></v-list-item>
    <v-list-item link title="Facilitators"></v-list-item>
    <v-list-item link title="Staff"></v-list-item>
    <v-list-item link title="Dads"></v-list-item>
    <v-list-item>
        <v-list-item-title style="font-weight: bold;">Content</v-list-item-title>
    </v-list-item>
    <v-list-item link title="Resources"></v-list-item>
    <v-list-item>
        <v-list-item-title style="font-weight: bold;">Communication</v-list-item-title>
    </v-list-item>
    <v-list-item link title="Alerts"></v-list-item>
    <v-list-item link title="Feedback"></v-list-item>
    <v-list-item>
        <v-list-item-title style="font-weight: bold;">Intake</v-list-item-title>
    </v-list-item>
    <v-list-item link title="New Intake"></v-list-item>
    <v-list-item link title="Edit Forms"></v-list-item>
    <v-list-item>
        <v-list-item-title style="font-weight: bold;">Reports</v-list-item-title>
    </v-list-item>
    <v-list-item link title="Reports Dashboard"></v-list-item>
    <v-list-item link title="Saved Reports"></v-list-item>
    <v-list-item link title="New Report"></v-list-item>
    </v-navigation-drawer>
</template>