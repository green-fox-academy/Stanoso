<template>
  <div>
    {{see}}
    <ul>
      <li v-for="todo in arrOfTodos" :key="todo.title">
        <TodoItem v-bind:item="todo" v-on:itemToDelete="itemTo" />
      </li>
    </ul>
    <CreateTodo v-on:todonew="addTodo" />
  </div>
</template>

<script>
import TodoItem from "./TodoItem.vue";
import CreateTodo from "./CreateTodo.vue";

export default {
  name: "TodoList",
  props: {
    arrOfTodos: Array,
  },

  components: {
    TodoItem,
    CreateTodo,
  },

  data: function () {
    return { see: null };
  },

  methods: {
    itemTo: function (value) {
      this.arrOfTodos.splice(this.arrOfTodos.indexOf(value), 1);
    },

    addTodo: function (value) {
      this.arrOfTodos.push(value);
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