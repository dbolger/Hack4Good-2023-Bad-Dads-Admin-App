<script setup>
import { inject, reactive } from 'vue'
import { useVuelidate } from '@vuelidate/core'
import { required } from '@vuelidate/validators'
import store from '../store/index.js'
import router from '../routing.js'
const $http = inject('$http')

const initialState = {
  username: '',
  password: '',
}

const state = reactive({
  ...initialState,
})

const rules = {
  username: { required },
  password: { required },
}

const v$ = useVuelidate(rules, state)

function clear () {
  v$.value.$reset()

  for (const [key, value] of Object.entries(initialState)) {
    state[key] = value
  }
}

const submit = async () => {
  const endpoint = `${$http.defaults.baseURL}/auth`
  v$.value.$touch()

  if (v$.value.$error) {
    return
  }
  const { data } = await $http.post(endpoint, state)
                              .catch(e => e.response)
  if (data.error) {
    v$.value.$reset()
    return
  }

  store.commit('auth/setToken', data?.jwtToken)
  router.push({ name: 'Home' })

  console.log(result)
}
</script>
<template>
  <v-form>
    <v-text-field
        v-model="state.username"
        :error-messages="v$.username.$errors.map(e => e.$message)"
        label="Name"
        required
        @input="v$.username.$touch"
        @blur="v$.username.$touch"
    />

    <v-text-field
        v-model="state.password"
        type="password"
        :error-messages="v$.password.$errors.map(e => e.$message)"
        label="Password"
        required
        @input="v$.password.$touch"
        @blur="v$.password.$touch"
    />

    <v-btn
        class="me-4"
        @click="submit"
    >
      submit
    </v-btn>
    <v-btn @click="clear">
      clear
    </v-btn>
  </v-form>
</template>
