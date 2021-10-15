<template>
  <div class="modal" v-if="isModalOpen=false">
        <img :src="rooms[roomNo].image" style="width: 100%"/>
        <h4>상세 페이지 <br> {{ rooms[roomNo].title }} </h4>
        <p>{{ rooms[roomNo].content }}</p>
        <p>{{ rooms[roomNo].price }} 만원</p>
        <button @click="isModalOpen=false">닫기</button>
      </div>

</template>

<script>
// import data from "@/assets/roomdata";

export default {
  name: "Modal",
  props: {
    visible: {
      type: Boolean,
      require: true,
      default: false
    },
    // title: String,
    // image: Object
    rooms: Array,
    roomNo: Number,
    isModalOpen: Boolean
    // },
    // data() {
    //   return {
    //     roomNo: 0,
    //     rooms: data,
    //     // content: data,
    //   }
    // }
  }
}
</script>

<style scoped>

</style>