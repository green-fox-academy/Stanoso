<template>
  <div>
      <ul>
      <li v-for="todo in arrOfTodos" :key="todo.title">
        <TodoItem v-bind:item="todo" v-on:itemToDelete="itemTo" />
      </li>
    </ul>
  </div>
</template>

<script>
import TodoItem from "./TodoItem.vue";

export default {
  name: "TodoList",
  props: {
    arrOfTodos: Array,
  },

  components: {
    TodoItem,
  },
  
  methods: {
    itemTo: function (value) {
      this.arrOfTodos.splice(this.arrOfTodos.indexOf(value), 1);
  
    },
  },
};
</script>

<style>
ul {
  list-style-type: none;
  padding: 0;
}
</style>