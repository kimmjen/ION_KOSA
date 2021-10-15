<template>
  <div id="app">

    <Modal
        :rooms="rooms"
        :roomNo="roomNo"
        v-if="isModalOpen">
    </Modal>

    <div class="menu">
      <!-- <a v-for="반복할 변수 in 숫자" :key="변수"> </a> -->
      <!-- <a v-for="i in 3" :key="i">home </a> -->
      <a v-for="menu in menus" :key="menu">{{ menu }} </a>
    </div>
    <Discount/>
    <!-- <a v-for="(menu,i)in menus" :key="i">{{i}} </a>
      <a v-for="(변수이름정의,인덱스번호)in 배열" :key="인덱스번호">{{인덱스번호}} </a> -->


    <!-- <a>{{menus}}</a>
    <a>{{menus[1]}}</a>
    <a>{{menus[3]}}</a> -->


    <h1 class="h1con"> land world 왔니? </h1>
    <img alt="Vue logo" src="./assets/logo.png">



    <!--    <div v-for="(p, i) in products" :key="i">-->


    <!--      <img src="./assets/1.jpg">-->
    <!--      &lt;!&ndash; <h4 :style="type"> {{products[i]}}원룸 </h4> 스타일 직접넣기 &ndash;&gt;-->
    <!--      <h4 @click="isModalOpen =true"> {{ products[i] }}원룸 </h4>-->
    <!--      <p> {{ price }}만원</p>-->

    <!--      <button @click="increase(i)">허위매물신고</button>-->
    <!--      <span>신고수:{{ counts[i] }}</span>-->

    <!--    </div>-->

    <div v-for="(r, i) in rooms" :key="i">

      <img :src="r.image">
      <h4 @click="isModalOpen=true; roomNo=i">{{ r.title }} 원룸 </h4>
      <p>{{ r.price }} 만원 </p>

    </div>


  </div>
</template>

<script>
import data from './assets/roomdata'
import Discount from './components/Discount'
import Modal from "@/components/Modal";

export default {
  name: 'App',
  data() {
    return {
      rooms: data,
      // visible: false,
      price: 70,
      price2: 50,
      type: 'color: red',
      menus: ['home', 'shop', 'products', 'about'],
      products: ['서대문구', '관악구', '강서구'],
      counts: [0, 0, 0],
      isModalOpen: false,
    }
  },
  methods: {
    increase(i) {
      this.$set(this.counts, i, this.counts[i] + 1);

      //반드시 앞에 this붙여야지 적용됨
      // this.$set(obj, key, value)
      // this.$set(arr, index, value)

    }
  }
  ,
  components: {
    Discount: Discount,
    Modal: Modal
  }
}

</script>

<style>
body {
  margin: 0;
}

div {
  box-sizing: border-box;
}


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

/* .img{
  width: 50px;
  height: 50px;
} */


.menu {
  background-color: darkgoldenrod;
  padding: 15px;
  border-radius: 5px;
}

.menu a {
  color: aliceblue;
  padding: 10px;
}

.h1con {
  color: blue;
  font-family: 맑은 고딕;
}


#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  /*margin-top: 60px;*/
}
</style>
