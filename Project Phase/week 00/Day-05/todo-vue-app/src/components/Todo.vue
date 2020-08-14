<template>
  <div>
    <h2>{{msg}}</h2>
    <ul>
      <li v-for="todo in todos" :key="todo.title">{{todo.title}} {{todo.project}} {{todo.done}}</li>
    </ul>
  </div>
</template>

<script>
export default {
  name: "Todo",
  props: {
    msg: String,
  },
  data: function () {
    return {todos};
  },
};

let todos = [
        {
          title: "Todo A",
          project: "Project A",
          done: false,
        },
        {
          title: "Todo B",
          project: "Project B",
          done: true,
        },
        {
          title: "Todo C",
          project: "Project C",
          done: false,
        },
        {
          title: "Todo D",
          project: "Project D",
          done: false,
        },
      ]
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
 /* ul {
  list-style-type: disc;
  padding: 0;
}

li {
  display: inline-block; 
  margin: 0 10px;
}  */
a {
  color: #42b983;
}
</style>
