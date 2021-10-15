<template>
  <div class="black-bg">
    <div class="white-bg">
      <img class="img" :src="room.image"/>
      <h4>상세 페이지 <br><br> {{ room.title }} </h4>
      <p>{{ room.content }}</p>
      <p>{{ room.price }} 만원</p>
      <button v-on:click="onEmit()">닫기</button>
    </div>
  </div>
</template>

<script>
export default {
  name: "Modal",
  props: {
    room: JSON
  },
  methods: {
    onEmit() {
      this.$emit("modalClose", false);
    }
  }
}

</script>

<style scoped>
.black-bg {
  width: 100%;
  height: 100%;
  background: rgb(0, 0, 0, 0.5);
  position: fixed;
  padding: 20px;
}

.white-bg {
  width: 100%;

  background-color: whitesmoke;
  border-radius: 8px;
  padding: 20px;

}
</style>