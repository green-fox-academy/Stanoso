<template>
  <div id="app">
    <img alt="Todo logo" src="./assets/todo.png" style="width: 80px;">
    <b class="title">Welcome to ToDo app made using JS & Vue</b>
    <Todo msg='ToDo List' />    
    
  </div>
</template>

<script>
import Todo from './components/Todo.vue'

export default {
  name: 'App',
  components: {
    Todo
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 40px;
}
.title {
  font-size: 150%;
  padding-left: 10px;
}
</style>
