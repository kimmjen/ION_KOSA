<template>
  <div id="app">

    <div class="menu">
      <a v-for="menu in menus" :key="menu">{{ menu }} </a>
    </div>
    <Discount/>

    <h1 class="h1"> land world 왔니? </h1>
    <img alt="Vue logo" src="./assets/logo.png">

    <Modal
        :room="rooms[roomNo]"
        :roomNo="roomNo"
        @modalClose="modalClose"
        v-if="visible"
    ></Modal>

    <Card
      :rooms="rooms"
      @modalOpen="modalOpen"
    />
  </div>
</template>

<script>
import Discount from "./components/Discount";
import data from "./assets/roomdata";
import Card from "./components/Card";
import Modal from "./components/Modal";

export default {
  name: 'App',
  data() {
    return {
      roomNo: 0,
      rooms: data,
      type: 'color: red',
      menus: ['home', 'shop', 'products', 'about'],
      visible: false
    }
  },
  methods: {
    /*increase(i) {
      this.$set(this.counts, i, this.counts[i] + 1);
    }*/
    modalClose(visible) {
      this.visible = visible
    },
    modalOpen(visible, roomNo) {
      this.visible = visible;
      this.roomNo = roomNo;
    }
  },
  components: {
    Discount,
    Card,
    Modal

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
  margin-top: 60px;
}
</style>
