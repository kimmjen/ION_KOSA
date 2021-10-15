<template>
  <div>
    <div v-for="(r, i) in rooms" :key="i">

      <img class="img" :src="r.image">
      <h4 v-on:click="visible(i)">{{ r.title }} 원룸 </h4>
      <p>{{ r.price }} 만원 </p>
      <button v-on:click="increase(i)">허위매물</button>

    </div>
  </div>
</template>

<script>
export default {
  name: "Card",
  props: {
    rooms: Array
  },
  methods: {
    increase(i) {
      this.rooms[i].counts += 1;
    },
    visible(i) {
      this.$emit("modalOpen", true, i)
    }
  }
}
</script>

<style scoped>

</style>