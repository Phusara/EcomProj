<script setup>
const { data, error } = await useFetch('http://localhost:8080/shop')


</script>
<template>

<h1>This is gallary</h1>
<div v-for="item in data" :key="item.id" >
<p class="">{{ item.model }}</p>

</div>

</template>
<style scoped></style>