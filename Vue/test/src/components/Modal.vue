<template>
  <div class="black-bg">
    <div class="white-bg">
      <img :src=rooms[roomNo].image>
      <h4>{{rooms[roomNo].title}}</h4>
      <p>{{rooms[roomNo].content}}</p>
<!--      <input @input="$event">-->
      <input v-model="month"><br />
      <input type="checkbox" v-model="month"><br />
      <input type="range" min="1" max="12"><br />
      {{ mon }}개월 선택함
      <p>계산 {{rooms[roomNo].price * month}}만원</p>
      <p> {{rooms[roomNo].price}}만원</p>
      <Discount />
      <button @click="isModalOpen">닫기</button>
    </div>
  </div>
</template>

<script>
import Discount from './Discount.vue'
export default {
  name:'Modal',
  data() {
    return {
      month: 1 // 초기 데이터
    }
  },
  watch: {
    month(num) { // month (변경될값, 이전 값)
      if (isNaN(num) === true) {
        alert('문자 입력하지 마세요!!');
        this.month = 1;
      }
    }
  },
  components:{
    Discount
  },
  props:{
    rooms:Array,
    roomNo:Number,

  },
  methods:{
    isModalOpen(){
      this.$emit("child",false)
    }
  }
}
</script>

<style>
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