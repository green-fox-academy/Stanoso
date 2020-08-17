<template>
  <div>
    <b>{{msg}}</b>
    <TodoList
      v-bind:arrOfTodos="todos"
      v-on:itemToDelete="deleteItem"
      v-on:setItemDone="setDone"
      v-on:itemToEdit="editItem"
      :key='componentKey'
    ></TodoList>
    <CreateTodo v-on:todonew="addTodo" />
  </div>
</template>

<script>
import TodoList from "./TodoList.vue";
import CreateTodo from "./CreateTodo.vue";

export default {
  name: "Todo",
  props: {
    msg: String,
  },
  data: function () {
    return { 
      todos,
      componentKey : 0, 
      };
  },
  components: {
    TodoList,
    CreateTodo,
  },
  methods: {
    addTodo: function (value) {
      this.todos.push(value);
    },
    deleteItem: function (value) {
      this.todos.splice(this.todos.indexOf(value), 1);
    },
    setDone: function (value) {
      const todoSetDone = this.todos.indexOf(value);
      this.todos[todoSetDone].done = true;
      this.componentKey +=1;
    },
    editItem: function (value1, value2) {
      const todoEdit = this.todos.indexOf(value1);
      this.todos[todoEdit] = value2;
      this.componentKey +=1;
    },
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
];
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
